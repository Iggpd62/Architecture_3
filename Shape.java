// 3) Переписать код в соответствии с Interface Segregation Principle:

public interface TwoDimensionalShape {
    double area();
}

public interface ThreeDimensionalShape {
    double area();
    double volume();
}

public class Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

public class Cube implements ThreeDimensionalShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}

// Теперь `Shape` разделен на два интерфейса `TwoDimensionalShape` и `ThreeDimensionalShape`, каждый из которых содержит только методы, 
// соответствующие двумерным и трехмерным фигурам соответственно. Класс `Circle` реализует только интерфейс `TwoDimensionalShape`.
// Класс `Cube` реализует оба интерфейса `TwoDimensionalShape` и `ThreeDimensionalShape`.