/*
 * Program demonstrates use of conditional  statements
 *  (a) check if entered value is 0 or postitive or negative
 *  (b) check marks of students and display grade accordingly
 */
package testdemo;

import static java.lang.System.exit;

public class TestDemo {
   
    
    public static void main(String[] args) {
        
       int input;
       if (args.length<1){                                  // are there any used indices in args array ?
            System.out.println("Notice :: Error occured  ");
            exit (255);                                     // explicit exit
        }
        input =Integer.parseInt(args[0]);                   // convert string to integer using ParseInt
        
                                                            
        if (input==0){                                                  // if-else if ladder to check the values
            System.out.println("You Have Entered Zero ");
        }
        else if(input < 0 ){
            System.out.println("You Have Entered Negative Value");                         
        }
        else {
            System.out.println("You Have Entered Positive Value");                
        }
        

    }
}    

