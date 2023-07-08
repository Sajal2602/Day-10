import java.util.*;
public class Program1 {
    static int sum(int[][] a){
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i][i];
            s+=a[i][a.length-1-i];
        }
        return a.length%2==0?s:s-a[a.length/2][a.length/2];
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
        System.out.println("Sum : "+sum(a));
        sc.close();
    }
}
