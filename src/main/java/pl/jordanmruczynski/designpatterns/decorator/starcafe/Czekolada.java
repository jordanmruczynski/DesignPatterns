package pl.jordanmruczynski.starcafe;

public class Czekolada extends SkladnikDekorator {
    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 1;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + ", czekolada";
    }
}
