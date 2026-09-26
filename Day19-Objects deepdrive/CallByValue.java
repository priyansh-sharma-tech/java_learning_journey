public class CallByValue {
    public static void main(String[] args) {
        // call by value:
        int x = 4;
        int y = 5;
            System.out.println(x + ", " + y);
        addTen(x, y);
            System.out.println(x + ", " + y);
    }   
    static void addTen(int x, int y){
        x = x + 10;
        y = y + 10;

    } 
}
