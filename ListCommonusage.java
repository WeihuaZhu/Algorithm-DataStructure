import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListCommonusage {
    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        ArrayList<Integer> temp =(ArrayList<Integer>) b.clone();
        a.add(temp);
        b.add(4);
        b.add(5);
        b.add(6);
        temp =(ArrayList<Integer>) b.clone();
        a.add(temp);
        System.out.println(a);
        System.out.println(a.get(1));

        int N = a.size();
        System.out.println(N);



    }
}
