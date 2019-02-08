/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01length.conversion;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab01lengthConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for feet and inch: ");
        double metres = input.nextDouble();
        double inch = metres * 3;
        double feet = metres * 3.2;
        System.out.println(metres + " metre is " + inch + " inch" + feet + "feet");
        
        
    }
    
}
