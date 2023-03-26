import java.util.ArrayList;

public class ListOperations {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        myList.add("apple");
        System.out.println("before removal"+myList);
        
        myList.remove("apple");
        myList.remove("banana");
        System.out.println("After removal: " + myList);

        myList.set(0,"app");
        System.out.println("after updation"+myList);
    }
}