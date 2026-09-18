

import java.util.Scanner;
   public class ifelsePractice {public static void main(String[] args) { 


// // Que-1) Write a Java program that takes an integer input from the user and checks whether the number is positive.
// // output format--->"Positive number"
//      Scanner sc = new Scanner(System.in);
//      int number = sc.nextInt();
//     if (number > 0){System.out.println("Positive Number");
//     } else {
//        System.out.println("Negitive Number");
//     }














// // Que-2) Write a Java Program to check whether a given integer is even or odd.
// //Output format  
// Scanner sccc = new Scanner(System.in);
//      int No = sccc.nextInt();
//     if(No % 2 == 0) {
//         System.out.println("Even Number");
//     } else {
//         System.out.println("Odd Number");
//     }
 










// //Que-3) Write a Java program that takes age as input and checks whrther the person is eligible to vote.
// // Condition * Age >= 18 ---> Eligible to vote, otherwise---> Not Eligible to vote.
// Scanner scc = new Scanner(System.in);
// int age = scc.nextInt();
// if (age >= 18){
//     System.out.println("Eligible to vote");
// }
// else{
//     System.out.println("Not Eligible to vote");
// }









// // Que-4) Write a Java program that takes two integers as input and prints which one is greter.
// // Example: input---> 10 20, output---> 20 is greater than 10
// Scanner scn = new Scanner(System.in);
// int num1 = scn.nextInt();
// int num2 = scn.nextInt();

// if(num1>num2){
//     System.out.println(num1 + " is greater than " + num2);
// }
// else {
//     System.out.println(num2 + " is greater than " + num1);
// }





// Que-5) Write a Java Program to classify temperature into categories.
// Conditions: Temp <10 --->"very cold"
// Conditions: Temp >=10 & <25 ---> 'moderate'
// conditions: Temp >25 ----> "hot"
// Scanner weather = new Scanner (System.in);
// int temp = weather.nextInt();
// if(temp < 10){System.out.println("very cold");}
// else if (temp >=10 && temp<25){System.out.println("Moderate");}
// else {System.out.println("hot");}












// // Que-6) Write a Java program that takes marks (0-100) as input and prints grade using if-else-if ladder.
// /*
// Grading criteria:
// >=90---> Grade A
// >=75---> Grade B
// >=60---> Grade C
// >=40---> Grade D       */ 
// Scanner marks = new Scanner(System.in);
// int Grade = marks.nextInt();
// if (Grade >= 90) {
//     System.out.println(" Grade-A");
// } else if (Grade >= 75) {
//     System.out.println("Grade-B");
// } else if (Grade >= 60) {
//     System.out.println("Grade-C");
// } else if (Grade >= 40) {
//     System.out.println("Grade-D");
// } else if (Grade < 40) {
//     System.out.println("fail");
// }











// //Que-7) Write a Java program to find the largest among three numbers using if-else-if ladder.
// //Example: Input---> 10 25 15, Output---> Largest number is 25
// Scanner la = new Scanner (System.in);
// int no1 = la.nextInt();
// int no2 = la.nextInt();
// int no3 = la.nextInt();
// if(no1 > no2 && no1 > no3){System.out.println("Largest number is ---> " + no1);}
// else if (no2 > no1 && no2 > no3){System.out.println("Largest number is ---> " + no2);}
// else {System.out.println("Largest number is ---> " + no3);}











//Que-8) Write a Java program to check whether anumber is: 1) Positive, 2) Negative, 3) zero
Scanner chq = new Scanner (System.in);
int number = chq.nextInt();
if(number < 0){System.out.println(number + " is a negative number");}
else if(number > 0){System.out.println(number + " is a positive number");}
else if(number == 0){System.out.println(number + " is a zero");}




}   
}
