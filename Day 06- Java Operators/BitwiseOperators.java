public class BitwiseOperators { public static void main(String[] args) {
   // bitwise Operator
    //Example values
    int a = 2; //binary value of     2 = 10---> 00000000 00000000 00000000 00000010
    int b = 3; // binary value of    3 = 11---> 00000000 00000000 00000000 00000011

    int c = a & b; //Bitwise and Operator, ans = 2 ---> it says agar dono 1 hoge tabhi value 1 hogi.
    int d = a | b; // Bitwise or Operator, ans = 3 ---> it says agar dono me se ek bhi 1 hoga to value 1 ho jaygi.
    int e = a ^ b; //Bitwise exclusive or Operator, ans = 1 ---> it says agar odd no of one's ha to hi value 1 hogi.
    int f = ~a;    //Bitwise not 'a' Operator, ans = -3 ---> 11111111 11111111 11111111 11111101 [it says ki jo 'a' ki value ha uski opposite value aaygi.]
    System.out.println(" (a & b)= " + c + " , " + " (a | b)= " + d + " , " + " (a ^ b)= " + e + " , " + " (~a)= " + f);


// left shift Operator (<<) just shift the value left side.
int g = 1;                                                     // 00000000 00000000 00000000 00000001
//g = g << 1;                                                    // 00000000 00000000 00000000 00000010
//System.out.println("{g<<1} ---> " + g); 

//g = g<<30;                                                    // 01000000 00000000 00000000 00000000
//System.out.println("{g<<30} ---> " + g);

//g = g<<31;                                                     //10000000 00000000 00000000 00000000
//System.out.println("{g<<31} --->" + g);

g = g << 32; 
System.out.println("{g<<32} --->" + g);  //result--> 1 because 32 %(mode) 32 = 0 humne shift kiya hi ni.
 
//same hi right shift hoga (>>) or (>>>) right shift with 0's
byte h = 1;
h = (byte)(h >> 1);
System.out.println("byte h --->" + h);















    
}
    
}
