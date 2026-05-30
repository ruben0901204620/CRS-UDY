import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows02LayoutFlow extends JFrame implements ActionListener {

    public Windows02LayoutFlow() {
        super("Ejemplo de Boton y eventos.");

        JPanel panel = new JPanel( new FlowLayout(FlowLayout.LEFT, 10, 20));

        setContentPane(panel);
        setSize(600, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        for(int i =1; 1 <=10;i++) {
            JButton button = new JButton("Aceptar".concat(String.valueOf(i)));

            button.setSize(100,60);
            button.addActionListener(this);
            button.addActionListener(event -> System.out.println("Boton pulsado 2"));
            button.addActionListener(new ButtonClickListener());

            //button.setSize(200,100);
            button.setPreferredSize(new Dimension(200, 100));
            add(button);


        }



    }

    static void main() {
        new Windows02LayoutFlow();

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
