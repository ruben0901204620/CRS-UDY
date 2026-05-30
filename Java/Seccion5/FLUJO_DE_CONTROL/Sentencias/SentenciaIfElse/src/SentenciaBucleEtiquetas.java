public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {

        bucle:
        for (int dia = 1; dia <= 7; dia++) {
            int horas = 1;
            while( horas <= 8) {
                if (dia == 6 || dia == 7) {
                    System.out.println("Dia: " + dia + ": descanso el fin de semana.");
                    continue bucle;
                }
                System.out.println("Dia " + dia + ", trabajando a las " + horas + "hrs.");
                horas++;
            }
        }

        System.out.println("\n\n=================================================================================");

        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i= " + i + " , j= " + j + "]");
            }
        }

        System.out.println("\n\n=================================================================================");

        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i= " + i + " , j= " + j + "]");
            }
        }

    }
}
