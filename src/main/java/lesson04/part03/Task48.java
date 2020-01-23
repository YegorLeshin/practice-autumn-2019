package lesson04.part03;

/**
 * Есть четыре класса MyException, MyException2, MyException3, MyException4.
 * Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.
 *
 * Подсказка:
 * Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
 *
 * Требования:
 * 1.	В классе Solution должно быть 4 вложенных класса: MyException, MyException2, MyException3 и MyException4.
 * 2.	Все вложенные классы должны быть унаследованы от классов исключений.
 * 3.	Два класса из четырех должны быть checked исключениями.
 * 4.	Два класса из четырех должны быть unchecked исключениями.
 *
 */

public class Task48 {

  public static void main(String[] args) {
  }

<<<<<<< HEAD
  static class MyException extends ArrayStoreException {
  }

  static class MyException2 extends ArithmeticException {
  }

  static class MyException3 extends NoSuchMethodException {
  }

  static class MyException4 extends NoSuchFieldException{
=======
  static class MyException {
  }

  static class MyException2 {
  }

  static class MyException3 {
  }

  static class MyException4 {
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }
}
