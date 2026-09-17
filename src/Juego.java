public class Juego extends Aplicacion{

    private boolean multijugador ;

    public Juego(String nombre, String version, double pesoMB, boolean multijugador) {
        super(nombre, version, pesoMB);
        this.multijugador = multijugador;
    }

    public boolean isMultijugador() {
        return multijugador;
    }

    public void setMultijugador(boolean multijugador) {
        this.multijugador = multijugador;
    }

    @Override
    public String devolverInfoString() {
        return super.devolverInfoString() + "\nMultijugador: " + multijugador;
    }
}
