public class ArithmaticOperators { public static void main(String[] args) {
 
    /* Operators in JAVA
 Arithmatic operators--> +, -, *, /,  %,  */  
 
 int a = 5;
 int b = 10;
// Now, performing Basic Arithmatic expressions.
 int c = a + b;  //15
 int d = a - b;  //-5
 int e = a * b;  //50
 int f = b / a;  //2
 int g = b % a;  //0
System.out.println( "sol of c, d, e, f, g, --> " + c + " , " + d + " , " + e + " , " + f + " , " + g);
 int h = a + 2; // a = 5 therefore 5+2=7 ==> h = 7 
 System.out.println(" h = a + 2 --> " + h);
// ab agar muj "h" ki value me "+2" krna ha to me direct bina kisi datatype ke kr skta hu
h = h + 2; // h = 9
System.out.println("h + 2 --> "+ h);



// Additional assignment operator.
h += 3; // NOTE---->  short trick [h = h + 3]--->[h += 3] dono ka same mtlb ha.
System.out.println("h += 3 --> "+ h);

// subtraction assignment operator.
h -= 1;
System.out.println("h -= 1 --> "+ h);

// multiplication assignment operator.
h *= 2;
System.out.println("h *= 1 --> "+ h);




//Increment operators
int i = 6; // lets take an example of this.
System.out.println("int i = 6 --> " + i);


// post increment operator (j++)
i++; // yha pr bhi iska mtlab ha (i = i + 1) or jo second wala '+' ha uska mtlab ha 'i' ko '1'se badana.
System.out.println("Increment (1++) --> " + i);


// Post decriment operator (j--)
i--; // it means (i = i-1). Jo yha second '-' ha uska mtlab ha value me '1' subtract krna.
System.out.println("Post decriment operator (1--) --> " + i);


// Pre increment operator ( ++j )
int j = 8;
int k = j++; //This is post increment operator, it means 'k' ko 'j' ki value do or 'j' me '1' add kr do.
System.out.println("(k = j++) ---> " + k + " , " + j); // ans--> k = 8, j = 9
k = ++j; // it means phle 'j' me '1' add kro fir jo value aaye wo 'k' ki value hogi.
System.out.println("(k = ++j) ---> " + k + " , " + j); // ans --> k = 10, j = 10


// Pre decriment operator ( --j )
int l = 14;
l = --j; // it means phle 'j' se '-1' kro fir us value ko 'l' me dal do.
System.out.println("(l = --j) ---> " + l + " , " + j); //yha ans,---> l = 9, j = 9

}
    
}
