package bdbt_proj;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;



public class Wynagrodzenia {
    private int id_wynagrodzenia;
    private String data_wyplaty;
    private Number kwota_podstawowa;
    private Number kwota_dodatkowa ;
    public int id_pracownika;

    public Wynagrodzenia() {
    }

    public Wynagrodzenia(int id_wynagrodzenia, String data_wyplaty, Number kwota_podstawowa, Number kwota_dodatkowa, int id_pracownika) {
        super();
        this.id_wynagrodzenia = id_wynagrodzenia;
        this.data_wyplaty = data_wyplaty;
        this.kwota_podstawowa = kwota_podstawowa;
        this.kwota_dodatkowa = kwota_dodatkowa;
        this.id_pracownika = id_pracownika;
    }

    public int getId_wynagrodzenia() {
        return id_wynagrodzenia;
    }

    public void setId_wynagrodzenia(int id_wynagrodzenia) {
        this.id_wynagrodzenia = id_wynagrodzenia;
    }

    public String getData_wyplaty() {
        return data_wyplaty;
    }

    public void setData_wyplaty(String data_wyplaty) {
        this.data_wyplaty = data_wyplaty;
    }

    public Number getKwota_podstawowa() {
        return kwota_podstawowa;
    }

    public void setKwota_podstawowa(Number kwota_podstawowa) {
        this.kwota_podstawowa = kwota_podstawowa;
    }

    public Number getKwota_dodatkowa() {
        return kwota_dodatkowa;
    }

    public void setKwota_dodatkowa(Number kwota_dodatkowa) {
        this.kwota_dodatkowa = kwota_dodatkowa;
    }

    public int getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(int id_pracownika) {
        this.id_pracownika = id_pracownika;
    }

    @Override
    public String toString() {
        return "Wynagrodzenia{" +
                "id_wynagrodzenia=" + id_wynagrodzenia +
                ", data_wyplaty='" + data_wyplaty + '\'' +
                ", kwota_podstawowa=" + kwota_podstawowa +
                ", kwota_dodatkowa=" + kwota_dodatkowa +
                ", id_pracownika=" + id_pracownika +
                '}';
    }
}
