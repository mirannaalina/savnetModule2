package tema2.carteDeTelefon;

import java.util.*;

public class Main {



    public static void main(String[] args) {


        Map<Persoana, String> persoane = new HashMap<>();

        persoane.put(new Persoana("12352523523", "Vlad", "Alina", "Otelu-Rosu"), "0882330324");
        persoane.put(new Persoana("16878679464", "Popescu", "Ana", "Otelu-Rosu"), "0228820324");
        persoane.put(new Persoana("12352523523", "Pop", "Andreea", "Otelu-Rosu"), "0882022324");
        persoane.put(new Persoana("12444444523", "Stanescu", "Daniel", "Otelu-Rosu"), "0833820324");
        persoane.put(new Persoana("17754823523", "Croitoru", "Alexa", "Otelu-Rosu"), "08820311124");
        persoane.put(new Persoana("24557587697", "Mihnea", "Anabella", "Otelu-Rosu"), "0338820324");
        persoane.put(new Persoana("12352666623", "Rahe", "Cristina", "Otelu-Rosu"), "083555820324");
        persoane.put(new Persoana("12352523523", "Steward", "AAlexandra", "Otelu-Rosu"), "0888820324");
        persoane.put(new Persoana("12352523523", "Stan", "Anton", "Otelu-Rosu"), "0880020324");
        persoane.put(new Persoana("12352523523", "Vitalie", "Rares", "Otelu-Rosu"), "088208770324");

        System.out.println("Introduceti un nr: ");

        Scanner sc = new Scanner(System.in);

        String numar = sc.nextLine();

        if(persoane.get(numar)==null){
            System.out.println("persoana nu exista");
        }

  //      persoane.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

  //      if(persoane.containsValue(numar)){
  //          System.out.println(persoane);
  //      }

        Optional<String> val = persoane.entrySet().stream().map(Map.Entry::getValue).filter(v->v!=null).findFirst();

        if(val.isPresent()){
            System.out.println(val);
        }

    }
}
