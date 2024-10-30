import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class examenGUI {
    private JComboBox razaC;
    private JTextArea textArea1;
    private JButton agregarGuerreroButton;
    private JButton mostrarGuerreroButton;
    private JTextField nombreF;
    private JTextField nivelP;
    private JTextField habilidadF;
    private JButton calcularPoderButton;
    private JButton copiarGuerreroButton;
    private JPanel pGeneral;
    private ColaGuerreros colaGuerreros;

    public examenGUI() {
        colaGuerreros = new ColaGuerreros();

        agregarGuerreroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreF.getText();
                String raza = (String) razaC.getSelectedItem();
                int nivelPoder;
                try {
                    nivelPoder = Integer.parseInt(nivelP.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "El nivel de poder debe ser un número ertero");
                    return;
                }
                String habilidad = habilidadF.getText();

                Guerrero guerrero = new Guerrero(nombre, raza, nivelPoder, habilidad);
                colaGuerreros.encolarGuerrero(guerrero);
                JOptionPane.showMessageDialog(null, "Guerrero agregado a la cola");

                nombreF.setText("");
                nivelP.setText("");
                habilidadF.setText("");
            }

        });
        mostrarGuerreroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(colaGuerreros.mostrarCola());

            }
        });
        calcularPoderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colaGuerreros.mostrarPoderGuerreros();
            }
        });

        copiarGuerreroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String habilidad = habilidadF.getText();
                if (habilidad.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese una habilidad para copiar guerreros.");
                    return;
                }
                String infoColas = colaGuerreros.copiarGuerrerosPorHabilidad(habilidad);
                textArea1.setText(infoColas);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("examenGUI");
        frame.setContentPane(new examenGUI().pGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
