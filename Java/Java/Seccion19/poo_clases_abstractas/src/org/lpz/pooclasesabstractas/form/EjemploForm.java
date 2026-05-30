package org.lpz.pooclasesabstractas.form;

import org.lpz.pooclasesabstractas.form.elementos.ElementoForm;
import org.lpz.pooclasesabstractas.form.elementos.InputForm;
import org.lpz.pooclasesabstractas.form.elementos.SelectForm;
import org.lpz.pooclasesabstractas.form.elementos.TextareaForm;
import org.lpz.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);
        SelectForm lenguaje = new SelectForm("lenguaje");

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2","python"));
        lenguaje.addOpcion(new Opcion("3", "JavaScript"));
        lenguaje.addOpcion(new Opcion("4", "TypeScript"));
        lenguaje.addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHTML() {
                return "<input disabled name ='" + this.nombre + "' value=\"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hola que tal este campo esta desabilitado!");
        username.setValor("jhon.doe");
        password.setValor("a1b2c3");
        email.setValor("jhon.doe@correo.copm");
        edad.setValor("24");
        experiencia.setValor("... mas de 10 años de experiencie ...");
        java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        elementos.add(saludar);

        for(ElementoForm e: elementos) {
            System.out.println(e.dibujarHTML());
            System.out.println("<br>");
        }

    }
}
