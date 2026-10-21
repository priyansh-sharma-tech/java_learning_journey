import java.util.Iterator;

public class OwnIterator {
    public static void main(String[] args) {
        String[] names = {"Aditya, Rahul, Rohit, Saurav, Priyansh"};
        NameContainer container = new NameContainer (names);
            Iterator<String> it = container.iterator();
                while(it.hasNext()){
                    System.out.println(it.next());
                }
    }
}
class NameContainer implements Iterable<String>{
    private String[] names;
    private int size;
        NameContainer(String[] names){
            this.names = names;
            this.size = this.names.length;
        }
    @Override 
    public Iterator<String> iterator(){
        return new NameContainerIterator();
    }
        private class NameContainerIterator implements Iterator<String>{
            private int position = 0;
                @Override 
                public boolean hasNext(){
                    return position < size;
                }
                @Override
                public String next(){
                    return names[position++];
                }
        }
}