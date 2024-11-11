package lab7.Task1;

class MathFunc implements MathCalculable{
    public double pow(double x, double y){
        return Math.pow(x, y);
    }

    public double mod(double x, double y){
        return Math.sqrt(this.pow(x, 2) + this.pow(y, 2));
    }

    public double PI(){
        return Math.PI;
    }
}
