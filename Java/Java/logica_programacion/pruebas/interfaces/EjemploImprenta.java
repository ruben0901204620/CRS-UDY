package interfaces;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Ruben", "Lopez"),
        "ing. de sistemas","Resumen laboral...");

        cv.addExperiencias("Java")
        .addExperiencias("Puthon")
        .addExperiencias("MYSQL")
        .addExperiencias("SQLSERVER");

        Informe informe = new Informe(new Persona("Armando", "Luch"), 
        new Persona("Jorge", "Diaz"), "Estudio sobre analisis de datos");


        Imprimible.imprimir(cv);
        Imprimible.imprimir(informe);


    }
    
}
