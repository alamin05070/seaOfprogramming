import java.util.Scanner;

public class moreCondition {
    public static void main(String[] args) {

        //largest number

       /* Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println(a+ "a is the largest");
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b+ "b is the largest");
        }
        else{
            System.out.println(c+ "c is the largest");
        }*/
        // positive or negative or zero & even or odd
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        if(number>0){
            if(number%2==0){
                System.out.println(number+"The number is both positive & even");
            }
            else
            {
                System.out.println(number+"The number is both positive & odd");
            }

        }
        else if (number<0){
            System.out.println(number+"The number is negative");

        }
        else{
            System.out.println(number+"The number is zero");
        }

    }
}
