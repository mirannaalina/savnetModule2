package tema1.Exercitiu2;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Carte> carti =  new HashSet<>();
        carti.add(new Carte("Dama cu camelii","Alexandre Dumas",20,Gen.DEZVOLTARE_PERSONALA));
        carti.add(new Carte("Crima si pedeapsa","Dovstoevsky",39,Gen.MANUAL));
        carti.add(new Carte("Madame Bovary","Gustave Flaubert",25,Gen.THRILLER));
        carti.add(new Carte("Dama cu camelii","Alexandre Dumas",50, Gen.PSIHOLOGIE));
        carti.add(new Carte("Anna Karenina","Lev Tolstoi",20,Gen.LITERATURA_CLASICA));
        carti.add(new Carte("Secretul","Osho",40,Gen.LITERATURA_CLASICA));
        carti.add(new Carte("Dama cu camelii","Alexandre Dumas",80,Gen.THRILLER));
        carti.add(new Carte("Dama cu camelii","Alexandre Dumas",29,Gen.DEZVOLTARE_PERSONALA));
        carti.add(new Carte("Dama cu camelii","Alexandre Dumas",18,Gen.MANUAL));
        carti.add(new Carte("Dama cu camelii","Alexandre Dumas",46,Gen.PSIHOLOGIE));

        literaturaClasica(carti);
        bookThriller(carti);
        manualeDiscount(carti);
    }

    public static void literaturaClasica(final Set<Carte> setC){
        System.out.println("Literautra Clasica");
        for(Carte c : setC){
            if(c.getGen()==Gen.LITERATURA_CLASICA){
                System.out.println(c);
            }
        }
    }
    private static void bookThriller(final Set<Carte> setC){
        System.out.println("Carti fara Thriller");
        setC.stream().filter(c.getGen()==Gen.THRILLER).forEach(System.out::println);
        //setC.stream().filter(Gen.THRILLER)
    }

    private static void manualeDiscount(final Set<Carte> setC){
        System.out.println("manuale cu 10% disc");

        for(Carte c : setC){
            if(c.getGen()==Gen.MANUAL){
                double newPrice = (c.getPret() -(c.getPret() *0.1));
                c.setPret(newPrice);
                System.out.println(c);
            }
        }
    }
}
