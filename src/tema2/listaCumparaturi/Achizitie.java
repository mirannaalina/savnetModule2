package tema2.listaCumparaturi;

public class Achizitie implements Comparable<Achizitie>{

    private int pret,cantitate;

    int totalPrice = pret * cantitate;


    public Achizitie(int pret, int cantitate) {
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public Achizitie(){

    }

    public int totalPrice(int pret, int cantitate){
        int totalPrice = pret * cantitate;
        return totalPrice;
    }

    public double getPret() {
        return pret;
    }

    public double getCantitate() {
        return cantitate;
    }

    @Override
    public int compareTo(Achizitie o) {
        return totalPrice.compareTo(o.totalPrice);
    }
}
