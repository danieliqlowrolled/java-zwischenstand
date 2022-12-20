public class einbrecher extends mensch{

    String einbruchswerkzeug;

    public einbrecher(String vorname, String nachname, Integer alter, String einbruchswerkzeug) {
        super(vorname, nachname, alter);
        setEinbruchswerkzeug(einbruchswerkzeug);
    }

    public void setEinbruchswerkzeug(String einbruchswerkzeug) {
        this.einbruchswerkzeug = einbruchswerkzeug;
    }
    public String getEinbruchswerkzeug() {
        return einbruchswerkzeug;
    }
    
}
