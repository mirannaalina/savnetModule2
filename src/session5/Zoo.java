package session5;

public class Zoo {

    void checkedException () throws Exception {
        throw new RuntimeException("e");
    }

    public static void main(String[] args) throws Exception {
        String[] animals = new String[2];
        animals[0]="a";
        animals[1]="b";
        System.out.println(animals.length);
        Zoo z= new Zoo();
        z.checkedException();
    }
}
