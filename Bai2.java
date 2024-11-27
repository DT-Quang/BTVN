package Buoi3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so can dao nguoc ");
        int soBanDau = sc.nextInt();
        int soSauKhiDaoNguoc=0;
        int n;

        for(;soBanDau!=0;){
            n=soBanDau%10;
            soSauKhiDaoNguoc=soSauKhiDaoNguoc*10+n;
            soBanDau=soBanDau/10;
        }
        System.out.println(soSauKhiDaoNguoc);
    }
}
