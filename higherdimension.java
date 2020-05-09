public class higherdimension {
    public static void main(String[] args) {
        String[][][] a=new String[2][2][2];
        a[0][0][0] ="A";
        a[0][0][1] ="B";
        a[0][1][0] ="C";
        a[0][1][1] ="D";
        a[1][0][0] ="E";
        a[1][0][1] ="F";
        a[1][1][0] ="G";
        a[1][1][1] = "H";

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length ; k++) {
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();

            }
            System.out.println();

        }
        System.out.println();


            //System.out.println(a.length);
        //System.out.println(a[0].length);

    }
}
