public class ImmutablilityProblem {
    public static void main(String[] args) {
        // Problem of immutability. 
        String s = ""; // /only this will store in string pool.
        for (int i=0; i<5; i++)  {
            s+=i;
            System.out.println(s);// "0"->"01"->"012"->"0123"->"01234", these all will store inheap memory seperatly.
        }
    }
}
