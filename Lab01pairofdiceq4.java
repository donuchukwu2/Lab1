/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01pairofdiceq4;

/**
 *
 * @author David
 */
public class Lab01pairofdiceq4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int die1;   // The number on the first die.
        int die2;   // The number on the second die.
        int roll;   // The total roll (sum of the two dice).
        
        die1 = (int)(Math.random()*10) + 1;
        die2 = (int)(Math.random()*10) + 1;
        roll = die1 + die2;
        
        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("Your total roll is " + roll);

    }  // end main()
 
}  // end class
    }
    
}
