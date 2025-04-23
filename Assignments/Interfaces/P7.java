public class P7 {
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        b.sort(new int[] { 2, -1, 0, 9, 3 });

        SelectionSort s = new SelectionSort();
        s.sort(new int[] { 2, -1, 0, 9, 3 });
    }
}

interface Sortable {
    public void sort(int arr[]);
}

class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}

class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}