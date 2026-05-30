package tipos_genericos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T>{
    private List<T> objetos;
    private int max;

    public Camion() {
    }

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(T o) {
        if(this.objetos.size() <= max) {
            this.objetos.add(o);

        } else {
            System.out.println("No se puede agregar mas objetos.");
        }

    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }

    
}
