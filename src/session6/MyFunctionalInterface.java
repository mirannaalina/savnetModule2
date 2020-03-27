package session6;

@FunctionalInterface
interface MyFunctionalInterface {
    //A method with no parameter
    public String sayHello();
}
class Example1 {
    public static void main(String args[]) {
        // lambda expression
        MyFunctionalInterface msg = () -> {
            return "Hello";
        };

        MyFunctionalInterface msg1 = new MyFunctionalInterface() {
            @Override
            public String sayHello() {
                return "h";
            }
        };

        System.out.println(msg.sayHello());
        System.out.println(msg1.sayHello());
    }
}