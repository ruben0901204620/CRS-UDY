import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows04layoutBorder extends JFrame implements ActionListener {

    public Windows04layoutBorder() {
        super("Ejemplo de Boton y eventos.");

        JPanel panel = new JPanel(new BorderLayout(8, 4));


        JButton button = new JButton("Aceptar");

        button.addActionListener(event -> System.out.println("Boton pulsado 2"));
        button.addActionListener(this);
        button.addActionListener(new ButtonClickListener());

        button.setSize(200, 100);
        //button.setPreferredSize(new Dimension(200, 100));
        panel.add(button, BorderLayout.CENTER);
        panel.add(new Button("NORTH"), BorderLayout.NORTH);
        panel.add(new Button("SOUTH"), BorderLayout.SOUTH);
        panel.add(new Button("WEST"), BorderLayout.WEST);
        panel.add(new Button("EAST"), BorderLayout.EAST);

        setContentPane(panel);
        setSize(600, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    static void main() {
        new Windows04layoutBorder();

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
