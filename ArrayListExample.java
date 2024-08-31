import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);

        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.add(3,6);
        System.out.println(list);

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(9);
        arr1.add(8);
        arr1.add(7);

        list.addAll(arr1);
        System.out.println(list);

        arr1.clear();
        System.out.println(arr1);

        if (list.contains(9)) System.out.println("true");

        list.forEach((i) -> System.out.print(i));
        System.out.println();
        // or
        list.forEach(System.out::print);
        System.out.println();

        System.out.println(list.get(6)); // return values at that index

        int ind = list.indexOf(6);

        if (list.isEmpty()) System.out.println("true");

        list.add(2);
        System.out.println(list.lastIndexOf(2));

        list.remove(2);
        System.out.println(list);

        System.out.println(list.size());


    }
}
