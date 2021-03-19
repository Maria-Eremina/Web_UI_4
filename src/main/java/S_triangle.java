import java.util.Scanner;

public class S_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 сторону треугольника");
        double x = scanner.nextDouble();

        System.out.println("Введите 2 сторону треугольника");
        double y = scanner.nextDouble();

        System.out.println("Введите 3 сторону треугольника");
        double z = scanner.nextDouble();

       double S = Triangle_Square(x,y,z);
        System.out.println("S треугольника = " + S );

    }
    public static double Triangle_Square(double a, double b, double c) {

        double p = (a+b+c)/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
