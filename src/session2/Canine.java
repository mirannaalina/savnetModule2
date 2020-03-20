package session2;

public class Canine {

    public double getAverageWeight(){
        return 56;
    }
}

class Wolf extends Canine{

    public double getAverageWeight(){
        return super.getAverageWeight()+20;
    }

    public static void main(String[] args) {
                System.out.println(
                new Canine().getAverageWeight());
                System.out.println(
                new Wolf().getAverageWeight());

    }
}
