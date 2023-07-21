public class App {
    public static void main(String[] args) throws Exception {
        Cow ngua = new Cow();
        ngua.sound();
        ngua.eat();
        ngua.eat(5);
        Duck donald = new Duck();
        donald.sound();
        Pig piglet = new Pig();
        piglet.sound();
        Owl hedwig = new Owl();
        hedwig.sound();
        PekingDuck daisy = new PekingDuck();

        donald.clean(ngua);
        donald.clean(piglet);
        donald.clean(hedwig);
        daisy.clean(donald);
    }
}
