public class oops {
    public static void main(String[] args) {
        class Pen p1=new Pen();
        p1.pass=456;
        p1.color="blue";
        p1.tip=2;
        Pen p2=new Pen(p1);
        p2.pass=123;                                    //object created
        // p1.setcolor("blue");
        // p1.settip(5);
        // System.out.println(p1.color);
        // System.out.println(p1.tip);
        Bank mybank=new Bank();
        mybank.acc_no="123";
        mybank.setpass("abcd");
        Student s1=new Student();
        s1.setname("ron");
        System.out.println(s1.getname());
        s1.setroll(1);
        System.out.println(s1.getroll());
}
}
class Pen{            //class
    String color;
    int tip;
    int pass;

    Pen(Pen p1){  //copy/shallow constructor
        this.color=p1.color;
        this.tip=p1.tip;
    }

    // Pen(String color){         //constructor
    //     this.color=color;
    // }

    // void setcolor(String newcolor){
    //     color=newcolor;
    // }
    // void settip(int newtip){
    //     tip=newtip;
    // }
}
class Bank{               //access modifier
    public String acc_no;
    private  String password;
    void setpass(String pwd){
        password=pwd;
    }
    }
    
class Student{         //getters and setters
    String name;
    int roll;

    String getname(){
        return this.name;
    }
    int getroll(){
        return this.roll;
    }
    void setname(String newname){
        this.name=newname;
    }
    void setroll(int newroll){
        this.roll=newroll;
    }
}
