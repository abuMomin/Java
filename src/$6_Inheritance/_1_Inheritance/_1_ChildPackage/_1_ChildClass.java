package $6_Inheritance._1_Inheritance._1_ChildPackage;

import $6_Inheritance._1_Inheritance._1_ParentPackage._1_ParentClass;

public class _1_ChildClass extends _1_ParentClass {
    public String nameChild = "Win";
    public int ageChild = 27;
    public double fortune = 90000;
    public void getDetails(){
        System.out.println("Child Name " + nameChild + ",\tChild Fortune: " + fortune + ",\tChild Age: " + ageChild);
    }
    public void getParentDetails(){
        super.getDetails();
    }
}