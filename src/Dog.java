public class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public String animalSound(){
        return "guau guau... im a dog...";
    }
}
