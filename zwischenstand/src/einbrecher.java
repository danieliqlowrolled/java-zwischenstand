public class einbrecher extends mensch{

    String einbruchswerkzeug;

    public einbrecher(String vorname, String nachname, Integer alter, String einbruchswerkzeug) {
        super(vorname, nachname, alter);
        setEinbruchswerkzeug(einbruchswerkzeug);
    }

    public void zeigeDaten(){
        System.out.println(getVorname()+" "+getNachname()+" "+getAlter()+" "+getEinbruchswerkzeug());
    }

    public void setEinbruchswerkzeug(String einbruchswerkzeug) {
        this.einbruchswerkzeug = einbruchswerkzeug;
    }
    public String getEinbruchswerkzeug() {
        return einbruchswerkzeug;
    }
    
}
