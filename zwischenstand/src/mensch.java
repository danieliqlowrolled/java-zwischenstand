public abstract class mensch {
    String vorname;
    String nachname;
    Integer alter;

    public mensch(String vorname, String nachname, Integer alter){
        setVorname(vorname);
        setNachname(nachname);
        setAlter(alter);

    }

    public abstract void zeigeDaten();

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getVorname() {
        return vorname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setAlter(Integer alter) {
        this.alter = alter;
    }
    public Integer getAlter() {
        return alter;
    }

}
