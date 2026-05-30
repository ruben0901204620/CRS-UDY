public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = Integer.valueOf(1);
        num2 = 2;

        boolean primitivoBoolean = num1 > num2; // false
        Boolean objetoBoolean = Boolean.valueOf(primitivoBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf(false);
        Boolean objetoBoolean3 = true;

        System.out.println("primiBoolean: " + primitivoBoolean);
        System.out.println("objetoBoolean: " + objetoBoolean);
        System.out.println("objetoBoolean2: " + objetoBoolean2);

        System.out.println("Comparando dos objetos boolean: " + (objetoBoolean == objetoBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (objetoBoolean.equals(objetoBoolean2)));
        System.out.println("Comparando dos objetos boolean: " + (objetoBoolean2 == objetoBoolean3));
        System.out.println("Comparando dos objetos boolean: " + (objetoBoolean == objetoBoolean3));

        Boolean primitivoBoolean2 = objetoBoolean2.booleanValue();
        System.out.println("orimitivoBoolean2: " + primitivoBoolean2);



    }
}
