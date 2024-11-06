/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GestorAsesores {

    private static GestorAsesores instancia;
    // Lista de asesores
    private List<Asesor> asesores;

    private GestorAsesores() {
        this.asesores = new ArrayList<>();
    }

    public static GestorAsesores getInstance() {
        if (instancia == null) {
            instancia = new GestorAsesores();
        }
        return instancia;
    }

    //para agregar asesores
    public void addAsesor(Asesor asesor) {
        asesores.add(asesor);
    }

    //Para obtener un asesor aleatorio
    public Asesor getAsesorAleatorio() {
        if (asesores.isEmpty()) {
            return null;
        }
        Random random = new Random();
        return asesores.get(random.nextInt(asesores.size()));
    }

    //para retornar la lista de los asesores
    public List<Asesor> listarAsesores() {
        return new ArrayList<>(asesores);
    }
}

