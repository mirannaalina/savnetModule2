package session7;

import java.util.function.Supplier;

public class SupEx {

        public static void main(String[] args) {
            Supplier<Student> studentSupplier = () -> new Student(1, "Arpit","M", 19);
            Supplier<Object> dealer = new Supplier(){
                @Override
                public Object get() {
                    String s = "test";
                    return s;
                }
            };
            Student student = studentSupplier.get();
            System.out.println(student);
            System.out.println(dealer.get());

    }

}
