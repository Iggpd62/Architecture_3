// 4) Переписать код в соответствии с Liskov Substitution Principle:

public abstract class Shape {
    public abstract int area();
}

public class Rectangle extends Shape {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}

public class Square extends Shape {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return this.side * this.side;
    }
}
// Класс `Rectangle` остается неизменным, а класс `Square` переопределяет метод `area()` для расчета площади квадрата, что не нарушает принцип подстановки Лисков.
