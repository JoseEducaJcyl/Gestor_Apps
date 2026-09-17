import java.util.ArrayList;

public class Dispositivo {
    private String marca;

    private double almacenamientoTotal;

    private double almacenamientoDisponible;

    private ArrayList<Aplicacion> appsInstaladas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getAlmacenamientoTotal() {
        return almacenamientoTotal;
    }

    public void setAlmacenamientoTotal(double almacenamientoTotal) {
        this.almacenamientoTotal = almacenamientoTotal;
    }

    public double getAlmacenamientoDisponible() {
        return almacenamientoDisponible;
    }

    public void setAlmacenamientoDisponible(double almacenamientoDisponible) {
        this.almacenamientoDisponible = almacenamientoDisponible;
    }

    public ArrayList<Aplicacion> getAppsInstaladas() {
        return appsInstaladas;
    }

    public void setAppsInstaladas(ArrayList<Aplicacion> appsInstaladas) {
        this.appsInstaladas = appsInstaladas;
    }

    public boolean instalarApp(Aplicacion app) {
        if (app.getPesoMB() < almacenamientoDisponible) {
            appsInstaladas.add(app);
            setAlmacenamientoTotal(almacenamientoTotal - app.getPesoMB());
            return true;

        } else {
            return false;
        }
    }

    public boolean desintalarApp(String nombreApp) {
        for (Aplicacion aplicacion : appsInstaladas) {
            if (appsInstaladas.equals(aplicacion.getNombre())) {
                appsInstaladas.remove(aplicacion.getNombre());
            }
        }
        return true;
    }

    public void listadoApps() {
        //System.out.println(appsInstaladas.);
    }
}
