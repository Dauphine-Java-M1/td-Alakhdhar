public class MyListGen{
    CellGen racine;

    MyListGen(CellGen n){
        racine = n;
    }
    MyListGen(){
        racine = null;
    }
    void add(Object s){
        racine = new CellGen(s,racine);
//        System.out.println(racine);
    }
    int size(){
        CellGen it= racine;
        int cpt=0;
        while(it.getNext()!=null){
            cpt++;
            it= it.getNext();
        }
        return cpt;
    }
    void  addLast(Object s){
        if(racine ==null){
            racine=new CellGen(s,null);
//            System.out.println(racine);
        }else {
            CellGen it= racine;
            while (it.getNext() != null) {
                it = it.getNext();
            }
            CellGen last = new CellGen(s, null);
            it.setNext(last);
        }

    }
    void add(Object s, int i){
        CellGen it= racine;
        int cpt=0;
        while(it.getNext()!=null && cpt!=i){
            System.out.println(i);
            it= it.getNext();
            cpt++;
        }
        CellGen nouv = new CellGen(s,it.getNext());
        it.setNext(nouv);
    }
    public String toString(){
        CellGen it= racine;
        String res=racine.toString()+ " \n";
        while(it.getNext()!=null){
            it=it.getNext();
            res+=it.toString()+" \n";
        }
        return res;
    }

    Object get(int index){
        if(index>size())
            return "Invalid";
        CellGen it= racine;
        int cpt=0;
        while(it.getNext()!=null && cpt!=index){
            it= it.getNext();
            cpt++;
        }
        return it.getObject();
    }
    boolean contains(Object o){
        CellGen it= racine;
        while(it.getNext()!=null && it.getObject()!=o){
            it= it.getNext();
        }
        if(it.getObject()==o)
            return true;
        return false;
    }
    public static void main(String [] args){
        MyListGen ml = new MyListGen();
        ml.addLast("tatu");
        ml.add("toto");
        ml.add("titi");
        ml.addLast("tutu");
        System.out.println(ml);
        ml.add(15);
        System.out.println(ml);

    }
}