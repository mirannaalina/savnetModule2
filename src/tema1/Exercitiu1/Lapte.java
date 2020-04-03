package tema1.Exercitiu1;


public class Lapte extends Ingredient {

private double procentaj;

    public Lapte(final int cantitate, final double procentaj) {
        super(cantitate);
        this.procentaj = procentaj;
    }

    @Override
    public String toString() {
        return "Lapte{" +
                "procentaj=" + procentaj +
                ", cantitate=" + cantitate +
                '}';
    }
}
