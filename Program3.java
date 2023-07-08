import java.util.*;
class Program3{
    static int[][] spiral(int A) {
        int[][] ans=new int[A][A];
        int left=0;
        int right=A-1;
        int top=0;
        int down=A-1;
        int num=1;
        while(left<=right){
            for(int i=left;i<=right;i++){
                ans[top][i]=num++;
            }
            top++;

            for(int i=top;i<=down;i++){
                 ans[i][right]=num++;
            }
            right--;

            for(int i=right;i>=left;i--){
                ans[down][i]=num++;
            }
            down--;

            for(int i=down;i>=top;i--){
                ans[i][left]=num++;
            }
            left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Matrix : ");
        int n = sc.nextInt();
        System.out.println("Matrix :");
        for(int i[] : spiral(n)){
            for(int j : i)
                System.out.print(j+" ");
            System.out.println();
        }
        sc.close();
    }
}