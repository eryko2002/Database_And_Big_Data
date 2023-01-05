package bdbt_proj;

public class Pracownicy_siedlisk {
    public int id_pracownika;
    public int id_siedliska;
    private String nazwa_siedliska;

    public Pracownicy_siedlisk() {
    }

    public Pracownicy_siedlisk(int id_pracownika, int id_siedliska, String nazwa_siedliska) {
        super();
        this.id_pracownika = id_pracownika;
        this.id_siedliska = id_siedliska;
        this.nazwa_siedliska = nazwa_siedliska;
    }

    public int getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(int id_pracownika) {
        this.id_pracownika = id_pracownika;
    }

    public int getId_siedliska() {
        return id_siedliska;
    }

    public void setId_siedliska(int id_siedliska) {
        this.id_siedliska = id_siedliska;
    }

    public String getNazwa_siedliska() {
        return nazwa_siedliska;
    }

    public void setNazwa_siedliska(String nazwa_siedliska) {
        this.nazwa_siedliska = nazwa_siedliska;
    }

    @Override
    public String toString() {
        return "Pracownicy_siedlisk{" +
                "id_pracownika=" + id_pracownika +
                ", id_siedliska=" + id_siedliska +
                ", nazwa_siedliska='" + nazwa_siedliska + '\'' +
                '}';
    }
}
