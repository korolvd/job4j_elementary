package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 1; j < board[row].length; j++) {
            if (board[row][0] != board[row][j]) {
                result = false;
                break;
            }

        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int j = 1; j < board.length; j++) {
            if (board[0][column] != board[j][column]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
