package tema2.listaCumparaturi;

public class Aliment extends Achizitie {

    int dataDeExpirare;

    public Aliment(double pret, double cantitate, int dataDeExpirare) {
        super(pret, cantitate);
        this.dataDeExpirare = dataDeExpirare;
    }

    public Aliment(int dataDeExpirare) {
        this.dataDeExpirare = dataDeExpirare;
    }
}
