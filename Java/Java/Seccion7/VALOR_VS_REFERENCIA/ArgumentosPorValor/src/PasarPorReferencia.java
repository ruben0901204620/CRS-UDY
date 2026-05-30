public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad  = {10,11,12};

        System.out.println("Iniciamos el metodo main");
        for ( int i = 0; i < edad.length; i ++) {
            System.out.println("Edad[i]: " + edad[i]);

        }

        System.out.println("Antes de llamar al metodo test");
        test(edad);
        System.out.println("Desoues de llamar al metodo test");

        /*for ( int i = 0; i < edad.length; i ++) {
            System.out.println("Edad[i]: " + edad[i]);

        }*/

        System.out.println("Finaliza el metodo main con los datos del arreglo modificado.");

    }

    public static void test(int[] edadArr) {
        System.out.println("Iniciamos el metodo test");
        for ( int i = 0; i < edadArr.length; i ++) {
            edadArr[i] = edadArr[i] + 20;
            System.out.println("Edad[i]: " + edadArr[i]);

        }

        System.out.println("Finaliza el metodo test");

    }

}
