public class Arbol extends Planta{
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHoja;

    public Arbol() {
    }

    @Override
    protected void decirLoQueSoy() {
        System.out.println("Hola soy un árbol");
    }

    public Arbol(String nombre, double tamanioTallo, boolean tieneHojas, String climaIdeal,
                 String colorPet, String variedad, String tipoTronco, double radioTronco,
                 String color, String tipoHoja) {
        super(nombre, tamanioTallo, tieneHojas, climaIdeal, colorPet);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoHoja = tipoHoja;
    }
}
