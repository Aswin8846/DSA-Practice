package DSAPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,4},{6,8},{9,10}};
        int[][] res = Merge(arr);
        print(res);
    }

    public static int[][] Merge(int[][] arr) {
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]) );
        List<int[]> list = new ArrayList<>();
        for(int[] interval : arr) {
            if(list.isEmpty() || list.get(list.size()-1)[1] < interval[0]){
                list.add(interval);
            }else{
                int[] lastInterval = list.get(list.size()-1);
                lastInterval[1] = Math.max(lastInterval[1],interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void print(int[][] arr) {
        for(int[] interval : arr) {
            System.out.println("[" + interval[0] + "," + interval[1] + "]");
        }
        System.out.println();
    }
}
