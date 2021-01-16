package com.company;

import java.util.Scanner;

class positive {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("num: ");
        num = input.nextInt();
        do {
            System.out.print("\n" + num++);
        } while(true);
    }
}

class negative {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("num: ");
        num = input.nextInt();
        do {
            System.out.print("\n" + num--);
        } while(true);
    }
}

public class pos_neg {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        String choose;
        System.out.print("\n1.positive or 2.negative: ");
        choose = input.nextLine();
        if (choose.equals("pos") || choose.equals("positive") || choose.equals("1")) {
            positive.StaticMethod();
        } else if (choose.equals("pos") || choose.equals("negative") || choose.equals("2")) {
            negative.StaticMethod();
        }
    }
}
