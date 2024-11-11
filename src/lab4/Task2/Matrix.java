package lab4.Task2;

public class Matrix<T>{
    public T[][] matrix;
    public int rows;
    public int cols;

    public Matrix(T[][] matrix){
        this.matrix = matrix;
        this.cols = matrix[0].length;
        this.rows = matrix.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < rows; i++) {
            sb.append("[");
            for (int j = 0; j < cols; j++) {
                if (j == cols - 1) sb.append(this.matrix[i][j].toString());
                else sb.append(this.matrix[i][j].toString() + ", ");
            }
            if (i == rows - 1) sb.append("]");
            else sb.append("],\n ");
        }
        sb.append("]");
        return sb.toString();
    }
}
