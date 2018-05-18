import java.util.Arrays;

public class KNearestNeighbors {
    public int[][] getKNeighbors(int[][] points, int k) {
        int[][] res = new int[k][2];
        


        return res;
    }
    
    public static void main(String[] args) {
        int points[][] = {{1,3}, {2,5}, {3,3}, {1,0}, {1,1}, {5,5}};
        KNearestNeighbors p = new KNearestNeighbors();
        int k = 3;
        System.out.println(Arrays.toString(p.getKNeighbors(points, k)));
    }
}