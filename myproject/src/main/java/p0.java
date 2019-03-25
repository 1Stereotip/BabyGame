import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p0 {
    public void streem() throws Exception {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        //1
        String da = "Да";

        System.out.println("Привет! Меня создал Коля, чтобы сделать тебе приятно)) Поехали? (Да или нет)");

        String str1 = reader.readLine();

        if (da.length() == str1.length()) {
            System.out.println("Кто самая лучшая девочка на всем белом свете?");
            return;
        } else if (da.length() != str1.length()) {
            System.out.println("Малышка, ну я же старался) Давай еще раз попробуем");

        }
            String str2 = reader.readLine();

            if (da.length() == str2.length()) {
                System.out.println("Кто самая лучшая девочка на всем белом свете?");
                return;
            } else if (da.length() != str2.length()) {
                System.out.println("Ну Мась, ты издеваешься)) Даю тебе подсказку: это ты, только от первого лица");
            }

        String str3 = reader.readLine();

        if (da.length() == str3.length()) {
            System.out.println("Кто самая лучшая девочка на всем белом свете?");
            return;
        } else if (da.length() != str3.length()) {
            System.out.println("Не хочешь приятности, ну и не надо!");
            return;
        }
    }
    }
