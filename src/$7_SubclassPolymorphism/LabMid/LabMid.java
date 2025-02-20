package $7_SubclassPolymorphism.LabMid;
/* QUESTION
1. Complete the following code as per the given instructions in the comments so that your code does not have any error left.
Look at the output at the end of this file.
You have to generate the output after your code is complete. You cannot modify/remove/add any line in the main method.

2. Class Bus has a method named void printPlaces() which prints the following for v4:
       Turag travels to 9 places a day.
Here, 9 is the value of the instance variable named places (int) and Turag is the name.
Now, you have to print this by calling the method for v4. You can add a line here for this part.
-------------------
OUTPUT  ----------
The goods are supplied by Bhai-bhai Poribohon
The speed limit of Bhai-bhai Poribohon is 0.0 km/h
We travel around the city using Dhaka Chaka
The goods are supplied by Mayer Doa Poribohon
The speed limit of Mayer doa Poribohon is 80.0 km/h
We travel around the city using Turag
--------------------
 */
import $7_SubclassPolymorphism.LabMid.pkg1.Truck;
import $7_SubclassPolymorphism.LabMid.pkg1.pkg2.Vehicle;
import $7_SubclassPolymorphism.LabMid.pkg1.pkg2.pkg3.Bus;
public class LabMid {
    public static void main(String[] args) {
        //class Vehicle in package pkg2 inside pkg1
        //class Vehicle has two data members typed type(String) and speed(double)
        Vehicle v1 = new Truck("Bhai-bhai Poribohon");
        //class Bus inside package in pkg3 inside package pkg2
        Vehicle v2 = new Bus("Dhaka Chaka");
        //class Truck inside package pkg1
        Vehicle v3= new Truck("Mayer doa Poribohon", 80.0);
        Vehicle v4 = new Bus("Turag", 9);

        v1.printDetails();       // The goods are supplied by Bhai-bhai Poribohon
        v1.printSpeed();        // The speed limit of Bhai-bhai Poribohon is 0.0 km/h
        v2.printDetails();      // We travel around the city using Dhaka Chaka
        v2.printSpeed();        // ____________
        v3.printDetails();       // The goods are supplied by Mayer Doa Poribohon
        v3.printSpeed();        // The speed limit of Mayer doa Poribohon is 80.0 km/h
        v4.printDetails();      // We travel around the city using Turag
        v4.printSpeed();        // _____________

        // vehicle
        Vehicle v5= new Vehicle();
        v5.printDetails();       // __________
        v5.printSpeed();            // __________

    }
}
