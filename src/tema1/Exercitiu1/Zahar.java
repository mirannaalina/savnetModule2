package tema1.Exercitiu1;

public class Zahar extends Ingredient {

    private String tip;

    public Zahar(final int cantitate,final  String tip) {
        super(cantitate);
        this.tip=tip;
    }

    @Override
    public String toString() {
        return "Zahar{" +
                "tip='" + tip + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
