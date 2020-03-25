package io.jancorp.lesson9;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Object - общий первородный класс для всех классов
        Object obj = new Object();

        // методы класса Object
        // 1. toString() - возвращает строковое представление обьекта
        Author author = new Author();
        author.setName("Trisha");
        author.setSurName("McGraw");

        ChildBook book1 = new ChildBook(new String[] {"dog.jpg", "cat.jpg", "crab.jpg"});
        book1.setTitle("Generic children's book");
        book1.setPageCount(125);
        book1.setAuthor(author);

        String stringBook = book1.toString();   //  вернет хэш-функцию
        System.out.println(stringBook);

        // 2. equals(Object other) - для сравнения обьектов
        // 3. hashCode()    - возвращает hash code обьекта
        ChildBook book2 = new ChildBook(new String[] {"dog.jpg", "cat.jpg", "crab.jpg"});
        book2.setTitle("Generic children's book2");
        book2.setPageCount(125);
        book2.setAuthor(author);

        boolean equalsBooks = book1.equals(book2);      // false, разные ссылки на схожие обьекты
        System.out.println(equalsBooks);

        System.out.println(book1.hashCode());   // уникальное представление адреса в памяти
        // очень редко, но хэш код может совпадать у разных обьектов

        //4. clone() - для создания копии обьекта
//        ChildBook clonebook = book1;    // это не копия, а ссылка на тот же обьект
        ChildBook clonebook = book1.clone();
        // 1 вариант - использовать базовую реализацию
        // класс должен реализовывать интерфейс Cloneable
        // можем расширить модификатор доступа до public
        // затем поменять тип с Object на нужный public ChildBook clone()
        // и return (ChildBook) super.clone();
        // при клонировании вложенные обьекты не копируются

        // 2 вариант - не использовать базовую реализацию
        // не нужен Cloneable
        // необходимо написать свою реализацию по созданию
        // копии
        System.out.println(clonebook.clone());
    }
}
