abstract class cake{
    String cakeFlavour;
    abstract void makeCake(String cakeFlavour);
    public  void bakeCake(){
        System.out.println("Cake is being  "+cakeFlavour+"  Flavoured");
    }

}

class chokolate extends cake{
    @Override
    void makeCake(String cakeFlavour) {
        System.out.println("Con1111111111");
        this.cakeFlavour=cakeFlavour;
    }

    }


class vanilla extends cake{
    @Override
    void makeCake(String cakeFlavour) {
        System.out.println("Con2222222222222222");
        this.cakeFlavour=cakeFlavour;
    }


}


public class Abstract {
    public static void main(String[] args) {
        chokolate C=new chokolate();

        C.makeCake("Hagu");
        C.bakeCake();

    }
}
