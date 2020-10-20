package fr.dauphine.ja.lakhdharamira.shapes;

import java.util.LinkedList;

public class Ring {
    private Point centre;
    private int ray_out;
    private int ray_in;

    public Ring(Point p, int n1, int n2) {
        this.centre = p;
        if (n1 > n2) {
            this.ray_in = n2;
            this.ray_out = n1;
        } else {
            this.ray_in = n1;
            this.ray_out = n2;
        }
    }

    public boolean equals(Ring r) {
        return this.ray_out == r.ray_out && this.ray_in == r.ray_in;
    }

    public String toString() {
        return "L'anneau est de centre :" + this.centre + " , de rayon interne " + this.ray_in + " et de rayon externe : " + this.ray_out;
    }

    public boolean contains(Point p) {
        if (p == null) return false;
        if (p.isSameAs(this.centre)) return true;
        int dist_p_centre = (int) Math.sqrt(((p.getX() - this.centre.getX()) * (p.getX() - this.centre.getX())) +
                ((p.getY() - this.centre.getY()) * (p.getY() - this.centre.getY())));
        return dist_p_centre <= this.ray_out && dist_p_centre >= this.ray_in;
    }


}
