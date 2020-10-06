package fr.dauphine.ja.lakhdharamira.td00;
import java.util.*;

/**
 * Hello world! (not anymore)
 *
 */
public class PrimeCollection
{
    private ArrayList <Integer> numbers ;

    public PrimeCollection(){
        this.numbers = new ArrayList <Integer>();
    }
    public void initRandom(int n,Integer m){
        for (int i=0;i<n;i++){
            Random r = new Random();
            numbers.add(i, r.nextInt(m));
        }
    }
    private boolean isPrime(int p){
            if(p <= 1) return false;
            if(p == 2) return true;
            if(p % 2 == 0) return false;
            if(p < 9) return true;
            if(p % 3 == 0) return false;
            int sqr = (int) Math.sqrt(p);
            for(int i = 5; i <= sqr; i += 6)
                if(p % i == 0 || p % (i + 2) == 0)
                    return false;
            return true;
    }
    public void printPrimes(){
        for(int i = 0; i < this.numbers.size(); i ++){
            System.out.println(this.numbers.get(i)+" : "+isPrime(this.numbers.get(i)));
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }

    /**Utilisez les méthodes précédentes pour faire en sorte que la méthode main génère
     100 entiers tirés aléatoirement entre 1 et 1000, et affiche ceux d’entre eux qui
     sont premiers.
     **/
    public static void main(String[] args )
    {
        PrimeCollection koko = new PrimeCollection();
        koko.initRandom(100,1000);
        koko.printPrimes();
    }
}
