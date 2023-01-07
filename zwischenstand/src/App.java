import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        //Demodaten
        bankmitarbeiter bm1 = new bankmitarbeiter("Max", "Mustermann", 73, 69);
        
        bankmitarbeiter bm2 = new bankmitarbeiter("Maximilian", "Mustermann", 49, 420);
        
        einbrecher e1 = new einbrecher("Bolek", "Langfinger", 7, "Dietrich");

        bank b1 = new bank("Haspa", "Langenhorner Markt 3, 22415 Hamburg", false);

        fluchtfahrzeug f1 = new fluchtfahrzeug(1.6, "Schwarz", 5, 150);

        
        //If - Abfrage
        if (b1.getEinbruchsicher()){
            System.out.println("In die Bank kann eingebrochen werden!");
        }else{
            System.out.println("In die Bank kann nicht eingebrochen werden!");
        }

        //Switch - Cases
        switch(e1.getEinbruchswerkzeug()){
            case "Meteoriten - Pistole":
                System.out.println("Der Einbrecher bekommt eine Meteoriten - Pistole.");
            case "Atom Bombe":
                System.out.println("Der Einbrecher bekommt eine Atombombe.");
        }

        //ArrayList
        ArrayList<kunde> Kunden = new ArrayList<>();
        Kunden.add(new kunde("Daniel", "Chowanek", 16, 01));
        Kunden.add(new kunde("Finn", "Harms", 17, 02));
        Kunden.add(new kunde("Mattis", "Henzel", 16, 03));

        //For - Each Schleife 
        for (kunde kunde : Kunden) {
            System.out.println(kunde);
        }

        //Array
        String[] andereStandorte = new String[3];
        andereStandorte[0] = "Berlin";
        andereStandorte[1] = "Stuttgart";
        andereStandorte[2] = "Schwerin";

        System.out.println(andereStandorte[0]);
        System.out.println(andereStandorte[1]);
        System.out.println(andereStandorte[2]);

        //ArrrayList
        ArrayList<einbruch> Einbrueche = new ArrayList<>();
        Einbrueche.add(new einbruch(e1, bm2, f1, b1, false));
        Einbrueche.add(new einbruch(e1, bm1, f1, b1, true));

        //If - Abfrage
        if (einbruch.getErfolgreich() == true){
            System.out.println("In die Bank wurde eingebrochen!");
        }else if (einbruch.getErfolgreich() == false){
            System.out.println("Die Einbrecher sind nicht eingebrochen!");
        }


    }
}
