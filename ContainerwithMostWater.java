package DSAPractice;
public class ContainerwithMostWater {
    public static int maxArea(int[] height) {
        int left=0,right = height.length-1;
        int ans = 0;
        while(left<right) {
            int containerLength = right - left;
            int area = containerLength * Math.min(height[left],height[right]);
            ans = Math.max(ans,area);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = new int[] {1, 5, 4, 3 };
        System.out.println(maxArea(height));
    }
}
