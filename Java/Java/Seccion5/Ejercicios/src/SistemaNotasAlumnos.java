import java.util.Scanner;

public class SistemaNotasAlumnos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        double promedioDeCinco=0, promedioDeCuatro=0, promedioTotal=0;
        double sumaDeCinco=0, sumaDeCuatro =0, sumaTotal=0;
        int contenedorDeCinco = 0, contenedorDeCuatro = 0;
        int conteoUno=0,  notasIngresadas = 0;

        for(int i = 1; i<=20;i++) {
            System.out.print(i + ". Ingrese una nota, dentro del rango 1-7: ");
            nota = entrada.nextDouble();

                if(nota == 0) {
                    System.out.println("Error finalizando el programa.");
                    break;
                }
                notasIngresadas++;

                if(nota == 1) {
                    conteoUno++;
                }

                if (nota > 5) {
                    contenedorDeCinco++;
                    sumaDeCinco += nota;
                    promedioDeCinco = (contenedorDeCinco > 0) ? sumaDeCinco / contenedorDeCinco : 0;
                }
                if(nota < 4) {
                    contenedorDeCuatro++;
                    sumaDeCuatro += nota;
                    promedioDeCuatro = (contenedorDeCuatro > 0) ? sumaDeCuatro / contenedorDeCuatro : 0;

                }
            sumaTotal += nota;
            promedioTotal = (notasIngresadas > 0) ? sumaTotal / notasIngresadas : 0;
        }


        System.out.println("El promedio mayor a 5 es : " + promedioDeCinco);
        System.out.println("El promedio menor a 4 es : " + promedioDeCuatro);
        System.out.println("El promedio total es: " + promedioTotal);
        System.out.println("La cantidad de uno es de : " + conteoUno);

    }
}
