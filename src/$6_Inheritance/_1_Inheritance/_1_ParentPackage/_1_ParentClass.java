package $6_Inheritance._1_Inheritance._1_ParentPackage;

public class _1_ParentClass {
    public String nameParent = "Mominul";
    public int ageParent = 67;
    public double fortune = 45000000;
    public void getDetails(){
        // this getDetails() is an example of "Method Overriding" --> it overridden the `getDetails()` of
        System.out.println("Parent Name " + nameParent + ",\tParent Fortune: " + fortune + ",\tParent Age: "+ ageParent);
    }
}
