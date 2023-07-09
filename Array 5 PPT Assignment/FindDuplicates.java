import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            
            if (nums[index] < 0) {
                duplicates.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        
        return duplicates;
    }
    
    public static void main(String[] args) {
        FindDuplicates findDuplicates = new FindDuplicates();
        
        // Example usage
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates.findDuplicates(nums);
        System.out.println("Duplicates: " + duplicates);
    }
}
