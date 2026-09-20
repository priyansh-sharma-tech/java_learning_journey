public class LoopsPracticeQuestions {
    public static void main(String[] args) {
        
        // /*
        // Que-1) Write a Java Program to print the following pattern
        // ****
        // ****
        // ****
        // ****
        // Condition: 
        // 1) Use loops only.
        // 2) Number of rows= 4
        // 3)Number of columns= 4                */
        //     for(int i = 1; i <= 4; i++){
        //         for(int j = 1; j <= 4; j++){
        //             System.out.print("*");
        //         } System.out.println();
        //     }



        // /*
        // Que-2) Write a Java program to print: using Loops
        // * * * * * 
        //     *
        //     * 
        //     * 
        //     *                       */

        //     for(int t = 1; t <= 5; t++){
        //        System.out.print("* ");
        //     }System.out.println();
        //         for(int s = 1; s <= 4; s++){
        //             System.out.println("    *");
        //         }


        // /*
        // Que-3) Write a Java program to print:
        // *
        // **
        // ***
        // ****
        // *****                                 */
        //     for(int a = 1; a <= 5; a++){
        //         for(int b = 1; b <= a; b++){
        //             System.out.print("*");
        //         }System.out.println();
        //     }



        // /*
        // Que-4) Write a java loop program to print:
        // *****
        // ****
        // ***
        // **
        // *                             */
        //     for(int i = 5; i >= 1; i--){
        //         for(int j = 1; j <= i; j++){
        //             System.out.print("* ");
        //         }System.out.println();
        //     }
        // /*
        // Que-5) Write a Java program tp print:
        // 1111
        // 2222
        // 3333
        // 4444         */
        //     for(int i =1; i <=4; i++){
        //         for(int j = 1; j <= 4; j++){
        //             System.out.print(i + " ");
        //         }System.out.println();
        //     }

        // /*
        // Que-6) Write a Java program to print:
        // 1
        // 12
        // 123
        // 1234
        // 12345            */
        //     for(int i = 1; i <= 5; i++){
        //         for(int j = 1; j<=i; j++){
        //             System.out.print(j);
        //         }System.out.println();
        //     }

        
        // /*
        // Que-7) Write a java program to print:
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // */
        //     int number = 1;
        //     for(int i = 1; i<=4; i++){
        //         for(int j = 1; j <= i; j++){
        //             System.out.print(number + " "); number++;
        //         }System.out.println();
        //     }


        // /*
        // Que-8) Write a java program to print:
        //      *
        //     * *
        //    * * *
        //   * * * *
        //  * * * * *        */
        // for (int i = 1; i<=5; i++){
        //     for(int j = 1; j <= 5 - i; j++){
        //         System.out.print(" ");
        //     }   
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //         System.out.println();
        // }


        // /*
        // Que-9) Write a Java program to print:
        // * * * * * 
        //  * * * *
        //   * * * 
        //    * * 
        //     *             */
        //     for(int i = 5; i >=1; i--){
        //         for(int j = 1; j<=5-i; j++){
        //             System.out.print(" ");
        //         }for(int j = 1; j <= i; j++){
        //             System.out.print("* ");
        //         }
        //             System.out.println();
        //     }




        // /*
        // Que-10) Print half Pyramid with same numbers:
        // 1
        // 22
        // 333
        // 4444
        // 55555             */

        //     for(int i = 1; i <= 5; i++){
        //         for(int j = 1; j <= i; j++){
        //             System.out.print(i);
        //         }
        //             System.out.println();
        //     }



        // /*
        // Que-11) Print Binary Pattern:
        // 1
        // 01
        // 101
        // 0101
        // 10101         */
        
        //     for(int i = 1; i <= 5; i++){
        //         for(int j = 1; j <= i; j++){
        //             if((i+j) % 2 == 0){
        //                 System.out.print("1 ");
        //             }
        //             else{
        //                 System.out.print("0 ");
        //             }
        //         }
        //         System.out.println();
                
        //     }




        // /*
        // Que-12) Print diamond pattern:
        //      *
        //     * * 
        //    * * *
        //   * * * *
        //  * * * * *
        //   * * * *
        //    * * *
        //     * *
        //      *              */
           
        //     for(int i = 1; i <= 5; i++){
        //         for(int j = 1; j <= 5-i; j++){
        //             System.out.print(" ");
        //         }
        //         for(int j = 1; j <= i; j++){
        //             System.out.print("* ");
        //         }
        //         System.out.println();
        //     }
          
        //     for(int i = 1; i <= 4; i++){
        //         for(int j = 1; j <= i; j++){
        //             System.out.print(" ");
        //         }      
                 
        //         for(int j = 1; j <= 5-i; j++){
        //             System.out.print("* ");
        //         }     
        //         System.out.println();
        //     }   

        // /*
        // Que-13) Print floyds triangle;
        // 1 
        // 2 3
        // 4 5 6 
        // 7 8 9 10
        // 11 12 13 14 15          */
        //     int n = 5;
        //     int number = 1;
        //     for(int i = 1; i <= n; i++){
        //         for(int j = 1; j<=i; j++){
        //             System.out.print(number + " "); number++;
        //         }System.out.println();
        //     }

        
        /*
        Que-14) Print Pascal's Triangle:
             1
            1 1
           1 2 1
          1 3 3 1
         1 4 6 4 1        */
         int n = 5;
         
            for(int i = 0; i < n; i++){
                int num = 1;
                for(int j = 3; j >= i; j--){
                    System.out.print(" ");
                }
                for(int j= 0; j <= i; j++){
                    System.out.print(num + " "); 
                    num = num* (i-j) / (j+1);                       
                }System.out.println();
            }



    }
 }
