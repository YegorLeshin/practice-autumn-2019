package lesson04.part01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e

/**
 * Ввести с клавиатуры 10 чисел и заполнить ими список.
 * Вывести их в обратном порядке. Каждый элемент - с новой строки.
 * Использовать только цикл for.
 *
 * Подсказка:
 * Не забудь импортировать класс: java.util.ArrayList;
 *
 * Требования:
 * 1.	Объяви переменную типа список целых чисел и сразу проинициализируй ee.
 * 2.	Считай 10 целых чисел с клавиатуры и добавь их в список.
 * 3.	Выведи числа в обратном порядке.
 * 4.	Используй цикл for.
 */

public class Task15 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
<<<<<<< HEAD
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++)
      list.add(Integer.parseInt(reader.readLine()));

    for (int i = 9; i > -1; i--)
      System.out.println(list.get(i));
=======

    //напишите тут ваш код
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }
}
