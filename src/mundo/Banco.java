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
public class Banco {

    public static void main(String[] args) {
        //primero el banco debe tener asesores.
        Asesor asesor1 = new Asesor("Camilo", 1);
        Asesor asesor2 = new Asesor("Santiago", 2);
        Asesor asesor3 = new Asesor("Felipe", 3);

        //Creo el gestor de asesores y agrego asesores para que en el momento que un cliente haga una solicitud se le asifne un asesor
        GestorAsesores gestorAsesores1 = GestorAsesores.getInstance();
        System.out.println("Agrego a: " + asesor1.getNombre() + " desde gestorAsesores1");
        gestorAsesores1.addAsesor(asesor1);
        System.out.println("Agrego a: " + asesor2.getNombre() + " desde gestorAsesores1");
        gestorAsesores1.addAsesor(asesor2);

        //creo otro gestor y agrego un asesor
        GestorAsesores gestorAsesores2 = GestorAsesores.getInstance();
        System.out.println("Agrego a: " + asesor2.getNombre() + " desde gestorAsesores2");
        gestorAsesores2.addAsesor(asesor3);

        System.out.println("");
        System.out.println("Imprimo todos los asesores desde gestorAsesores1");
        for (Asesor asesor : gestorAsesores1.listarAsesores()) {
            System.out.println(asesor.getNombre());
        }
        System.out.println("");
        //Ahora creo el cliente e inicia una solicitud
        Persona cliente1 = new Persona("1021669009", "David", "Carreño", 350);
        cliente1.solicitarTarjetaCredito(new Date(2024, 9, 17));

        Persona cliente2 = new Persona("79751458", "Angela", "Parra", 701);
        cliente2.solicitarTarjetaCredito(new Date(2024, 9, 17));

        Persona cliente3 = new Persona("79751458", "Alejandro", "Acevedo", 701);
        cliente3.solicitarTarjetaCredito(new Date(2024, 9, 17));

        cliente3.solicitarTarjetaCredito(new Date(2024, 9, 17));
    }
}
