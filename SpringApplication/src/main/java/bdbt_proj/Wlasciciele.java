package bdbt_proj;

public class Wlasciciele {
    private int id_wlasciciela;
    private String imie;
    private String nazwisko;
    private String numer_kontaktowy;
    private String plec;
    private String data_urodzenia;
    private String data_przejecia_oddzialu;
    public int id_adresu;
    public int id_zoo;

    public Wlasciciele() {
    }

    public Wlasciciele(int id_wlasciciela, String imie, String nazwisko, String numer_kontaktowy, String plec, String data_urodzenia, String data_przejecia_oddzialu, int id_adresu, int id_zoo) {
        super();
        this.id_wlasciciela = id_wlasciciela;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_kontaktowy = numer_kontaktowy;
        this.plec = plec;
        this.data_urodzenia = data_urodzenia;
        this.data_przejecia_oddzialu = data_przejecia_oddzialu;
        this.id_adresu = id_adresu;
        this.id_zoo = id_zoo;
    }

    public int getId_wlasciciela() {
        return id_wlasciciela;
    }

    public void setId_wlasciciela(int id_wlasciciela) {
        this.id_wlasciciela = id_wlasciciela;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNumer_kontaktowy() {
        return numer_kontaktowy;
    }

    public void setNumer_kontaktowy(String numer_kontaktowy) {
        this.numer_kontaktowy = numer_kontaktowy;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(String data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public String getData_przejecia_oddzialu() {
        return data_przejecia_oddzialu;
    }

    public void setData_przejecia_oddzialu(String data_przejecia_oddzialu) {
        this.data_przejecia_oddzialu = data_przejecia_oddzialu;
    }

    public int getId_adresu() {
        return id_adresu;
    }

    public void setId_adresu(int id_adresu) {
        this.id_adresu = id_adresu;
    }

    public int getId_zoo() {
        return id_zoo;
    }

    public void setId_zoo(int id_zoo) {
        this.id_zoo = id_zoo;
    }

    @Override
    public String toString() {
        return "Wlasciciele{" +
                "id_wlasciciela=" + id_wlasciciela +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numer_kontaktowy='" + numer_kontaktowy + '\'' +
                ", plec='" + plec + '\'' +
                ", data_urodzenia='" + data_urodzenia + '\'' +
                ", data_przejecia_oddzialu='" + data_przejecia_oddzialu + '\'' +
                ", id_adresu=" + id_adresu +
                ", id_zoo=" + id_zoo +
                '}';
    }
}
