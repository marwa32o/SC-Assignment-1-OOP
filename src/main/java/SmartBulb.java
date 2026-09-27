public class SmartBulb implements SmartDevice {
    private boolean isOn;
    private int brightness; // Percentage (0 - 100)

    public SmartBulb() {
        this.isOn = false;
        this.brightness = 0;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        this.brightness = 100; // Default brightness when turned on
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        this.brightness = 0;
    }

    @Override
    public String getStatus() {
        return "SmartBulb Status: " + (isOn ? "ON" : "OFF") + " | Brightness: " + brightness + "%";
    }

    // Unique method specific to SmartBulb
    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            this.brightness = level;
        } else {
            System.out.println("Invalid brightness level. Must be between 0 and 100.");
        }
    }
}