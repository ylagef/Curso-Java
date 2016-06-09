package InterfazGrafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Yeray on 09/06/2016.
 */
public class Interfaz {

    private JPanel panel1;
    private JTextField campo1;
    private JTextField campo2;
    private JRadioButton ptasAEurosRadioButton;
    private JRadioButton eurosAPtasRadioButton;
    private JButton convertirButton;

    public Interfaz() {
        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double importe = Double.parseDouble(campo1.getText());

                if (ptasAEurosRadioButton.isSelected()) {
                    campo2.setText(Double.toString(importe * 0.006));
                } else if (eurosAPtasRadioButton.isSelected()) {
                    campo2.setText(Double.toString(importe * 166.386));
                } else {
                    campo2.setText("ERROR");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interfaz");
        frame.setContentPane(new Interfaz().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
