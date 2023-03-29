package pl.jordanmruczynski.starcafe;

public abstract class Napoj {
    public enum Wielkosc { MALA, SREDNIA, DUZA };
    Wielkosc wielkosc = Wielkosc.MALA;
    String opis = "napój";

    public String getOpis() {
        return opis;
    }

    public Wielkosc getWielkosc() {
        return wielkosc;
    }

    public void setWielkosc(Wielkosc wielkosc) {
        this.wielkosc = wielkosc;
    }

    public abstract double koszt();
}
