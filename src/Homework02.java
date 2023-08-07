public class Homework02 {


    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Исходный массив:");
        printArray(arr);

        HeapSorter heapSort = new HeapSorter();
        heapSort.sort(arr);

        System.out.println("Отсортированный массив:");
        printArray(arr);
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

