package behavioral;

public class TiendaAlPublico2 extends Observer {

    private String nombreTienda = "TiendaAlPublico2";

    @Override
    void update() {
        System.out.println("Hola " + nombreTienda + " Mercado Libre tiene Stock...");
    }
}
