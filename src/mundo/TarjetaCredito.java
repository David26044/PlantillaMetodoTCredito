/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author ACER
 */
public class TarjetaCredito {

    private double cupo;
    private double numeroTarjeta;

    public TarjetaCredito(double cupo, double numeroTarjeta) {
        this.cupo = cupo;
        this.numeroTarjeta = numeroTarjeta;
        System.out.println("                Se creó la tarjeta con número: " + numeroTarjeta);
    }

    public double getCupo() {
        return cupo;
    }

    public double getNumeroTarjeta() {
        return numeroTarjeta;
    }

    
    
}
