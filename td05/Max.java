import java.util.*;
public class Max {
    //Ex1
    @SafeVarargs
    static  <T extends Comparable<T>> T myMax( T...nbs) throws Exception{
        if(nbs.length==0)
            throw new Exception("No args");
        T max=nbs[0];
        for(T e: nbs){
            if(e.compareTo(max)>0)
                max=e;
        }
        return max;
    }
    //Ex 2
    private static <T extends Object> void print(List<T> list) {
        for(T o:list)
            System.out.println(o);
    }
    private static <T extends CharSequence> void printLength(List<T> list){
        for(T o:list)
            System.out.println(o.length());
    }
    //Ex3
    public static <T extends  CharSequence> List<? super Object>  listLength(List<T> list) {
        ArrayList<? super Object> length=new ArrayList<Object>();
        for(int i=0;i<list.size();i++) {
            CharSequence seq=(CharSequence)list.get(i);
            length.add(seq.length());
        }
        return length;
    }
    //Ex4
//    private static List<? extends T1,T2> fusion(List<T1 extends Object> l1,List<T2 extends Object> l2){
//        if(l1.size()==0)
//            return l2;
//        if(l2.size()==0)
//            return l1;
//        if(l1.size()==l2.size()){
//            List<? extends CharSequence> list = new List(l1.size()*2);
//            for(int i=0;i<l1.size();i++){
//                list.add((CharSequence)l1.get(i));
//                list.add((CharSequence)l2.get(i));
//            }
//            return list;
//        }
//        return null;
//    }
    public static void main(String[] args) {
        //Ex1
        try {
            System.out.println(myMax("AMira", "Koko")); //1664
            System.out.println(myMax(15,18, 13)); //2018
            //System.out.println(myMax(15,"koko")); //Error
        } catch (Exception e){
            System.out.println("Error");
        }
        //Ex2
        List<String> list=Arrays.asList("foo", "toto");
        print(list);
        printLength(list);
        //Ex3
        List<String> l=Arrays.asList("colonel", "reyel");
        System.out.println(listLength(l)); //affiche [7, 5]
        //Ex4
//        List<String> l1= Arrays.asList("C", "rc");
//        List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
//        List<? extends CharSequence> r1=fusion(l1,l2);
////        List<?> r2=fusion(l1,l2);
////        List<Integer> l3 = Arrays.asList(1,2);
////        List<Integer> l4 = Arrays.asList(10,20);
////        List<Integer> r3 = fusion(l3,l4);
////        List<?> r4 = fusion(l1,l3);
    }
}