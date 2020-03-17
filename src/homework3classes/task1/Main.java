package homework3classes.task1;

public class Main {
//    Создать фигуры: Circle, Rectangle, Triangle, у которых должны быть координаты.
//    Все фигуры должны иметь методы, которые возвращают площадь и периметр
//            (для окружности - длина окружности).
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(6);
        float per1 = circle1.perimeter();
        System.out.println(per1);
        float sur1 = circle1.surface();
        System.out.println(sur1);

        Rectangle rec1 = new Rectangle();
        rec1.setA(4);
        rec1.setB(7);
        int per2 = rec1.perimeter();
        int sur2 = rec1.surface();
        System.out.println(per2 + ";  " + sur2);

        Triangle tri1 = new Triangle();
        tri1.setA(4);
        tri1.setB(6);
        tri1.setC(5);
        int per3 = tri1.perimeter();
        float sur3 = tri1.surface();
        System.out.println(per3 + ";  " + sur3);

    }
}
