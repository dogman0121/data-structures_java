package lab24.Task2;

public class ClientTester {
    public static void main(String[] args) {
        // Создаем фабрики
        ChairAbstractFactory victorianFactory = new VictorianChairFactory();
        ChairAbstractFactory multifunctionalFactory = new MultifunctionalChairFactory();
        ChairAbstractFactory magicFactory = new MagicChairFactory();

        // Создаем стулья с помощью фабрик
        Chair victorianChair = victorianFactory.createChair();
        Chair multifunctionalChair = multifunctionalFactory.createChair();
        Chair magicChair = magicFactory.createChair();

        // Создаем клиента
        Client client = new Client();

        // Клиент садится на разные стулья
        System.out.println("Клиент садится на различные стулья:");
        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }
}
