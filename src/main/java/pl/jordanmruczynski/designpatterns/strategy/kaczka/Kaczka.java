package pl.jordanmruczynski.kaczka;

public abstract class Kaczka {
    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;

    public abstract void wyswietl();

    public void wykonajLec() {
        latanieInterfejs.leć();
    }

    public void wykonajKwacz() {
        kwakanieInterfejs.kwacz();;
    }

    public void plyn() {
        System.out.println("wszystkie kaczki umieja plywac");
    }

    public void setKwakanieInterfejs(KwakanieInterfejs kwakanieInterfejs) {
        this.kwakanieInterfejs = kwakanieInterfejs;
    }

    public void setLatanieInterfejs(LatanieInterfejs latanieInterfejs) {
        this.latanieInterfejs = latanieInterfejs;
    }
}
