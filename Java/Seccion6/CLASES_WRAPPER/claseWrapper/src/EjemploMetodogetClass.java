import java.lang.reflect.Method;

public class EjemploMetodogetClass {
    public static void main(String[] args) {

        String texto = "hola que tal";
        Class strClass = texto.getClass();

        System.out.println("strClass: " + strClass);
        System.out.println("strClass: " + strClass.getName());
        System.out.println("strClass: " + strClass.getPackageName());
        System.out.println("strClass: " + strClass.getSimpleName());

        for(Method metodo: strClass.getMethods()) {
            System.out.println("metodo: " +metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
        System.out.println("getSuperclass().getSuperclass() = " + objClass);

        for(Method metodo: strClass.getMethods()) {
            System.out.println("metodo: " +metodo.getName());
        }




    }
}
