enum Teams{
    a(22),b(45),c(67),d(87);

    private int getPoint;
    Teams(int gpoint){
        getPoint=gpoint;
    }

    public int getOwner(){
        return getPoint;
    }
}


public class Enumeration {
    public static void main(String[] args) {
        //Teams t=Teams.a;
        //System.out.println(t);
        for (Teams teams:Teams.values()) {
            System.out.println(teams.getOwner());

        }
    }
}
