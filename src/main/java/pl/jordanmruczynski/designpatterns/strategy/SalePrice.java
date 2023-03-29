package pl.jordanmruczynski.strategydesignpattern;

public class SalePrice implements PricingStrategy{
    @Override
    public void calculatePrice(int price, boolean isSignedUpFornewsletter) {
        System.out.println(isSignedUpFornewsletter ? (price/2) : "Niezmieniona cena");
    }
}
