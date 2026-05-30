public enum TipoAutomovil {
    SEDAN("Sedan", "Auto normal", 4),
    STATION_WAGON("Station wagon", "Auto nomral", 5),
    HATCHBAK("hatchback", "camioneta", 5),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 3),
    SUV("Suv", "Todo terreno deportivo", 5);


    private final String nombre;
    private final int numPuertas;
    private  final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numPuertas) {
        this.nombre = nombre;
        this.numPuertas = numPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
