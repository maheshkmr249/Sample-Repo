package JavaConcepts;

public class ThorwExample {

	// A method that checks a user's age
    static void checkAge(int age) { 
        if (age < 18) { 
            // Explicitly throw an exception if the condition is not met
            throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
        } else {
            System.out.println("Access granted - You are old enough!"); 
        }
    }

    public static void main(String[] args) { 
        try {
            checkAge(18); // Calls the method, which throws the exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage()); // Catches and handles the exception
        }
    }
}
