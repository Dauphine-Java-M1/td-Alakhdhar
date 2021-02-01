import java.util.Iterator;
import java.util.*;
public class Panel{
    static Iterator<Integer> panel1(int i, int e){
        ArrayList<Integer> v = new ArrayList<Integer>();
        for(int r=i;r<e+1;r++){
            v.add(r);
        }
        Iterator<Integer> it=v.iterator();
        return it;
    }
    public static void main(String args []){
        Iterator<Integer> it=panel1(1,5);
        for(;it.hasNext();)
            System.out.println(it.next()); // affiche 1 2 3 4 5
    }
}