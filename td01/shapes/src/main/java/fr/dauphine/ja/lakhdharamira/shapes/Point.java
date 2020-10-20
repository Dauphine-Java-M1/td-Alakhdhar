package fr.dauphine.ja.lakhdharamira.shapes;

/**
 *
 *
 */
public class Point
{
    private int x;
    private int y;
    private static int compt;

    public Point(){
        this.x = 0;
        this.y = 0;
        compt++;
    }
    public Point( int px, int py){
        this.x = px;
        this.y = py;
        compt++;
    }
    public Point( Point p){
        this.x = p.x;
        this.y = p.y;
        compt++;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        return this.x+" "+this.y;
    }
    public boolean isSameAs(Point p){
        return this.x == p.x && this.y== p.y;
    }
    public Point translate(int dx,int dy){
        Point new_point =new Point(this.x+dx,this.y+dy);
        return new_point;
        //System.out.println(" Point translated to : "+ this);
    }
}