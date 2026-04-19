public class interfaces {
    public static void main(String[] args) {
        // Queen q=new Queen();
        // q.moves();
        Student s1=new Student();
        s1.school="lcs";
        Student s2=new Student();
        System.out.println(s2.school);
        
        
    }

}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,right,left(4dir)");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }

}
class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal");
    }
}
//static keyword

class Student{
    String name;
    int rollno;
    static String school;
    void setName(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}

