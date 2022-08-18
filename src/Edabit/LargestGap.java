package Edabit;

public class LargestGap {
    public static void main(String[] args) {
        System.out.println(largestGap(new int[] { 9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5 }));

        System.out.println(largestGap(new int[] { 14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7 }));

        System.out.println(largestGap(new int[] { 13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9 }));

        System.out.println(largestGap(new int[] { 21, 28, 0, 5, 11, 6, 17, 25, 2, 19 }));

        System.out.println(largestGap(new int[] { 26, 17, 4, 25, 29, 26, 8, 30, 4, 20, 2, 7, 29, 7, 20, 30, 23, 5 }));

        System.out.println(largestGap(new int[] { 12, 13, 17, 20, 23, 25, 29, 26, 12, 7, 9 }));
    }

    public static int largestGap(int[] arr) {
        bubbleSort(arr);

        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            int count = arr[i] - arr[i - 1];
            if (count > res) {
                res = count;
            }
        }

        return res;
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
