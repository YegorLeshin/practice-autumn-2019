package lesson04.part03;

/**
 * Создай метод public static void divideByZero, в котором подели любое число на ноль и выведи на экран результат деления.
 * Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
 *
 * Требования:
 * 1.	В классе должен быть метод public static void divideByZero().
 * 2.	Метод divideByZero должен содержать операцию деления любого целого числа на ноль.
 * 3.	Метод divideByZero должен вызывать System.out.println или System.out.print.
 * 4.	Метод main должен содержать блок try..catch.
 * 5.	Метод main должен отлавливать любые исключения метода divideByZero.
 * 6.	Программа должна выводить стек-трейс пойманого исключения.
 */

public class Task49 {

  public static void main(String[] args) {
<<<<<<< HEAD
    try {
      divideByZero();
    } catch (ArithmeticException exception) {
      exception.printStackTrace();
    }
  }

  public static void divideByZero() {
    int a = 10;
    System.out.println(a/0);
=======
//    divideByZero();
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }
}
