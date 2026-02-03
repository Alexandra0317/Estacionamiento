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
import com.lowagie.text.pdf.PdfWriter;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Alexandra
 */
public class GeneradorTickets {
    private static final String CARPETA_TICKETS = "tickets";
    private static final Font FUENTE_TITULO = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14);
    private static final Font FUENTE_NORMAL = FontFactory.getFont(FontFactory.HELVETICA, 10);

    public static String generarPreticket(int idAuto, String placas, String tipo, String horaEntrada) {
        String nombreArchivo = CARPETA_TICKETS + File.separator + "preticket_" + idAuto + "_" + System.currentTimeMillis() + ".pdf";
        try {
            crearCarpetaSiNoExiste();
            Document doc = new Document(PageSize.A6);
            PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
            doc.open();
            doc.add(new Paragraph("--- PRETICKET ENTRADA ---", FUENTE_TITULO));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Folio: " + idAuto, FUENTE_NORMAL));
            doc.add(new Paragraph("Placas: " + (placas != null ? placas : "-"), FUENTE_NORMAL));
            doc.add(new Paragraph("Tipo: " + (tipo != null ? tipo : "-"), FUENTE_NORMAL));
            doc.add(new Paragraph("Hora entrada: " + (horaEntrada != null ? horaEntrada : "-"), FUENTE_NORMAL));
            doc.add(new Paragraph("Fecha: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), FUENTE_NORMAL));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Conserve este comprobante.", FUENTE_NORMAL));
            doc.close();
            return nombreArchivo;
        } catch (DocumentException | IOException e) {
            System.out.println("Error al generar preticket: " + e.getMessage());
            return null;
        }
    }

    public static String generarTicket(int idAuto, String placas, String tipo, String horaEntrada, String horaSalida, String total) {
        String nombreArchivo = CARPETA_TICKETS + File.separator + "ticket_" + idAuto + "_" + System.currentTimeMillis() + ".pdf";
        try {
            crearCarpetaSiNoExiste();
            Document doc = new Document(PageSize.A6);
            PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
            doc.open();
            doc.add(new Paragraph("--- TICKET SALIDA ---", FUENTE_TITULO));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Folio: " + idAuto, FUENTE_NORMAL));
            doc.add(new Paragraph("Placas: " + (placas != null ? placas : "-"), FUENTE_NORMAL));
            doc.add(new Paragraph("Tipo: " + (tipo != null ? tipo : "-"), FUENTE_NORMAL));
            doc.add(new Paragraph("Hora entrada: " + (horaEntrada != null ? horaEntrada : "-"), FUENTE_NORMAL));
            doc.add(new Paragraph("Hora salida: " + (horaSalida != null ? horaSalida : "-"), FUENTE_NORMAL));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("TOTAL A PAGAR: $" + (total != null && !total.isEmpty() ? total : "0.00"), FUENTE_TITULO));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Fecha: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), FUENTE_NORMAL));
            doc.add(new Paragraph("Gracias por su preferencia.", FUENTE_NORMAL));
            doc.close();
            return nombreArchivo;
        } catch (DocumentException | IOException e) {
            System.out.println("Error al generar ticket: " + e.getMessage());
            return null;
        }
    }

    private static void crearCarpetaSiNoExiste() {
        File carpeta = new File(CARPETA_TICKETS);
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
    }

    public static void abrirPDF(String rutaPdf) {
        if (rutaPdf == null || rutaPdf.isEmpty()) {
            return;
        }
        try {
            File archivo = new File(rutaPdf);
            if (archivo.exists() && Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(archivo);
            }
        } catch (IOException e) {
            System.out.println("No se pudo abrir el PDF: " + e.getMessage());
        }
    }
    
}
