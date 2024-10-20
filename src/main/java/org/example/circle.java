package geometry2d;
import org.example.InvalidRadiusException;
import org.example.figure;
import java.util.logging.*;

//класс Circle описывает круг
public class circle implements figure {
    private double radius; //радиус круга
    private static final Logger logger = Logger.getLogger(circle.class.getName());
    //метод, создающий запись логера с текущим месяцем

    static {
        try {
            // Создаем обработчик файла для логирования
            FileHandler fileHandler = new FileHandler("figures.log");
            fileHandler.setFormatter(new XMLFormatter()); // Логи в формате XML
            logger.addHandler(fileHandler);
            logger.setLevel(Level.SEVERE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //конструктор создает новый круг с заданным радиусом
    public circle(double radius) throws InvalidRadiusException{
        if (radius < 0) {
            logger.severe("\nAttempt to create a circle with a negative radius: " + radius);
            throw new InvalidRadiusException("The radius cannot be negative");
        }
        this.radius = radius;
        logger.severe("\nThe circle is created with a radius: " + radius);
    }

    //метод, вычисляющий площадь круга
    @Override // метод переопределения
    public double area() {
        return Math.PI * radius * radius;
    }

    //метод, вычисляющий периметр круга.
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    //метод, возвращающий строковое представление круга
    @Override
    public String toString() {
        return "Circle {" + "radius=" + radius + ", area=" + area() + ", perimeter=" + perimeter() + '}';
    }
}