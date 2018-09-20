package insertion.sort;

public class InsertionSort {
    static int[] list = {5, 12, 9, 3, 2, 15, 11, 4, 32, 17, 18};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("List after sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
