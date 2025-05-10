package $6_Inheritance._1_Inheritance;

/* Key Takeaways
// Inheritance is the process by which one object acquires the properties of another object.
// It is a way to form new classes using classes that have already been defined.
// The new classes (child classes), take over (or inherit) attributes and behavior of the pre-existing classes (parent classes) along with it's own properties.
// When a class inherits another class --> `extends` --> keyword is used.
// class <subclass> extends <superclass>
// Access Modifiers (and packages) play a crucial role in inheritance about which members of superclass would get access to subclasses.
// For Example: private variable cannot be accessed by its subclasses. Default members of superclass are only accessible if they are in the same package as subclass. and so on.
// A child class can have only one parent class, but a parent can have multiple children class. --> Multiple inheritance not supported in java
// A child class can have unlimited grandchild and greatGrandchild classes --> Multi-level inheritance is supported in java.
// Method Overriding = When a subclass redefines/modifies a method of its superclass. Not mandatory, it's a choice.
// Method Overidding = A class replacing an ancestor's implementation of a method with an implementation of it own.
// Method Overriding --> Method Signature(name and argument list) and return type must be the same as the parent method.
// Method Overriding --> method body can be changed. And Child method access_modifier could be equal or more accessible.
// `super` keyword --> super keyword is used to call superclass' constructor, method, instance_variables --> https://www.geeksforgeeks.org/super-keyword/
// A subclass can call a method defined in its parent class using the super keyword. method can be called anywhere.
// When calling a superclass constructor, the super() statement must be the first statement in the constructor of the subclass.
// If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
// The super keyword cannot be used in a static context, such as in a static method or a static variable initializer.
// Static variables belong to the class, not to instances, so they are shared among all instances.
// When a subclass defines a static variable with the same name as a superclass, it hides the superclass variable rather than overriding it.
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
