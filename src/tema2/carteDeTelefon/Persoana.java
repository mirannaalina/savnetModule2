package tema2.carteDeTelefon;

public class Persoana {

    String cnp,nume,prenume,localitate;

    public Persoana(String cnp, String nume, String prenume, String localitate) {
        this.cnp = cnp;
        this.nume = nume;
        this.prenume = prenume;
        this.localitate = localitate;

    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }


    @Override
    public String toString() {
        return "Persoana{" +
                "cnp='" + cnp + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", localitate='" + localitate + '\'';
    }
}
