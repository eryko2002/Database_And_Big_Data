package bdbt_proj;

public class Siedliska {
    private int id_siedliska;
    private String gatunek_zamieszkujacy;
    private String rodzaj_terenu;
    private float powierzchnia;
    public int id_zoo;

    public Siedliska() {
    }

    public Siedliska(int id_siedliska, String gatunek_zamieszkujacy, String rodzaj_terenu, float powierzchnia, int id_zoo) {
        super();
        this.id_siedliska = id_siedliska;
        this.gatunek_zamieszkujacy = gatunek_zamieszkujacy;
        this.rodzaj_terenu = rodzaj_terenu;
        this.powierzchnia = powierzchnia;
        this.id_zoo = id_zoo;
    }

    public int getId_siedliska() {
        return id_siedliska;
    }

    public void setId_siedliska(int id_siedliska) {
        this.id_siedliska = id_siedliska;
    }

    public String getGatunek_zamieszkujacy() {
        return gatunek_zamieszkujacy;
    }

    public void setGatunek_zamieszkujacy(String gatunek_zamieszkujacy) {
        this.gatunek_zamieszkujacy = gatunek_zamieszkujacy;
    }

    public String getRodzaj_terenu() {
        return rodzaj_terenu;
    }

    public void setRodzaj_terenu(String rodzaj_terenu) {
        this.rodzaj_terenu = rodzaj_terenu;
    }

    public float getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(float powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public int getId_zoo() {
        return id_zoo;
    }

    public void setId_zoo(int id_zoo) {
        this.id_zoo = id_zoo;
    }

    @Override
    public String toString() {
        return "Siedliska{" +
                "id_siedliska=" + id_siedliska +
                ", gatunek_zamieszkujacy='" + gatunek_zamieszkujacy + '\'' +
                ", rodzaj_terenu='" + rodzaj_terenu + '\'' +
                ", powierzchnia=" + powierzchnia +
                ", id_zoo=" + id_zoo +
                '}';
    }
}
