import java.util.Random;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/** LeetCode 381
 * @author Weihua Zhu
 * @version 1.0.0
 */
public class RandomizedCollection {
    private HashMap<Integer, List<Integer>> table;
    private List<Integer> nums;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        table = new HashMap<>();
        nums = new ArrayList<>();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        List<Integer> list = table.getOrDefault(val, new ArrayList<>());
        list.add(nums.size());
        table.put(val, list);
        nums.add(val);
        return list.size()==1;

    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if (table.containsKey(val)) {
            List<Integer> list = table.get(val);
            int pos = list.get(list.size()-1);
            int tail = nums.get(nums.size()-1);
            List<Integer> tlist = table.get(tail);
            tlist.set(tlist.size()-1, pos);
            table.put(tail, tlist);
            list = table.get(val);
            list.remove(list.size()-1);
            if (list.size()==0)
                table.remove(val);
            else
                table.put(val,list);

            nums.set(pos, tail);
            nums.remove(nums.size()-1);
            return true;
        }
        else
            return false;
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        if (nums.size()>0) {
            Random rad = new Random();
            int r = rad.nextInt(nums.size());
            return nums.get(r);
        }
        else
            return 0;
    }

    public String toString() {
        return nums.toString();
    }
    /**
     * Your RandomizedCollection object will be instantiated and called as such:
     * RandomizedCollection obj = new RandomizedCollection();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */
    public static void main(String[] args) {
        RandomizedCollection obj = new RandomizedCollection();
        obj.insert(1);
        obj.insert(1);
        obj.insert(2);
        obj.insert(2);
        obj.insert(2);
        System.out.println(obj);
        obj.remove(1);
        obj.remove(1);
        obj.remove(2);
        System.out.println(obj);
        obj.insert(1);
        System.out.println(obj);
        obj.remove(2);
        System.out.println(obj);








    }
}
