import java.util.Scanner;

public class problem1c {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int tea= scan.nextInt();
        int candy=scan.nextInt();
        if(tea < 5 || candy < 5) System.out.println("bad");
        else if (tea/candy>=2 || candy/tea>=2) System.out.println("great");
        else if(tea+candy>=5) System.out.println("good");

    }
}
