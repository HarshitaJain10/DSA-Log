public class abstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        // Chicken c=new Chicken();
        // c.eat();
        // c.walk();
    }

}
abstract class Animal{
    String color;
    Animal(){                            //const=initialises var for child cklass
        color="red";
    }
    void eat(){                       //abstract function
        System.out.println("eats");
    }

    abstract void walk();    //abst method

}
class Horse extends Animal{
    void changecolor(){
        color="brown"; 
    }
    void walk(){
        System.out.println("4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("2legs");
    }
}
