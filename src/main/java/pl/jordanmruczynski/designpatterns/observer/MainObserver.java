package pl.jordanmruczynski.observerdesignpattern;

public class MainObserver {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weatherForecast.updateForecast(18, 1007);
    }
}
