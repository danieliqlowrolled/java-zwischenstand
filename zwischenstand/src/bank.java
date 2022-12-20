public class bank {
    String name;
    String adresse;
    Boolean einbruchsicher;

    public bank(String name, String adresse, Boolean einbruchsicher){
        setName(name);
        setAdresse(adresse);
        setEinbruchsicher(einbruchsicher);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setEinbruchsicher(Boolean einbruchsicher) {
        this.einbruchsicher = einbruchsicher;
    }
    public Boolean getEinbruchsicher() {
        return einbruchsicher;
    }

}
