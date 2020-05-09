import java.util.Scanner;

public class problem1a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of year: ");
        int year=scan.nextInt();
        if((year%4==0 && year%100 !=0) || (year%400 == 0))
        {
            System.out.println(year+" Year is leap year");
        }
        else{
            System.out.println(year+" Year is not leap year");
        }
    }
}
