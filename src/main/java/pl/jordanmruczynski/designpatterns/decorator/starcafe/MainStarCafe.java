package pl.jordanmruczynski.starcafe;

public class MainStarCafe {

    public static void main(String[] args) {
        Napoj napoj = new Espresso();
        System.out.println(napoj.getOpis() + " " + napoj.koszt());

        Napoj napoj1 = new Espresso();
        napoj1 = new BitaSmietana(napoj1);
        napoj1 = new Czekolada(napoj1);
        System.out.println(napoj1.getOpis() + " " + napoj1.koszt());


    }
}
