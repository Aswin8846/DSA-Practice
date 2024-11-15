package DSAPractice;
import java.util.*;
public class chocolateDistributionProblem {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 2, 4, 9, 12, 56};
        int m1 = 3;
        System.out.println(findMin(arr1, m1));
        int[] arr2 = {7, 3, 2, 4, 9, 12, 56};
        int m2 = 5;
        System.out.println(findMin(arr2, m2));

    }

    public static int findMin(int[] arr, int m) {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        int n = arr.length;
        int ans = 0;
        if(n<m) return -1;
        for(int i=0;i<n-m;i++){
            int min = arr[i];
            int max = arr[i+m-1];
            ans += max-min;
            res = Math.min(res,ans);

        }
        return res;
    }

}
