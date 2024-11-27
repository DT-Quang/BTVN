package Buoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class SoArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số n ");
        int n = sc.nextInt();
        if (check(n))
            System.out.println(" Đây là số armstrong ");
        else
            System.out.println(" Đây không phải số armstrong ");
    }
    public static boolean check(int n) {
        int temp=n;

        ArrayList<Integer> list=new ArrayList<Integer>();
        while (temp!=0) {
            list.add(temp%10);
            temp/=10;
        }
        int sum=0;
        for(int i=0;i<50;i++){
            sum=0;
            for(int j=0;j<list.size();j++){
                sum=sum + (int)Math.pow(list.get(j),i);
            }
            if(sum==n) return true;
            if(sum>n) return false;
        }
        return false;
    }





}
