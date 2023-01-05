package bdbt_proj;

public class Zwierzeta {
    private int id_zwierzecia;
    private String imie;
    private String data_urodzenia;
    private String plec;
    private String nazwa_zwierzecia;
    public int id_siedliska;
    public int id_gatunku;

    public Zwierzeta() {
    }

    public Zwierzeta(int id_zwierzecia, String imie, String data_urodzenia, String plec, String nazwa_zwierzecia, int id_siedliska, int id_gatunku) {
        super();
        this.id_zwierzecia = id_zwierzecia;
        this.imie = imie;
        this.data_urodzenia = data_urodzenia;
        this.plec = plec;
        this.nazwa_zwierzecia = nazwa_zwierzecia;
        this.id_siedliska = id_siedliska;
        this.id_gatunku = id_gatunku;
    }

    public int getId_zwierzecia() {
        return id_zwierzecia;
    }

    public void setId_zwierzecia(int id_zwierzecia) {
        this.id_zwierzecia = id_zwierzecia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(String data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getNazwa_zwierzecia() {
        return nazwa_zwierzecia;
    }

    public void setNazwa_zwierzecia(String nazwa_zwierzecia) {
        this.nazwa_zwierzecia = nazwa_zwierzecia;
    }

    public int getId_siedliska() {
        return id_siedliska;
    }

    public void setId_siedliska(int id_siedliska) {
        this.id_siedliska = id_siedliska;
    }

    public int getId_gatunku() {
        return id_gatunku;
    }

    public void setId_gatunku(int id_gatunku) {
        this.id_gatunku = id_gatunku;
    }

    @Override
    public String toString() {
        return "Zwierzeta{" +
                "id_zwierzecia=" + id_zwierzecia +
                ", imie='" + imie + '\'' +
                ", data_urodzenia='" + data_urodzenia + '\'' +
                ", plec='" + plec + '\'' +
                ", nazwa_zwierzecia='" + nazwa_zwierzecia + '\'' +
                ", id_siedliska=" + id_siedliska +
                ", id_gatunku=" + id_gatunku +
                '}';
    }
}
