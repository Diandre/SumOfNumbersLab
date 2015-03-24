/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofnumbers;

import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class SumofNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter a positive non-zero integer: ");
        Scanner scan = new Scanner(System.in);
        int maxNumber = scan.nextInt();
        
        if (maxNumber > 0) {
            int sum = 0;
            int numberToAdd = 1;
            
            while (numberToAdd <= maxNumber) {                
                System.out.print(numberToAdd + ", ");
                sum += numberToAdd;
                numberToAdd++;
            }
            System.out.println(); //prints an extra line.
            
            System.out.println("The sum is: " + sum);
        }
        else {
            System.out.println("Failure, please try again.");
    }
    
}}
