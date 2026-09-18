public class jumps {public static void main(String[] args) {
    




// // There are two types of jump statements in java.
// // (break;), (continue;)



// //                                        break;
// for (int i = 1; i <= 10; i++) {
//     System.out.println(i);// ye simple for loop ha.
//     if(i>5) {
//         break; // yaha pr agar me chahta hu ki me sirf 5 tak print kru to me break use kruga.
//     }

// }


// //lets take an example: whether a number is prime or not.
// int p = 7; int i;
// for( i = 2; i < p; i++) {
//     if (p % i == 0) {
//         System.out.println ("the number is not prime");
//         break;
//     }
// }
// if ( i==p) {
// System.out.println( "the number is prime");
// }


//                           continue;
 // only print odd numbers
 int g = 7;
 for(g = 1; g <=10; g++) {
    if (g%2==0) {
        continue;
    }System.out.println(g); if(g==7){break;}

}

//          lables: yha pr "outer", "inner" lables ha.

// int g = 7;
//  outer: for(g = 1; g <=10; g++) {
//     inner: if (g%2==0) {
//         continue;
//     }System.out.println(g); if(g==7){break;}
    
}







}
