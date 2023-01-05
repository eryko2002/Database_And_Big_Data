package bdbt_proj;

public class Stanowiska {
    private int id_stanowiska;
    private String nazwa;
    private String opis;

    public Stanowiska() {
    }

    public Stanowiska(int id_stanowiska, String nazwa, String opis) {
        super();
        this.id_stanowiska = id_stanowiska;
        this.nazwa = nazwa;
        this.opis = opis;
    }

    public int getId_stanowiska() {
        return id_stanowiska;
    }

    public void setId_stanowiska(int id_stanowiska) {
        this.id_stanowiska = id_stanowiska;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Stanowiska{" +
                "id_stanowiska=" + id_stanowiska +
                ", nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
