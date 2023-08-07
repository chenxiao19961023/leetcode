package May;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int[][] ints = matrixReshape(nums, r, c);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 重塑矩阵
     * 你一个由二维数组 mat 表示的m x n 矩阵，以及两个正整数 r 和 c ，分别表示想要的重构的矩阵的行数和列数。
     * 重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。
     * 如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
     *
     * @param mat
     * @param r
     * @param c
     * @return
     */
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int m = 0;
        int n = 0;
        int[][] num = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                num[m][n++] = mat[i][j];
                if (n == c) {
                    m++;
                    n = 0;
                }
            }
        }
        return num;
    }

    public static int[][] matrixReshape1(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[][] num = new int[r][c];
        int m = mat[0].length;
        for (int i = 0; i < r * c; i++) {
            num[i / c][i % c] = mat[i / m][i % m];
        }
        return num;
    }


}
