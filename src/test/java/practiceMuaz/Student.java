package practiceMuaz;

public class Student {

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", footbolclup='" + footbolclup + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFootbolclup() {
        return footbolclup;
    }

    public void setFootbolclup(String footbolclup) {
        this.footbolclup = footbolclup;
    }

    private String name;
    public int age;
    private  String footbolclup;

    public void team(){
        System.out.println(name + " favorite team is " + footbolclup);
    }

}
