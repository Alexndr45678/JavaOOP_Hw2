public class Delphin extends Animal implements Swimming {
    public Delphin(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Whistling";
    }

    @Override
    public int swimmingSpeed() {
        return 50;
    }
}
