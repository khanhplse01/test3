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
public class Triangle {
    private String color;
    private String owner;
    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;

    public Triangle(String color, String owner, double firstEdge, double secondEdge, double thirdEdge) {
        this.color = color;
        this.owner = owner;
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.thirdEdge = thirdEdge;
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

    public double getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }

    public double getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }

    public double getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    @Override
    public String toString() {
        return "Triangle{" + "color=" + color + ", owner=" + owner + ", firstEdge=" + firstEdge + ", secondEdge=" + secondEdge + ", thirdEdge=" + thirdEdge + '}';
    }
    public double getPartOfPerimeter(){
        return (firstEdge+secondEdge+thirdEdge)/2 ;
        
    }
    public double getArea(){
        return Math.sqrt(getPartOfPerimeter()*(getPartOfPerimeter()-firstEdge)*(getPartOfPerimeter()-secondEdge)*(getPartOfPerimeter()*thirdEdge));
    }
    public void showDetail(){
        System.out.printf("|%-10s|%-10s|%4.1f|%4.1f|%4.1f|%7.3f|\n", color, owner, firstEdge, secondEdge, thirdEdge, getArea());
    }
}
