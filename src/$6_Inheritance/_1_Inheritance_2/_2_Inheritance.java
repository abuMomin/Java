package $6_Inheritance._1_Inheritance_2;
/*
// What will happen if a granChild reference calls a parentMethod(), which is overridden in child class but not in grandChild class?
// Ans: It will execute the overridden parentMethod() from childClass. which is natural because the grandChild inherited the overridden parentMethod() from child.
 */
class Parent{
    private String par_name;
    int par_age;
    Parent(){
        par_name = "Momin";
        par_age = 60;
        System.out.println("Parent Class Constructor");
    }
    void parentMethod(){
        System.out.println("Parent Method, Parent Name: " + par_name);
    }
    String getPar_name() {
        return par_name;
    }
}
class Child extends Parent{
    private String chi_name;
    int chi_age;
    Child(){
        chi_name = "Win";
        chi_age = 22;
        System.out.println("Child Class Constructor");
    }
    void childMethod(){
        System.out.println("Child Method, Child Name: " + chi_name + ", Parent Name: " + getPar_name());
    }
    //ParentMethod overriding
    void parentMethod(){
        System.out.println("Parent Method from Child Class, Parent Name: "+ getPar_name() + ", Child Name: "+ chi_name);
    }
    void superParentMethodFromChild(){
        super.parentMethod();
    }
    public String getChi_name() {
        return chi_name;
    }
}

class GrandChild extends Child{
    private String grandChi_name;
    int grandChi_age;

    GrandChild(){
        //super("Momin", 60);
        grandChi_name = "Pichu";
        grandChi_age = 0;
        System.out.println("GrandChild Class Constructor");
    }

    void grandChildMethod(){
        System.out.println("GrandChild Method, GrandChild Name: "+ grandChi_name+ ", Child Name: " + getChi_name() + ", Parent Name: " + getPar_name());
    }

    // parentMethod() is not overridden in GrandChild.
}

public class _2_Inheritance {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
        c1.par_age = 40;
        System.out.println(c1.par_age);
        System.out.println(p1.par_age);
        c1.childMethod();
        System.out.println(c1.getPar_name());
        c1.parentMethod();
        c1.superParentMethodFromChild();

        // Creating Grandchild object
        GrandChild gc1 = new GrandChild();
        // Calling the parentMethod which has been overriden in Child Class but not in grandChildClass
        gc1.parentMethod();
    }
}
