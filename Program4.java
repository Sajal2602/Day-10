import java.util.Scanner;

public class Program4 {
    static int[][] transpose(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) 
            for (int j = 0; j < a[0].length; j++) 
                t[j][i] = a[i][j];
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Matrix : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=sc.nextInt();
        System.out.println("Matrix :");
        for(int i[] : transpose(a)){
            for(int j : i)
                System.out.print(j+" ");
            System.out.println();
        }
        sc.close();
    }
}
