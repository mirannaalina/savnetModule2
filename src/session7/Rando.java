package session7;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;
public class Rando {

        public static void main(String[] args) {
            Supplier<Integer> randomNumbersSupp=() -> new Random().nextInt(10);

            Supplier<Integer> anon =  new Supplier(){
                @Override
                public Object get() {
                    return 4;
                }
            };

            System.out.println(randomNumbersSupp.get());
            System.out.println(anon.get());
        }
}

