//java program to find the transpose of a 3x3 matrix
import java.util.Scanner;
class transpose{
    public static void main(String[] args) {
        int a[][]= new int[3][3];
        int i, j;
        System.out.println("Enter matrix data");
        Scanner s= new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                   a[i][j]=s.nextInt(); 
            }
        }
        System.out.println("Your matrix is:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Teanspose of matrix is");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.print("\n");
        }
    }
}
