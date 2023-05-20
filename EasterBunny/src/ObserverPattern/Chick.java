package ObserverPattern;
public class Chick implements Observer {
    @Override
        public void update() {
            System.out.println("Яйцата са готови!");
        }
}
