import java.util.*;

public class task5 {

    public static void printAllEven(List<Integer> list) {
        printEven(0, list);
    }

    public static void printEven(int index, List<Integer> list) {
        if(index == list.size()) {
            return;
        }
        if(list.get(index) % 2 == 0) {
            System.out.print(list.get(index) + " ");
        }
        printEven(index + 1, list);
    }

}