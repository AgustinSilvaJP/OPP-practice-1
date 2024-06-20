public class Persona {
    //atributos (estado/caracteristicas de un objeto);
    public String name;
    public String subName;
    public int age;
    public boolean isAlive;

    //constructor
    public Persona(String name, String subName, int age, boolean alive){
        this.name = name;
        this.subName = subName;
        this.age = age;
        isAlive = alive;
    }
    public Persona(String name, int age){
        this.name = name;
        this.subName = "";
        this.age = age;
        isAlive = true;

    }

    //metodos (comportamientos de un objeto)
    public String getName(){
        return name + " " + subName;
    }

    public String saluteTo(String personToSalute){
        if(isAlive) return "Good day " + personToSalute + " how are you?";
        return personToSalute + " is dead... F";
    }
}
