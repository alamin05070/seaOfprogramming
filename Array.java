import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Enter 38 size: ");
        int size = scan.nextInt();
        int[] a= new int[size];*/
        /*int sum=0;

        for (int i = 0; i < a.length ; i++) {
            a[i]=i+1;
        }
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        System.out.println("sum= "+sum);
        */
        /*int valueToBechecked = scan.nextInt();
        for (int i = 0; i < a.length ; i++) {
            a[i]=i+1;
        }
        for (int i = 0; i < a.length ; i++) {

            if(a[i]==valueToBechecked)
            {
                System.out.println("Found");
                break;
            }
            else{
                System.out.println("Not Found");
            }
        }*/
       /* for (int i = 0; i <a.length ; i++) {
            a[i]=i+1;
            System.out.print(a[i]+" ");
        }
        System.out.println();*/
        /*for (int i = a.length-1; i >= 0 ; i--) {
            System.out.print(a[i]+" ");

        }*/
        /*int temp;
        for (int i = 0; i < a.length/2; i++) {
            temp=a[i];
            a[i]=a[size-i-1];
            a[size-i-1]=temp;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");

        }*/
        //min
        /*int min,max;
        min=a[0];
        for (int i = 1; i < size ; i++) {
            if(a[i]<min) min=a[i];
        }
        System.out.println("Min "+min);
        System.out.println();
        max=a[0];
        for (int i = 1; i <size ; i++) {
            if(a[i]>max) max=a[i];
        }
        System.out.println("Max "+max);
         */
       /* int[] a={1,2,3};
        int[] b={5,7,9};
        int[] result=new int[a.length];
        int i,j;
        for ( i = 0,j=b.length-1; j >=0; i++,j--) {
            result[j]=a[i]+b[j];
        }
        for (int elem:result) {
            System.out.print(elem+" ");

        }*/

       /*int[] a={2,4,6};
       int[] b={2,6,10,6,12};
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j])
                {
                    System.out.println("Common values: "+b[j]);
                    break;
                }

            }

        }*/

        //merging two sorted array
        int[] a = {1, 2, 4};
        int[] b = {3, 5};
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
                k++;
            } else {
                result[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }
        for (int element : result) {
            System.out.print(element + " ");

        }


    }
}
