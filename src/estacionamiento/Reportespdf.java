/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;

/**
 *
 * @author Alexandra
 */
public class Reportespdf {
    private static final String CARPETA_REPORTES = "reportes";
    private static final Font FUENTE_TITULO = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14);
    private static final Font FUENTE_NORMAL = FontFactory.getFont(FontFactory.HELVETICA, 9);
    private static final SimpleDateFormat FMT_FECHA = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Reporte 1: Lista de registros terminados (activo=false) del día.
     */
    public static String generarReporteRegistrosTerminados(Connection con, java.sql.Date fecha) {
        if (con == null || fecha == null) return null;
        String nombreArchivo = CARPETA_REPORTES + File.separator + "reporte_registros_" + System.currentTimeMillis() + ".pdf";
        try {
            crearCarpetaSiNoExiste();
            String sql = "SELECT id_auto, propietario, placas, marca, color, hora_llegada, hora_salida, total " +
                    "FROM automoviles WHERE activo = false AND DATE(\"updatedAt\") = ? ORDER BY \"updatedAt\"";
            Document doc = new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
            doc.open();
            doc.add(new Paragraph("REPORTE 1: REGISTROS TERMINADOS POR DÍA", FUENTE_TITULO));
            doc.add(new Paragraph("Fecha: " + FMT_FECHA.format(fecha), FUENTE_NORMAL));
            doc.add(new Paragraph(" "));

            PdfPTable tabla = new PdfPTable(8);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            tabla.setWidths(new float[]{1.2f, 2.5f, 1.8f, 2f, 1.5f, 1.5f, 1.5f, 1.5f});
            String[] encabezados = {"Folio", "Propietario", "Placas", "Marca", "Color", "H. entrada", "H. salida", "Total"};
            for (String enc : encabezados) {
                PdfPCell celda = new PdfPCell(new Phrase(enc, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 9)));
                celda.setBackgroundColor(new java.awt.Color(220, 220, 220));
                tabla.addCell(celda);
            }
            int totalRegistros = 0;
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setDate(1, fecha);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        tabla.addCell(String.valueOf(rs.getInt("id_auto")));
                        tabla.addCell(rs.getString("propietario") != null ? rs.getString("propietario") : "-");
                        tabla.addCell(rs.getString("placas") != null ? rs.getString("placas") : "-");
                        tabla.addCell(rs.getString("marca") != null ? rs.getString("marca") : "-");
                        tabla.addCell(rs.getString("color") != null ? rs.getString("color") : "-");
                        Time hE = rs.getTime("hora_llegada");
                        tabla.addCell(hE != null ? hE.toString().substring(0, 5) : "-");
                        Time hS = rs.getTime("hora_salida");
                        tabla.addCell(hS != null ? hS.toString().substring(0, 5) : "-");
                        String tot = rs.getString("total");
                        tabla.addCell(tot != null ? tot : "-");
                        totalRegistros++;
                    }
                }
            }
            if (totalRegistros == 0) {
                doc.add(new Paragraph("No hay registros terminados en esta fecha.", FUENTE_NORMAL));
            } else {
                doc.add(tabla);
                doc.add(new Paragraph(" "));
                doc.add(new Paragraph("Total de registros: " + totalRegistros, FUENTE_TITULO));
            }
            doc.close();
            return nombreArchivo;
        } catch (SQLException | DocumentException | IOException e) {
            System.out.println("Error reporte 1: " + e.getMessage());
            return null;
        }
    }

    /**
     * Reporte 2: Ganancias del día (suma de total de registros terminados ese día).
     */
    public static String generarReporteGananciasDia(Connection con, java.sql.Date fecha) {
        if (con == null || fecha == null) return null;
        String nombreArchivo = CARPETA_REPORTES + File.separator + "reporte_ganancias_" + System.currentTimeMillis() + ".pdf";
        try {
            crearCarpetaSiNoExiste();
            String sql = "SELECT COALESCE(SUM(CAST(NULLIF(TRIM(total), '') AS DECIMAL(10,2))), 0) AS ganancia " +
                    "FROM automoviles WHERE activo = false AND DATE(\"updatedAt\") = ?";
            double ganancia = 0;
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setDate(1, fecha);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        ganancia = rs.getDouble("ganancia");
                    }
                }
            }
            Document doc = new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
            doc.open();
            doc.add(new Paragraph("REPORTE 2: GANANCIAS DEL DÍA", FUENTE_TITULO));
            doc.add(new Paragraph("Fecha: " + FMT_FECHA.format(fecha), FUENTE_NORMAL));
            doc.add(new Paragraph(" "));
            PdfPTable tabla = new PdfPTable(2);
            tabla.setWidthPercentage(80);
            tabla.setSpacingBefore(15);
            tabla.setSpacingAfter(15);
            tabla.addCell(crearCeldaEncabezado("Concepto"));
            tabla.addCell(crearCeldaEncabezado("Valor"));
            tabla.addCell(crearCeldaDato("Fecha"));
            tabla.addCell(crearCeldaDato(FMT_FECHA.format(fecha)));
            tabla.addCell(crearCeldaDato("Total ganancias del día"));
            tabla.addCell(crearCeldaDato("$" + String.format("%.2f", ganancia)));
            doc.add(tabla);
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Registros de donde se obtuvieron los datos:", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10)));
            doc.add(new Paragraph(" "));
            PdfPTable tablaRegistros = crearTablaRegistrosDelDia(con, fecha);
            if (tablaRegistros != null) {
                doc.add(tablaRegistros);
            }
            doc.close();
            return nombreArchivo;
        } catch (SQLException | DocumentException | IOException e) {
            System.out.println("Error reporte 2: " + e.getMessage());
            return null;
        }
    }

    /**
     * Reporte 3: Cantidad de automóviles que estuvieron (registros terminados) en el día.
     */
    public static String generarReporteAutomovilesDia(Connection con, java.sql.Date fecha) {
        if (con == null || fecha == null) return null;
        String nombreArchivo = CARPETA_REPORTES + File.separator + "reporte_automoviles_dia_" + System.currentTimeMillis() + ".pdf";
        try {
            crearCarpetaSiNoExiste();
            String sql = "SELECT COUNT(*) AS cantidad FROM automoviles WHERE activo = false AND DATE(\"updatedAt\") = ?";
            int cantidad = 0;
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setDate(1, fecha);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        cantidad = rs.getInt("cantidad");
                    }
                }
            }
            Document doc = new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
            doc.open();
            doc.add(new Paragraph("REPORTE 3: AUTOMÓVILES DEL DÍA", FUENTE_TITULO));
            doc.add(new Paragraph("Fecha: " + FMT_FECHA.format(fecha), FUENTE_NORMAL));
            doc.add(new Paragraph(" "));
            PdfPTable tabla = new PdfPTable(2);
            tabla.setWidthPercentage(80);
            tabla.setSpacingBefore(15);
            tabla.setSpacingAfter(15);
            tabla.addCell(crearCeldaEncabezado("Concepto"));
            tabla.addCell(crearCeldaEncabezado("Valor"));
            tabla.addCell(crearCeldaDato("Fecha"));
            tabla.addCell(crearCeldaDato(FMT_FECHA.format(fecha)));
            tabla.addCell(crearCeldaDato("Cantidad de automóviles (salidas registradas)"));
            tabla.addCell(crearCeldaDato(String.valueOf(cantidad)));
            doc.add(tabla);
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Registros de donde se obtuvieron los datos:", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10)));
            doc.add(new Paragraph(" "));
            PdfPTable tablaRegistros = crearTablaRegistrosDelDia(con, fecha);
            if (tablaRegistros != null) {
                doc.add(tablaRegistros);
            }
            doc.close();
            return nombreArchivo;
        } catch (SQLException | DocumentException | IOException e) {
            System.out.println("Error reporte 3: " + e.getMessage());
            return null;
        }
    }

    private static void crearCarpetaSiNoExiste() {
        File carpeta = new File(CARPETA_REPORTES);
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
    }

    private static PdfPCell crearCeldaEncabezado(String texto) {
        PdfPCell celda = new PdfPCell(new Phrase(texto, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10)));
        celda.setBackgroundColor(new java.awt.Color(220, 220, 220));
        celda.setPadding(8);
        return celda;
    }

    private static PdfPCell crearCeldaDato(String texto) {
        PdfPCell celda = new PdfPCell(new Phrase(texto != null ? texto : "-", FUENTE_NORMAL));
        celda.setPadding(8);
        return celda;
    }

    /**
     * Crea la tabla de detalle con los registros terminados del día (misma consulta que reporte 1).
     */
    private static PdfPTable crearTablaRegistrosDelDia(Connection con, java.sql.Date fecha) {
        String sql = "SELECT id_auto, propietario, placas, marca, color, hora_llegada, hora_salida, total " +
                "FROM automoviles WHERE activo = false AND DATE(\"updatedAt\") = ? ORDER BY \"updatedAt\"";
        PdfPTable tabla = new PdfPTable(8);
        tabla.setWidthPercentage(100);
        tabla.setSpacingBefore(5);
        tabla.setWidths(new float[]{1.2f, 2.5f, 1.8f, 2f, 1.5f, 1.5f, 1.5f, 1.5f});
        String[] encabezados = {"Folio", "Propietario", "Placas", "Marca", "Color", "H. entrada", "H. salida", "Total"};
        for (String enc : encabezados) {
            PdfPCell celda = new PdfPCell(new Phrase(enc, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 9)));
            celda.setBackgroundColor(new java.awt.Color(220, 220, 220));
            tabla.addCell(celda);
        }
        int filas = 0;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDate(1, fecha);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    tabla.addCell(String.valueOf(rs.getInt("id_auto")));
                    tabla.addCell(rs.getString("propietario") != null ? rs.getString("propietario") : "-");
                    tabla.addCell(rs.getString("placas") != null ? rs.getString("placas") : "-");
                    tabla.addCell(rs.getString("marca") != null ? rs.getString("marca") : "-");
                    tabla.addCell(rs.getString("color") != null ? rs.getString("color") : "-");
                    Time hE = rs.getTime("hora_llegada");
                    tabla.addCell(hE != null ? hE.toString().substring(0, 5) : "-");
                    Time hS = rs.getTime("hora_salida");
                    tabla.addCell(hS != null ? hS.toString().substring(0, 5) : "-");
                    String tot = rs.getString("total");
                    tabla.addCell(tot != null ? tot : "-");
                    filas++;
                }
            }
        } catch (SQLException e) {
            return null;
        }
        if (filas == 0) {
            PdfPCell celdaVacia = new PdfPCell(new Phrase("No hay registros en esta fecha.", FUENTE_NORMAL));
            celdaVacia.setColspan(8);
            tabla.addCell(celdaVacia);
        }
        return tabla;
    }
    
}
