package session1.Inheritance;

public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal() {

    }

    public Animal(int age) {
        this.age = age;

    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
