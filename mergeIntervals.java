package DSAPractice;
import java.util.*;
public class mergeIntervals {
    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        int[][] merged1 = mergeintervals(intervals1);
        printIntervals(merged1);
        int[][] intervals2 = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
        int[][] merged2 = mergeintervals(intervals2);
        printIntervals(merged2);

    }

    public static int[][] mergeintervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                int[] lastInterval = merged.get(merged.size() - 1);
                lastInterval[1] = Math.max(lastInterval[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    public static void printIntervals(int[][] intervals) {
        for (int[] interval : intervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] "); }
        System.out.println();
    }

}
