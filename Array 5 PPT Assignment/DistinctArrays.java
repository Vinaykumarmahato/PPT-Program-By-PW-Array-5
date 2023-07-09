import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctArrays {
    public List<List<Integer>> findDisappearedNumbers(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        List<Integer> missingInNums2 = new ArrayList<>();
        List<Integer> missingInNums1 = new ArrayList<>();
        
        for (int num : nums1) {
            if (!set2.contains(num)) {
                missingInNums2.add(num);
            }
        }
        
        for (int num : nums2) {
            if (!set1.contains(num)) {
                missingInNums1.add(num);
            }
        }
        
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(missingInNums2);
        answer.add(missingInNums1);
        
        return answer;
    }
    
    public static void main(String[] args) {
        DistinctArrays distinctArrays = new DistinctArrays();
        
        // Example usage
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> answer = distinctArrays.findDisappearedNumbers(nums1, nums2);
        System.out.println("Answer: " + answer);
    }
}
