public class OOPS_interfaces {
    public static void main(String args[]){
        Quenn q = new Quenn();
        q.moves();
       
    }

    
}
interface ChessPlayer  {
    void moves();  //abstract

    
}
class Quenn implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal(in all 4 dirns) ");

    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right");
    }

    
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal (by 1 step)");
    }
}
