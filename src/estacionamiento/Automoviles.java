/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

import java.sql.Time;
import java.text.SimpleDateFormat;

/**
 *
 * @author Alexandra
 */
public class Automoviles {
    
    private static final SimpleDateFormat FMT_HORA = new SimpleDateFormat("HH:mm");
    
    int id_auto;
    int id_precio;
    String propietario;
    String placas;
    String marca;
    String color;
    String tipo;
    String descripcion;
    Time hora_llegada;
    Time hora_salida;
    String total;
    
    public Automoviles(){
        
    }

    public Automoviles(String propietario, String placas, String marca, String color, int id_precio, Time hora_llegada, String descripcion, boolean activo) {
        this.propietario = propietario;
        this.placas = placas;
        this.marca = marca;
        this.color = color;
        this.id_precio = id_precio;
        this.hora_llegada = hora_llegada;
        this.descripcion = descripcion;
        this.activo = activo;
    }
    
    public Automoviles(String propietario, String placas, String marca, String color, int id_precio, String tipo, String descripcion, Time hora_llegada, Time hora_salida, String total) {
        this.propietario = propietario;
        this.placas = placas;
        this.marca = marca;
        this.color = color;
        this.id_precio = id_precio;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.hora_llegada = hora_llegada;
        this.hora_salida = hora_salida;
        this.total = total;
    }

    public int getId_auto() {
        return id_auto;
    }

    public int getId_precio() {
        return id_precio;
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

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Time getHora_llegada() {
        return hora_llegada;
    }
    
    public String getHora_llegadaFormato() {
        return hora_llegada != null ? FMT_HORA.format(hora_llegada) : "";
    }


    public Time getHora_salida() {
        return hora_salida;
    }
    
    public String getHora_salidaFormato() {
        return hora_salida != null ? FMT_HORA.format(hora_salida) : "";
    }

    public String getTotal() {
        return total;
    }

    public void setId_auto(int id_auto) {
        this.id_auto = id_auto;
    }

    public void setId_precio(int id_precio) {
        this.id_precio = id_precio;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHora_llegada(Time hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public void setHora_salida(Time hora_salida) {
        this.hora_salida = hora_salida;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    boolean activo;
   

    
}
