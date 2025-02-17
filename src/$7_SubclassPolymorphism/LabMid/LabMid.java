package $7_SubclassPolymorphism.LabMid;
/*
Complete the following code as per the given instructions in the comments so that your code does not have any error left.
Look at the output at the end of this file.
You have to generate the output after your code is complete. You cannot modify/remove/add any line in the main method.
*/

/* OUTPUT  ----------
The goods are supplied by Bhai-bhai Poribohon
The speed limit of Bhai-bhai Poribohon is 0.0 km/h
We travel around the city using Dhaka Chaka
The goods are supplied by Mayer Doa Poribohon
The speed limit of Mayer doa Poribohon is 80.0 km/h
We travel around the city using Turag
 */
public class LabMid {
    public static void main(String[] args) {
        //class Vehicle in package pkg2 inside pkg1
        //class Vehicle has two data members typed type(String) and speed(double)
        Vehicle v1 = new Truck("Bhai-bhai Poribohon");
        //class Truck inside package in pkg3 inside package pkg2
        Vehicle v2 = new Bus("Dhaka Chaka");
        //class Truck inside package pkg1
        Vehicle v3= new Truck("Mayer doa Poribohon", 80.0);
        Vehicle v4 = new Bus("Turag", 9);
        v1.printDetails();
        v1.printSpeed();
        v2.printDetails();
        v2.printSpeed();
        v3.printDetails();
        v3.printSpeed();
        v4.printDetails();
        v4.printSpeed();
        Vehicle v5= new Vehicle();
        v5.printDetails();
        v5.printSpeed();
        /*
        Class Bus has a method named void printPlaces() which prints the following for v4:
               Turag travels to 9 places a day.
        Here, 9 is the value of the instance variable named places (int) and Turag is the name.
        Now, you have to print this by calling the method for v4. You can add a line here for this 		part.

         */
    }
}
