public class animalDriver {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Animal bird1 = new Bird();
        Dog dog2 = new Dog();

        dog1.makeSound();
        bird1.makeSound();
        dog1.move();
        bird1.move();

        String hw = dog2.misbehave("homework");

        System.out.println(hw);

    }
}
