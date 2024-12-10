package lab24.Task2;

class Client {
    private Chair chair;

    // Метод для сидения на стуле
    public void sit(Chair chair) {
        this.chair = chair;
        chair.sit();  // вызываем метод sit для стула
    }
}