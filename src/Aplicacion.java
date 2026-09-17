public abstract class Aplicacion implements Imprimible {
    private String nombre;
    private String version;
    private double pesoMB;

    public Aplicacion(String nombre, String version, double pesoMB) {
        this.nombre = nombre;
        this.version = version;
        this.pesoMB = pesoMB;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getPesoMB() {
        return pesoMB;
    }

    public void setPesoMB(double pesoMB) {
        this.pesoMB = pesoMB;
    }

    @Override
    public String devolverInfoString() {
        return "Nombre: " + nombre + "\nVersion: " + version + "\nPeso" + pesoMB;
    }
}
