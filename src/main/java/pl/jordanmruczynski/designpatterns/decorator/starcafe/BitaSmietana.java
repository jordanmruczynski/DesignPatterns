package pl.jordanmruczynski.starcafe;

import java.util.HashMap;
import java.util.Map;

public class BitaSmietana extends SkladnikDekorator {

    Map<Wielkosc, Double> sizePrices;
    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
        sizePrices = new HashMap<>();
    }

    @Override
    public double koszt() {
      //  return sizePrices();
        return napoj.koszt() + 1.5;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + ", bita smietana";
    }

    private void sizePrices() {
        sizePrices.put(Wielkosc.MALA, 0.3);
        sizePrices.put(Wielkosc.DUZA, 0.7);
        sizePrices.put(Wielkosc.SREDNIA, 0.5);
    }
}
