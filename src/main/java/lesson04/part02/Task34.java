package lesson04.part02;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.Iterator;
=======
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
import java.util.Map;

/**
 * Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
 * Удалить из словаря всех людей, у которых зарплата ниже 500.
 * <p>
 * Требования:
 * 1.	Программа не должна выводить текст на экран.
 * 2.	Программа не должна считывать значения с клавиатуры.
 * 3.	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
 * 4.	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
 */

public class Task34 {

  public static Map<String, Integer> createMap() {
<<<<<<< HEAD
    Map<String, Integer> map = new HashMap<>();
    map.put("1", 1);
    map.put("2", 3000);
    map.put("3", 9);
    map.put("4", 5444);
    map.put("5", 10000);
    map.put("6", 1);
    map.put("7", 744);
    map.put("8", 2);
    map.put("9", 0);
    map.put("10", 1);

    return map;



  }

  public static void removeItemFromMap(Map<String, Integer> map) {
    Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

    while (iterator.hasNext()) {
      Integer n = iterator.next().getValue();

      if (n < 500)
        iterator.remove();
    }
=======
    //напишите тут ваш код
    return null;
  }

  public static void removeItemFromMap(Map<String, Integer> map) {
    //напишите тут ваш код
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }

  public static void main(String[] args) {

  }
}
