package session6;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speciesName, boolean hopper, boolean
            swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
    public boolean canHop() {
        return canHop;
    }
    public boolean canSwim() {
        return canSwim;
    }
    public String toString() {
        return species;
    }
}
interface CheckTrait {
    boolean test(Animal a);
}
class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }

    class PrintLib {
        public void print(List<Animal> animals, CheckTrait checker) {//secound implementation
            for (Animal animal : animals) {
                if (checker.test(animal))
                    System.out.print(animal + " ");
            }
            System.out.println();
        }
    }

    class Search {
        public void main(String[] args) {
            PrintLib printLib = new PrintLib();
            List<Animal> animals = new ArrayList<Animal>(); // list of animals
            animals.add(new Animal("fish", false, true));
            animals.add(new Animal("kangaroo", true, false));
            animals.add(new Animal("rabbit", true, false));
            animals.add(new Animal("turtle", false, true));
            print(animals);
            printLib.print(animals, new CheckIfHopper()); // pass class that doescheck
            printLib.print(animals, a -> a.canHop());//last implementation
        }

        private void print(List<Animal> animals) {//first implementation
            for (Animal animal : animals) {
                if (animal.canHop())
                    System.out.print(animal + " ");
            }
            System.out.println();
        }
    }
}
