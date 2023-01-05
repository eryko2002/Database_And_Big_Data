package bdbt_proj;

public class Pracownicy_w_punkcie {
    public int id_punktu;
    public int id_pracownika;

    public Pracownicy_w_punkcie() {
    }

    public Pracownicy_w_punkcie(int id_punktu, int id_pracownika) {
        super();
        this.id_punktu = id_punktu;
        this.id_pracownika = id_pracownika;
    }

    public int getId_punktu() {
        return id_punktu;
    }

    public void setId_punktu(int id_punktu) {
        this.id_punktu = id_punktu;
    }

    public int getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(int id_pracownika) {
        this.id_pracownika = id_pracownika;
    }

    @Override
    public String toString() {
        return "Pracownicy_w_punkcie{" +
                "id_punktu=" + id_punktu +
                ", id_pracownika=" + id_pracownika +
                '}';
    }
}
