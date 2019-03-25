import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2 {
    public void streem() throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        String chochy = "хочу";
        System.out.println("если захочешь еще узнать про себя, то просто напиши мне <еще> а если факты про себя больше не хочешь читать, напиши <конец>");

        String str = reader.readLine();

        if (chochy.length() == str.length()) {
            System.out.println("Ты мега красивая!!!");
        } else if (chochy.length() != str.length()) {
            System.out.println("Ну ладно) Тогда двигаем дальше)");return;
        }
        String chochy1 = "еще";
        String str1 = reader.readLine();

        if (chochy1.length() == str1.length()) {
            System.out.println("Самая нежная!!!");
        } else if (chochy1.length() != str1.length()) {
            System.out.println("Двигаем дальше)");return;
        }
        String str2 = reader.readLine();

        if (chochy1.length() == str2.length()) {
            System.out.println("Ты очень заботливая!!!");
        } else if (chochy1.length() != str2.length()) {
            System.out.println("Двигаем дальше)");return;
        }
        String str3 = reader.readLine();

        if (chochy1.length() == str3.length()) {
            System.out.println("У тебя есть чувство юмора, это круууууто!!!");
        } else if (chochy1.length() != str3.length()) {
            System.out.println("Двигаем дальше)");return;
        }
        String str4 = reader.readLine();

        if (chochy1.length() == str4.length()) {
            System.out.println("Сексуальная девочка!!!");
        } else if (chochy1.length() != str4.length()) {
            System.out.println("Двигаем дальше)");return;
        }
        String str5 = reader.readLine();

        if (chochy1.length() == str5.length()) {
            System.out.println("А главное ещё и умная!!!");
        } else if (chochy1.length() != str5.length()) {
            System.out.println("Двигаем дальше)");return;
        }
        String str6 = reader.readLine();

        if (chochy1.length() == str6.length()) {
            System.out.println("Ради тебя готов на все!!!");
        } else if (chochy1.length() != str6.length()) {
            System.out.println("Двигаем дальше)");return;
        }

        String str8 = reader.readLine();

        if (chochy1.length() == str8.length()) {
            System.out.println("Таких как ты, боьше не бывает!!!");
        } else if (chochy1.length() != str8.length()) {
            System.out.println("Двигаем дальше)");return;
        }


        String str9 = reader.readLine();

        if (chochy1.length() == str9.length()) {
            System.out.println("Нет ничего  чудесней, чем просто быть с тобою вместте!!!");
        } else if (chochy1.length() != str9.length()) {
            System.out.println("Двигаем дальше)");return;
        }

        String str10 = reader.readLine();

        if (chochy1.length() == str10.length()) {
            System.out.println("Ты достойна всех самых лучших и приятных слов во вселенной !!!");
        } else if (chochy1.length() != str10.length()) {
            System.out.println("Двигаем дальше)");return;
        }
        String str7 = reader.readLine();

        if (chochy1.length() == str7.length()) {
            System.out.println("Ты лучшее, что происходило в моей жизни!!!");
        } else if (chochy1.length() != str7.length()) {
            System.out.println("Двигаем дальше)");return;
        }

    }
}