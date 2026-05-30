import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Ruben","Pepe","Paco","Maria","Pedro"};
        int count = nombres.length;

        for(int i = 0; i < count; i++) {
            if(nombres[i].equalsIgnoreCase("pedro") ||
                    nombres[i].equalsIgnoreCase("maria")) {
                continue;
            }
            System.out.println("Nombres: " +nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre: ");
        System.out.println("Buscar: " + buscar);

        boolean encontrado = false;

        for(int i = 0; i < count; i++) {
            if( nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }

        if(encontrado) {
            JOptionPane.showMessageDialog(null,buscar + " fue encontrado.");
        } else{
            JOptionPane.showMessageDialog(null,"No existe en el sistema...");
        }


    }
}
