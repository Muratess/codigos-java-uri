import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");
        double empSalary = sc.nextDouble();
        double empNewSalary;

        if (empSalary > 0 && empSalary <= 400.00) {
            empNewSalary = empSalary + empSalary * 0.15;
            System.out.println("Novo salario:" + " " + df.format(empNewSalary));
            System.out.println("Reajuste ganho:" + " " + df.format(empSalary * 0.15));
            System.out.println("Em percentual: 15 %");
        }

        if (empSalary >= 400.01 && empSalary <= 800.00) {
            empNewSalary = empSalary + empSalary * 0.12;
            System.out.println("Novo salario:" + " " + df.format(empNewSalary));
            System.out.println("Reajuste ganho:" + " " + df.format(empSalary * 0.12));
            System.out.println("Em percentual: 12 %");
        }

        if (empSalary >= 800.01 && empSalary <= 1200.00) {
            empNewSalary = empSalary + empSalary * 0.10;
            System.out.println("Novo salario:" + " " + df.format(empNewSalary));
            System.out.println("Reajuste ganho:" + " " + df.format(empSalary * 0.10));
            System.out.println("Em percentual: 10 %");
        }

        if (empSalary >= 1200.01 && empSalary <= 2000.00) {
            empNewSalary = empSalary + empSalary * 0.07;
            System.out.println("Novo salario:" + " " + df.format(empNewSalary));
            System.out.println("Reajuste ganho:" + " " + df.format(empSalary * 0.07));
            System.out.println("Em percentual: 7 %");
        }

        if (empSalary > 2000.00) {
            empNewSalary = empSalary + empSalary * 0.04;
            System.out.println("Novo salario:" + " " + df.format(empNewSalary));
            System.out.println("Reajuste ganho:" + " " + df.format(empSalary * 0.04));
            System.out.println("Em percentual: 4 %");
        }

    }
}