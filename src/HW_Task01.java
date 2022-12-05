// Пусть дан произвольный список целых чисел, удалить из него четные числа



import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class HW_Task01 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();


        numbers.add(36565563);
        numbers.add(45682);
        numbers.add(45678925);
        numbers.add(875442);
        numbers.add(34364676);

        System.out.println("Список: " + numbers);

        for (Iterator<Integer> iterator = numbers.iterator();iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                System.out.println("Четное число: " + number);
                iterator.remove();
            }

        }

        Collections.sort(numbers);
        System.out.println("Получившийся список: " + numbers);
    }
}
