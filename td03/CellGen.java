public class CellGen{
    Object str;
    CellGen next;
    CellGen(Object s,CellGen n){
        str =s;
        next= n;
    }
    CellGen getNext(){
        return next;
    }
    Object getObject(){
        return str;
    }
    void setNext(CellGen c){
        this.next=c;
    }

}