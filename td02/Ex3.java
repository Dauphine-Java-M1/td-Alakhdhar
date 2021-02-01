class Expr{
    double val;
    Expr(double v){
        val=v;
    }
    double eval(){
        return val;
    }
}
class Value extends Expr{
    Value(double v){
        super(v);
    }
    double eval(){
        return val;
    }
}
class Add extends Expr{
    Expr v2;
    Add(Expr v1,Expr v2){
        super(v1.eval());
        System.out.println(v2.eval());
        this.v2=new Expr(v2.eval());
        System.out.println(this.v2.eval());
    }
    double eval(){
        System.out.println(super.eval());
        System.out.println(v2.eval());
        return (double)(super.eval())+v2.eval();
    }

}
//3. Ajouter l’op´eration de multiplication.
//        4. Ajouter l’op´eration de racine carr´ee. Pour l’affichage, vous utiliserez le symbole
//        unicode \u221a. Pour l’´evaluation, vous utiliserez la m´ethode Math.sqrt().
public class Ex3 {
    public static void main(String[] args){
        Expr val = new Value(1337.0);
        System.out.println(val.eval()); //affiche 1337.0
        Expr add = new Add(new Value(327.0), val);
        System.out.println(add.eval()); //affiche 1664.0
        Expr e = new Add(new Value(350.0), add);
        System.out.println(e.eval()); //affiche 2014.0
    }
}