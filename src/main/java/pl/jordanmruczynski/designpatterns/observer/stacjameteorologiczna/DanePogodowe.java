package pl.jordanmruczynski.stacjameteorologiczna;

import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements Podmiot {
    private List<Obserwator> obserwatory;
    private float temp, wilgotnosc, cisnienie;

    public DanePogodowe() {
        obserwatory = new ArrayList<Obserwator>();
    }

    public float pobierzTemperature() {
        return temp;
    }

    public float pobierzWilgotnosc() {
        return wilgotnosc;
    }

    public float pobierzCisnienie() {
        return cisnienie;
    }

    @Override
    public void zarejestrujObserwator(Obserwator o) {
        obserwatory.add(o);
    }

    @Override
    public void usunObserwator(Obserwator o) {
        obserwatory.remove(o);
    }

    @Override
    public void powiadomObserwatory() {
        obserwatory.forEach(Obserwator::aktualizacja);
    }

    public void zmienionoOdczyty() {
        powiadomObserwatory();
    }

    public void ustawOdczyty(float temp, float wilgotnosc, float cisnienie) {
        this.temp = temp;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        zmienionoOdczyty();
    }
}
