package lab24.Task1;

class ConcreteFactory implements ComplexAbstractFactory {

    @Override
    public Complex createComplex() {
        return new Complex(0, 0);  // создаем комплексное число 0 + 0i
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);  // создаем комплексное число с заданными значениями
    }
}