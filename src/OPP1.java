public class OPP1 {
    public static void main(String[] args) {
        Persona p1 = new Persona();

        Major p1M = new Major();
        p1M.majorName = "IT on something";
        p1M.duration = 5;
        p1M.inCourse = true;

        p1.name = "agus";
        p1.subName = "xd";
        p1.age = 23;
        p1.isAlive = true;
        p1.major = p1M;

        Persona p2 = new Persona();
        Major p2M = new Major();
        p2M.majorName = "Psychology in weed";
        p2M.duration = 4;
        p2M.inCourse = false;

        p2.name = "suga";
        p2.subName = "nit";
        p2.age = 20;
        p2.isAlive = false;
        p2.major = p2M;

        System.out.printf("Person 1: Name & subname: %s, age: %d, alive?: %b\n", p1.getName(), p1.age, p1.isAlive);
        System.out.println(p1.saluteTo(p1.getName()));
        System.out.println(p1.getMajorInfo());
        System.out.println(p1.major.duration);
        System.out.println();

        System.out.printf("Person 2: Name & subname: %s, age: %d, alive?: %b\n", p2.getName(), p2.age, p2.isAlive);
        System.out.println(p2.saluteTo(p2.getName()));
        System.out.println(p2.getMajorInfo());
        System.out.println(p2.major.majorName);
    }
}