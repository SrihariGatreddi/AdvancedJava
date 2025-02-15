class employee {

    // A non-static inner class is associated with an instance of the outer class.
    // To create an object of a non-static inner class, you must first create an instance of the outer class.

    //         A static nested class does not require an instance of the outer class. It behaves more like a top-level class but is logically grouped inside the outer class.
    // You can create an object of the static nested class directly without creating an object of the outer class.
    
    // The nested class does not depend on the instance of the outer class.
    // You want to instantiate the nested class directly without creating an instance of the outer class.

    class man {
        // if man is a static class i.e static class man.....then create an instance of the man directly in the main method.
        int age;
        String name;
        static int classname=1;
        man(int age, String name) {
            this.age = age;
            this.name = name;
        }

        void sayhello() {
            System.out.println("Hello");
        }
    }

    class empDetailsViewer extends man {
        // When you extend a non-static inner class (like man) in a subclass (like empDetailsViewer), you're essentially creating a subclass of an instance-dependent class.
        // The constructor of the inner class must be called to initialize the inner class’s fields (age, name, etc.) before the subclass (empDetailsViewer) can be initialized.
        // In Java, when you inherit from a class, the constructor of the superclass is invoked automatically unless you explicitly call it using super().

        // However, since the non-static inner class (man) requires an instance of the outer class (employee), the constructor of man needs to be invoked with the correct instance of the outer class. 
        // This is why you need to call super(age, name) inside the constructor of empDetailsViewer.
        // Since man is a non-static inner class, it has an implicit reference to an instance of the outer class (employee).
        // When you extend it, the subclass constructor has to ensure that the inner class is properly initialized, which requires passing the parameters to the man constructor via super().
        // Without super(), the compiler will not know how to instantiate the inner class man, because it requires an instance of the outer class.

        empDetailsViewer(int age, String name) {
            super(age, name); // Call to the superclass (man) constructor
        }
    }

    public static void main(String[] args) {
        // when a non-static inner class is there, first create the outer class instance and then using that instance create the nested class instance as follows
        employee emp = new employee(); // Create the outer class instance

        // Create an instance of the inner class 'man' using the outer class instance
        employee.man emp1 = emp.new man(26, "Srihari");
        System.out.println(emp1.age); // Print age of the 'man' instance
        emp1.sayhello(); // Call sayhello method of 'man'

        // Create an instance of the inner class 'empDetailsViewer' using the outer class instance
        employee.empDetailsViewer empDetails = emp.new empDetailsViewer(34, "harry");
        empDetails.sayhello(); // Call sayhello method of 'empDetailsViewer'
        System.out.println(empDetailsViewer.classname);
        System.out.println(empDetailsViewer.classname);
    }
}
