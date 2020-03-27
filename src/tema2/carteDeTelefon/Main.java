package tema2.carteDeTelefon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        List<Persoana> persoane = new ArrayList<>();

        persoane.add(new Persoana("12352523523","Vlad","Alina","Otelu-Rosu","023444232"));
        persoane.add(new Persoana("16878679464","Popescu","Ana","Otelu-Rosu","2312141414124"));
        persoane.add(new Persoana("12352523523","Pop","Andreea","Otelu-Rosu","124141241414"));
        persoane.add(new Persoana("12444444523","Stanescu","Daniel","Otelu-Rosu","121111111"));
        persoane.add(new Persoana("17754823523","Croitoru","Alexa","Otelu-Rosu","222222212112"));
        persoane.add(new Persoana("24557587697","Mihnea","Anabella","Otelu-Rosu","0098828222"));
        persoane.add(new Persoana("12352666623","Rahe","Cristina","Otelu-Rosu","21112233"));
        persoane.add(new Persoana("12352523523","Steward","AAlexandra","Otelu-Rosu","9088888"));
        persoane.add(new Persoana("12352523523","Stan","Anton","Otelu-Rosu","0988008844"));
        persoane.add(new Persoana("12352523523","Vitalie","Rares","Otelu-Rosu","0987655533"));

        System.out.println("Introduceti un nr: ");

        Scanner sc = new Scanner(System.in);

        String numar = sc.nextLine();


        while(true) {
            if (persoane.contains(numar)) {
                System.out.println(persoane.toString());//doar persoana cu nr
                //trebuie stocate toate nr intr-un array separat?

            } else {
                System.out.println("Numarul nu exista");
                break;
            }
        }
    }
}
