package org.lpz.java.jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

public class Windows05CopyText extends JFrame{

     JTextField fieldValue, result; //campo de texto.

    // Implementacion de la ventana.
    public Windows05CopyText() throws HeadlessException {
        /* Jpanel panel = new Jpanel();
        *  getContentPane(panel);*/

        super("Ejemplo CopyText");
        Container panel = this.getContentPane();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Valor: "));
        fieldValue = new JTextField(10);
        panel.add(fieldValue);

        JButton button = new JButton("Copiar");
        button.addActionListener(new CopyTextActionListener());
        panel.add(button);

        result = new JTextField(10);
        panel.add(result);

        setSize(600, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    static void main() {

        JFrame frame = new Windows05CopyText();



    }

    private class CopyTextActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String value = fieldValue.getText();
            result.setText(value);
        }
    }
}
