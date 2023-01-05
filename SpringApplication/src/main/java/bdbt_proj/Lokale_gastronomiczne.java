package bdbt_proj;

public class Lokale_gastronomiczne {
    public int id_punktu;
    private String nazwa;
    private String rodzaj_lokalu;
    private String godzina_otwarcia;

    public Lokale_gastronomiczne() {
    }

    public Lokale_gastronomiczne(int id_punktu, String nazwa, String rodzaj_lokalu, String godzina_otwarcia) {
        super();
        this.id_punktu = id_punktu;
        this.nazwa = nazwa;
        this.rodzaj_lokalu = rodzaj_lokalu;
        this.godzina_otwarcia = godzina_otwarcia;
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

    public String getRodzaj_lokalu() {
        return rodzaj_lokalu;
    }

    public void setRodzaj_lokalu(String rodzaj_lokalu) {
        this.rodzaj_lokalu = rodzaj_lokalu;
    }

    public String getGodzina_otwarcia() {
        return godzina_otwarcia;
    }

    public void setGodzina_otwarcia(String godzina_otwarcia) {
        this.godzina_otwarcia = godzina_otwarcia;
    }

    @Override
    public String toString() {
        return "Lokale_gastronomiczne{" +
                "id_punktu=" + id_punktu +
                ", nazwa='" + nazwa + '\'' +
                ", rodzaj_lokalu='" + rodzaj_lokalu + '\'' +
                ", godzina_otwarcia='" + godzina_otwarcia + '\'' +
                '}';
    }
}
