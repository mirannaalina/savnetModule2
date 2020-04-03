package tema1.Exercitiu2;

public class Carte {

    String nume;
    String autor;
    double pret;
    Gen gen;

    public Carte(String nume, String autor, double pret, Gen gen) {
        this.nume = nume;
        this.autor = autor;
        this.pret = pret;
        this.gen= gen;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "nume='" + nume + '\'' +
                ", autor='" + autor + '\'' +
                ", pret=" + pret +
                ", gen=" + gen +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Gen getGen() {
        return gen;
    }

    public void setGen(Gen gen) {
        this.gen = gen;
    }
}
