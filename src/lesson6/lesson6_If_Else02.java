package lesson6;

import java.util.Scanner;

public class lesson6_If_Else02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.contains(",") && str.contains(" ")) {
            System.out.println("error");
        } else {
            if (str.contains(" ")) {
                System.out.println("user ввел 2 слова: " + str);
            } else if (str.contains(",")) {
                System.out.println("user ввел больше 2-двух слов: " + str);
            } else {
                System.out.println("ВВелл одно слово: " + str);
            }
        }


    }
}
