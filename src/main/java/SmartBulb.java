/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class SmartBulb implements SmartDevice {

    private boolean isOn;
    private int brightness;

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
            return "Bulb is ON";
        } else {
            return "Bulb is OFF";
        }
    }

    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            brightness = level;
        }
    }
}
