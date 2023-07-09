import java.util.*;

public class task3 {

    public static int listLen(ArrayList<String> list) {
        if(list.size() == 0) {
            return 0;
        }
        list.remove(0);
        return 1 + listLen(list);
    }

}