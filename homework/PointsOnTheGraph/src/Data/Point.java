/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author phanluukhanh
 */
public class Point {
    private String name;
    private double x; 
    private double y;

    public Point(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + "name=" + name + ", x=" + x + ", y=" + y + '}';
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    
}
