package pl.jordanmruczynski.observerdesignpattern;

public class TvNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TV News: " + weatherForecast.temperature + "C degrees and " + weatherForecast.pressure + "hPa");
    }
}
