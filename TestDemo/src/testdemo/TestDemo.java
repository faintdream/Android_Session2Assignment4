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
       if (args.length<1){
            System.out.println(" Error occured  ");
            exit (255);
        }
        input =Integer.parseInt(args[0]);
        if (input==0){
            System.out.println("You Have Entered Zero ");
        }
        else if(input < 0 ){
            System.out.println("“You Have Entered Negative Value");                         
        }
        else {
            System.out.println("You Have Entered Positive Value");                
        }
        

    }
}    

