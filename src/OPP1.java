public class OPP1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("agus", "silva", 5, true);

        System.out.printf("Person 1: Name & subname: %s, age: %d, alive?: %b\n", p1.getName(), p1.age, p1.isAlive);
        System.out.println(p1.saluteTo(p1.getName()));
        System.out.println();

        Persona p2 = new Persona("agus", 23);
        System.out.println(p2.saluteTo(p2.getName()));
        p2.subName = "xd";

        System.out.println(p2.saluteTo(p2.getName()));
    }
}