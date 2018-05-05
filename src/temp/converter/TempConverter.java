/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp.converter;

import java.util.Scanner;

/**
 *
 * @author khaddow
 */
public class TempConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner user_input=new Scanner(System.in);
        float Fahrenheit, Celsius;
        System.out.print ("Celsius Temperature:");
        Celsius = (float) user_input.nextDouble();
        Fahrenheit = (float) ((9.0/5.0)*Celsius +32);
        System.out.print ("\n\nFahrenheit is : "+Fahrenheit);
        // TODO code application logic here
        
    }
    
}
