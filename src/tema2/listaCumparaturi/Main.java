package tema2.listaCumparaturi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Achizitie blugi  =  new Achizitie(100,1);
        Achizitie lapte = new Aliment(5,1,29);
        Achizitie placaPar = new AparatElectrocasnic(200,1,2);
        Achizitie camasa  =  new Achizitie(89,1);
        Achizitie dres  =  new Achizitie(140,1);
        Achizitie fusta  =  new Achizitie(120,1);
        Achizitie branza = new Aliment(5,1,29);
        Achizitie paine = new Aliment(3,1,18);
        Achizitie miere = new Aliment(7,1,20);
        Achizitie masinaSpalat = new AparatElectrocasnic(900,1,1);
        Achizitie frigider = new AparatElectrocasnic(800,1,2);
        Achizitie hota = new AparatElectrocasnic(350,1,4);

        List<Achizitie> lista =  new ArrayList<>();

        //Collections.sort(lista);

        lista.add(blugi);
        lista.add(lapte);
        lista.add(placaPar);
        lista.add(camasa);
        lista.add(dres);
        lista.add(fusta);
        lista.add(branza);
        lista.add(paine);
        lista.add(miere);
        lista.add(masinaSpalat);
        lista.add(frigider);
        lista.add(hota);

        for(Achizitie list : lista) {
            System.out.println(list);
        }


    }
}
