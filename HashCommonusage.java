import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class HashCommonusage {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Hashtable<Character,Integer> table = new Hashtable<>();
        

        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.add(4)); //add and check in the same time, helpful usage
        System.out.println(set);

    }
}
