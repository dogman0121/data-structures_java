package lab4.Task2;

public class IntMatrix extends Matrix<Integer> {
    public IntMatrix(Integer[][] m) {
        super(m);
    }

    public void add(IntMatrix other){
        if (this.cols != other.cols || rows != other.rows)
            return;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
    }

    public void multiply(int k){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.matrix[i][j] = this.matrix[i][j] * k;
            }
        }
    }
}
