class Animal{
    String color;
    String weight;
    String sound;

    public Animal(String color, String weight, String sound) {
        System.out.println("Cons1..............");
        this.color = color;
        this.weight = weight;
        this.sound = sound;
    }

    public Animal(Animal animal) {
        System.out.println("Cons2......................");
        this.color=animal.color;
        this.color=animal.weight;
        this.sound=animal.sound;
    }

    public Animal() {
        System.out.println("Cons3.......................");
        this.color="blue";
        this.weight="150kg";
        this.sound="helo helo";
    }
}
class Horse extends  Animal{

    private String topSpeed;

    public Horse(String color, String weight, String sound, String topSpeed) {
        super(color, weight, sound);
        this.topSpeed = topSpeed;
    }

    public Horse(Horse horsi) {
        super(horsi);
        this.topSpeed=horsi.topSpeed;
    }

    public Horse() {
        super();
    }
}
public class Example {
    public static void main(String[] args) {
    Horse h1=new Horse("yellow","590kg","ku ku","225");
    Horse h2=new Horse();
    Horse h3=new Horse(h1);
    System.out.println(h2.color);



    }
}
