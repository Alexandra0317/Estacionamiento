/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;
import static estacionamiento.Principal.lbHora;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Alexandra
 */
public class Reloj extends Thread{
    public void run() {
        while (true){
            int hora, minutos, segundos;
            char c=0;
            Calendar calendario = new GregorianCalendar();
            hora = calendario.get(Calendar.HOUR_OF_DAY);
            minutos = calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND);
            if(segundos<10)
                lbHora.setText(hora+":"+minutos+":0"+segundos);
            else
                lbHora.setText(hora+":"+minutos+":"+segundos); 
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
 }}
}
