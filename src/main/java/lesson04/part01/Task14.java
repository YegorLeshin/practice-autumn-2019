package lesson04.part01;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.InputStreamReader;
=======
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
import java.util.ArrayList;

/**
 * 1. Введи с клавиатуры 10 слов в список строк.
 * 2. Метод doubleValues должен удваивать слова по принципу:
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 * 3. Выведи результат на экран, каждое значение с новой строки.
 *
 * Требования:
 * 1.	Проинициализируй переменную типа список строк.
 * 2.	Считай 10 строк с клавиатуры и добавь их в список.
 * 3.	Метод doubleValues должен удваивать элементы списка
 * по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
 * 4.	Выведи получившийся список на экран, каждый элемент с новой строки.
 */

public class Task14 {
  public static void main(String[] args) throws Exception {
<<<<<<< HEAD
    ArrayList<String> list = new ArrayList<String>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 10; i++)
      list.add(reader.readLine());


    ArrayList<String> result = doubleValues(list);

    for (String str: result)
      System.out.println(str);
  }

  public static ArrayList<String> doubleValues(ArrayList<String> list) {
    for (int i = 0; i < list.size();) {
      list.add(i, list.get(i));
      i += 2;
    }
    return list;
=======
    // Считать строки с консоли и объявить ArrayList list тут
    ArrayList<String> list = null;

    ArrayList<String> result = doubleValues(list);

    // Вывести на экран result
  }

  public static ArrayList<String> doubleValues(ArrayList<String> list) {
    //напишите тут ваш код
    return null;
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }
}
