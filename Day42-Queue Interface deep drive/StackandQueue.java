import java.util.ArrayDeque;

public class StackandQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        //Single ended queue methods -->
            // Addition methods / enqueue methods.
                queue.add(1);// it throws exception if it fails.
                queue.offer(2);// it will never throw excption when it fails but shows false..
                // therfore offer is more safer then add method.
                queue.offer(3);
            // front access methods.
                System.out.println(queue.peek());// only to se the front/first element in queue.
                System.out.println(queue.element());// same as peek but throw exception if there is no element in queue.
            // remove element methods.
                queue.remove();// unsafe--> throws exception.
                queue.poll(); // safer--> return null.





    }
}
