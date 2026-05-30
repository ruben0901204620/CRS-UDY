package org.lpz.java.jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows06Counter extends JFrame implements ActionListener {

    private int counter;
    private JButton button = new JButton("Count");
    private JLabel result = new JLabel("Counter: 0");

    private JButton button2 = new JButton("Decrement");

    Windows06Counter() throws HeadlessException {
        super("Ejemplo Contador");

        Container panel = getContentPane();
        panel.add(button);
        panel.add(new JLabel(" - "));
        panel.add(button2);
        panel.add(result);
        panel.setLayout(new FlowLayout());
        button.addActionListener(this);
        button2.addActionListener(e -> {
            counter --;
            result.setText("Counter: " + counter);
        } );
        setVisible(true);
        setSize(400, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    static void main() {
        new Windows06Counter();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter ++;
        result.setText("Counter: ".concat( String.valueOf(counter)));


    }
}
