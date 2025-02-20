package $7_SubclassPolymorphism.LabMid.pkg1;

import $7_SubclassPolymorphism.LabMid.pkg1.pkg2.Vehicle;

public class Truck extends Vehicle {
    public String truckName;
    public Truck(String truckName){
        type = "Truck";
        this.truckName = truckName;
    }

    public Truck(String truckName, double speed){
        type = "Truck";
        this.truckName = truckName;
        this.speed = speed;
    }

    public void printDetails(){
        System.out.println("The goods are supplied by " + truckName);
    }

    public void printSpeed(){
        System.out.println("The speed limit of " + truckName + " is " + speed + " km/h");
    }
}
