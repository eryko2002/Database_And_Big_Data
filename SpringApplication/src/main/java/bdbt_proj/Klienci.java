package bdbt_proj;

public class Klienci {
    private int id_klienta;
    private String imie;
    private String nazwisko;
    private String numer_telefonu;
    private String e_mail;
    public int id_zoo;

    public Klienci() {
    }

    public Klienci(int id_klienta, String imie, String nazwisko, String numer_telefonu, String e_mail, int id_zoo) {
        super();
        this.id_klienta = id_klienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_telefonu = numer_telefonu;
        this.e_mail = e_mail;
        this.id_zoo = id_zoo;
    }

    public int getId_klienta() {
        return id_klienta;
    }

    public void setId_klienta(int id_klienta) {
        this.id_klienta = id_klienta;
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

    @Override
    public String toString() {
        return "Klienci{" +
                "id_klienta=" + id_klienta +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numer_telefonu='" + numer_telefonu + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", id_zoo=" + id_zoo +
                '}';
    }
}
