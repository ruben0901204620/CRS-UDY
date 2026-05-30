package org.lpz.anotaciones.ejemplo;


import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD) // campo
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAtributo {
    String nombre() default "";
    boolean capitalizar() default false;
}
