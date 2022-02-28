package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Создать перечисление для дней (понедельник, вторник...)
         Выберите дату в консоли. Если это понедельник — «Я изучаю Java в понедельник» или «Я изучаю английский во вторник» — тогда нажмите на консоль, чтобы выбрать предмет, который вы изучаете.
         Укажите дни недели на кыргызском языке. */
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        Jumalar jumalar = Jumalar.valueOf(a.toUpperCase(Locale.ROOT));
        switch (jumalar) {
            case DUYSHOMBY -> System.out.println("Duyshombu jemanin bashtalishi! ");
            case SHEYSHEMBI -> System.out.println("Praktika sabagi! ");
            case SHARSHEMBI -> System.out.println("Lekciya sabagi! ");
            case BEYSHEMBI -> System.out.println("Softskill sabagi bar! ");
            case JUMA -> System.out.println("Akirki sabak bul juma! ");
            case IYSHEMBI -> System.out.println("Dopolnitelnie zaniatiya! ");
            case JEKSHEMBI -> System.out.println("Duyshombu kununo dayardanoo!");
        }
    }
}
