/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author ACER
 */

import java.util.Date;

public abstract class Solicitud {

    protected String estado;
    protected Date fecha;
    protected Persona cliente;
    protected Asesor asesor;

    public Solicitud(Date fecha, Persona cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.estado = "En espera";
    }

    //define los pasos del algoritmo
    public final void procesarSolicitud() {
        if (!verificarPuntaje()) {
            manejarRechazoPorPuntaje();
            return;
        }
        asignarAsesor();
        if (asesor == null) {
            estado = "No se pudo procesar la solicitud";
            manejarErrorSinAsesor();
            return;
        }
        mostrarInformacionAsesor();
        procesar();
    }

    // Métodos abstractos que las subclases deben implementar
    protected abstract boolean verificarPuntaje();
    
    protected abstract void manejarRechazoPorPuntaje();
    
    protected void asignarAsesor() {
        asesor = GestorAsesores.getInstance().getAsesorAleatorio();
    }

    protected abstract void manejarErrorSinAsesor();

    protected abstract void mostrarInformacionAsesor();

    protected abstract void procesar();
    
    protected TarjetaCredito getTarjetaCliente(){
        return null;
    }
}
