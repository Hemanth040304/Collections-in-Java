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

        // returns the element at the specified position in this list
        System.out.println(list.get(2));

        // returns the first element in this list.
        System.out.println(list.getFirst());

        // returns the last element in this list
        System.out.println(list.getLast());

        // returns the index of the first occurrence of the specified element in this list, or -1 if not contains
        System.out.println(list.indexOf("Java"));

        // returns the index of the last occurrence of the specified element in this list, or -1 if not contains
        System.out.println(list.lastIndexOf("Hemanth"));

        System.out.println(list);
        list.pop(); // pops first element in the list
        list.removeLast(); // removes element at last
        list.remove(); // same as pop
        System.out.println(list);

        list.push("one");
        System.out.println(list); // same as add but it will add from front


    }
}
