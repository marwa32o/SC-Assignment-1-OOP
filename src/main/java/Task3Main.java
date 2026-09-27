public class Task3Main {
    public static void main(String[] args) {
        // Instantiate SmartBulb
        SmartBulb bulb = new SmartBulb();
        bulb.turnOn();
        bulb.setBrightness(75);
        System.out.println(bulb.getStatus());

        // Instantiate SmartThermostat
        SmartThermostat thermostat = new SmartThermostat();
        thermostat.turnOn();
        thermostat.setTemperature(24.5);
        System.out.println(thermostat.getStatus());
    }
}