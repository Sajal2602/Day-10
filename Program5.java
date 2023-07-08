import java.util.Scanner;

public class Program5 {

    static void zero(int[][] a) {
        int[] r = new int[a.length];
        int[] c = new int[a[0].length];
    
        for (int i = 0; i < a.length; i++) 
            for (int j = 0; j < a[0].length; j++) 
                if (a[i][j] == 0){ 
                    r[i] = 1;
                    c[j] = 1;
                }

        for (int i = 0; i < a.length; i++)
            if (r[i] == 1) 
                for (int j = 0; j < a[0].length; j++)
                    a[i][j] = 0;
    
        for (int j = 0; j < a[0].length; j++)
            if (c[j] == 1) 
                for (int i = 0; i < a.length; i++) 
                    a[i][j] = 0;
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
        zero(a);
        System.out.println("Matrix :");
        for(int[] i : a){
            for(int j : i)
                System.out.print(j+" ");
            System.out.println();
        }
        sc.close();
    }
}
