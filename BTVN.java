package Buoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class BTVN {

    // Hàm kiểm tra số hoàn hảo
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    // Hàm kiểm tra số Armstrong
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Số chữ số

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    // Hàm kiểm tra số đối xứng
    public static boolean isPalindrome(int num) {
        String original = String.valueOf(num);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    // Hàm tính tổng các chữ số của một số
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào dãy số nguyên dương
        System.out.print("Nhập số lượng phần tử của dãy: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Nhập các số nguyên dương:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Phân loại và kiểm tra từng số
        System.out.println("\nKết quả phân loại số:");
        for (int num : numbers) {
            System.out.println("Số: " + num);

            // Kiểm tra số hoàn hảo
            if (isPerfectNumber(num)) {
                System.out.println(" - Là số hoàn hảo.");
            } else {
                System.out.println(" - Không phải là số hoàn hảo.");
            }

            // Kiểm tra số Armstrong
            if (isArmstrong(num)) {
                System.out.println(" - Là số Armstrong.");
            } else {
                System.out.println(" - Không phải là số Armstrong.");
            }

            // Kiểm tra số đối xứng
            if (isPalindrome(num)) {
                System.out.println(" - Là số đối xứng.");
            } else {
                System.out.println(" - Không phải là số đối xứng.");
            }

            // Tính tổng các chữ số
            System.out.println(" - Tổng các chữ số: " + sumOfDigits(num));
        }

//        scanner.close();
    }
}

