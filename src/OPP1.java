public class OPP1 {
    public static void main(String[] args) {
        Animal animal = new Animal("joseph", 20);
        System.out.println(Animal.getAnimalCount());

        Cat gato = new Cat("uwu", 23);
        System.out.println(Cat.getAnimalCount());

        Dog perro = new Dog("Firu", 10);
        System.out.println(Dog.getAnimalCount());

        System.out.println(animal.animalSound());
        System.out.println(gato.animalSound());
        System.out.println(perro.animalSound());
    }
}