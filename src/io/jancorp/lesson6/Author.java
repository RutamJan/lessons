package io.jancorp.lesson6;

public class Author {
    //  свойства
    private String name;    // private - модификатор доступа, только внутри класса
                            // делается в основном для проверок
    private String surname;

    //  методы
    public void setName(String name) {      // Ctrl + Enter - Setter method
        // void - метод ничего не возвращает
        //  проверка - длина от 2х символов
        if (name.length() >= 2) {   /*&& !"".equals(name), name != null - проверка на пустую*/
            // someVar.equals("java") - так лучше не делать, потому что someVar может быть null
            // "java".equals(someVar) - так 100% не свалится в exception
            this.name = name;                   // присваивем значение свойству
            //  this - ссылка на текущий обьект
        }
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //  метод getter - возвращает значение св-ва
    public String getName() {   // String - тип возвращаемого значения
        return name;
        //  после return код не выполняется
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
