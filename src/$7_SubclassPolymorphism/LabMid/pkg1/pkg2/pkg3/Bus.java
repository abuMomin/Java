package $7_SubclassPolymorphism.LabMid.pkg1.pkg2.pkg3;

import $7_SubclassPolymorphism.LabMid.pkg1.pkg2.Vehicle;

public class Bus extends Vehicle {
    private int places;
    public String busName;

    public Bus(String busName){
        type = "Bus";
        this.busName = busName;
    }

    public Bus(String busName, int places){
        type = "Bus";
        this.busName = busName;
        this.places = places;
    }

    public void printDetails(){
        System.out.println("We travel around the city using " + busName);
    }

    public void printPlaces(){
        System.out.println(busName + " travels to " + places + " places a day.");
    }
}
