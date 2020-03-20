package io.jancorp.lesson8.staticAndfinal;

// оператор final с классом
public final class CalcUtils {
    // final запрещает наследование от данного класса
    // значения свойств обьявлены как final, их нельзя изменить
//    final double PI = 3.14;
    // либо при определении, либо в конструкторе
//    final double PI;
    static final double PI; // обычно константы описываются как static n final

    // static не относятся к обьектом, принадлежат классу
    // можно вызывать без создания обьекта
    public static int summ(int a, int b)    {
//        someVoid();
//        из статических методов нельзя обращаться к нестатическим св-вам и методам
        return a + b;
    }
    //  статический блок, загружается в память 1 раз, при загрузке класса в память
    static  {
        PI = 3.14;
    }
    public CalcUtils(){
//        PI = 3.14;  // константы записываются в верхнем регистре
    }

    //    final методы нельзя переопределять, но можно наследовать
//    final arguments доступны только для чтения
    public final void someVoid(final int num, final SomeClass sc, final int[] arr)   {
        System.out.println(num);
//        num = 90
        System.out.println(sc);
        System.out.println(sc.name); // можно менять св-ва
        sc.name = "Новое имя";
//        sc = new SomeClass(); // так нельзя, будет другая ссылка
        arr[4] = 34;    // любой элемент доступен для изменения
    };
}

class SomeClass {
    String name;
}
//  наследование невозможно, тк final class
//  class Child extends CalcUtils{}  ERROR!!!
