package fr.dauphine.ja.lakhdharamira.shapes;

import java.util.Iterator;
import java.util.LinkedList;

public class Circle {
    private Point centre;
    private int rayon;
    public Circle ( Point p, int r){
        this.centre = p;
        this.rayon = r;
    }
    public double surface(){
        return Math.PI * this.rayon * this.rayon;
    }
    public void translate(int dx,int dy){
        this.centre=this.centre.translate(dx,dy);
    }
    public Point getCenter(){
        return this.centre;
    }
    /**
     38. Créer une méthode contains(Point p) indiquant si le point p est contenu dans
     le cercle (indice: utiliser pythagore).
     9. Créer la méthode contains(Point p, Circle...circles) qui renvoit vrai si le
     point est dans un des cercles. Doit-on en faire une méthode statique ?*/
    public String toString(){
        return "Le cercle est de centre "+this.centre+ ",de rayon : "+this.rayon + " et de surface "+ this.surface();
    }
    public boolean contains(Point p){
        if(p==null) return false;
        if( p.isSameAs(this.centre)) return true;
        int dist_p_centre =(int) Math.sqrt( ((p.getX()-this.centre.getX())*(p.getX()-this.centre.getX()))+
                ((p.getY()-this.centre.getY())*(p.getY()-this.centre.getY())));
        return dist_p_centre <= this.rayon;
    }

}
