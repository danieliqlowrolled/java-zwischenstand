public class kunde extends mensch{

    Integer kundennummer;

    public kunde(String vorname, String nachname, Integer alter, Integer kundennummer) {
        super(vorname, nachname, alter);
        setKundennummer(kundennummer);
    }
    
    public void setKundennummer(Integer kundennummer) {
        this.kundennummer = kundennummer;
    }
    public Integer getKundennummer() {
        return kundennummer;
    }

}
