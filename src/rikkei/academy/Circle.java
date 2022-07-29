package rikkei.academy;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    protected Circle(double radius) {
        this.radius = radius;
    }

    double getRadius(){
        return this.radius;
    }
    double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
}
