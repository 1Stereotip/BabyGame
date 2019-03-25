import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1 {
       public void streem() throws IOException {

           String ya = "Я";

           BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

           String str2 = reader.readLine();

           if (ya.length() == str2.length()) {
               System.out.println("Именно так! А хочешь кое что о себе узнать?(отвечай Хочу или Нет)");return;
           } else if (ya.length() != str2.length()) {
               System.out.println("А теперь подумай и напиши еще раз)");
           }
           String str3 = reader.readLine();
           if (ya.length() == str3.length()) {
               System.out.println("Именно так! А хочешь кое что о себе узнать?(отвечай Хочу или Нет)");return;
           } else if (ya.length() != str3.length()) {
               System.out.println("Даю тебе еще один шанс))");
           }
           String str4 = reader.readLine();
           if (ya.length() == str4.length()) {
               System.out.println("Именно так! А хочешь кое что о себе узнать?(отвечай Хочу или Нет)");
           } else if (ya.length() != str4.length()) {
               System.out.println("Не хочешь, как хочешь(");
           }
       }}
