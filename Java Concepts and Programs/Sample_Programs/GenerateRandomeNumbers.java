package Sample_Programs;

import java.util.Random;

public class GenerateRandomeNumbers {

	public static void main(String[] args) {
		
		//Appraoch 1- Random
       Random rand = new Random();
       
       int rand_int = rand.nextInt(100);
       System.out.println("Random number is: "+rand_int);
       
       double rand_dbl = rand.nextDouble();
       System.out.println(rand_dbl);
       
       
     //Appraoch 2 - math
       System.out.println(Math.random());
    }
}
