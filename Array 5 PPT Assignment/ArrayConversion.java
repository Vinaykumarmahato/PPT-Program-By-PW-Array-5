public class ArrayConversion {
    public static int[][] convertTo2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }
        
        int[][] result = new int[m][n];
        
        for (int i = 0; i < original.length; i++) {
            int row = i / n;
            int col = i % n;
            result[row][col] = original[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;

        int[][] result = convertTo2DArray(original, m, n);

        // Print the result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
