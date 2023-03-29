package pl.jordanmruczynski.strategydesignpattern;

public interface PricingStrategy {

    void calculatePrice(int price, boolean isSignedUpFornewsletter);

}
