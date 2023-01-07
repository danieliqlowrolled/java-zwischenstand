public class bankmitarbeiter extends mensch{

    Integer mitarbeiternummer;

    public bankmitarbeiter(String vorname, String nachname, Integer alter, Integer mitarbeiternummer) {
        super(vorname, nachname, alter);
        setMitarbeiternummer(mitarbeiternummer);
    }

    public void zeigeDaten(){
        System.out.println(getVorname()+" "+getNachname()+" "+getAlter()+" "+getMitarbeiternummer());
    }
    
    public void setMitarbeiternummer(Integer mitarbeiternummer) {
        this.mitarbeiternummer = mitarbeiternummer;
    }
    public Integer getMitarbeiternummer() {
        return mitarbeiternummer;
    }
}
