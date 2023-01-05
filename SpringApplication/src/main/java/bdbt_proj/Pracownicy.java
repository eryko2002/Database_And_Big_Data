package bdbt_proj;

public class Pracownicy {
    private int id_pracownika;
    private String imie;
    private String nazwisko;
    private String numer_telefonu;
    private String numer_PESEL;
    private String plec;
    private String data_urodzenia;
    private String data_zatrudnienia;
    private String e_mail;
    public int id_zoo;
    public int id_stanowiska;
    public int id_adresu;

    public Pracownicy() {
    }

    public Pracownicy(int id_pracownika, String imie, String nazwisko, String numer_telefonu, String numer_PESEL, String plec, String data_urodzenia, String data_zatrudnienia, String e_mail, int id_zoo, int id_stanowiska, int id_adresu) {
        super();
        this.id_pracownika = id_pracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_telefonu = numer_telefonu;
        this.numer_PESEL = numer_PESEL;
        this.plec = plec;
        this.data_urodzenia = data_urodzenia;
        this.data_zatrudnienia = data_zatrudnienia;
        this.e_mail = e_mail;
        this.id_zoo = id_zoo;
        this.id_stanowiska = id_stanowiska;
        this.id_adresu = id_adresu;
    }

    public int getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(int id_pracownika) {
        this.id_pracownika = id_pracownika;
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

    public String getNumer_telefonu() {
        return numer_telefonu;
    }

    public void setNumer_telefonu(String numer_telefonu) {
        this.numer_telefonu = numer_telefonu;
    }

    public String getNumer_PESEL() {
        return numer_PESEL;
    }

    public void setNumer_PESEL(String numer_PESEL) {
        this.numer_PESEL = numer_PESEL;
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

    public String getData_zatrudnienia() {
        return data_zatrudnienia;
    }

    public void setData_zatrudnienia(String data_zatrudnienia) {
        this.data_zatrudnienia = data_zatrudnienia;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public int getId_zoo() {
        return id_zoo;
    }

    public void setId_zoo(int id_zoo) {
        this.id_zoo = id_zoo;
    }

    public int getId_stanowiska() {
        return id_stanowiska;
    }

    public void setId_stanowiska(int id_stanowiska) {
        this.id_stanowiska = id_stanowiska;
    }

    public int getId_adresu() {
        return id_adresu;
    }

    public void setId_adresu(int id_adresu) {
        this.id_adresu = id_adresu;
    }

    @Override
    public String toString() {
        return "Pracownicy{" +
                "id_pracownika=" + id_pracownika +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numer_telefonu='" + numer_telefonu + '\'' +
                ", numer_PESEL='" + numer_PESEL + '\'' +
                ", plec='" + plec + '\'' +
                ", data_urodzenia='" + data_urodzenia + '\'' +
                ", data_zatrudnienia='" + data_zatrudnienia + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", id_zoo=" + id_zoo +
                ", id_stanowiska=" + id_stanowiska +
                ", id_adresu=" + id_adresu +
                '}';
    }
}
