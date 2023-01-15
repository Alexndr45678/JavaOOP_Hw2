import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> animals;
    private Radio radio = new Radio();

    public Zoo(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public Zoo addAnimal(Animal a) {
        animals.add(a);
        return this;
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> answer = new ArrayList<Speakable>();
        for (Animal an : animals) {
            answer.add(an);
        }
        answer.add(radio);
        return answer;
    }

    public List<Runable> getRunner() {
        List<Runable> result = new ArrayList<Runable>();
        for (Animal an : animals) {
            if (an instanceof Runable) {
                result.add((Runable) an);
            }
        }
        return result;
    }

    public int getChampOfRunner() {
        int maxSpeed = 0;
        for (Runable runner : getRunner()) {
            if (maxSpeed < runner.speedRun()) {
                maxSpeed = runner.speedRun();
            }
        }
        return maxSpeed;
    }

    public List<Flyable> getFlyers() {
        List<Flyable> result = new ArrayList<Flyable>();
        for (Animal an : animals) {
            if (an instanceof Flyable) {
                result.add((Flyable) an);
            }
        }
        return result;
    }

    public List<Swimming> getSwimmers() {
        List<Swimming> result = new ArrayList<Swimming>();
        for (Animal an : animals) {
            if (an instanceof Swimming) {
                result.add((Swimming) an);
            }
        }
        return result;
    }

    public int getChampOfSwimming() {
        int maxSpeed = 0;
        for (Swimming swimmer : getSwimmers()) {
            if (maxSpeed < swimmer.swimmingSpeed()) {
                maxSpeed = swimmer.swimmingSpeed();
            }
        }
        return maxSpeed;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
