import java.util.*;

public class task6 {

    public static void printAllWithEvenInd(List<Integer> list) {
        if(list.size() == 0) {
            return;
        }
        System.out.print(list.get(0) + " ");
        if(list.size() != 1) {
            printAllWithEvenInd(list.subList(2, list.size()));
        }
    }

}