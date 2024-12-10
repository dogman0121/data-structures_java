package lab24.Task1;

class Complex {
    private int real;
    private int image;

    // Конструктор для инициализации комплексного числа
    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return real + " + " + image + "i";
    }
}