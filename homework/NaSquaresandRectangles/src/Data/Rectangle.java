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
public class Rectangle {
    private String owner;
    private String color;
    private double longEdge;
    private double shortEdge;

    public Rectangle(String owner, String color, double longEdge, double shortEdge) {
        this.owner = owner;
        this.color = color;
        this.longEdge = longEdge;
        this.shortEdge = shortEdge;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLongEdge() {
        return longEdge;
    }

    public void setLongEdge(double longEdge) {
        this.longEdge = longEdge;
    }

    public double getShortEdge() {
        return shortEdge;
    }

    public void setShortEdge(double shortEdge) {
        this.shortEdge = shortEdge;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", longEdge=" + longEdge + ", shortEdge=" + shortEdge + '}';
    }
    public double getArea(){
        return longEdge*shortEdge;
    }
    public void showDetail(){
        System.out.printf("|RECT  |%-10s|%-10s|%-4.1f|%-4.1f|%-5.1f|\n",owner,color,longEdge,shortEdge,getArea());
        
    }
}
