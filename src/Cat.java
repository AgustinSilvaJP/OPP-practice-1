//extends especifica herencia de Cat por parde de la clase Animal
public class Cat extends Animal{


    public Cat(String name, int age){
        //con keyword super estamos asignando informacion heredada
        super(name, age);
    }

    @Override
    public String animalSound(){
        return "nyaaa uwu";
    }
}
