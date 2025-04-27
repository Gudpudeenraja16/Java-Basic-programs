class Matrix {
    private int[][] matrix;

    public Matrix(int size) {
        matrix = new int[size][size];
    }

    public void set(int row, int col, int value) {
        matrix[row][col] = value;
    }

    public void unset(int row, int col) {
        matrix[row][col] = 0;
    }

    public int get(int row, int col) {
        return matrix[row][col];
    }

    public void print() {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

public class Program16 {
    private Matrix board;
    private int size;

    public Program16(int size) {
        this.size = size;
        this.board = new Matrix(size);
    }

    public boolean solve() {
        return placeQueens(0);
    }

    private boolean placeQueens(int col) {
        if (col >= size) return true;
        for (int row = 0; row < size; row++) {
            if (isSafe(row, col)) {
                board.set(row, col, 1);
                if (placeQueens(col + 1)) return true;
                board.unset(row, col);
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < col; i++)
            if (board.get(row, i) == 1) return false;
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board.get(i, j) == 1) return false;
        for (int i = row, j = col; i < size && j >= 0; i++, j--)
            if (board.get(i, j) == 1) return false;
        return true;
    }

    public void printSolution() {
        board.print();
    }

    public static void main(String[] args) {
        Program16 queens = new Program16(10);
        if (queens.solve()) {
            queens.printSolution();
        } else {
            System.out.println("No solution exists");
        }
    }
}
