import java.util.Scanner;

class Program6 {
    
    public static int[] Sum(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int[] result = new int[n * m];
        int ind = 0;
        for (int i = 0; i < n + m - 1; i++) {
            int sr = Math.min(i, n - 1);
            int sc = Math.max(0, i - n + 1);
            while (sr >= 0 && sc < m) {
                result[ind++] = nums[sr][sc];
                sr--;
                sc++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                a[i][j] = sc.nextInt();
        System.out.print("Output: ");
        for (int i = 0; i < Sum(a).length; i++) {
            System.out.print(Sum(a)[i]);
            if (i != Sum(a).length - 1)
                System.out.print(" ");
        }
        System.out.println();
        sc.close();
    }

    
}
