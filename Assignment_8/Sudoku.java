package Assignment_8;

import java.util.*;

public class Sudoku {
    ArrayList<int[][]> potentialAL = new ArrayList<>(); // method 1 with stack and method 2 with queue
    Stack<int[][]> potentialST = new Stack<>(); // method 3
    LinkedList<int[][]> potentialLL = new LinkedList<>(); // method 4

    public Sudoku(int[][] initial, int option) {
        switch (option) {
            case 1:
                potentialAL.add(initial); // method 1, which uses ArrayList as a stack
                break;
            case 2:
                potentialAL.add(initial); // method 2, which uses ArrayList as a queue
                break;
            case 3:
                potentialST.push(initial); // method 3, which uses the class Stack to solve the problem
                break;
            case 4:
                potentialLL.add(initial); // method 4, which uses the class LinkedList as a queue.
                break;
        }
    }

    void display(int[][] table) {
        for (int[] row : table) {
            for (int cell : row) {
                System.out.print(" " + cell + " ");
            }
            System.out.println();
        }
    }

    boolean hasEmptyCells(int[][] table) {
        for (int[] row : table) {
            for (int cell : row) {
                if (cell == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    int[][] newSudoku(int[][] table) {
        int length = table.length;
        int[][] newArr = new int[length][table[0].length];
        for (int i = 0; i < length; i++) {
            System.arraycopy(table[i], 0, newArr[i], 0, table[i].length);
        }
        return newArr;
    }

    boolean isValidSudoku(int[][] table, int row, int column, int num) {
        for (int i = 0; i <= table.length - 1; i++) { // checks if there is a duplicate number in a row
            if (table[row][i] == num)
                return false;
        }

        for (int j = 0; j <= table.length - 1; j++) { // checks if there is a duplicate number in a column
            if (table[j][column] == num)
                return false;
        }

        int x = row - row % 3; // checks if there is a duplicate number in the sub-array
        int y = column - column % 3;

        for (int x1 = x; x1 < x + 3; x1++) {
            for (int y1 = y; y1 < y + 3; y1++) {
                if (table[x1][y1] == num)
                    return false;
            }
        }
        return true;
    }

    void stackALSol() { // array list as a stack method
        boolean flag = false;
        while (!potentialAL.isEmpty() && !flag) {
            int[][] top = potentialAL.remove(potentialAL.size() - 1);
            for (int[] pr : top) {
                System.out.println(Arrays.toString(pr));
            }
            System.out.println();

            outerLoop:
            while (hasEmptyCells(top)) {
                for (int i = 0; i <= top.length - 1; i++) {
                    for (int j = 0; j <= top.length - 1; j++) {
                        if (top[i][j] == 0) {
                            for (int num = 1; num <= 9; num++) {
                                if (isValidSudoku(top, i, j, num)) {
                                    int[][] newTop = newSudoku(top);
                                    newTop[i][j] = num;
                                    potentialAL.add(newTop);
                                }
                            }
                            break outerLoop; // exit the loop to process the next item in the stack
                        }
                    }
                }
            }
            if (!hasEmptyCells(top)) {
                display(top);
                flag = true;
            }
        }
    }
}