package lesson04.part02;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

=======
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
/**
 * Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
 * арбуз - ягода,
 * банан - трава,
 * вишня - ягода,
 * груша - фрукт,
 * дыня - овощ,
 * ежевика - куст,
 * жень-шень - корень,
 * земляника - ягода,
 * ирис - цветок,
 * картофель - клубень.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 *
 * Пример вывода (тут показана только одна строка):
 * картофель - клубень
 *
 * Требования:
 * 1.	Объяви переменную коллекции Map с типом элементов String, String и сразу проинициализируй ee.
 * 2.	Программа не должна считывать значения с клавиатуры.
 * 3.	Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
 * 4.	Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
 */

public class Task22 {

  public static void main(String[] args) {
<<<<<<< HEAD
    Map<String, String> map = new HashMap<String, String>();
    map.put("арбуз", "ягода");
    map.put("банан", "трава");
    map.put("вишня", "ягода");
    map.put("груша", "фрукт");
    map.put("дыня", "овощ");
    map.put("ежевика", "куст");
    map.put("жень-шень", "корень");
    map.put("земляника", "ягода");
    map.put("ирис", "цветок");
    map.put("картофель", "клубень");

    for (Map.Entry<String, String> text: map.entrySet())
      System.out.println(text.getKey() + " - " + text.getValue());
=======
    //напишите тут ваш код
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }
}
