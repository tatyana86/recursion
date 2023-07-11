import java.util.*;

public class task5 {

    public static void printAllEven(List<Integer> list) {
        if(list.size() == 0) {
            return;
        }
        if(list.get(0) % 2 == 0) {
            System.out.print(list.get(0) + " ");
        }

        printAllEven(list.subList(1, list.size()));
    }

}