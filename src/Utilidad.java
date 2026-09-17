public class Utilidad extends Aplicacion {

    private String categoria;

    public Utilidad(String nombre, String version, double pesoMB, String categoria) {
        super(nombre, version, pesoMB);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String devolverInfoString() {
        return super.devolverInfoString() + "\nCategoria: " + categoria;
    }
}
