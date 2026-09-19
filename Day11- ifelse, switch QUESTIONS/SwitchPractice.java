import java.util.Scanner;
public class SwitchPractice {
    public static void main(String[] args) {
    
    //Que-9) Write a Java program that takes a number (1-7)and prints the corresponding day using switch.
    /*
    Mapping:
    1---> Monday
    2---> Tuesday
    3---> Wednesday
    4---> Thursday
    5---> Friday
    6---> Saturday
    7---> Sunday        */
//         Scanner sc = new Scanner(System.in);
//         int day = sc.nextInt();
//         switch(day) {
//             case 1:
//                     System.out.println("Monday");
//                     break;
//             case 2:
//                     System.out.println("Tuesday");
//                     break;
//             case 3:
//                     System.out.println("Wednesday");
//                     break;
//             case 4:
//                     System.out.println("Thursday");
//                     break;
//             case 5:
//                     System.out.println("Friday");
//                     break;
//             case 6:
//                     System.out.println("Saturday");
//                     break;
//             case 7:
//                     System.out.println("Sunday");
//                     break;
//             default:
//                     System.out.println("error: number does not represent any day");
//                     break;
//         }

 


//     //Que-10) Write a Java program that takes:
//     /*
//     1) Two Numbers
//     2) One Operator(+, -, *, /)
//     and performs the operation using switch.
//     Example: Input: 10 + 5 = 15
//     */
//         Scanner cal = new Scanner (System.in);
//         double num1 = cal.nextDouble();
//         char operator = cal.next().charAt(0);
//         double num2 = cal.nextDouble();

//         switch(operator){
//                 case '+':
//                         System.out.println("Result = " + (num1 + num2));
//                         break;
//                 case '-':
//                         System.out.println("Result = " + (num1 + num2));
//                         break;
//                 case '*':
//                         System.out.println("Result = " + (num1 * num2));
//                         break;
//                 case '/':
//                         System.out.println("Result = " + (num1 / num2));
//                         break;

//                         }





    /*
    Que-11) Write a program that checks whether a year is a leap year.
    Condition:
     A year is Leap yearif:
                       1) Divisible by 400
                             or
                       2) Divisible by 4 but not by 100.      */                    

        Scanner leap = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = leap.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                System.out.println("Leap Year");
        }
        else{System.out.println("Not a Leap Year");}
        leap.close();
     
     










































            }
                
            }
