package bdbt_proj;

public class Gatunki {
    private int id_gatunku;
    private String nazwa_gatunku;
    private String opis;

    public Gatunki() {
    }

    public Gatunki(int id_gatunku, String nazwa_gatunku, String opis) {
        super();
        this.id_gatunku = id_gatunku;
        this.nazwa_gatunku = nazwa_gatunku;
        this.opis = opis;
    }

    public int getId_gatunku() {
        return id_gatunku;
    }

    public void setId_gatunku(int id_gatunku) {
        this.id_gatunku = id_gatunku;
    }

    public String getNazwa_gatunku() {
        return nazwa_gatunku;
    }

    public void setNazwa_gatunku(String nazwa_gatunku) {
        this.nazwa_gatunku = nazwa_gatunku;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Gatunki{" +
                "id_gatunku=" + id_gatunku +
                ", nazwa_gatunku='" + nazwa_gatunku + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
