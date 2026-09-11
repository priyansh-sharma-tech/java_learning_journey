public class FlowOfControl {public static void main(String[] args) {
                                     
                                         // SELECTION STATEMENT   

// int i = 4;
// if(i > 5 && i < 10) {System.out.println("true");} //it means ki agar i ki value 5 ha tbhi vo statement ruun krna.
// else {System.out.println("false");} // varna ye satatement run krna.

// if (i * 2 >= 50)
//     System.out.println( "true " + " , " + "value of (i * 2) --->" + i*2);
// else
//     System.out.println("false " + " , " +"value of ( i * 2) ---> " + i * 2);




                        // Nested "if" ---> it means hum ik 'if' ke ander jitne chahe utne 'if' lga skte ha.

// int a = 80;
// if(a > 40){
// if( a > 70){if (a > 95) {System.out.println(" (>95) true  " );}
// else{System.out.println(" (>95) false");}
// }
//     else{System.out.println("(>70) false");}
// }
// else {System.out.println("(>40)  false");}


                                                 // if-else-if ladder

// int i = 7;

//      if (i==5){System.out.println("i is 5");}
// else if (i==6){System.out.println("i is 6");}
// else if (i==7){System.out.println("i is 7");}
// else if (i==8){System.out.println("i is 8");}
// else if (i>=9){System.out.println("i is 9");}




                           // switch statements---> isme hume organized result milta ha jo if-else-if se fast hota ha.

int i = 2;
switch(i){
    case 1:
        System.out.println("i is 1");
        break;
    case 2:
        System.out.println("i is 2");
        break;
    case 3:
        System.out.println("i is 3");
        break;
    case 4:
        System.out.println("i is 4");
        break;
    default:
        System.out.println("i is greater then 4");
        break;     

}
 // Nested Switch
 int j = 5;
 int k = 1;
switch(j){
    case 4:
        System.out.println("j is 4");
        break;
    case 5:
        switch (k){
            case 1:
                System.out.println("k is 1");
                break;
            case 2:
                break;
        }
        break;
    default:
        System.out.println("a is 6");
    
 }


}
}
