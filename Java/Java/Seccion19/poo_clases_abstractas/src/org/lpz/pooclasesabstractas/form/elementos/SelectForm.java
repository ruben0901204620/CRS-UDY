package org.lpz.pooclasesabstractas.form.elementos;

import org.lpz.pooclasesabstractas.form.elementos.select.Opcion;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion) {
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHTML() {
        StringBuffer sb = new StringBuffer("<select ");
        sb.append("name=' ")
                .append(this.nombre)
                .append("'>");

        for(Opcion opcion: this.opciones) {
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if(opcion.isSelected()) {
                sb.append("selected");
                this.valor = opcion.getValor();
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }


}
