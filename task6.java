public class task6 {

    public static int[] removeTwoElem(int[] list) {
        if(list.length < 3) {
            return new int[0];
        }

        int [] newList = new int[list.length - 2];

        for(int i = 0; i < newList.length; i ++) {
            newList[i] = list [i + 2];
        }

        return newList;
    }

    public static void printEvenInd(int [] list) {
        if(list.length < 1) {
            return;
        }
        System.out.print(list[0] + " ");
        list = removeTwoElem(list);
        printEvenInd(list);
    }

}