public class EnumDirectionMove {
    public static void main(String[] args) {
        Direction d = Direction.NORTH;
        d.move();
    }
}
enum Direction { 
    NORTH{ // Anonomyus class--> with no name.
        @Override
        public void move(){
            System.out.println("Move up (Y+1)");
        }
    },
    
    SOUTH{
        @Override
        public void move(){
            System.out.println("Move down (Y-1)");
        }
    },
    EAST{
        @Override
        public void move(){
            System.out.println("Move right (x+1)");
        }
    },
    WEST{
        @Override
        public void move(){
            System.out.println("Move left (x-1)");
        }
    };

    public  abstract void move(); //Abstract Method, or isme hume class ko abstract krne ki zarurat nahi ha.
}