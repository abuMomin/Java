package $6_Inheritance._1_Inheritance;

/* Key Takeaways
// Inheritance is the process by which one object acquires the properties of another object.
// It is a way to form new classes using classes that have already been defined.
// The new classes (child classes), take over (or inherit) attributes and behavior of the pre-existing classes (parent classes) along with it's own properties.
// When a class inherits another class --> `extends` --> keyword is used.
// class <subclass> extends <superclass>
// A child class can have only one parent class, but a parent can have multiple children class. --> Multiple inheritance not supported in java
// A child class can have unlimited grandchild and greatGrandchild classes --> Multi-level inheritance is supported in java.
// Method Overriding =  when a subclass redefines/modifies a method of its superclass.
// Method Overriding --> return type, name, parameter same as parent, only method body can be changed. also, Child method access_modifier could be equal or more accessible.
// `super` keyword --> super keyword is used to call superclass' constructor, method, instance_variables --> https://www.geeksforgeeks.org/super-keyword/
// A subclass can call a method defined in its parent class using the super keyword. method can be called anywhere.
// When calling a superclass constructor, the super() statement must be the first statement in the constructor of the subclass.
// If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
// The super keyword cannot be used in a static context, such as in a static method or a static variable initializer.
*/

import $6_Inheritance._1_Inheritance._1_ParentPackage._1_ParentClass;
import $6_Inheritance._1_Inheritance._1_ChildPackage._1_ChildClass;
public class _1_Inheritance {
    public static void main(String[] args) {
        _1_ChildClass child = new _1_ChildClass();
        _1_ParentClass parent = new _1_ParentClass();

        child.getDetails();
        parent.getDetails();

        System.out.println("Accessing parent properties from child object "+child.ageParent);
        System.out.println("Accessing child properties from child object "+ child.ageChild);
        System.out.println("Accessing parent's same method from child object:");
        child.getParentDetails();

        parent.ageParent = child.ageChild + parent.ageParent;

        System.out.println("Modified Parent property but of another object: "+ parent.ageParent);
        System.out.println("Accessing parent properties from child object "+ child.ageParent);


    }
}
/* QnA

 */
