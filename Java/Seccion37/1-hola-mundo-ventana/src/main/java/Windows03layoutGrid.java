import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows03layoutGrid extends JFrame implements ActionListener {

    public Windows03layoutGrid() {
        super("Ejemplo de Boton y eventos.");

        JPanel panel = new JPanel( new GridLayout(4, 3, 8, 4));
        setContentPane(panel);
        setSize(600, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        for(int i =1; 1 <=10;i++) {
            JButton button = new JButton("Aceptar".concat(String.valueOf(i)));

            button.addActionListener(event -> System.out.println("Boton pulsado 2"));
            button.addActionListener(this);
            button.addActionListener(new ButtonClickListener());

            button.setSize(200,100);
            //button.setPreferredSize(new Dimension(200, 100));
            panel.add(button);


        }



    }

    static void main() {
        new Windows03layoutGrid();

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
