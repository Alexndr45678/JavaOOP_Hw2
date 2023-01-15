public class Duck extends Animal implements Runable, Flyable, Swimming {
    public Duck(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Quack-quack";
    }

    @Override
    public int speedFly() {
        return 40;
    }

    @Override
    public int speedRun() {
        return 10;
    }
    @Override
    public int swimmingSpeed() {
        return 5;
    }
}
