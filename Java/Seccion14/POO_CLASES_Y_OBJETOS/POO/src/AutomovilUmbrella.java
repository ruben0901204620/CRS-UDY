//import org.jetbrains.annotations.NotNull;

public class AutomovilUmbrella implements Comparable<AutomovilUmbrella>{

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJA;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String CoLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azuzl";
    public static final String COLOR_BLANCO = "Blancp";
    public static final String COLOR_GRIS = "Gris";

    public AutomovilUmbrella(){
        this.id = ++ ultimoId;
        this.ruedas = new Rueda[5];
    }

    public AutomovilUmbrella(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public AutomovilUmbrella(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public AutomovilUmbrella(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public AutomovilUmbrella(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public AutomovilUmbrella(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public String getFabricante() { // leetFabricante
        return fabricante;
    }

    public void setFabricante(String fabricante) { // asignarFabricante
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        AutomovilUmbrella.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        AutomovilUmbrella.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void addRueda(Rueda rueda) {
        if(indiceRuedas < this.ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;
        }
    }

    public String verDetalle() {

        String detalle =  "auto.id: " + this.id +
                "\nauto.fabricante: " + this.getFabricante() +
                "\nauto.modelo: " + this.getModelo();
                if(this.getTipo() != null) {
                    detalle += "\nauto.tipo: " + this.getTipo().getDescripcion();

                }
                detalle = "\nauto.color: " + this.color.getColor() +
                "\nauto.colorPatente: " + AutomovilUmbrella.colorPatente.getColor();

                if(getConductor() != null) {
                    detalle += "Ruedas subaru: " + this.getConductor();
                }

                if(getRuedas() != null) {
                    detalle += "\nRuedas del automovil: ";
                    for(Rueda r : this.getRuedas()) {
                        detalle += "\n" + r.getFabricante() + " Aro: " + r.getAro() + " ancho: " + r.getAncho();
                    }
                }

        return detalle;
    }

    public String acelerar(int rpm) {
        return "El auto: " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencida) {
        return km / (estanque.getCapacidad()  * porcentajeBencida);
    }

    public float calcularConsumo(int km, int porcentajeBencida) {
        return km / (estanque.getCapacidad() * (porcentajeBencida / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencida) {
        return km / (AutomovilUmbrella.capacidadEstanqueEstatico * (porcentajeBencida / 100f));
    }

    @Override // sibreescribir metodos
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(!(obj instanceof AutomovilUmbrella)) {
            return false;
        }
        AutomovilUmbrella a = (AutomovilUmbrella) obj;
        return (this.fabricante != null && this.modelo != null  && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + ": " + fabricante + " " + modelo;
    }

    @Override
    public int compareTo( AutomovilUmbrella a) {
        return this.fabricante.compareTo(a.fabricante);
    }

}
