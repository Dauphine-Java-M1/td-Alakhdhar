public class Cell{
    String str;
    Cell next;
    Cell(String s,Cell n){
        str =s;
        next= n;
    }
    Cell getNext(){
        return next;
    }
    void setNext(Cell c){
        this.next=c;
    }
    public String toString(){
        return ""+this.str;
    }
}