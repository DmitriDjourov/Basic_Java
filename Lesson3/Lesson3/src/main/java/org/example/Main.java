package org.example;

import java.util.Scanner;

public class Main {
    static int value = 0;

    public void run1() {
        System.out.println("run 1");
    }

    public static void run2() {
        System.out.println("run 2");
    }

    public static void inc() {
        value++;
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {

//        Main m = new Main();
//        m.run1();
//
//        run2();
//        Main.run2();
//
//        int x = 12;
//        int y= 23;
//        int res = sum(x,y);
//        System.out.println(res);

        // Экхемпляр
//        Foo foo = new Foo();
//        foo.value = 123;

        // Статика
//        Bar.value = 234;
//        System.out.println(Bar.value);


//        Film f = new Film();
//        f.setId(1);
//        f.setTitle("Фильм 1");
//        System.out.println("title: " + f.getTitle() + " id: " + f.getId());

        //--------------------------------------------
        Scanner userData = new Scanner(System.in);
        System.out.print("Введите имя фильма: ");
        String filmName = userData.nextLine();
        //   System.out.print(filmName);
        //--------------------------------------------
        //
        int val = userData.nextInt();

        Film f = new Film( filmName);
        System.out.println(f.getInfo());
        Film f2 = new Film( "Новый фильм");
        System.out.println(f2.getInfo());

        Film f3 = new Film( "Ещё фильм");
        System.out.println(f3.getInfo());

        f.getGlobalId();
        f2.getGlobalId();
        f3.getGlobalId();

        Film f4 = new Film("");
        f3.setTitle("Ещё один фильм");
        System.out.println(f3.getInfo()); // Ещё один фильм
        System.out.println(f4.getInfo());// Ещё один фильм
        Film f5 = f4;
        f5.setTitle("Ещё один фильм !!!!");

        System.out.println(f3.getInfo()); // Ещё один фильм
        System.out.println(f4.getInfo());// Ещё один фильм
        System.out.println(f5.getInfo());// Ещё один фильм

//        f.f = new Foo();
//        f.f.value=123123;
//
//        f.bar();
    }
}