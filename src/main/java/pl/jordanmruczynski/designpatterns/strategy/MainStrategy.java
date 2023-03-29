package pl.jordanmruczynski.strategydesignpattern;

public class MainStrategy {
    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculatePrice(10, true);
        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculatePrice(20, true);
    }
}
