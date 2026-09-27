public class SmartThermostat implements SmartDevice {
    private boolean isOn;
    private double temperature;

    public SmartThermostat() {
        this.isOn = false;
        this.temperature = 22.0; // Default temperature in Celsius
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    @Override
    public String getStatus() {
        return "SmartThermostat Status: " + (isOn ? "ON" : "OFF") + " | Target Temp: " + temperature + "°C";
    }

    // Unique method specific to SmartThermostat
    public void setTemperature(double temp) {
        this.temperature = temp;
    }
}