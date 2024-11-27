package Buoi3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n=getN();
        Bai1 bt1=new Bai1();
        bt1.bai1(n);
    }

    public void bai1(int n) {
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += (long) Math.pow(i, 3);
        }
        System.out.println("Tong S(n) = 1^3 + 2^3 + 3^3 + … + n^3 la: " + tong);
    }

    public static int getN() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Nhap vao n: ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }
}
