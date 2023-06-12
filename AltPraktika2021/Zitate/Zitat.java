package Versuch7;

public class Zitat {
    private String name;
    private String beschreibung;
    private String zitat;

    public Zitat(String name, String beschreibung, String zitat) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.zitat = zitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getZitat() {
        return zitat;
    }

    public void setZitat(String zitat) {
        this.zitat = zitat;
    }
}
