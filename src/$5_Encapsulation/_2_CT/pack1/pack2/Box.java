package $5_Encapsulation._2_CT.pack1.pack2;

public class Box {
    double boxLength;
    double boxHeight;
    double boxWidth;

    public Box(double cubeLength) {
        boxLength = cubeLength;
        boxHeight = cubeLength;
        boxWidth = cubeLength;
    }

    public Box(double boxLength, double boxHeight, double boxWidth) {
        this.boxLength = boxLength;
        this.boxHeight = boxHeight;
        this.boxWidth = boxWidth;
    }
    public double getVolume(){
        return boxLength*boxWidth*boxHeight;
    }

    public void printDetails(){
        System.out.println("Length: " + boxLength+",\tWidth: " + boxWidth + ",\tHeight: " + boxHeight);
    }
    public double getBoxLength() {
        return boxLength;
    }

    public void setBoxLength(double boxLength) {
        this.boxLength = boxLength;
    }

    public double getBoxHeight() {
        return boxHeight;
    }

    public void setBoxHeight(double boxHeight) {
        this.boxHeight = boxHeight;
    }

    public double getBoxWidth() {
        return boxWidth;
    }

    public void setBoxWidth(double boxWidth) {
        this.boxWidth = boxWidth;
    }
}
