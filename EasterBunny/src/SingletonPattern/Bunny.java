package SingletonPattern;
import ObserverPattern.Observer;
import java.util.ArrayList;
import java.util.List;

    public class Bunny {
        private static Bunny instance;
        private Bunny() {
        }
        public static Bunny getInstance() {
            if (instance == null) {
                instance = new Bunny();
            }
            return instance;
        }
        public void prepareEggs() {
            notifyObservers();
        }
        private List<Observer> observers = new ArrayList<>();

        public void addObserver(Observer observer) {
            observers.add(observer);
        }
        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }


