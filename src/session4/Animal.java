package session4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animal {

    private String name;
    public Animal(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Animal animal = (Animal)o;
        return Objects.equals(name, animal.name);
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal a1 = new Animal("a1");
        animals.add(a1);
        Animal a2 = new Animal("a2");
        animals.add(a2);
        Animal a3 = new Animal("a3");
        animals.add(a3);
        Animal a4 = new Animal("a3");//not add in the animals list
        System.out.println(animals.contains(a4));
        System.out.println(animals.contains(a1));
    }
}
