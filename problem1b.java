import java.util.Scanner;

public class problem1b {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if((a==b) && (b==c)){
            System.out.println("good");

        }else if(a==b || b==c ||c==a){
            System.out.println("better");

        }else
        {
            System.out.println("best");
        }

    }
}
