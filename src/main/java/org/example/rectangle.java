package geometry2d;
import org.example.InvalidDimensionException;
import java.util.logging.*;
import org.example.figure;

//класс Rectangle описывает прямоугольник
public class rectangle implements figure {
    private double width; //ширина прямоугольника
    private double height; //высота прямоугольника
    private static final Logger logger = Logger.getLogger(rectangle.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("figures.log");
            fileHandler.setFormatter(new XMLFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.INFO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //конструктор Rectangle создает новый прямоугольник

    public rectangle(double width, double height) throws InvalidDimensionException{
        if (width < 0 || height < 0) {
            throw new InvalidDimensionException("The dimensions cannot be negative");
        }
        this.width = width;
        this.height = height;
        logger.info("\nThe triangle has been created: width=" + width + ", height=" + height);
    }

    //метод, вычисляющий площадь прямоугольника
    @Override
    public double area() {
        return width * height;
    }

    //метод, вычисляющий периметр прямоугольника
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    //метод, возвращающий строковое представление прямоугольника
    @Override
    public String toString() {
        return "Rectangle {" + "width=" + width + ", height=" + height + ", area=" + area() + ", perimeter=" + perimeter() + '}';
    }
}