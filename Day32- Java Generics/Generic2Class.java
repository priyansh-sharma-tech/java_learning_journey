public class Generic2Class {
    public static void main(String[] args) {
        Pair <Integer, String> p1 = new Pair<>(14, "Ram");
            System.out.println(p1.first + ", " + p1.second);
    }
}
class Pair < T, U > {
    T first;
    U second;
        Pair(T first, U second){
            this.first = first;
            this.second = second;
        }
}
