package bdbt_proj;

import java.util.Date;

public class Zoo {
    private int id_zoo;
    private String name;
    private String godzina_otwarcia;
    private String numer_kontaktowy;
    private String NIP;
    private String numer_KRS;
    private String data_zalozenia;
    private float powierzchnia;
    public int id_adresu;

    public Zoo() {
    }

    public Zoo(int id_zoo, String name, String godzina_otwarcia, String numer_kontaktowy, String NIP, String numer_KRS, String data_zalozenia, float powierzchnia, int id_adresu) {
        super();
        this.id_zoo = id_zoo;
        this.name = name;
        this.godzina_otwarcia = godzina_otwarcia;
        this.numer_kontaktowy = numer_kontaktowy;
        this.NIP = NIP;
        this.numer_KRS = numer_KRS;
        this.data_zalozenia = data_zalozenia;
        this.powierzchnia = powierzchnia;
        this.id_adresu = id_adresu;
    }

    public int getId_zoo() {
        return id_zoo;
    }

    public void setId_zoo(int id_zoo) {
        this.id_zoo = id_zoo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGodzina_otwarcia() {
        return godzina_otwarcia;
    }

    public void setGodzina_otwarcia(String godzina_otwarcia) {
        this.godzina_otwarcia = godzina_otwarcia;
    }

    public String getNumer_kontaktowy() {
        return numer_kontaktowy;
    }

    public void setNumer_kontaktowy(String numer_kontaktowy) {
        this.numer_kontaktowy = numer_kontaktowy;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNumer_KRS() {
        return numer_KRS;
    }

    public void setNumer_KRS(String numer_KRS) {
        this.numer_KRS = numer_KRS;
    }

    public String getData_zalozenia() {
        return data_zalozenia;
    }

    public void setData_zalozenia(String data_zalozenia) {
        this.data_zalozenia = data_zalozenia;
    }

    public float getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(float powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public int getId_adresu() {
        return id_adresu;
    }

    public void setId_adresu(int id_adresu) {
        this.id_adresu = id_adresu;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "id_zoo=" + id_zoo +
                ", name='" + name + '\'' +
                ", godzina_otwarcia='" + godzina_otwarcia + '\'' +
                ", numer_kontaktowy='" + numer_kontaktowy + '\'' +
                ", NIP='" + NIP + '\'' +
                ", numer_KRS='" + numer_KRS + '\'' +
                ", data_zalozenia='" + data_zalozenia + '\'' +
                ", powierzchnia=" + powierzchnia +
                ", id_adresu=" + id_adresu +
                '}';
    }
}
