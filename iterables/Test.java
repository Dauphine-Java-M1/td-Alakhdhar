import java.util.*;
class Mult{
    static AbstractList<Integer> mult( Integer c, AbstractList<Integer> list){
        for(int i=0;i<list.size();i++)
            list.set(i,c*list.get(i));
        return list;
    }
}
public class Test{
    public static void main (String [] args){
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            al.add(i);
        }
        long t0 = System.nanoTime();
        List<Integer> ret = Mult.mult(2, al);
        long sum=0;
        for(int val : ret) {
            sum+=val/2;
        }
        System.out.println((System.nanoTime() - t0));
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            ll.add(i);
        }
        t0 = System.nanoTime();
        sum=0;
        ret = Mult.mult(2, ll);
        for(int val : ret) {
            sum+=val/2;
        }
        System.out.println((System.nanoTime() - t0));
    }

}