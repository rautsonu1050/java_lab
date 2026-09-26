interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {
    String name = "Smart TV";
    String brand = "Samsung";

    @Override
    void displayAppliance() {
        System.out.println("Appliance: " + name);
        System.out.println("Brand: " + brand);
    }

    @Override
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

public class exp_6 {
    public static void main(String[] args) {
        Appliance appliance = new SmartTV();
        appliance.displayAppliance();

        RemoteControl remote = (SmartTV) appliance;
        remote.turnOn();
        remote.turnOff();
    }
}