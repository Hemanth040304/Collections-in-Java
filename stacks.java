import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);

        while(!st.isEmpty()) {
            System.out.println(st.pop());
        }

        // Default initialization of Stack
        Stack stack1 = new Stack();

        // Initialization of Stack
        // using Generics
        Stack<String> stack2 = new Stack<String>();

        // pushing the elements
        stack1.push("4");
        stack1.push("All");
        stack1.push("Mind");

        stack2.push("Good");
        stack2.push("LOOK");
        stack2.push("Gamer");

        // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"+ " stack is: " + stack1.peek());



    }
}
