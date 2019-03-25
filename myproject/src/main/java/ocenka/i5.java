package ocenka;

import java.util.Scanner;

public class i5 {public void streem()  {
    Scanner sc = new Scanner(System.in);

    int str = sc.nextInt();
    int q = 0;
    int i = 1;
    int j = 2;
    int w = 3;
    int e = 4;
    int r = 5;
    int t = 10;

    if (q == str){
        System.out.println("Стыд и срам такое думать! Еще варианты?) ");
        return;
    }
    if (i == str){
        System.out.println("Вот этого я не ожидал конечно! Еще раз подумай)");
        return;
    }

    if (j == str){
        System.out.println("Неужели реально думаешь что на 2? Пробуем еще разок) ");
        return;
    }

    if (w == str){
        System.out.println("Странно, он не думал что тянет на 3. Может попробеушь еще разок?) ");
        return;
    }
    if (e == str){
        System.out.println("Мало что-то, давай еще разочек) ");
        return;
    }
    if (r == str){
        System.out.println("хм, все равно мало я считаю) он  же в два раза больше тебя))  ");
        return;
    }
    if (t == str){
        System.out.println("Именно так!! Он очень сильно тебя любит! Так, что любовь даже не влезает в рамки)");
        System.out.println("На этом все! А теперь почелуй своего любимого мальчика))");System.exit(0);
    }
    while (str > r && str != 10){
        System.out.println("нууууу, давай еще раз)");return;
    }
}
}
