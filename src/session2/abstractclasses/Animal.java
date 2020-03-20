package session2.abstractclasses;

public abstract class Animal {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName();
}
class Swan extends Animal {
    public String getName() {
        return "Swan";
    }

}
