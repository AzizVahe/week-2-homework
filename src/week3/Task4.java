package week3;

public class Task4 {
    public static int search(int[] array, int key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4, 9};
        System.out.println(search(arr,9));
    }
}
