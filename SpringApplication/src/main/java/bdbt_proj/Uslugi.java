package bdbt_proj;

public class Uslugi {
    public int id_biletu;
    public int id_atrakcji;
    private String rodzaj_atrakcji;

    public Uslugi() {
    }

    public Uslugi(int id_biletu, int id_atrakcji, String rodzaj_atrakcji) {
        super();
        this.id_biletu = id_biletu;
        this.id_atrakcji = id_atrakcji;
        this.rodzaj_atrakcji = rodzaj_atrakcji;
    }

    public int getId_biletu() {
        return id_biletu;
    }

    public void setId_biletu(int id_biletu) {
        this.id_biletu = id_biletu;
    }

    public int getId_atrakcji() {
        return id_atrakcji;
    }

    public void setId_atrakcji(int id_atrakcji) {
        this.id_atrakcji = id_atrakcji;
    }

    public String getRodzaj_atrakcji() {
        return rodzaj_atrakcji;
    }

    public void setRodzaj_atrakcji(String rodzaj_atrakcji) {
        this.rodzaj_atrakcji = rodzaj_atrakcji;
    }

    @Override
    public String toString() {
        return "Uslugi{" +
                "id_biletu=" + id_biletu +
                ", id_atrakcji=" + id_atrakcji +
                ", rodzaj_atrakcji='" + rodzaj_atrakcji + '\'' +
                '}';
    }
}
