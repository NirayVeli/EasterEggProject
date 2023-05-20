package DecoratorPattern;
public class ColorEgg extends Decorator {
    public ColorEgg(Egg decoratedEgg) {
        super(decoratedEgg);
    }
        //Painting the EGGs
        @Override
        public void prepare() {
            super.prepare();
        }
}
