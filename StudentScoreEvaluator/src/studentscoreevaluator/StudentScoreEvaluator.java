/*
 * Program demonstrates use of conditional  statements
 *  (b) check marks of students and display grade accordingly 
*/
package studentscoreevaluator;

import java.util.Scanner;

public class StudentScoreEvaluator {    
    String name;                                                // holds student name
    int score;                                                  // holds exam score
    int age;
    Scanner scan=new Scanner (System.in);                       // Scanner object initialization
            
    void getStudentInfo(){                                      //Getter
        System.out.println("Student Name :: " + name);
        System.out.println("Age     :: " +age);
    }
    
    void setStudentInfo(){                                      //Setter
        System.out.print("Please input your name :: ");
        name=scan.next();
        System.out.println("");
        System.out.print("Please input your age :: ");
        age=scan.nextInt();
        System.out.print("Please input your score :: ");
        score=scan.nextInt();
    }
    
    void evalScore(){                                          //evaluates age and score
        getStudentInfo();
        if (age <=15){                                         //Validating Age 
            if (score > 70 ){                                  // Validating score
             System.out.println("Grade :: A");            
            }
            else if (score >= 60 && score <=70 ){
                System.out.println("Grade :: B");                           
            }            
            else {
                System.out.println("Grade :: C");
            }                                        
        }                 
        else {
            System.out.println("Notice :: Age should be less thens 15");
        }
    }
    public static void main(String[] args) {
        StudentScoreEvaluator objSSE = new StudentScoreEvaluator();       //Class object initialization
        objSSE.setStudentInfo();
        objSSE.evalScore();
    }
    
}
