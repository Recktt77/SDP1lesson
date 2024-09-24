package Dependency_Inversion_Principle;

public class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light is ON.");
    }
    public void turnOff() {
        System.out.println("Light is OFF.");
    }
}

