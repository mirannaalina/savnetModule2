package session6;
@FunctionalInterface
public interface MyFunctionalInterface1 {
        //A method with single parameter
        public int incrementByFive(int a);
    }
    class Example2 {
        public static void main(String args[]) {
            // lambda expression with single parameter num
            MyFunctionalInterface1 f = (num) -> num+5;

            MyFunctionalInterface1 f1 = new MyFunctionalInterface1() {
                @Override
                public int incrementByFive(int a) {
                    return a;
                }
            };

            System.out.println(f.incrementByFive(22));
            System.out.println(f1.incrementByFive(22));
        }
    }


