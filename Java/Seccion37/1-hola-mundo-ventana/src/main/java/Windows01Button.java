import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows01Button extends JFrame implements ActionListener {
    
    public Windows01Button() {
        super("Ejemplo de Boton y eventos.");

        JButton button = new JButton("Aceptar");
        button.setSize(100,60);
        button.addActionListener(this); //this: se coloca el nombre de la clase si no estuviera dentro del mismo.
        button.addActionListener(event -> System.out.println("Boton pulsado 2"));
        button.addActionListener(new ButtonClickListener());

        getContentPane().add(button);

        setSize(200, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    static void main() {
        new Windows01Button();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Boton pulsado.");
    }

    static class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Boton pulsado3.");
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
