package lesson04.part03;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * String s = null;
 * String m = s.toLowerCase();
 *
 * Требования:
 * 1.	Программа должна выводить сообщение на экран.
 * 2.	В программе должен быть блок try-catch.
 * 3.	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
 * 4.	Выведенное сообщение должно содержать тип возникшего исключения.
 * 5.	Имеющийся код в методе main не удалять.
 *
 */

public class Task40 {

  public static void main(String[] args) {
<<<<<<< HEAD
    try {
      String s = null;
      String m = s.toLowerCase();
    } catch (NullPointerException e) {
      System.out.println(e);
    }
=======
    //напишите тут ваш код

    String s = null;
    String m = s.toLowerCase();

    //напишите тут ваш код
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }
}
