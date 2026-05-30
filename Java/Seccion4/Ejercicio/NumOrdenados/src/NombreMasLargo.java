import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String nombreCompleto1 = JOptionPane.showInputDialog("1. Ingrese un nombre y un apellido:");
        String nombreCompleto2 = JOptionPane.showInputDialog("2. Ingrese un nombre y un apellido:");
        String nombreCompleto3 = JOptionPane.showInputDialog("3. Ingrese un nombre y un apellido:");

        int largo1 = nombreCompleto1.split(" ")[0].length();
        int largo2 = nombreCompleto2.split(" ")[0].length();
        int largo3 = nombreCompleto3.split(" ")[0].length();

        if ( (largo1 > largo2) && (largo1 > largo3) ) {
            JOptionPane.showMessageDialog(null,nombreCompleto1+" tiene el nombre mas largo.");
        } else if ( (largo2>largo1) && (largo2>largo3)) {
            JOptionPane.showMessageDialog(null,nombreCompleto2+" tiene el nombre mas largo.");
        } else {
            JOptionPane.showMessageDialog(null,nombreCompleto3+" tiene el nombre mas largo.");
        }

    }
}