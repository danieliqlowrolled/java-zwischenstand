public class einbruch {
    public static boolean getErfolgreich;
    einbrecher einbrecher;
    bankmitarbeiter bankmitarbeiter;
    fluchtfahrzeug fluchtfahrzeug;
    bank bank;
    static boolean erfolgreich;

    public einbruch(einbrecher einbrecher, bankmitarbeiter bankmitarbeiter, fluchtfahrzeug fluchtfahrzeug, bank bank, boolean erfolgreich){
        setEinbrecher(einbrecher);
        setBankmitarbeiter(bankmitarbeiter);
        setFluchtfahrzeug(fluchtfahrzeug);
        setBank(bank);
        setErfolgreich(erfolgreich);

    }

    public void setEinbrecher(einbrecher einbrecher) {
        this.einbrecher = einbrecher;
    }
    public einbrecher getEinbrecher() {
        return einbrecher;
    }
    public void setBankmitarbeiter(bankmitarbeiter bankmitarbeiter) {
        this.bankmitarbeiter = bankmitarbeiter;
    }
    public bankmitarbeiter getBankmitarbeiter() {
        return bankmitarbeiter;
    }
    public void setFluchtfahrzeug(fluchtfahrzeug fluchtfahrzeug) {
        this.fluchtfahrzeug = fluchtfahrzeug;
    }
    public fluchtfahrzeug getFluchtfahrzeug() {
        return fluchtfahrzeug;
    }
    public void setBank(bank bank) {
        this.bank = bank;
    }
    public bank getBank() {
        return bank;
    }
    public void setErfolgreich(boolean erfolgreich) {
        this.erfolgreich = erfolgreich;
    }
    public static boolean getErfolgreich() {
        return erfolgreich;
    }
}
