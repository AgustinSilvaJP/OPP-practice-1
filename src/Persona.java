public class Persona {
    //atributos (estado/caracteristicas de un objeto);
    private String name;
    private String subName;
    private int age;
    private boolean isAlive;

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

    //getters
    public String getName(){
        return name.toUpperCase();
    }
    public String getSubName(){
        return subName.toUpperCase();
    }
    public String getCompleteName(){
        return getName() + " " + getSubName();
    }
    public int getAge(){
        return age;
    }
    public boolean getAlive(){
        return isAlive;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setSubName(String subName){
        this.subName = subName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAlive(boolean state){
        isAlive = state;
    }
    public String saluteTo(String personToSalute){
        if(isAlive) return "Good day " + personToSalute + " how are you?";
        return personToSalute + " is dead... F";
    }
}
