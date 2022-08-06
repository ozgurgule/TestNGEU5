package practiceMuaz;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Muaz");
        s1.setAge(17);
        s1.setFootbolclup("Galatasaray");
        System.out.println(s1.toString());
        System.out.println("s1.getName() = " + s1.getName());
        s1.team();


    }
}
