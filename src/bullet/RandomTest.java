package bullet;

import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Start input you number:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println();
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
