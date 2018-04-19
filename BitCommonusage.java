import java.util.BitSet;
import java.util.Arrays;

public class BitCommonusage {
    public static void main(String[] args) {
        BitSet bs = new BitSet(128);
        bs.set(0);
        bs.set(64);
        bs.set(65);
        long[] bsarr = bs.toLongArray();
        System.out.println(Arrays.toString(bsarr));
    }
}
