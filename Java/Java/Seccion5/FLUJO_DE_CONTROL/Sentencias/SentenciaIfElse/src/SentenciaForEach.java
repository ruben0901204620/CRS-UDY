public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7 ,9 , 11, 13, 14};

        for (int num: numeros) {
            System.out.println("numero: " + num);
        }

        System.out.println("\n");
        String[] nombres = {"Ruben","Pepe","Paco","Maria","Pedro"};
        for(String nom: nombres) {
            System.out.println("nombre: " + nom);
        }
    }
}
