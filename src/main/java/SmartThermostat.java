/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class SmartThermostat implements SmartDevice {

    private boolean isOn;
    private double temperature;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        if (isOn) {
            return "Thermostat is ON";
        } else {
            return "Thermostat is OFF";
        }
    }

    public void setTemperature(double temp) {
        temperature = temp;
    }
}