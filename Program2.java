import java.util.*;
public class Program2 {
    static void rotate(int [][] a){
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a[0].length;j++){
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length/2;j++){
                int t=a[i][j];
                a[i][j]=a[i][a[0].length-1-j];
                a[i][a[0].length-1-j]=t;
            }
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
        rotate(a);
        for(int i[] : a){
            for(int j : i)
                System.out.print(j+" ");
            System.out.println();        
        }
        sc.close();
    }
}
