import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HolaMundoVentana {
    static void main() {

        CrearYMostrarVentana();

    }

    public static void CrearYMostrarVentana() {

       //JFrame.setDefaultLookAndFeelDecorated(true); // Decora dependiendo de la config del SO.

        JFrame frame = new JFrame("Hola mundo Swing!");
        JLabel tex = new JLabel("Hola mundo!");

        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Cerrando ventana con exito!");
                System.exit(0);
            }
        });

        frame.getContentPane().add(tex);
        frame.setVisible(true);
        frame.pack();
    }




}
