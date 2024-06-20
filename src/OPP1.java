public class OPP1 {
    public static void main(String[] args) {
        Animal animal = new Animal("joseph", 20);
        Cat gato = new Cat("uwu", 23);
        Dog perro = new Dog("Firu", 10);

        System.out.println(animal.animalSound());
        System.out.println(gato.animalSound());
        System.out.println(perro.animalSound());
    }
}