package fr.dauphine.ja.lakhdharamira.shapes;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 *
 */
public class TestPoint
{
    public static boolean containsCircle(Point p, LinkedList<Circle> circles){
        if(p==null) return false;
        Iterator<Circle> it = circles.iterator();
        while(it.hasNext() ){
            Circle next=it.next();
            if(next.contains(p)){
                System.out.println(next);
                return true;
            }

        }
        return false;
    }
    public static boolean containsRing(Point p, LinkedList<Ring> rings) {
        if(p==null) return false;
        Iterator<Ring> it = rings.iterator();
        while(it.hasNext() ){
            Ring next=it.next();
            if(next.contains(p)){
                System.out.println(next);
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args )
    {
        /*** TEST 1
         Point p=new Point();
         p.setX(3);
         p.setY(5);
         System.out.println("HI");
         System.out.println(p);
         **/


        Point p1=new Point(1,2);
        Point p2=p1;
        Point p3=new Point(1,2);
        Point p4=new Point(5,2);
        Point p5=new Point(2,2);

        /*** TEST 2
        System.out.println(p1==p2);
        System.out.println(p1==p3);
        System.out.println(p1.isSameAs(p3));

        ArrayList<Point> list = new ArrayList<>();
        list.add(p1);
        System.out.println(list.indexOf(p2));
        System.out.println(list.indexOf(p3));
         **/

        /**
         * BrokenLine TEST

        BrokenLine line =new BrokenLine(3);
        //line.add(null);
        line.add(p1);
        line.add(p4);
        //System.out.println(line.contains(null));
        System.out.println(line.contains(p4));

        System.out.println(line.contains(p5));
        line.nbPoints();
        line.pointCapacity();
        line.add(p5);
         **/

        /**
        //ModernBrokenLine TEST

        ModernBrokenLine line =new ModernBrokenLine();
        //line.add(null);
        line.add(p1);
        line.add(p4);
        //System.out.println(line.contains(null));
        System.out.println(line.contains(p4));
        System.out.println(line.contains(p5));
        System.out.println(line.nbPoints());
        line.add(p5);
         */

        // EXERCICE 4
        p1=p1.translate(6,1);

        Point p=new Point(1,2);
        Circle c=new Circle(p,1);
        Circle c2=new Circle(p,2);
        c2.translate(1,1);
        System.out.println(c+" \n"+c2);
        Circle c5=new Circle(new Point(1,2), 1);
        c5.getCenter().translate(1,1);
        System.out.println(c5);

        LinkedList<Circle> list= new LinkedList<Circle>();
        list.add(c);
        list.add(c2);
        Point pt=new Point(2,3);
        System.out.println(c.contains(pt));
        System.out.println(containsCircle(pt,list));
        System.out.println(c5.contains(p1));
    }
}