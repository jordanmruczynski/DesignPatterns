package pl.jordanmruczynski.starcafe;

public class Espresso extends Napoj {

    public Espresso() {
        opis = "Kawa Espresso";
    }

    @Override
    public double koszt() {
        return 5.0;
    }
}
