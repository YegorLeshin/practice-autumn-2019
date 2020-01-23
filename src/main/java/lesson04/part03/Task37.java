package lesson04.part03;

/**
 * Написать пять методов, которые вызывают друг друга.
 * Метод должен вернуть номер строки кода, из которого вызвали этот метод.
 * Воспользуйся функцией: element.getLineNumber().
 *
 * Требования:
 * 1.	В классе должно быть 5 методов (метод main не учитывать).
 * 2.	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
 * 3.	Каждый метод должен возвращать номер строки кода, из которого вызвали этот метод.
 * 4.	Для получения номера строки, используй метод getLineNumber класса StackTraceElement.
 */

public class Task37 {

  public static void main(String[] args) {
    method1();
  }

  public static int method1() {
    method2();
<<<<<<< HEAD
    return  Thread.currentThread().getStackTrace()[2].getLineNumber();
=======
    return  /*напишите тут ваш код*/ 0;
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }

  public static int method2() {
    method3();
<<<<<<< HEAD
    return  Thread.currentThread().getStackTrace()[2].getLineNumber();
=======
    return  /*напишите тут ваш код*/ 0;
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }

  public static int method3() {
    method4();
<<<<<<< HEAD
    return  Thread.currentThread().getStackTrace()[2].getLineNumber();
=======
    return  /*напишите тут ваш код*/ 0;
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }

  public static int method4() {
    method5();
<<<<<<< HEAD
    return  Thread.currentThread().getStackTrace()[2].getLineNumber();
  }

  public static int method5() {
    return  Thread.currentThread().getStackTrace()[2].getLineNumber();
=======
    return  /*напишите тут ваш код*/ 0;
  }

  public static int method5() {
    return  /*напишите тут ваш код*/ 0;
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }
}
