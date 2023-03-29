package pl.jordanmruczynski.starcafe;

public class StarCafeSpecial extends Napoj {

    public StarCafeSpecial() {
        opis = "Specjalnosc firmy";
    }

    @Override
    public double koszt() {
        return 4.5;
    }
}
