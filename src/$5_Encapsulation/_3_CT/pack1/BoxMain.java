package $5_Encapsulation._3_CT.pack1;
// CT Question: assets/images/fig_2_CT.png

import $5_Encapsulation._3_CT.pack1.pack2.Box;
public class BoxMain {
    public static void main(String[] args) {
        Box[] boxArray = new Box[3];

        boxArray[0] = new Box(5);
        boxArray[1] = new Box(5,6,7);
        boxArray[2] = new Box(9,8,7);

        for (int i = 0; i < boxArray.length; i++) {
            System.out.print("Box Volume: " + boxArray[i].getVolume() + ":\t");
            boxArray[i].printDetails();
        }
    }
}
