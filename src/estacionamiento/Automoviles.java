/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

/**
 *
 * @author Alexandra
 */
public class Automoviles {

    public int getId_auto() {
        return id_auto;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getPlacas() {
        return placas;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public String getTotal() {
        return total;
    }

    public void setId_auto(int id_auto) {
        this.id_auto = id_auto;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    int id_auto;
    String propietario;
    String placas;
    String marca;
    String color;
    String descripcion;
    String hora_llegada;
    String hora_salida;
    String total;

    public Automoviles(String propietario, String placas, String marca, String color, String descripcion, String hora_llegada, String hora_salida, String total) {
        this.propietario = propietario;
        this.placas = placas;
        this.marca = marca;
        this.color = color;
        this.descripcion = descripcion;
        this.hora_llegada = hora_llegada;
        this.hora_salida = hora_salida;
        this.total = total;
    }
    
    
    
}
