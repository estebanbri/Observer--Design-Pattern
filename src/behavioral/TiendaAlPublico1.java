package behavioral;

public class TiendaAlPublico1 extends Observer {

    private String nombreTienda = "TiendaAlPublico1";

    @Override
    void update() {
        System.out.println("Hola " + nombreTienda + " Mercado Libre tiene Stock...");
    }
}
