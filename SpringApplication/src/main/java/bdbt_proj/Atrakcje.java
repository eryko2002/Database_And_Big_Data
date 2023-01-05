package bdbt_proj;

public class Atrakcje {
    private int id_atrakcji;
    private String nazwa;
    private String opis;
    public int id_zoo;

    public Atrakcje() {
    }

    public Atrakcje(int id_atrakcji, String nazwa, String opis, int id_zoo) {
        super();
        this.id_atrakcji = id_atrakcji;
        this.nazwa = nazwa;
        this.opis = opis;
        this.id_zoo = id_zoo;
    }

    public int getId_atrakcji() {
        return id_atrakcji;
    }

    public void setId_atrakcji(int id_atrakcji) {
        this.id_atrakcji = id_atrakcji;
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

    public int getId_zoo() {
        return id_zoo;
    }

    public void setId_zoo(int id_zoo) {
        this.id_zoo = id_zoo;
    }

    @Override
    public String toString() {
        return "Atrakcje{" +
                "id_atrakcji=" + id_atrakcji +
                ", nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                ", id_zoo=" + id_zoo +
                '}';
    }
}
