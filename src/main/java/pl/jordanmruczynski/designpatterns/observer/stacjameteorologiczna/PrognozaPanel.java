package pl.jordanmruczynski.stacjameteorologiczna;

public class PrognozaPanel implements Obserwator, PanelInformacyjny {

    private float biezaceCisnienie = 1010.1f;
    private float poprzednieCisnienie;
    DanePogodowe danePogodowe;

    public PrognozaPanel(DanePogodowe danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwator(this);
    }

    @Override
    public void aktualizacja() {
        poprzednieCisnienie = danePogodowe.pobierzCisnienie();
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("PrognozaPanel: " + biezaceCisnienie + " <-> " + poprzednieCisnienie);
    }
}
