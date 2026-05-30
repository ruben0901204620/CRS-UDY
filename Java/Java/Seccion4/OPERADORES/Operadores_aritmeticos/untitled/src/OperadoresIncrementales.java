public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre-incemento.
        int i = 1;
        int j = ++i; // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pos-incremento.
         i = 2;
         j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre-decremento.
        j = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("J = " + j);


        // Pos-decremento.
        j = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("J = " + j);

    }
}
