public class MinimumInRotatedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return nums[left];
    }
    
    public static void main(String[] args) {
        MinimumInRotatedArray minimumInRotatedArray = new MinimumInRotatedArray();
        
        // Example usage
        int[] nums = {3, 4, 5, 1, 2};
        int min = minimumInRotatedArray.findMin(nums);
        System.out.println("Minimum element: " + min);
    }
}
