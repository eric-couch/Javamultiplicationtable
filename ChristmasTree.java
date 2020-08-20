package com.company;

public class ChristmasTree {
    public static void main(String[] args) {
        // create tree
        //      *               5 spaces 1 *
        //     ***              4 spaces 3 *
        //    *****             3 spaces 5 *
        //   *******            2 spaces 7 *
        //  *********           1 space  9 *
        //  tree 5 tall, requires 5 system.out.print lines
        int treeHeight = 5;
        for (int line=0; line<treeHeight; line++) {  // 1 to 5 -- i * 2 - 1 = 1,3,5,7,9
            for ( int spaces=0; spaces<treeHeight - line;spaces++) {  // to go from 5 to 1 in our loop subtract 5 - i, 5-0=5, 5-1=4, 5-2=3, 5-3=2, 5-4=1, 5-5=0
                System.out.print(" ");
            }
            for (int asterisk=0; asterisk<line*2-1; asterisk++){    // asterisks
                System.out.print("*");
            }
            System.out.println();
        }
    }
}