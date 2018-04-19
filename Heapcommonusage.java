import java.util.PriorityQueue;

public class Heapcommonusage {


    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(); // default is min-heap
        for (int num: nums) {
            if (heap.size() < k) {
                heap.offer(num);
            } else {
                int smallest = heap.peek();
                if (num > smallest) {
                    heap.poll();
                    heap.offer(num);
                }
            }

        }
        return heap.peek();

    }
    public static void main(String[] args){
        int[] nums = {2,1,4,6,-5,6,8,3,0};
        System.out.println(findKthLargest(nums, 3));



    }
}
