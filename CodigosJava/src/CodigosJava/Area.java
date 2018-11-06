import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        //Area of Triangle
        double areaTriangle = (C * A) / 2;
        double areaCircle = pi * C * C;
        double areaTrapezium = (A + B) / 2 * C;
        double areaSquare = B * B;
        double areaRectangle = A * B;

        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("TRIANGULO:" + " " + df.format(areaTriangle));
        System.out.println("CIRCULO:" + " " + df.format(areaCircle));
        System.out.println("TRAPEZIO:" + " " + df.format(areaTrapezium));
        System.out.println("QUADRADO:" + " " + df.format(areaSquare));
        System.out.println("RETANGULO:" + " " + df.format(areaRectangle));
    }
}