import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


public class Commonusage {
    public static void main(String[] args) {
        int n = 24;
        System.out.println(Math.sqrt(n));
        int m = (int)(Math.sqrt(n));
        System.out.println(m);
        Integer[] arr = {2,3,4,5,1,3,8,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        List<Integer> res = new ArrayList<>();
        res.add(1);
        res.add(2);
        res.add(3);
        System.out.println(res);
        int[][] t = new int[2][3];
        for (int[] temp:t)
            System.out.println(Arrays.toString(temp));
        String s;
        int a = 4;
        s = String.valueOf(a);
        System.out.println(s);
        StringBuilder y = new StringBuilder();
        y.append("sdfads");
        y.append("121323");
        System.out.println(y);
        int x = -123;
        String z = String.valueOf(x);
        System.out.println(z);
        int[] zz = {1,2,7,-3,4,8,0,3};
        int answer = Arrays.binarySearch(zz,3); //must be sorted
        System.out.println("answer is "+answer);
    }
}
