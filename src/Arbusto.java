public class Arbusto extends Planta{
    private int anchArbusto;
    private boolean esDomestico;
    private String varArbusto;
    private String colorHojas;
    private boolean sePoda;

    public Arbusto(String nombre, Long tamanioTallo, boolean tieneHojas, String climaIdeal, String colorPet) {
        super(nombre, tamanioTallo, tieneHojas, climaIdeal, colorPet);
    }

    public Arbusto() {
    }

    @Override
    protected void decirLoQueSoy() {
        System.out.println("Hola soy un arbusto");
    }

    public int getAnchArbusto() {
        return anchArbusto;
    }

    public void setAnchArbusto(int anchArbusto) {
        this.anchArbusto = anchArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVarArbusto() {
        return varArbusto;
    }

    public void setVarArbusto(String varArbusto) {
        this.varArbusto = varArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }
}
