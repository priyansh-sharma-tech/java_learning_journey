public class EnumDirectionDegree {
    public static void main(String[] args) {
        Direction d1 = Direction.NORTH;
            System.out.println(d1.getDegree());
        Direction d2 = Direction.SOUTH;
            System.out.println(d2.getDegree());
    }
}
enum Direction{ // this "Direction" is also a class.
    NORTH(0),   // these all constants are the objects of the "Direction Class".
    SOUTH(180),
    EAST(90),
    WEST(270);

    private int degree; // this should be 'private' and call through getters.

    Direction(int degree){ // constructor of enum is always private, to hum sirf isko enum ke ander hi edit kr skte ha.
        this.degree = degree;
    }
    public int getDegree(){ // getter to call the 'int degree'.
        return this.degree;
    }
}