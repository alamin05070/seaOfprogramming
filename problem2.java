import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
       /* prime series

       int start = scan.nextInt();
        int end = scan.nextInt();
        boolean flag = false;
        while (start < end){
            for(int i=2; i<start;i++) {
                if (start % i == 0) {
                    flag = true;
                    break;
                }
            }
                if(flag==false){
                    if(start!=1)
                    System.out.print(start+" ");
                }
                flag = false;

            start++;
        }*/

       /* pallindrome checking

       System.out.println("Enter the number: ");
        int n=scan.nextInt();
        int temp,s=0,rem;
        temp=n;
        while (temp!=0){
            rem=temp%10;
            temp=temp/10;
            s=s*10+rem;

        }

        if(n==s) System.out.println("number is "+n+"  palindrome");
        else System.out.println("number is "+n+" not palindrome");
*/
 /*  cipher checking

 System.out.println("Enter the Message: ");
        String message=scan.next();
        String hiddenMsg="";
        char temp;
        for(int i=0;i<message.length();i++)
        {
            if(i%2!=0)
            {
                int t = (int)message.charAt(i)+('a'-'A');
                temp = (char)t;
            }
            else temp=message.charAt(i);

            if(temp=='Y') hiddenMsg+=Character.toString('A');
            else if(temp=='y') hiddenMsg+=Character.toString('a');
            else if(temp=='Z') hiddenMsg+=Character.toString('B');
            else if(temp=='z') hiddenMsg+=Character.toString('b');
            else hiddenMsg+=Character.toString(temp+(char)2);
        }

        System.out.println(hiddenMsg);

*/
    }

}
