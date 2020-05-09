import java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number of n: ");
        int n =scan.nextInt();
        int sum=0;

        /*for(int i=1;i<row;i++){
            for(int j=1;j<(row-i);j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        for (int i = 2; i <= n; i+=2) {
            for (int j = 2; j<= i; j+=2) {
                sum+=j;

            }

        }
        System.out.println("Sum is: "+sum);

    }
}
