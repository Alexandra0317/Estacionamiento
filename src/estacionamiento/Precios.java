/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

/**
 *
 * @author Alexandra
 */
public class Precios {
    public Precios(String tipo, String costo_horas, String descripcion) {
        this.tipo = tipo;
        this.costo_horas = costo_horas;
        this.descripcion = descripcion;
    }
  
    int id_precio;
    String tipo;
    String costo_horas;
    String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public int getId_precio() {
        return id_precio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCosto_horas() {
        return costo_horas;
    }

    public void setId_precio(int id_precio) {
        this.id_precio = id_precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto_horas(String costo_horas) {
        this.costo_horas = costo_horas;
    } 
}
