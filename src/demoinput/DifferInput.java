package demoinput;

import java.io.*;
import java.util.*; 

class DifferInput 
{ 
    public static void main(String args[]) 
                  throws IOException 
    { 
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        long start = System.currentTimeMillis( );
        System.out.println("Enter an integer"); 
        int a = Integer.parseInt(br.readLine()); 
        System.out.println("Enter a String"); 
        String b = br.readLine(); 
        System.out.println("You have entered:- " + a + 
                          " and name as " + b);
        long end = System.currentTimeMillis( );
        long diff = end - start;

         System.out.println("Operation time is " + diff);
    } 
} 