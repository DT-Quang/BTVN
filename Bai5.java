package Buoi3;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số cần chuyển sang nhị phân ");
        int n = sc.nextInt();
        String nhiPhan="";
        while(n>0){
            nhiPhan=(n%2)+nhiPhan;
            n=n/2;
        }
        System.out.println(nhiPhan);
    }
}
