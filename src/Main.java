public class Main {
    public static void main(String[] args) {
        Aplicacion aplicacion1 = new Juego("juego1","1.0",5.5,true);
        Aplicacion aplicacion2 = new Utilidad("aplicacion2","1.0",1.0,"calculadora");

        System.out.println(aplicacion1.devolverInfoString());

        System.out.println(aplicacion2.devolverInfoString());
    }
}

