package esg.itp.shape;

public class Rectangle implements Polgon {
    float len;
    float bre;
    float area;
    float perimeter;

    public Rectangle(float l, float b){
        len = l;
        bre = b;
    }

    @Override
    public void calArea() {

        area = len * bre;
    }

    @Override
    public void calPeri() {

        perimeter = 2 * (len + bre);
    }

    @Override
    public void Display() {
        System.out.println("Area is " + area);
        System.out.println("Peri is " + perimeter);
    }
}
