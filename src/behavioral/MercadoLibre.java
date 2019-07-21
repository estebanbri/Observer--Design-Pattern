package behavioral;

import java.util.ArrayList;
import java.util.List;

public class MercadoLibre implements Subject {

    private List<Observer> observers = new ArrayList<>();
    Boolean hayStock;

    @Override
    public void registrarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        System.out.println("Notificando todos los observers...");
        for(Observer observer: observers){
            observer.update();
        }
    }

    public void hayStock(Boolean hayStock) {
        this.hayStock = hayStock;
    }
}
