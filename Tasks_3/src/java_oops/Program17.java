import java.util.Scanner;

public class Program17 {
    private int[][] data;
    private int rows;
    private int cols;

    public Program17(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    public void unsetValue(int row, int col) {
        data[row][col] = 0;
    }

    public int getValue(int row, int col) {
        return data[row][col];
    }

    public static void main(String[] args) {
        Program17 matrix = new Program17(10, 10); // 10x10 matrix for theater seats
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter row number:");
        int row = Sc.nextInt();

        System.out.println("Enter seat number:");
        int seat = Sc.nextInt();

        System.out.println("Enter number of seats needed:");
        int numSeats = Sc.nextInt();

        allocateSeats(matrix, row, seat, numSeats);

        printMatrix(matrix);
    }

    public static void allocateSeats(Program17 matrix, int row, int seat, int numSeats) {

        for (int i = seat; i < seat + numSeats; i++) {
            matrix.setValue(row, i, 1); 
        }
    }

    public static void printMatrix(Program17 matrix) {
        
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                System.out.print(matrix.getValue(i, j) + " ");
            }
            System.out.println();
        }
    }
}