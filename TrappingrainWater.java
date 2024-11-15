package DSAPractice;

public class TrappingrainWater {
    public static void main(String[] args) {
        int[] arr1 = {3, 0, 1, 0, 4, 0, 2};
        int[] arr2 = {3, 0, 2, 0, 4};
        System.out.println(trap(arr1));
        System.out.println(trap(arr2));

    }

    public static int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int res = 0;
        int leftMax = 0;
        int rightMax = 0;
        while(left<right){
            if(height[left] <= height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }else{
                    res += leftMax - height[left];
                }
                left++;
            }else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    res += rightMax - height[right];
                }
                right--;
            }
        }
        return res;
    }
}
