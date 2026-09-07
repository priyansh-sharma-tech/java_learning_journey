public class Conversion {public static void main(String[] args) {
    //Implicit conversions
    // (byte-int)
byte b = 24;
int i;
i = b;
System.out.println( "byte to int-->"+ i); //24

// character to int
char c = 'a';
int f;
f = c; 
System.out.println("chr to int-->"+f); //to yaha pr'a' ki numerical value aajaygi, jo ha=97.
// Explicit conversion case 1 jab hamari int ki value byte ke range ki ho.
int q = 26;
byte w;
w = (byte)q; // yha pr me simply w=q; type nahi kr skya kuki yha muj byte casting krni pdegi kuki int ki bits byte se zyada ha.
System.out.println("case 1 of explicit byte to int -->"+w);

//Explicit conversion case 2 jab hamari int ki value byte ki range ke bahar ho. Lets take 300 as in my notes.
int ii = 300;
byte bb;
bb = (byte)ii;
System.out.println("case 2 of explicit [byte to int]-->"+ bb); // result 44 aya or iska reason notes me ha.Proper solve kiya ha.

//Truncating conversion of floating value
float ff = 15.678f;
int iin;
iin = (int)ff;
System.out.println("Truncating float into int-->"+ iin);// yha pr result hmara 15 aayega kuki int me integers values hi store hoti ha.

// NOTE: BOOLEAN Datatype kbhi bhi convert nhi hota kuki isme koi bhi numerical nhi hote, true or false m hote ha.
//therefor boolean casting is not possible.

//Type promotions
// agar ab hm asa kre byte b = 50; --> b = b*2; to kya ye possible ha? 
//or isme type mismatch wala error ku aa ra ha int to byte conversion wala iska solu notes me ha.
//hume yha bhi byte lgana pdega.
byte bpp = 50;
bpp = (byte)(bpp*2); // ab result 100 ana chahiye
System.out.println("Automatic Type promotion-->"+bpp);

// Applying all four rules of Automatic Type Promotions here is code below
byte bbb = 42;
char ccc = 'a';
short sss = 1024;
int iii = 50000;
float fff= 5.67f;
double ddd = .1234;
// yha  pr dekho sabhi datatypes me double datatype sabse bda ha to sara result double me hi calculate hoga.
// isi liya niche jo bhi calculatons ha usme hum double datatype ka use kr rhe ha.
double result = (fff * bbb) + (iii / ccc) - (ddd * sss);
/*ab yha pr bhi  har category me result bde datatype me hi niklega.
1) fff * bbb = float
2) iii / ccc = int
3) ddd * sss = double
therefore, float + int = float - double =  double        */
System.out.println((fff*bbb) + " + " + (iii / ccc) + " - " + (ddd * sss));
System.out.println("result="+ result);





}
    
}
