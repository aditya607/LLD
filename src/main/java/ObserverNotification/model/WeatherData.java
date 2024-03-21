package ObserverNotification.model;

public class WeatherData implements Data{

    Double temperature;

    public WeatherData(Double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getDataMessage() {
        return "there is the temperature update" + temperature.toString();
    }
}
