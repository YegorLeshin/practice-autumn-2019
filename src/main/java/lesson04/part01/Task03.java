package lesson04.part01;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.InputStreamReader;

=======
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
/**
 * 1. Создать массив на 10 строк.
 * 2. Создать массив на 10 чисел.
 * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 * 4. В каждую ячейку массива чисел записать длину строки из массива строк,
 * индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 *
 * Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 *
 * Требования:
 * 1.	Программа должна создавать массив на 10 строк.
 * 2.	Программа должна создавать массив на 10 целых чисел.
 * 3.	Программа должна считывать строки для массива с клавиатуры.
 * 4. Программа должна в массив чисел записать длины строк из массива строк,
 * а затем их вывести на экран.
 */

public class Task03 {

  public static void main(String[] args) throws Exception {
<<<<<<< HEAD
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] listString = new String[10];
    int[] listInt = new int[10];

    for (int i = 0; i < 10; i++)
      listString[i] = reader.readLine();

    for (int i = 0; i < 10; i++) {
      listInt[i] = listString[i].length();
      System.out.println(listInt[i]);
    }
=======
    //напишите тут ваш код
>>>>>>> cf1e973b6e5e023208f8b3033a338052ef120d5e
  }
}
