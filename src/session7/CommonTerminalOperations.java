package session7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonTerminalOperations {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count());
        Stream<String> sMin = Stream.of("monkey", "ape", "bonobo");
        //if s1.length()-s2.length() = 0 or negative value => nothing is done,else change elements order
        //s1=monkey and s2=ape
        //s1.length()-s2.length() =>6-3=3 => "ape","monkey", "bonobo"
        //s1=monkey and s2=bonobo
        //s1.length()-s2.length() => 6-6 = 0 => "ape","monkey", "bonobo"
        Optional<String> min = sMin.min((s1, s2) -> s1.length()-s2.length());
        min.ifPresent(System.out::println); // ape
        Stream<String> sMax = Stream.of("monkey", "ape", "bonobo");
        Optional<String> max = sMax.max((s1, s2) -> s1.length()- s2.length());
        max.ifPresent(System.out::println); // ape
        //we can not use a stream twice
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        stream.findAny().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp
        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infiniteAnyMatch = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infiniteAnyMatch.anyMatch(pred)); // true
        Stream<String> sForEach = Stream.of("Monkey", "Gorilla",
                "Bonobo");
        sForEach.forEach(System.out::println); // MonkeyGorillaBonobo
        Stream<String> streamSet = Stream.of("w", "o", "l", "f");
        Set<String> set = streamSet.collect(Collectors.toSet());
        System.out.println(set); // [f, w, l, o]
    }
}
