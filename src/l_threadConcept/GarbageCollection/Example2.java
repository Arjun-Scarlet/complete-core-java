package l_threadConcept.GarbageCollection;

// AutoCloseable is a functional interface present in lang package
// Introduced in JDK 1.7 and it is used to manage the resources in try-with-resource statement
// It implicitly closes the resource after using it and it is an alternative method of finalize()

class B implements AutoCloseable { //here implementing AutoCloseable is just for printing message by overriding close()
    B() {
        System.out.println("B Object created");
    }

    @Override
    public void close() {
        System.out.println("Resource closed!");
    }
}

public class Example2 {
    public static void main(String[] args) {
    	System.out.println("main starts");
        try (B b1 = new B()) {
            System.out.println("B Object called!");//use resource
        } // impliciltly calls close() here
        System.out.println("main ends");
    }
}

