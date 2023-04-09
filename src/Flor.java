public class Flor extends Planta{
    private String colorPetalo;
    private int cantProm;
    private String colorPistilo;
    private String colorPet;
    private String varFlor;
    private String estacionFlorece;

    public Flor() {
    }

    public Flor(String nombre, Long tamanioTallo, boolean tieneHojas, String climaIdeal, String colorPet, String colorPetalo, int cantProm, String colorPistilo, String colorPet1, String varFlor, String estacionFlorece) {
        super(nombre, tamanioTallo, tieneHojas, climaIdeal, colorPet);
        this.colorPetalo = colorPetalo;
        this.cantProm = cantProm;
        this.colorPistilo = colorPistilo;
        this.colorPet = colorPet1;
        this.varFlor = varFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPetalo() {
        return colorPetalo;
    }

    public void setColorPetalo(String colorPetalo) {
        this.colorPetalo = colorPetalo;
    }

    public int getCantProm() {
        return cantProm;
    }

    public void setCantProm(int cantProm) {
        this.cantProm = cantProm;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    @Override
    public String getColorPet() {
        return colorPet;
    }

    @Override
    public void setColorPet(String colorPet) {
        this.colorPet = colorPet;
    }

    @Override
    protected void decirLoQueSoy() {
        System.out.println("Hola soy una flor");
    }

    public String getVarFlor() {
        return varFlor;
    }

    public void setVarFlor(String varFlor) {
        this.varFlor = varFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }
}
