package bdbt_proj;

public class Adres {
    private int id_adresu;
    private String miasto;
    private String ulica;
    private String kod_pocztowy;
    private int nr_mieszkania;
    private int nr_lokalu;

    public Adres() {
    }


    public Adres(int id_adresu, String miasto, String ulica, String kod_pocztowy, int nr_mieszkania, int nr_lokalu) {
        super();
        this.id_adresu = id_adresu;
        this.miasto = miasto;
        this.ulica = ulica;
        this.kod_pocztowy = kod_pocztowy;
        this.nr_mieszkania = nr_mieszkania;
        this.nr_lokalu = nr_lokalu;
    }

    public int getId_adresu() {
        return id_adresu;
    }

    public void setId_adresu(int id_adresu) {
        this.id_adresu = id_adresu;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }

    public int getNr_mieszkania() {
        return nr_mieszkania;
    }

    public void setNr_mieszkania(int nr_mieszkania) {
        this.nr_mieszkania = nr_mieszkania;
    }

    public int getNr_lokalu() {
        return nr_lokalu;
    }

    public void setNr_lokalu(int nr_lokalu) {
        this.nr_lokalu = nr_lokalu;
    }

    @Override
    public String toString() {
        return "Adresy{" +
                "id_adresu=" + id_adresu +
                ", miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", kod_pocztowy='" + kod_pocztowy + '\'' +
                ", nr_mieszkania=" + nr_mieszkania +
                ", nr_lokalu=" + nr_lokalu +
                '}';
    }
}
