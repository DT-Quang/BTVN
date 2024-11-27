package Buoi3;

import java.util.Scanner;

public class Bai3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" Nhap so can tinh giai thua ");
        int n = sc.nextInt();
        System.out.print(fact(n)+" ");
    }
    static int fact(int n){
        if(n == 1){
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }
}
