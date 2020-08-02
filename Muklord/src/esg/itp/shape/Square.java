package esg.itp.shape;

public class Square implements Polgon {

    float side;
    float area;
    float perimeter;

    public Square(float s){
        side = s;
    }

    @Override
    public void calArea() {

    area = side * side;
    }

    @Override
    public void calPeri() {

    perimeter = 4 * side;
    }

    @Override
    public void Display() {
        System.out.println("Area is " + area);
        System.out.println("Peri is " + perimeter);
    }
}
