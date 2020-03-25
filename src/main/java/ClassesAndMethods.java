public class ClassesAndMethods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Pipirio");
        person1.getName();

    }
}


class Person{
    private String name="Olen";
    private int age;
    void speak(){
        System.out.println("Method speak working nice");
    }
    int calculate(){
        return 123*age;
    }
    public void setName(String username) {
        name = username;
    }

    public String getName(){
        return name;
    }

}

