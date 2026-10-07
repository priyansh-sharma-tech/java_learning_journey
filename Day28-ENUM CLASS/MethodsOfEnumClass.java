public class MethodsOfEnumClass {
    public static void main(String[] args) {

        //IF i call values();--> this is out of enum class, it is compiler generated method.
        // this is used taki hum "enum Direction" ki sari values laa sake.
        // Direction[] directions = Direction.values();
        //     for(Direction d : directions){
        //         System.out.println(d.name());  
        //     }
        // //valueof();--> this is also out of enum class, it is also compile generated.
        // //ye sirf string ko constant me convert krta ha, or ye case sensative hota ha.
        Direction d1 = Direction.EAST;
        // Direction d2 = Direction.valueOf("EAST"); // CASE SENSATIVE.
        //     System.out.println(d2.name());
        // // name();--> it is a method from enum class, this is final can't be @override.
        //     System.out.println(d1.name()); 
        //     System.out.println(d2.toString()); // both are same but this can be @override.
        // // ordinal();--> this gives the value of constants.
            System.out.println(d1.ordinal());
    }   
}
enum Direction{
    NORTH,
    SOUTH,
    EAST,
    WEST;

}