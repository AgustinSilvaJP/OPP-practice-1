public class Animal {
    String name;
    int age;
    static int animalCount = 0;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        animalCount++;
    }
    public String animalSound(){
        return "a generic animal sound :v";
    }
    public static int getAnimalCount(){
        return animalCount;
    }
}
