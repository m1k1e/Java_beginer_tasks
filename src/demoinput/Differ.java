package demoinput;

import java.util.*; 

class Differ 

{ 
     public static void main(String args[]) 
     { 
         Scanner scn = new Scanner(System.in); 
         long start = System.currentTimeMillis( );
         System.out.println("Enter an integer");
         int a = scn.nextInt(); 
         System.out.println("Enter a String"); 
         String b = scn.nextLine(); 
         System.out.println("You have entered:- "
                 + a + " " + "and name as " + b); 
         long end = System.currentTimeMillis( );
         long diff = end - start;

         System.out.println("Operation time is " + diff);
     } 
} 