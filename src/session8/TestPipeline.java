package session8;

import java.util.Arrays;
import java.util.List;

public class TestPipeline {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list.stream().filter(n -> n.length() == 4).sorted()
                .limit(2).forEach(System.out::println);
    }

}
