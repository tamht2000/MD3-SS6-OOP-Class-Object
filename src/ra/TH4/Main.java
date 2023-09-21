package ra.TH4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.print("Nhập a = ");
        double a = sc.nextDouble();
        System.out.print("Nhập b = ");
        double b = sc.nextDouble();

        calculator.setA(a);
        calculator.setB(b);

        System.out.println("Tổng 2 số là: " + calculator.add());
        System.out.println("Hiệu 2 số là: " + calculator.sub());
        System.out.println("Tích 2 số là: " + calculator.multi());
        System.out.println("Thương 2 số là: " + calculator.div());
    }
}
