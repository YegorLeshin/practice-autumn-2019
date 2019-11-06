package lesson02.part01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

/**
 * Вывести на экран произведение 10 чисел от 1 до 10. Результат - это 1 число.
 * Подсказка: будет три миллиона с хвостиком.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить целое число на экран.
 * 2.	Метод main должен вызывать функцию System.out.println.
 * 3.	Выведенное число должно быть больше трех миллионов.
 * 4.	Выведенное число должно соответствовать заданию.
 */

public class Task08 {
    public static void main(String[] args) {
        int count = 10;
        long g = 1;
        while (count > 0) {
            g = g * count;
            count--;
        }
        System.out.println(g);
    }
}
