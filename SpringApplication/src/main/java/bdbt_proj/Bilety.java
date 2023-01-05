package bdbt_proj;

public class Bilety {
    private int id_biletu;
    private String data_sprzedazy;
    private String okres_waznosci;
    private String czy_wykorzystany;
    public int id_klienta;
    public int id_punktu;
    public int id_rodzaju_biletu;

    public Bilety() {
    }

    public Bilety(int id_biletu, String data_sprzedazy, String okres_waznosci, String czy_wykorzystany, int id_klienta, int id_punktu, int id_rodzaju_biletu) {
        super();
        this.id_biletu = id_biletu;
        this.data_sprzedazy = data_sprzedazy;
        this.okres_waznosci = okres_waznosci;
        this.czy_wykorzystany = czy_wykorzystany;
        this.id_klienta = id_klienta;
        this.id_punktu = id_punktu;
        this.id_rodzaju_biletu = id_rodzaju_biletu;
    }

    public int getId_biletu() {
        return id_biletu;
    }

    public void setId_biletu(int id_biletu) {
        this.id_biletu = id_biletu;
    }

    public String getData_sprzedazy() {
        return data_sprzedazy;
    }

    public void setData_sprzedazy(String data_sprzedazy) {
        this.data_sprzedazy = data_sprzedazy;
    }

    public String getOkres_waznosci() {
        return okres_waznosci;
    }

    public void setOkres_waznosci(String okres_waznosci) {
        this.okres_waznosci = okres_waznosci;
    }

    public String getCzy_wykorzystany() {
        return czy_wykorzystany;
    }

    public void setCzy_wykorzystany(String czy_wykorzystany) {
        this.czy_wykorzystany = czy_wykorzystany;
    }

    public int getId_klienta() {
        return id_klienta;
    }

    public void setId_klienta(int id_klienta) {
        this.id_klienta = id_klienta;
    }

    public int getId_punktu() {
        return id_punktu;
    }

    public void setId_punktu(int id_punktu) {
        this.id_punktu = id_punktu;
    }

    public int getId_rodzaju_biletu() {
        return id_rodzaju_biletu;
    }

    public void setId_rodzaju_biletu(int id_rodzaju_biletu) {
        this.id_rodzaju_biletu = id_rodzaju_biletu;
    }
}
