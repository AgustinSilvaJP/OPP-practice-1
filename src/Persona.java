public class Persona {
    //atributos (estado/caracteristicas de un objeto);
    public String name;
    public String subName;
    public int age;
    public boolean isAlive;

    //metodos (comportamientos de un objeto)

    public String getName(){
        return name + " " + subName;
    }

    public String saluteTo(String personToSalute){
        if(isAlive) return "Good day " + personToSalute + " how are you?";

        return personToSalute + " is dead... F";
    }
}
