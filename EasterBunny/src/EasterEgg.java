import SingletonPattern.Bunny;
import FactoryPattern.EggFactory;
import FactoryMethod.EggFactoryMethod;
import DecoratorPattern.ColorEgg;
import DecoratorPattern.StickerEgg;
import DecoratorPattern.Egg;
import ObserverPattern.Chick;

public class EasterEgg {
    public static void main(String[] args) {
        Bunny bunny = Bunny.getInstance();
        Chick chicken1 = new Chick();
        Chick chicken2 = new Chick();
        Chick chicken3 = new Chick();

        bunny.addObserver(chicken1);
        bunny.addObserver(chicken2);
        bunny.addObserver(chicken3);

        EggFactory eggFactory = new EggFactoryMethod();
        Egg egg = eggFactory.createEgg();
        egg = new ColorEgg(egg);
        egg = new StickerEgg(egg);

        bunny.prepareEggs();
    }
}