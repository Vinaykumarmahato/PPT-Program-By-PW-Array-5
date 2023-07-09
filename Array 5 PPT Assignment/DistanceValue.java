public class DistanceValue {
    public int distanceValue(int[] arr1, int[] arr2, int d) {
        int distance = 0;
        
        for (int num1 : arr1) {
            boolean valid = true;
            
            for (int num2 : arr2) {
                if (Math.abs(num1 - num2) <= d) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                distance++;
            }
        }
        
        return distance;
    }
    
    public static void main(String[] args) {
        DistanceValue distanceValue = new DistanceValue();
        
        // Example usage
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
        int distance = distanceValue.distanceValue(arr1, arr2, d);
        System.out.println("Distance value: " + distance);
    }
}
