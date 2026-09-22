public class Arrays01 {
    public static void main(String[] args) {





        // 1Dimensions Arrays:
            // int[] rollnumbers = new int [50]; //to determine new array "[]"
            // int rollnumbers[] = new int [50];// isko hum ase bhi likh skte ha.
            
            // System.out.println(rollnumbers.length); //ye arrays ka size batata ha, ek continus memory me.
            // int x = 101;
            // for(int i = 1; i <= rollnumbers.length; i++){
            //     System.out.println(x);
            //     x++;
            // }



        // 2 Dimensions Arrays:
            // int [][] marks = new int [3][3];
            // marks[0][0] = 23;
            // marks[0][1] = 25;
            // marks[0][2] = 45;

            // marks[1][0] = 34;
            // marks[1][1] = 11;
            // marks[1][2] = 90;

            // marks[2][0] = 56;
            // marks[2][1] = 23;
            // marks[2][2] = 78;

            // for (int row = 0; row < marks.length; row++){
            //     for (int col = 0; col < marks[row].length; col++){
            //         System.out.print(marks [row][col] + " ");
            //     }System.out.println();
            // }

        // 2 dimension Array ---> each column with different length:
            int marks[][] = new int[3][]; // iska matlab ha ki har 'row' ke columns manualy daluga.
            marks[0] = new int [1]; // yaha pr '0th' row ha usme '1-column' ha.
            marks[1] = new int [2];// yaha pr '1st' row ha usme '2-columns' ha.
            marks[2] = new int [3];// yaha  pr '2nd' row ha usme '3-columns' ha.
       
            marks [0][0] = 23;
        
            marks [1][0] = 24;
            marks [1][1] = 90;
        
            marks [2][0] = 35;
            marks [2][1] = 53;
            marks [2][2] = 89;
            for (int row = 0; row < marks.length; row++){
                for (int column = 0; column < marks[row].length; column++){
                    System.out.print(marks[row][column] + " ");
                }System.out.println();
            }
        // uper wale array ko me aasse bhi represent kr sakta hu.

            // int marks[][] = {
            //     {23},
            //     {24, 90},
            //     {35, 53},                                      
            // };
            //             for (int row = 0; row < marks.length; row++){
            //                 for (int column = 0; column < marks[row].length; column++){
            //                     System.out.print(marks[row][column] + " ");
            //                 }System.out.println();
            //             }















    }
    

}
