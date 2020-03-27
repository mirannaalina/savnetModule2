package session7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumerrr {

        public static void main(String[] args) {
            Consumer<String> print = x -> System.out.println(x);
            print.accept("java"); // java
            List<String> list=new ArrayList<String>();
            list.add("Rick");
            list.add("Negan");
            list.add("Daryl");
            list.add("Glenn");
            list.add("Carl");
            list.forEach(
                    // lambda expression
                    (name)->System.out.println(name+" x")
            );
            Consumer<List<Integer> > modify = intList ->
            {
                for (int i = 0; i < intList.size(); i++)
                    intList.set(i, 2 * intList.get(i));
            };
            List<Integer> intList = new ArrayList<Integer>();
            intList.add(2);
            intList.add(1);
            intList.add(3);
            // Implement modify using accept()
            modify.accept(intList);
            System.out.print(intList);
        }
    }

