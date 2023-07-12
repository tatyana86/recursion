import java.util.*;

public class task6 {

    public static void printAllWithEvenInd(List<Integer> list) {
        printWithEvenInd(0, list);
    }

    public static void printWithEvenInd(int index, List<Integer> list) {
        if(index >= list.size()) {
            return;
        }
        System.out.print(list.get(index) + " ");
        printWithEvenInd(index + 2, list);
    }

}