package DecoratorPattern;
public abstract class Decorator implements Egg {
        protected Egg decoratedEgg;
        public Decorator(Egg decoratedEgg) {
            this.decoratedEgg = decoratedEgg;
        }
            @Override
            public void prepare() {
                decoratedEgg.prepare();
            }
    }

