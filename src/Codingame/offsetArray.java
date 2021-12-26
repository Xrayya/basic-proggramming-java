package Codingame;
// Completed

import java.util.*;

class offsetArray {
    static Scanner in = new Scanner(System.in);
    static int n, indexes[][], elements[][];
    static String input[];
    static String arrName[];

    public static void main(String args[]) {
        input();
        process();
        int res = execute(in.next());
        System.out.println(res);
    }

    public static void input() {
        n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }

        input = new String[n];
        for (int i = 0; i < input.length; i++) {
            input[i] = in.nextLine();
        }
    }

    public static void process() {
        getArrName();
        getElements();
        getIndex();
    }

    public static int execute(String args) {
        String name, indexSection;
        int index, arrIndex, elementIndex;
        // System.out.println("cp");

        name = args.substring(0, args.indexOf('['));
        // System.out.println(name);
        arrIndex = findIndex(name, arrName);
        // System.out.println(arrIndex);
        indexSection = args.substring(args.indexOf('[') + 1, args.length() - 1);
        // System.out.println(indexSection);
        index = indexSection.contains("[") ? execute(indexSection) : Integer.parseInt(indexSection);
        // System.out.println(index);
        elementIndex = findIndex(index, indexes[arrIndex]);
        // System.out.println(elementIndex);

        return elements[arrIndex][elementIndex];
    }

    public static void getArrName() {
        arrName = new String[n];
        for (int i = 0; i < arrName.length; i++) {
            arrName[i] = input[i].substring(0, input[i].indexOf('['));
        }
    }

    public static void getElements() {
        elements = new int[n][];
        String el, els[];

        for (int i = 0; i < elements.length; i++) {
            el = input[i].substring(input[i].indexOf('=') + 2);
            els = el.strip().split(" ");
            elements[i] = new int[els.length];
            for (int j = 0; j < els.length; j++) {
                elements[i][j] = Integer.parseInt(els[j]);
            }
        }
    }

    public static void getIndex() {
        indexes = new int[n][];
        int firstIndex;

        for (int i = 0; i < indexes.length; i++) {
            firstIndex = Integer.parseInt(input[i].substring(input[i].indexOf('[') + 1, input[i].indexOf('.')));

            indexes[i] = new int[elements[i].length];
            for (int j = 0, k = firstIndex; j < indexes[i].length; j++, k++) {
                indexes[i][j] = k;
            }
        }
    }

    public static int findIndex(String c, String[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i].equals(c)) {
                break;
            }
            i++;
        }

        return i;
    }

    public static int findIndex(int e, int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (e == arr[i]) {
                break;
            }
            i++;
        }

        return i;
    }
}
