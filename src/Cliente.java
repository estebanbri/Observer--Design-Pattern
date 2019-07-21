import behavioral.*;

public class Cliente {
    public static void main(String[] args) {

        // Observable
        MercadoLibre mercadoLibre = new MercadoLibre();

        // Observers
        Observer tiendaAlPublico1 = new TiendaAlPublico1();
        Observer tiendaAlPublico2 = new TiendaAlPublico2();

        // Registro observers
        mercadoLibre.registrarObserver(tiendaAlPublico1);
        mercadoLibre.registrarObserver(tiendaAlPublico2);

        // Hay stock
        mercadoLibre.hayStock(true);

        // Notifico observers
        mercadoLibre.notificarObservers();

    }
}
