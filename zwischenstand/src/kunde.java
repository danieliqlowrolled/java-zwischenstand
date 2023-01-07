public class kunde extends mensch{

    Integer kundennummer;

    public kunde(String vorname, String nachname, Integer alter, Integer kundennummer) {
        super(vorname, nachname, alter);
        setKundennummer(kundennummer);
    }

    public void zeigeDaten(){
        System.out.println(getVorname()+" "+getNachname()+" "+getAlter()+" "+getKundennummer());
    }
    
    public void setKundennummer(Integer kundennummer) {
        this.kundennummer = kundennummer;
    }
    public Integer getKundennummer() {
        return kundennummer;
    }

}
