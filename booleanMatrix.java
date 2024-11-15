package DSAPractice;

public class booleanMatrix {

    public static void modifyMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        boolean firstRowHasOne = false, firstColHasOne = false;
        for (int j = 0; j < cols; j++) {
            if (mat[0][j] == 1) {
                firstRowHasOne = true;
                break;
            }
        }

        for (int i = 0; i < rows; i++) {
            if (mat[i][0] == 1) {
                firstColHasOne = true;
                break;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[i][j] == 1) {
                    mat[i][0] = 1;
                    mat[0][j] = 1;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[i][0] == 1 || mat[0][j] == 1) {
                    mat[i][j] = 1;
                }
            }
        }

        if (firstRowHasOne) {
            for (int j = 0; j < cols; j++) {
                mat[0][j] = 1;
            }
        }

        if (firstColHasOne) {
            for (int i = 0; i < rows; i++) {
                mat[i][0] = 1;
            }
        }
    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 0},
                {0, 0}
        };
        modifyMatrix(mat1);
        printMatrix(mat1);

        int[][] mat2 = {
                {0, 0, 0},
                {0, 0, 1}
        };
        modifyMatrix(mat2);
        printMatrix(mat2);

        int[][] mat3 = {
                {1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };
        modifyMatrix(mat3);
        printMatrix(mat3);
    }
}

