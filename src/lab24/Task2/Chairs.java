package lab24.Task2;

class VictorianChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидишь на Викторианском стуле.");
    }
}

// Многофункциональный стул
class MultifunctionalChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидишь на Многофункциональном стуле.");
    }
}

// Магический стул
class MagicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидишь на Магическом стуле. Он исполнил твоё желание!");
    }
}