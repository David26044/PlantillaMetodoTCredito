/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author ACER
 */
public class Asesor {

    private String nombre;
    private int codEmpleado;
    private SistemaBanco sistemaBanco;

    public Asesor(String nombre, int codEmpleado) {
        this.nombre = nombre;
        this.codEmpleado = codEmpleado;
        this.sistemaBanco = SistemaBanco.getInstance();
    }
    
    //El asesor pide al sistema que procese la solicitud, retornara null si el sistema no la aprobo o != null si la aprobo
    public TarjetaCredito manejarSolicitud(int puntajeDataCredito){
        System.out.println("            Asesor: " + nombre + " le pide al sistema procesar la solicitud");
        return sistemaBanco.procesarSolicitud(puntajeDataCredito);
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }
    
}
