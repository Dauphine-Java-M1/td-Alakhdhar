package fr.dauphine.ja.lakhdharamira.shapes;

import java.util.LinkedList;

/***
 * 6. Soyez plus moderne et modifier la classe afin qu’elle utilise une LinkedList plutôt
 * qu’un tableau (et ainsi ne plus avoir de limite sur sa taille). Que deviennent
 * pointCapacity, nbPoints et contains ?
 */

public class ModernBrokenLine {
    private LinkedList<Point> points;
    public ModernBrokenLine(){
        this.points = new LinkedList<Point>();
    }
    public void add(Point p){
        if( p!=null )
            this.points.add(p);
    }
    public int nbPoints(){
        return this.points.size();
    }
    public boolean contains( Point p){
        if( p==null || this.points.size()==0 ) return false;
        return this.points.contains(p);
    }


}
