public class App {
    public static void main(String[] args) throws Exception {

        bankmitarbeiter bm1 = new bankmitarbeiter("Max", "Mustermann", 73, 69);
        
        bankmitarbeiter bm2 = new bankmitarbeiter("Maximilian", "Mustermann", 49, 420);
        
        einbrecher e1 = new einbrecher("Bolek", "Langfinger", 7, "Dietrich");

        bank b1 = new bank("Haspa", "Langenhorner Markt 3, 22415 Hamburg", false);

        if (b1.getEinbruchsicher()){
            System.out.println("In die Bank kann eingebrochen werden!");
        }else{
            System.out.println("In die Bank kann nicht eingebrochen werden!");
        }

        switch(e1.getEinbruchswerkzeug()){
            case "Meteoriten - Pistole":
                System.out.println("Der Einbrecher bekommt eine Meteoriten - Pistole.");
            case "Atom Bombe":
                System.out.println("Der Einbrecher bekommt eine Atombombe.");
        }
    }
}
