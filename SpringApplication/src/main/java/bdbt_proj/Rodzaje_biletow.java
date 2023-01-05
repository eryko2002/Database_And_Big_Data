package bdbt_proj;

public class Rodzaje_biletow {
    private int id_rodzaju_biletu;
    private String nazwa;
    private String czy_jest_dziecko;
    private String czy_obowiazuje_znizka;
    private float cena;

    public Rodzaje_biletow() {
    }

    public Rodzaje_biletow(int id_rodzaju_biletu, String nazwa, String czy_jest_dziecko, String czy_obowiazuje_znizka, float cena) {
        super();
        this.id_rodzaju_biletu = id_rodzaju_biletu;
        this.nazwa = nazwa;
        this.czy_jest_dziecko = czy_jest_dziecko;
        this.czy_obowiazuje_znizka = czy_obowiazuje_znizka;
        this.cena = cena;
    }

    public int getId_rodzaju_biletu() {
        return id_rodzaju_biletu;
    }

    public void setId_rodzaju_biletu(int id_rodzaju_biletu) {
        this.id_rodzaju_biletu = id_rodzaju_biletu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getCzy_jest_dziecko() {
        return czy_jest_dziecko;
    }

    public void setCzy_jest_dziecko(String czy_jest_dziecko) {
        this.czy_jest_dziecko = czy_jest_dziecko;
    }

    public String getCzy_obowiazuje_znizka() {
        return czy_obowiazuje_znizka;
    }

    public void setCzy_obowiazuje_znizka(String czy_obowiazuje_znizka) {
        this.czy_obowiazuje_znizka = czy_obowiazuje_znizka;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Rodzaje_biletow{" +
                "id_rodzaju_biletu=" + id_rodzaju_biletu +
                ", nazwa='" + nazwa + '\'' +
                ", czy_jest_dziecko='" + czy_jest_dziecko + '\'' +
                ", czy_obowiazuje_znizka='" + czy_obowiazuje_znizka + '\'' +
                ", cena=" + cena +
                '}';
    }
}
