import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class ColaGuerreros  {
    private Queue<Guerrero> cola;
    private Queue<Guerrero> colaCopia;

    public ColaGuerreros() {
        cola = new LinkedList<>();
        encolarGuerreros();
    }


    //Primer método
    private void encolarGuerreros() {
        cola.add(new Guerrero());  // Guerrero por defecto
        cola.add(new Guerrero("Dende", "Namekusein", 650, "Teletransportacion"));
        cola.add(new Guerrero("Goten", "Saiyajin", 880, "Cañón Especial"));
        cola.add(new Guerrero("Yamcha", "Terricola", 350, "Super patada"));
        cola.add(new Guerrero("Trunks", "Saiyajin", 980, "Final flash"));
    }

    // Método para encolar un guerrero específico
    public void encolarGuerrero(Guerrero guerrero) {
        cola.add(guerrero);
    }

    public String mostrarCola() {
        StringBuilder infoCola = new StringBuilder();
        for (Guerrero guerrero : cola) {
            infoCola.append(guerrero.mostrarInfo()).append("\n\n");
        }
        return infoCola.toString();
    }
    public void mostrarPoderGuerreros() {
        StringBuilder infoPoder = new StringBuilder();
        for (Guerrero guerrero : cola) {
            int poderTotal = guerrero.calculoPoder();
            infoPoder.append(guerrero.mostrarInfo())
                    .append("\nPoder Total Calculado: ").append(poderTotal)
                    .append("\n\n");
        }
        JOptionPane.showMessageDialog(null, infoPoder.toString(), "Nivel de Poder de Guerreros", JOptionPane.INFORMATION_MESSAGE);
    }
    // Método 2 Copiar guerreros de una habilidad específica
    public String copiarGuerrerosPorHabilidad(String habilidad) {
        colaCopia = new LinkedList<>();
        for (Guerrero guerrero : cola) {
            if (guerrero.getHabilidad().equalsIgnoreCase(habilidad)) {
                colaCopia.add(guerrero);
            }
        }

        StringBuilder infoOriginal = new StringBuilder("Cola Original:\n");
        for (Guerrero guerrero : cola) {
            infoOriginal.append(guerrero.mostrarInfo()).append("\n\n");
        }

        StringBuilder infoCopia = new StringBuilder("Cola Copia (Habilidad: " + habilidad + "):\n");
        for (Guerrero guerrero : colaCopia) {
            infoCopia.append(guerrero.mostrarInfo()).append("\n\n");
        }

        return infoOriginal.toString() + "\n\n" + infoCopia.toString();
    }

}
