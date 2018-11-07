package vn.codegym.QuyenLeSy;

import static vn.codegym.QuyenLeSy.BubbleSort.bubbleSort;
import static vn.codegym.QuyenLeSy.BubbleSort.list;

public class Main {
    public static void main(String[] args) {
            bubbleSort(list);
            for (int i = 0; i < list.length; i++)
                System.out.print(list[i] + " ");
    }
}
