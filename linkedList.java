import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list);


        // Adding element at a particular index
        // by passing as an argument
        list.add(2, "Java");
        System.out.println(list);

        // Adding new elements at the beginning
        list.addFirst("First");
        System.out.println(list);

        // Adding new elements at the end
        list.addLast("Last");
        System.out.println(list);

        LinkedList list2 = (LinkedList) list.clone();
        System.out.println(list2);

        list2.clear();
        System.out.println(list2);

        // Check if the list contains "Java"
        System.out.println(list.contains("Java"));

        
    }
}
