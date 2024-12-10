package lab24.Task2;

class VictorianChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

// Конкретная фабрика для создания Многофункционального стула
class MultifunctionalChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}

// Конкретная фабрика для создания Магического стула
class MagicChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}