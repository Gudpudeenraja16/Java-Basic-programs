public class Program10 {
    int rows, cols;
    int[][] data;

    // Inner class for matrix operations
    public class MatrixOperations {
        // Method to add two matrices
        public Program10 add(Program10 other) {
            Program10 result = new Program10();
            result.rows = rows;
            result.cols = cols;
            result.data = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result.data[i][j] = data[i][j] + other.data[i][j];
                }
            }
            return result;
        }

        // Method to multiply two matrices
        public Program10 multiply(Program10 other) {
            Program10 result = new Program10();
            result.rows = rows;
            result.cols = other.cols;
            result.data = new int[rows][other.cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < other.cols; j++) {
                    for (int k = 0; k < cols; k++) {
                        result.data[i][j] += data[i][k] * other.data[k][j];
                    }
                }
            }
            return result;
        }

        // Method to copy one matrix to another
        public void copy(Program10 other) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    other.data[i][j] = data[i][j];
                }
            }
        }
    }

    // Method to print matrix
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Program10 m1 = new Program10();
        m1.rows = 2;
        m1.cols = 2;
        m1.data = new int[][]{{1, 2}, {3, 4}};

        Program10 m2 = new Program10();
        m2.rows = 2;
        m2.cols = 2;
        m2.data = new int[][]{{5, 6}, {7, 8}};

        MatrixOperations operations = m1.new MatrixOperations();

        System.out.println("Matrix 1:");
        m1.printMatrix();

        System.out.println("Matrix 2:");
        m2.printMatrix();

        Program10 sum = operations.add(m2);
        System.out.println("Sum:");
        sum.printMatrix();

        Program10 product = operations.multiply(m2);
        System.out.println("Product:");
        product.printMatrix();

        Program10 copy = new Program10();
        copy.rows = 2;
        copy.cols = 2;
        copy.data = new int[2][2];
        operations.copy(copy);
        System.out.println("Copy of Matrix 1:");
        copy.printMatrix();
    }
}