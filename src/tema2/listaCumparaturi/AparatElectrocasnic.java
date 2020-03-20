package tema2.listaCumparaturi;

public class AparatElectrocasnic extends Achizitie{

    int garantie;

    public AparatElectrocasnic(double pret, double cantitate, int garantie) {
        super(pret, cantitate);
        this.garantie = garantie;
    }

    public AparatElectrocasnic(int garantie) {
        this.garantie = garantie;
    }
}
