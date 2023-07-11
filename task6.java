public class task6 {

    public static void printWithEvenInd(int index, int[] list) {
        if(index >= list.length) {
            return;
        }
        System.out.print(list[index] + " ");
        index += 2;
        printWithEvenInd(index, list);
    }

    public static void printAllWithEvenInd(int [] list) {
        int index = 0;
        printWithEvenInd(index, list);
    }

}