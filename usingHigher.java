import java.util.Scanner;

public class usingHigher {
    public static void main(String[] args) {
       /*multiplication Table:
       Scanner scan= new Scanner(System.in);
        int[][] multTable = new int[scan.nextInt()][scan.nextInt()];
        for (int i = 0; i < multTable.length ; i++) {
            for (int j = 0; j <multTable[i].length ; j++) {
                multTable[i][j] = (i+1)*(j+1);

            }

        }
        for (int i = 0; i < multTable.length ; i++) {
            for (int j = 0; j < multTable[i].length; j++) {
                System.out.print(multTable[i][j]+" ");
            }
            System.out.println();

        }*/
        //Student avg & GPA:
        Scanner scan = new Scanner(System.in);
        double[][] studentTable = new double[5][3];
        for (int i = 0; i < studentTable.length; i++) {
            for (int j = 0; j < studentTable[i].length; j++) {
                studentTable[i][j] = scan.nextDouble();
            }


        }
        double avg=0,sum,gpa=0;
        int rollNo;

        for (int i = 0; i < studentTable.length; i++) {
            sum=0;
            for (int j = 0; j < studentTable[i].length; j++) {
                sum=sum+studentTable[i][j];
            }
            avg = sum/3;
            gpa = (avg * 5)/100;
            rollNo = i+1;
            System.out.println("rollNo is :"+rollNo+" GPA is :"+gpa);

        }
        }

    }

