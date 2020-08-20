package com.company;

public class Main {

    public static void main(String[] args) {
        // print times table from 1 to 10
//        x | 1   2   3   4   5   6   7   8   9   10
//        ------------------------------------------
//        1 | 1   2   3   4   5   6   7   8   9   10
//        2 | 2   4   6   8   10  12  14  16  18  20
//        3 | 3   6   9   12  15  18  21  24  27  30
//        4 | 4   8   12  16  20  24  28  32  36  40
        int sizeOfGrid = 10;
        for (int header=0; header<=sizeOfGrid; header++) {
            if (header == 0) {
                System.out.print("x\t|\t");
            } else {
                System.out.print(header + "\t");
            }
        }
        System.out.println("\n---------------------------------------------");
        for (int x=1; x<=sizeOfGrid; x++) {
            System.out.print(x + "\t|\t");
            for (int y=1; y<=sizeOfGrid; y++) {
                System.out.print(x*y + "\t");
            }
            System.out.print("\n");
        }
    }
}
