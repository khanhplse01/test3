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
public class TriangleSquare {
    private String color;
    private String owner;
    private double firstSquaredAngle;
    private double secondSquareAngle;
  

    public TriangleSquare(String color, String owner, double firstSquaredAngle, double secondSquareAngle, double hypotenuse) {
        this.color = color;
        this.owner = owner;
        this.firstSquaredAngle = firstSquaredAngle;
        this.secondSquareAngle = secondSquareAngle;
        
    }

    public TriangleSquare(String color, String owner, double firstSquaredAngle, double secondSquareAngle) {
        this.color = color;
        this.owner = owner;
        this.firstSquaredAngle = firstSquaredAngle;
        this.secondSquareAngle = secondSquareAngle;
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

    public double getFirstSquaredAngle() {
        return firstSquaredAngle;
    }

    public void setFirstSquaredAngle(double firstSquaredAngle) {
        this.firstSquaredAngle = firstSquaredAngle;
    }

    public double getSecondSquareAngle() {
        return secondSquareAngle;
    }

    public void setSecondSquareAngle(double secondSquareAngle) {
        this.secondSquareAngle = secondSquareAngle;
    }

    public double getHypotenuse(){
        return Math.sqrt(Math.pow(firstSquaredAngle, 2)+Math.pow(secondSquareAngle, 2));
    }
    public double getArea(){
        return (firstSquaredAngle*secondSquareAngle)/2;
    }
    public void showDetail(){
        System.out.printf("|%-10s|%-10s|%4.1f|%4.1f|%4.1f|%5.2f|\n", color, owner, firstSquaredAngle, secondSquareAngle, getHypotenuse(), getArea());
    }
}
