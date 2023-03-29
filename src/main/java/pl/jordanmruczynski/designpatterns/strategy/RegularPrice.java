package pl.jordanmruczynski.strategydesignpattern;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpFornewsletter) {
        System.out.println(isSignedUpFornewsletter ? "Normalna cena" : price);
    }
}
