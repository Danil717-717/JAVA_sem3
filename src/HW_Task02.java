//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;

public class HW_Task02 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(34);
        num.add(345);
        num.add(678);
        num.add(876);
        num.add(389);

        System.out.println("Список: " + num);

        double avg = getAverage(num);
        System.out.println("Максимальное значение: " + Collections.max(num));
        System.out.println("Миниимальное значение: " + Collections.min(num));
        System.out.println("Среднее значение: " + avg);
    }

    public static double getAverage(List<Integer> list) {
        IntSummaryStatistics stats = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        return stats.getAverage();

    }

}