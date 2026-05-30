package orgh.guzman.optional.ejemplo;

import java.util.Optional;

public class EjemploOPtional {
    static void main() {

        String nombre = "Andres";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt: " + opt);

        System.out.println(opt.isPresent());

        if(opt.isPresent()) {
            System.out.println("Hola " + opt.get());
        }

        System.out.println("opt:" + opt.isEmpty());

        opt.ifPresent( valor -> {
            System.out.println("Hola " + valor);
        });

        nombre = null;

        opt = Optional.ofNullable(nombre);

        System.out.println("opt: " + opt);
        System.out.println("opt: " + opt.isPresent());
        System.out.println("opt: " + opt.isEmpty());

        opt.ifPresentOrElse(valor -> System.out.println("Hola " + valor), () -> {
            System.out.println("No esta presente.");
        });

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty: " + optEmpty);
        System.out.println(optEmpty.isPresent());


    }
}
