package Java_Seminar3.Java_Sem3_HomeTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Java_Sem3_HT1 {
    /**
     * @param args
     */
    
    public static void main(String[] args) {
        // Задание. Пусть дан произвольный список целых чисел.
        // 1) Нужно удалить из него чётные числа
        // 2) Найти минимальное значение
        // 3) Найти максимальное значение
        // 4) Найти среднее ариф. значение
        ArrayList<Integer> array = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(rand.nextInt(100));
        }
        System.out.println(array);
        // System.out.println(RemoveEven(array));
        // System.out.println(FindMax(array));
        // System.out.println(FindMin(array));
        // System.out.println(FindAver(array));

    }
    
    public static ArrayList<Integer> RemoveEven (ArrayList<Integer> arr) {
        java.util.Iterator<Integer> iter = arr.iterator();
        while(iter.hasNext()){
            if(iter.next()%2 == 0){
                iter.remove();
            }
        }
        return arr;
    }

    public static int FindMax (ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size()-1; i++) {
            if(max < arr.get(i+1)) max = arr.get(i+1);
        }
        return max;
    }

    public static int FindMin (ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int i = 0; i < arr.size()-1; i++) {
            if(min > arr.get(i+1)) min = arr.get(i+1);
        }
        return min;
    }

    public static Double FindAver (ArrayList<Integer> arr) {
        Double ave = 0.0;
        for (int i = 0; i < arr.size(); i++) {
            ave += arr.get(i);
        }
        ave = ave/arr.size();
        return ave;
    }

}
