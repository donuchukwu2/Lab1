/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.pkg9;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a, b, answer1, answer2, answer3, answer4, answer5 ;
        
        Scanner one = new Scanner(System.in);
        
        a = 10.5;
        b = 8.8;
        answer1 = a + b;
        answer2 = a - b;
        answer3 = a * b;
        answer4 = a / b;
        answer5 = a % b;
        
                
        System.out.println("Addition Total =" + answer1); // addition of a+b 
        
        System.out.println("Minus Total =" + answer2);
        
        System.out.println("Multiplication Total =" + answer3);
        
        System.out.println("Division Total =" + answer4);
        
        System.out.println("Modulus Total =" + answer5);
        
        
    }
    
}
