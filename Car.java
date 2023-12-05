// 5) Переписать код в соответствии с Dependency Inversion Principle:

public interface Engine {
    void start();
}

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

public class PetrolEngine implements Engine {
    public void start() {
        // Код для запуска бензинового двигателя
    }
}

public class DieselEngine implements Engine {
    public void start() {
        // Код для запуска дизельного двигателя
    }
}
// Теперь класс `Car` зависит от абстракции `Engine`, а не от конкретных реализаций `PetrolEngine` и `DieselEngine`, что позволяет заменять тип двигателя.
