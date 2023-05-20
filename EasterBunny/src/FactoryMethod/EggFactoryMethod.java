package FactoryMethod;
import DecoratorPattern.Egg;
import FactoryPattern.EggFactory;
public class EggFactoryMethod extends EggFactory {
        public enum TypeOfEggs {
            QUAILEGG,
            CHICKENEGG,
            DINOSAUREGG
        }
    @Override
    public Egg createEgg() {
        return null;
    }
}
