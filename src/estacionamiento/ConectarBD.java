/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;
import java.sql.*;

/**
 *
 * @author Alexandra
 */
public class ConectarBD {
    
    public static Connection Conexion(){
        Connection con=null;
        try{
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/estacionamiento","postgres","root");
            System.out.println("conecion establecida");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
