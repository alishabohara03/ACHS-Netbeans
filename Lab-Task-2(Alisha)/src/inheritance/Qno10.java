/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;


/**
 *
 * @author asyla
 */
//public class Qno10 {
//    
//}


abstract class Appliance {
    public abstract void turnOn(); // Abstract method
}

// Subclass 1: Fan
class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is now spinning.");
    }
}

// Subclass 2: WashingMachine
class WashingMachine extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Washing machine is now washing clothes.");
    }
}

public class Qno10 {
    // Method demonstrating dynamic binding
    public static void startAppliance(Appliance appliance) {
        appliance.turnOn(); // Dynamic method dispatch
    }

    public static void main(String[] args) {
        // Create objects
        Appliance fan = new Fan();
        Appliance washer = new WashingMachine();

        // Call method that uses dynamic binding
        startAppliance(fan);
        startAppliance(washer);
    }
}
