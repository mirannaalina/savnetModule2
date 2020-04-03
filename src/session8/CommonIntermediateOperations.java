package session8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CommonIntermediateOperations {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::println); // monkey

        Stream<String> sDistinct = Stream.of("duck", "duck", "duck", "goose");
        sDistinct.distinct().forEach(System.out::println); // duckgoose

        Stream<Integer> sLimit = Stream.iterate(1, n -> n + 1);//stream infinit
        sLimit.skip(5).limit(2).forEach(System.out::print); // 67  //skip la primele 5 elemente si afiseaza urmatoarele doua 6 si 7

        Stream<String> sMap = Stream.of("monkey", "gorilla", "bonobo");
        sMap.map(String::length).forEach(System.out::print); // 676 //map ia fiecare element din string si il inlocuieste cu ce e in paranteze, aici ia lengthu pt fiecare si afiseaza care elemente are cuvantu

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);//flat map transforma mai multe liste intr un stream

        Stream<String> sToSort = Stream.of("brown-", "bear-");
        sToSort.sorted().forEach(System.out::println); // bear-brown-

        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(st -> st.startsWith("g"))
                .peek(System.out::println).count(); // grizzly System.out.println(count); // 1  //ne permite sa aruncam o privire in elementele din filtru

    }


}
