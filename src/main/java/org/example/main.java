package test;

//import файлов пакета
import org.example.InvalidDimensionException;
import org.example.InvalidHeightException;
import org.example.InvalidRadiusException;
import geometry2d.circle;
import geometry2d.rectangle;
import geometry3d.cylinder;

//В main создаём объекты классов Circle, Rectangle и Cylinder (правильные и неправильные).
public class main {
    public static void main(String[] args) {
        try {
            //создаем объекты и выводим их
            circle circle1 = new circle(5);
            rectangle rectangle1 = new rectangle(4, 6);
            cylinder cylinder1 = new cylinder(circle1, 10.56);
            System.out.println(circle1.toString());
            System.out.println(rectangle1.toString());
            System.out.println(cylinder1.toString());

            //создаем объекты для исключений и проверяем
            circle circle = new circle(-5);
            rectangle rectangle = new rectangle(-4, 6);
            cylinder cylinder = new cylinder(circle, -10);

        } catch (InvalidRadiusException e) {
            System.out.println(e.getMessage());
        } catch (InvalidDimensionException e) {
            System.out.println(e.getMessage());
        } catch (InvalidHeightException e) {
            System.out.println(e.getMessage());
        }
    }
}