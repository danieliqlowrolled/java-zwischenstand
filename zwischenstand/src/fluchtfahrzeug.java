public class fluchtfahrzeug {

    double hubraum;
    String farbe;
    Integer sitzplaetze;
    Integer ps;

    public fluchtfahrzeug(double hubraum, String farbe, Integer sitzplaetze, Integer ps){
        setHubraum(hubraum);
        setFarbe(farbe);
        setSitzplaetze(sitzplaetze);
        setPs(ps);
    }

    public void setHubraum(double hubraum) {
        this.hubraum = hubraum;
    }
    public double getHubraum() {
        return hubraum;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public String getFarbe() {
        return farbe;
    }
    public void setSitzplaetze(Integer sitzplaetze) {
        this.sitzplaetze = sitzplaetze;
    }
    public Integer getSitzplaetze() {
        return sitzplaetze;
    }
    public void setPs(Integer ps) {
        this.ps = ps;
    }
    public Integer getPs() {
        return ps;
    }
}
