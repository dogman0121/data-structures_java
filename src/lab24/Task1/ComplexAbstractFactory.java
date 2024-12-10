package lab24.Task1;

interface ComplexAbstractFactory {
    Complex createComplex();  // метод для создания комплексного числа
    Complex createComplex(int real, int image);  // метод для создания комплексного числа с параметрами
}
