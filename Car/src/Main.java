import java.util.Scanner;

public class Main {

    public static void func(int a, int b)
    {
        int c = a + b;
        System.out.println(c);
        func(b, c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car cr = new Car();
        System.out.println("This is a car object:-");
        cr.drive(6, 120);
        cr.display();

        System.out.println("This is a sports car object");
        SportsCar sprtscr = new SportsCar(6, 560, 1);
        SportsCar sc = new SportsCar(7, 700, 1);
        sprtscr.display();
        sc.display();

        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        func(a, b);
    }
}
