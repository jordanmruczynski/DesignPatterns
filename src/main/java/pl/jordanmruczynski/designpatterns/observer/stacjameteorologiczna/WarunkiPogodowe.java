package pl.jordanmruczynski.stacjameteorologiczna;

public class WarunkiPogodowe implements Obserwator, PanelInformacyjny {

    private float temp, wilgotnosc;
    private DanePogodowe danePogodowe;

    public WarunkiPogodowe(DanePogodowe danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwator(this);
    }

    @Override
    public void aktualizacja() {
        this.temp = danePogodowe.pobierzTemperature();
        this.wilgotnosc = danePogodowe.pobierzWilgotnosc();
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("WarunkiPogodowe: " + temp  + " | " + wilgotnosc);
    }
}
