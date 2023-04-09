public abstract class Planta {
    private String nombre;
    private  double tamanioTallo;
    private boolean tieneHojas;
    private String climaIdeal;
    private String colorPet;

    public Planta() {
    }

    public Planta(String nombre, double tamanioTallo, boolean tieneHojas, String climaIdeal, String colorPet) {
        this.nombre = nombre;
        this.tamanioTallo = tamanioTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
        this.colorPet = colorPet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamanioTallo() {
        return tamanioTallo;
    }

    public void setTamanioTallo(Long tamanioTallo) {
        this.tamanioTallo = tamanioTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String    getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public String getColorPet() {
        return colorPet;
    }

    public void setColorPet(String colorPet) {
        this.colorPet = colorPet;
    }
    protected abstract void decirLoQueSoy();
}
