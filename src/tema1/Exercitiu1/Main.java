package tema1.Exercitiu1;

public class Main {

    public static void main(String[] args) {


        Lapte lapte = new Lapte(3,1.5);
        Zahar brun = new Zahar(2, "brun");
        Zahar alb = new Zahar(1, "alb");

        Cafea cafea = new Cafea(lapte, brun, alb);

        System.out.println(cafea.toString());
    }
}
