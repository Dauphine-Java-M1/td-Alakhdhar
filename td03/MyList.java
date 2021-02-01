public class MyList{
    Cell racine;

    MyList(Cell n){
        racine = n;
    }
    MyList(){
        racine = null;
    }
    void add(String s){
        racine = new Cell(s,racine);
//        System.out.println(racine);
    }
    int size(){
        Cell it= racine;
        int cpt=0;
        while(it.getNext()!=null){
            cpt++;
            it= it.getNext();
        }
        return cpt;
    }
    void  addLast(String s){
        if(racine ==null){
            racine=new Cell(s,null);
//            System.out.println(racine);
        }else {
            Cell it= racine;
            while (it.getNext() != null) {
                it = it.getNext();
            }
            Cell last = new Cell(s, null);
            it.setNext(last);
        }

    }
    void add(String s, int i){
        Cell it= racine;
        int cpt=0;
        while(it.getNext()!=null && cpt!=i){
            System.out.println(i);
            it= it.getNext();
            cpt++;
        }
        Cell nouv = new Cell(s,it.getNext());
        it.setNext(nouv);
    }
    public String toString(){
        Cell it= racine;
        String res=racine.toString()+ " \n";
        while(it.getNext()!=null){
            it=it.getNext();
            res+=it.toString()+" \n";
        }
        return res;
    }
    int sumLetters(){
        int cpt=0;
        Cell it= racine;
        int res=it.toString().length();
        while(it.getNext()!=null){
            it=it.getNext();
            res+=it.toString().length();
        }
        return res;
    }
    String get(int index){
        if(index>size())
            return "Invalid";
        Cell it= racine;
        int cpt=0;
        while(it.getNext()!=null && cpt!=index){
            it= it.getNext();
            cpt++;
        }
        return it.toString();
    }
    public static void main(String [] args){
        MyList ml = new MyList();
        ml.addLast("tatu");
        ml.add("toto");
        ml.add("titi");
        ml.addLast("tutu");
        System.out.println(ml);
        System.out.println(ml.get(15));
        System.out.println(ml.get(2));
        System.out.println(ml.sumLetters());
    }
}