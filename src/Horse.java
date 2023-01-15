public class Horse extends Animal implements Runable{
    public Horse(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Igogo";
    }
    @Override
    public String toString() {
        return "Horse " + super.toString();
    }

    @Override
    public int speedRun() {
        return 60;
    }
}
