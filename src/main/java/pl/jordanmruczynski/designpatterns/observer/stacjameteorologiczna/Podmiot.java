package pl.jordanmruczynski.stacjameteorologiczna;

public interface Podmiot {

    public void zarejestrujObserwator(Obserwator o);
    public void usunObserwator(Obserwator o);
    public void powiadomObserwatory();
}
