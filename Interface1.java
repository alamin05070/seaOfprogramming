interface Robot{
    void walk();
    void talk(String keyword);

    int arms=2;
    int legs=2;

}
class BuilderRobot implements Robot{
    @Override
    public void walk() {
        System.out.println("Builder Robot is walking");
    }

    @Override
    public void talk(String keyword) {
        System.out.println("I am saying"+keyword);
    }

    public void showAll(){
        System.out.println("Arms "+arms+"  legs==  "+legs);
    }
}
class FightingRobot implements Robot{
    @Override
    public void walk() {
        System.out.println("Fighting Robot is walking");
    }

    @Override
    public void talk(String keyword) {
        System.out.println("I am saying"+keyword);
    }

}

public class Interface1 {
    public static void main(String[] args) {
        Robot r= new BuilderRobot();
        r.talk("hello");
        r.walk();
        BuilderRobot BB=new BuilderRobot();
        BB.showAll();
    }
}
