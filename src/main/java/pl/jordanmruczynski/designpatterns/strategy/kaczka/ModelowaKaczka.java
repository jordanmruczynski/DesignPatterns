package pl.jordanmruczynski.kaczka;

public class ModelowaKaczka extends Kaczka {

    public ModelowaKaczka() {
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new NieKwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("modelowa kaczka");
    }
}
