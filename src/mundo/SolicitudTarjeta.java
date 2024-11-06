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
public class SolicitudTarjeta extends Solicitud {

    private static final int PUNTAJE_MINIMO = 700; //puntaje mínimo

    private TarjetaCredito tarjetaCliente;

    public SolicitudTarjeta(Date fecha, Persona cliente) {
        super(fecha, cliente);
    }

    @Override
    protected boolean verificarPuntaje() {
        int puntaje = cliente.getPuntajeDataCredito();
        return puntaje >= PUNTAJE_MINIMO;
    }

    @Override
    protected void manejarRechazoPorPuntaje() {
        estado = "Rechazado por puntaje insuficiente";
        System.out.println(estado + " para cliente: " + cliente.getNombre() + "\n");
    }

    @Override
    protected void manejarErrorSinAsesor() {
        System.out.println(estado + ": no hay asesores disponibles");
    }

    @Override
    protected void mostrarInformacionAsesor() {
        System.out.println("Se le asignó el asesor: " + asesor.getNombre());
    }

    @Override
    protected void procesar() {
        tarjetaCliente = asesor.manejarSolicitud(cliente.getPuntajeDataCredito());

        if (tarjetaCliente == null) {
            estado = "Rechazado";
            System.out.println("                 " + estado + " para cliente: " + cliente.getNombre() + "\n");
        } else {
            estado = "Aprobado";
            System.out.println("                     " + estado + " para cliente: " + cliente.getNombre() + "\n");
        }
    }

    @Override
    public TarjetaCredito getTarjetaCliente() {
        return tarjetaCliente;
    }
}
