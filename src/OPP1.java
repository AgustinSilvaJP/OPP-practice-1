public class OPP1 {
    public static void main(String[] args) {
        Persona p1 = new Persona();

        p1.name = "agus";
        p1.subName = "xd";
        p1.age = 23;
        p1.isAlive = true;

        Persona p2 = new Persona();
        p2.name = "suga";
        p2.subName = "nit";
        p2.age = 20;
        p2.isAlive = false;

        System.out.printf("Person 1: Name & subname: %s, age: %d, alive?: %b\n", p1.getName(), p1.age, p1.isAlive);

        System.out.println(p1.saluteTo(p1.getName()));

        System.out.println();
        System.out.printf("Person 2: Name & subname: %s, age: %d, alive?: %b\n", p2.getName(), p2.age, p2.isAlive);
        System.out.println(p2.saluteTo(p2.getName()));
    }
}