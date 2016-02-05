
import java.util.Scanner;
import static java.lang.Math.pow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Me
 */
public class presentValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.println("Enter the Furture Value."); // gets FV
        double futureValue = input.nextDouble();

        System.out.println("Enter the Interest Rate.");// gets  rate
        double interestRate = input.nextDouble();

        System.out.println("Enter the number of years. "); //gets  time
        double time = input.nextDouble();

     
             
        System.out.println(presentValue(futureValue, interestRate, time)); // Print to screen the present value
    }

    
    
    public static double presentValue(double futureValueR, double interestRateR, double yearsR) {
               // System.out.println( " future: "+futureValueR +"  rate: "+  interestRateR +"  years: "+  yearsR); //Tests the arguments
        return futureValueR / Math.pow((1 + interestRateR), yearsR); // Will return the present Value
    }
}
