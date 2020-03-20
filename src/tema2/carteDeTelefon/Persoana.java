package tema2.carteDeTelefon;

public class Persoana {

    String cnp,nume,prenume,localitate,nr;

    public Persoana(String cnp, String nume, String prenume, String localitate,String nr) {
        this.cnp = cnp;
        this.nume = nume;
        this.prenume = prenume;
        this.localitate = localitate;
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "cnp='" + cnp + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", localitate='" + localitate + '\'' +
                ", nr='" + nr + '\'' +
                '}';
    }
}
