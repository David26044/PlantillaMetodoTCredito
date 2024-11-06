/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author ACER
 */
public class SistemaBanco{

    private static SistemaBanco instancia;
    private double generarNTarjeta;
    
    private SistemaBanco() {

        generarNTarjeta = 10000000;
    }

    public static SistemaBanco getInstance() {
        if (instancia == null) {
            instancia = new SistemaBanco();
        }
        return instancia;
    }
    
    public TarjetaCredito procesarSolicitud(int puntajeDataCredito) {
            generarNTarjeta+=1;
            TarjetaCredito tarjeta = new TarjetaCredito(1000000, generarNTarjeta);
            return tarjeta;
    }
}
