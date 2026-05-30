package ejempllo1;
public class Estudiante {
    private String nombreCompleto;

    public Estudiante() {

    }

    public Estudiante(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;

    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombreCompleto;
    }

}