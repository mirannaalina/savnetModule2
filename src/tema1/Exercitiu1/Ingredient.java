package tema1.Exercitiu1;

public class Ingredient {

    protected int cantitate;

    public Ingredient(int cantitate) {
        super();
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return String.valueOf(cantitate);
    }

}
