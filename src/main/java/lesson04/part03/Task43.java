package lesson04.part03;

import java.util.HashMap;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * HashMap map = new HashMap(null);
 * map.put(null, null);
 * map.remove(null);
 *
 * Требования:
 * 1.	Программа должна выводить сообщение на экран.
 * 2.	В программе должен быть блок try-catch.
 * 3.	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
 * 4.	Выведенное сообщение должно содержать тип возникшего исключения.
 * 5.	Имеющийся код в методе main не удалять.
 */

public class Task43 {

  public static void main(String[] args) {
<<<<<<< HEAD
    try {
      HashMap<String, String> map = new HashMap<String, String>(null);
      map.put(null, null);
      map.remove(null);
    } catch (NullPointerException e) {
      System.out.println(e);
    }
=======
    //напишите тут ваш код

    HashMap<String, String> map = new HashMap<String, String>(null);
    map.put(null, null);
    map.remove(null);

    //напишите тут ваш код
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }
}
