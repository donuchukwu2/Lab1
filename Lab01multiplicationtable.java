/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01multiplicationtable;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab01multiplicationtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int tableSize = 5;

	        printMultiplicationTable(tableSize);

	    }

	    public static void printMultiplicationTable(int tableSize) {

	        // first print the top header row

	        System.out.format("      ");

	        for(int i = 1; i<=tableSize;i++ ) {

	            System.out.format("%4d",i);

	        }

	        System.out.println();

	        System.out.println("------------------------------------------");
                
	        for(int i = 1 ;i<=tableSize;i++) {

	            // print left most column first

	            System.out.format("%4d |",i);

	            for(int j=1;j<=tableSize;j++) {

	                System.out.format("%4d",i*j);

	            }

	            System.out.println();

	        }

	    }
    }
    
