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
public class Circle {
    private String color;
    private String owner;
    private double radius;

    public Circle(String color, String owner, double radius) {
        this.color = color;
        this.owner = owner;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "color=" + color + ", owner=" + owner + ", radius=" + radius + '}';
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public void showDetail(){
        System.out.printf("|%-10s|%-10s|%4.1f|%5.2f|\n",color, owner, radius, getArea());
    }
}
