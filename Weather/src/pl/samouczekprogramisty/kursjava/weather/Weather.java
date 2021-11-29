package pl.samouczekprogramisty.kursjava.weather;

public class Weather {

    private String name;
    private int temperature;

    public Weather(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString()
    {
        return "Weather: " + this.getName() + "\nTemperature: " + this.getTemperature();
    }
}
