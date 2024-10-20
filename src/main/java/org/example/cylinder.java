package geometry3d;
import org.example.figure;
import org.example.InvalidHeightException;
import java.util.logging.*;
//класс Cylinder описывает цилиндр
public class cylinder {
    private figure base; //Поле base хранит основание цилиндра.
    private double height; //Поле height хранит высоту цилиндра.
    private static final Logger logger = Logger.getLogger(cylinder.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("cylinder.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.FINEST);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //конструктор создает новый цилиндр с заданным основанием и высотой

    public cylinder(figure base, double height) throws InvalidHeightException {
        if (height < 0) {
            logger.finest("\nAn attempt to create a cylinder with a negative height: " + height);
            throw new InvalidHeightException("The height cannot be negative");
        }
        this.base = base;
        this.height = height;
    }

    //метод, вычисляющий объем цилиндра
    public double volume() {
        return base.area() * height;
    }

    //метод, возвращающий строковое представление цилиндра
    @Override
    public String toString() {
        return "Cylinder {" + "base=" + base + ", height=" + height + ", volume=" + volume() + '}';
    }
}