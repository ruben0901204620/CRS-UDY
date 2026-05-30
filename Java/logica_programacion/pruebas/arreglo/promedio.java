import java.util.Scanner;

import javax.swing.JOptionPane;

public class promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota = 0;
        int calificacion = 0;

        int cursos = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de cursos: "));
 
        for(int i = 1; i <= cursos; i++) {
            nota = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la calificacion del curso" + (i) + ": "));
            calificacion += nota;
        }

        int promedio = calificacion / cursos;

        JOptionPane.showMessageDialog(null,"El promedio general de los cusos aprobados son: "+ promedio);

        entrada.close();



        
    }
    
}
