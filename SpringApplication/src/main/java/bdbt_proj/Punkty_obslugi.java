package bdbt_proj;

public class Punkty_obslugi {
    private int id_punktu;
    private String rodzaj_punktu;
    private String nazwa;
    public int id_zoo;

    public Punkty_obslugi() {
    }

    public Punkty_obslugi(int id_punktu, String rodzaj_punktu, String nazwa, int id_zoo) {
        super();
        this.id_punktu = id_punktu;
        this.rodzaj_punktu = rodzaj_punktu;
        this.nazwa = nazwa;
        this.id_zoo = id_zoo;
    }

    public int getId_punktu() {
        return id_punktu;
    }

    public void setId_punktu(int id_punktu) {
        this.id_punktu = id_punktu;
    }

    public String getRodzaj_punktu() {
        return rodzaj_punktu;
    }

    public void setRodzaj_punktu(String rodzaj_punktu) {
        this.rodzaj_punktu = rodzaj_punktu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getId_zoo() {
        return id_zoo;
    }

    public void setId_zoo(int id_zoo) {
        this.id_zoo = id_zoo;
    }

    @Override
    public String toString() {
        return "Punkty_obslugi{" +
                "id_punktu=" + id_punktu +
                ", rodzaj_punktu='" + rodzaj_punktu + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", id_zoo=" + id_zoo +
                '}';
    }
}
