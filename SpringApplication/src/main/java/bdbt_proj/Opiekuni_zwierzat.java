package bdbt_proj;

public class Opiekuni_zwierzat {
    public int id_pracownika;
    public int id_zwierzecia;

    public Opiekuni_zwierzat() {
    }

    public Opiekuni_zwierzat(int id_pracownika, int id_zwierzecia) {
        super();
        this.id_pracownika = id_pracownika;
        this.id_zwierzecia = id_zwierzecia;
    }

    public int getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(int id_pracownika) {
        this.id_pracownika = id_pracownika;
    }

    public int getId_zwierzecia() {
        return id_zwierzecia;
    }

    public void setId_zwierzecia(int id_zwierzecia) {
        this.id_zwierzecia = id_zwierzecia;
    }

    @Override
    public String toString() {
        return "Opiekuni_zwierzat{" +
                "id_pracownika=" + id_pracownika +
                ", id_zwierzecia=" + id_zwierzecia +
                '}';
    }
}
