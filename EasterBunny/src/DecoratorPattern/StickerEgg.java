package DecoratorPattern;
public class StickerEgg extends Decorator {
    public StickerEgg(Egg decoratedEgg) {
        super(decoratedEgg);
    }
    @Override
        public void prepare() {
            super.prepare();
        }
}
