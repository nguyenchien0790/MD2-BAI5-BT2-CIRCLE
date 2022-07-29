package rikkei.academy;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Hinh tron co ban kinh : " +circle.getRadius());
        System.out.println("Dien tich hinh tron la : "+circle.getArea());
    }
}