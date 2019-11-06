package lesson02.part01;

/**
 * Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
 * «Имя» получает «число1» через «число2» лет.
 * Пример: Коля получает 3000 через 5 лет.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Программа должна считывать данные с клавиатуры.
 * 3.	Выведенный текст должен содержать введенное имя.
 * 4.	Выведенный текст должен содержать введенное число1.
 * 5.	Выведенный текст должен содержать введенное число2.
 * 6.	Выведенный тест должен полностью соответствовать заданию.
 */

import java.io.*;
import java.util.*;

public class Task18 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream1 = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream1);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sAge1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sAge2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        int age1 = Integer.parseInt(sAge1);       //преобразовываем строку в число
        int age2 = Integer.parseInt(sAge2);       //преобразовываем строку в число

        System.out.println(name + " получает " + age1 + " через " + age2 + " лет.");

    }
}
