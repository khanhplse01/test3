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
     
    private String name; 
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "name=" + name + ", radius=" + radius + '}';
    }

    public double getRadius() {
        return radius;
    }

   
    
    

}