public class Main {

    public static int findSecondMax(int index, int max1, int max2, int [] list) {
        if(index == list.length) {
            return max2;
        }
        if(list[index] >= max1) {
            max2 = max1;
            max1 = list[index];
        }
        if(list[index] > max2 && list[index] < max1) {
            max2 = list[index];
        }
        index ++;
        return findSecondMax(index, max1, max2, list);
    }

    public static int secondMax(int [] list) {
        int max1, max2;
        if(list[0] > list[1]) {
            max1 = list[0];
            max2 = list[1];
        } else {
            max1 = list[1];
            max2 = list[0];
        }
        int i = 2;
        return findSecondMax(i, max1, max2, list);
    }

}