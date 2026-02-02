/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

import java.sql.Connection;
import java.sql.Statement;


/**
 *
 * @author Alexandra
 */
public class InicializarBD {
    public static void crearTablas(){
        Connection con = null;
        Statement st = null;
        try {
            con = ConectarBD.Conexion();
            if (con == null) {
                System.out.println("No se pudo conectar. Las tablas no se crearán.");
                return;
            }
            st = con.createStatement();

            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS usuarios ( id_usuario SERIAL PRIMARY KEY," +
                "nombre VARCHAR(100) NOT NULL, apellidos VARCHAR(100)," +
                "telefono VARCHAR(20), correo VARCHAR(100) UNIQUE NOT NULL," +
                "contrasena VARCHAR(100) NOT NULL, rol VARCHAR(20) DEFAULT 'OPERADOR')"
            );
            System.out.println("Tabla usuarios creada.");

            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS precios ( id_precio SERIAL PRIMARY KEY," +
                "tipo VARCHAR(50) NOT NULL UNIQUE, costo_horas VARCHAR(20) NOT NULL," +
                "descripcion VARCHAR(200) )"
            );
            System.out.println("Tabla precios creada.");

            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS automoviles ( id_auto SERIAL PRIMARY KEY," +
                "propietario VARCHAR(100), placas VARCHAR(20)," +
                "marca VARCHAR(50), color VARCHAR(30), id_precio INTEGER REFERENCES precios(id_precio)," +
                "descripcion VARCHAR(200), hora_llegada TIME," +
                "hora_salida TIME, total VARCHAR(20)," +
                "activo BOOLEAN, " +
                "\"createdAt\" TIMESTAMP DEFAULT CURRENT_TIMESTAMP," +
                "\"updatedAt\" TIMESTAMP DEFAULT CURRENT_TIMESTAMP )"
            );
            System.out.println("Tabla automoviles creada.");

            try {
                st.executeUpdate("ALTER TABLE automoviles ADD COLUMN id_precio INTEGER REFERENCES precios(id_precio)");
                System.out.println("Columna id_precio añadida a automoviles.");
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().contains("already exists"))
                    System.out.println(e.getMessage());
            }

            try {
                st.executeUpdate("ALTER TABLE automoviles ADD COLUMN \"createdAt\" TIMESTAMP DEFAULT CURRENT_TIMESTAMP");
                System.out.println("Columna createdAt añadida a automoviles.");
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().contains("already exists"))
                    System.out.println(e.getMessage());
            }
            try {
                st.executeUpdate("ALTER TABLE automoviles ADD COLUMN \"updatedAt\" TIMESTAMP DEFAULT CURRENT_TIMESTAMP");
                System.out.println("Columna updatedAt añadida a automoviles.");
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().contains("already exists"))
                    System.out.println(e.getMessage());
            }

            try {
                st.executeUpdate(
                    "CREATE OR REPLACE FUNCTION update_automoviles_updated_at() " +
                    "RETURNS TRIGGER AS $$ BEGIN NEW.\"updatedAt\" = CURRENT_TIMESTAMP; RETURN NEW; END; $$ LANGUAGE plpgsql"
                );
                st.executeUpdate(
                    "DROP TRIGGER IF EXISTS trigger_automoviles_updated_at ON automoviles"
                );
                st.executeUpdate(
                    "CREATE TRIGGER trigger_automoviles_updated_at " +
                    "BEFORE UPDATE ON automoviles FOR EACH ROW EXECUTE PROCEDURE update_automoviles_updated_at()"
                );
                System.out.println("Trigger updatedAt en automoviles creado.");
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().contains("already exists"))
                    System.out.println("Trigger updatedAt: " + e.getMessage());
            }

            try {
                st.executeUpdate("ALTER TABLE automoviles ALTER COLUMN hora_llegada TYPE TIME USING hora_llegada::time");
                st.executeUpdate("ALTER TABLE automoviles ALTER COLUMN hora_salida TYPE TIME USING hora_salida::time");
                System.out.println("Columnas hora_llegada y hora_salida migradas a TIME.");
            } catch (Exception e) {
            }

            int insertados = st.executeUpdate(
                "INSERT INTO usuarios (nombre, apellidos, telefono, correo, contrasena, rol) " +
                "SELECT 'Administrador', 'Sistema', '951237g4612', 'admin@gmail.com', 'root', 'ADMIN' " +
                "WHERE NOT EXISTS (SELECT 1 FROM usuarios WHERE correo = 'admin@gmail.com')"
            );
            if (insertados > 0) {
                System.out.println("Usuario administrador creado: admin@gmail.com / root");
            }

            st.executeUpdate(
                "INSERT INTO precios (tipo, costo_horas, descripcion) VALUES " +
                "('TIPO A', '20.1', 'Motocicletas'), ('TIPO B', '45.25', 'Coches'), " +
                "('TIPO C', '48.3', 'Taxis'), ('TIPO D', '60.6', 'Camionetas o similares'), " +
                "('TIPO E', '49.2', 'Servicios Oficiales'), ('TIPO F', '35.4', 'Discapacitado'), " +
                "('TIPO G', '30.1', 'Personas Mayores') ON CONFLICT (tipo) DO NOTHING"
            );
            System.out.println("Tipos de precio insertados.");

        } catch (Exception ex) {
            System.out.println("Error al crear tablas: " + ex.getMessage());
        } finally {
            try {
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                System.out.println("Error al cerrar conexión: " + ex.getMessage());
            }
        }
    }
    
}
