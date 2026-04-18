public class inheritance {
    public static void main(String[] args) {
        // Fish shark=new Fish();
        // shark.eat();
        Maths calc=new Maths();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,2,3));

        
    }

}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
//derieved class
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swim");

    }
}
//polymolrphism(method overloading)
class Maths{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
