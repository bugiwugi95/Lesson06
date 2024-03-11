package lesson6;

import java.util.Scanner;

public class lesson6_If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double current = sc.nextDouble();
        double pi = Math.PI;
        if (current > pi){
            System.out.println("pimore");
        }else {
            System.out.println("Не больше");
        }

    }
}
