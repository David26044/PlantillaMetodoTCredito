/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private int puntajeDataCredito;
    private TarjetaCredito tarjeta;

    public Persona(String cedula, String nombre, String apellido, int puntajeDataCredito) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntajeDataCredito = puntajeDataCredito;
    }
    
    /*
    El cliente comienza solicitando la tarjeta, un cliente puede hacer muchas solicitudes
    solo si son negadas, luego de que sea aprbada ya no podrá hacer mas solicitudes.
    */
    public void solicitarTarjetaCredito(Date fecha){
        if (tarjeta != null) {
            System.out.println(nombre + " ya tiene tarjeta, no puede realizar mas solicitudes");
            return;
        }
        System.out.println(nombre + " solicita tarjeta");
        Solicitud solicitud = new SolicitudTarjeta(fecha, this);
        solicitud.procesarSolicitud();
        tarjeta = solicitud.getTarjetaCliente();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getPuntajeDataCredito() {
        return puntajeDataCredito;
    }
    
    public void setPuntajeDataCredito(int puntajeDataCredito){
        this.puntajeDataCredito = puntajeDataCredito;
    }
    
    
}
