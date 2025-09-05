package Java_Theory.Java_Oops;

public class Encapsulation {

/*
    Only Class, variables and methods have the access modifies
    Encapsulation: Practice of bundling/Wrapping the data (variables) and the methods (functions) in to a single unit. called a class, and restricting access to some of the object's components.

         Key Aspects of Encapsulation or achieve Encapsulation via below steps:
         1) Private Variables
         2) Public Methods (Getters and Setters)

         Getters: allow reading the value of a private field.
         Setters: allow modifying the value of a private field, typically after performing some validation.

         We cannot access variable directly without creating getters and setters methods
         Two types of variable in Java: Local variable and class/Instance variable

         (Note: Global variable {Created outside the class} is not present in java)
         Two types of errors: Logical error and syntax error

        Access modifiers:
        Access modifiers are keywords that are used in order to specify the accessibility of methods, variables, and classes.

        public: Anyone can access it, Including outside the class.
        protected: Only accessible within the same package and by subclasses (Child class).
        default (no modifier): Only accessible within the same package.
        private: Only accessible within the same class.

*/

    private int a;
    private int b;

    public void Getters(int a) {
        this.a = a;
        /*
         This is used to identify and classify class variable and getters variable
         When class variable and local variable
         */
    }

    public int Setters() {
        return a;
    }

}
