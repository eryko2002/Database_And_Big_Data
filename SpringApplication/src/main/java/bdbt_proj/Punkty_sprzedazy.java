package bdbt_proj;

public class Punkty_sprzedazy {
    public int id_punktu;
    private String nazwa;

    public Punkty_sprzedazy() {
    }

    public Punkty_sprzedazy(int id_punktu, String nazwa) {
        super();
        this.id_punktu = id_punktu;
        this.nazwa = nazwa;
    }

    public int getId_punktu() {
        return id_punktu;
    }

    public void setId_punktu(int id_punktu) {
        this.id_punktu = id_punktu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Punkty_sprzedazy{" +
                "id_punktu=" + id_punktu +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
