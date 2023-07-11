public class task5 {

    public static void printEvenElement(int index, int[] list) {
        if(index == list.length) {
            return;
        }
        if(list[index] % 2 == 0) {
            System.out.print(list[index] + " ");
        }
        index ++;
        printEvenElement(index, list);
    }

    public static void printAllEven(int [] list) {
        if(list.length < 1) {
            return;
        }
        int index = 0;
        printEvenElement(index, list);
    }

}