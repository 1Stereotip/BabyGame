package chisla;

import java.util.Scanner;

public class с0 {
    public void streem() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Еще чуть-чуть и конец))");
    System.out.println("Напиши любое число от 0 до 5");
    int str = sc.nextInt();
    int q = 0;
    int i = 1;
    int j = 2;
    int w = 3;
    int e = 4;
    int r = 5;


    if (q == str){
        System.out.println("такая вероятность того, что он тебе изменит");
        return;
    }
    if (i == str){
        System.out.println("На таком месте ты для него");
        return;
    }

    if (j == str){
        System.out.println("Это мы, две половинки, что нашли друг друга");
       return;
    }

    if (w == str){
        System.out.println("Столько нас будет в бущующем))");
       return;
    }
    if (e == str){
        System.out.println("А может столько нас будет в бущующем))");
        return;
    }
    if (r == str){
        System.out.println("Ты всегда выглядишь на 5 из 5!!!");
        return;
    }

    while (str > 5 && 100000 > str){
        System.out.println("Жопка, ты нарушила правила!");return;
    }
}
}
