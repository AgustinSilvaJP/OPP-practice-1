public class OPP1 {
    public static void main(String[] args) {
        Persona p1 = new Persona();

        p1.name = "agus";
        p1.subName = "xd";
        p1.age = 23;
        p1.isAlive = true;

        System.out.printf("Person 1 name: %s, subname: %s, age: %d, alive?: %b\n", p1.name, p1.subName, p1.age, p1.isAlive);
    }
}