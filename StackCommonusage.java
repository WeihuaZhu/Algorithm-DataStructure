import java.util.Stack;

public class StackCommonusage {

    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        System.out.println(a.peek());
        while (!a.isEmpty()) {
            System.out.println(a.pop());
        }
        a.pop();
        

    }
}
