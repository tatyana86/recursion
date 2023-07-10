public class task5 {

    public static int[] removeFirstElement(int[] list) {
        int [] newList = new int[list.length - 1];

        for(int i = 0; i < newList.length; i ++) {
            newList[i] = list [i + 1];
        }

        return newList;
    }

    public static void printEven(int [] list) {
        if(list.length < 1) {
            return;
        }
        if(list[0] % 2 == 0) {
            System.out.print(list[0] + " ");
        }
        list = removeFirstElement(list);
        printEven(list);
    }

}