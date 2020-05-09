import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
       /* Scanner scan= new Scanner(System.in);
        int[] a= new int[scan.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        int fMin,sMin,fMax,sMax =-1;
        fMax=a[0];
        sMax=a[1];

        for (int i = 2; i < a.length; i++) {

            if(a[i] > fMax)
            {
                sMax=fMax;
                fMax=a[i];
            }
            else if(a[i] > sMax)
            {
                sMax=a[i];
            }

        }
        fMin=a[0];
        sMin = a[1];
        for (int i = 2; i < a.length; i++) {

            if(a[i] < fMin)
            {
                sMin=fMin;
                fMin=a[i];
            }
            else if(a[i] < sMin)
            {
                sMin=a[i];
            }

        }
        System.out.println("sMax: "+sMax+" sMin:"+ sMin);
        */
      /*  Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] a = new int[size][size];
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=scan.nextInt();

            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();*/
       /* int[][] result =new int[size][size];
        //tranposing:
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                result[j][i] = a[i][j];

            }

        }*/
        /*int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] =temp;
            }

        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }*/
        Scanner scan = new Scanner(System.in);
        int r1=scan.nextInt();
        int c1=scan.nextInt();
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        //aaaaaaaaaaaaaaaaaaaaaaaaaa
        int[][] a= new int[r1][c1];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();
        //bbbbbbbbbbbbbbbbbbbbbbbb
        int[][] b= new int[r2][c2];
        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                b[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < b.length ; i++) {
            for (int j = 0; j < b[i].length ; j++) {
                System.out.print(b[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();
        //result......

        if(c1!=r2) {
            System.out.println("error !");
        }
        else{
            int[][] result=new int[r1][c2];
            int sum=0;
            for (int i = 0; i <r1 ; i++) {
                for (int j = 0; j <c2 ; j++) {
                    for (int k = 0; k <r2 ; k++) {
                        sum+=a[i][k]*b[k][j];
                    }
                    result[i][j]=sum;
                    sum=0;

                }
            }
            for (int i = 0; i <result.length ; i++) {
                for (int j = 0; j <result[i].length ; j++) {
                    System.out.print(result[i][j]+" ");

                }
                System.out.println();

            }

        }


    }
}
