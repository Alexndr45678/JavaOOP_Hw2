//На основе работы на уроке сделать:
//1) Создать интерфейс, скорость плаванья.
//2) Добавить новое животное, способное плавать.
//3) Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo(new ArrayList<>());
        zoo1.addAnimal(new Cat("Jess", 1, "black-gray"))
                .addAnimal(new Horse("Snow", 2))
                .addAnimal(new Duck("Donald", 3))
                .addAnimal(new Delphin("Flipper", 4));

        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an + "\n" + an.say());
        }
        System.out.println("-------------");

        for (Speakable speak : zoo1.getSpeakable()) {
            System.out.println(speak.say());
        }
        int max = zoo1.getChampOfRunner();
        System.out.println(String.format("Max of speed in the zoo is %d", max));

        for (Runable runner : zoo1.getRunner()) {
            System.out.println("Speed is: " + runner.speedRun());
        }
        System.out.println("--------------------");

        for (Flyable flyer : zoo1.getFlyers()) {
            System.out.printf("Speed of fly is: %d \n", flyer.speedFly());
        }
        System.out.println("-------------------->  HOMEWORK №2  <--------------------");

        for (Swimming swimmer: zoo1.getSwimmers()) {
            System.out.println("Speed of swimmer: " + swimmer.swimmingSpeed());
        }
        int maxswim = zoo1.getChampOfSwimming();
        System.out.printf("Max speed among swimmers: %d", maxswim);
    }
}
