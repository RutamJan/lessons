package io.jancorp.lesson6;

public class Library {
    //библиотека
    //  можно добавлять книги по 1й или несколько сразу
    //  можно брать книгу (указав автора)
    //  домой / для чтения в библиотеке
    private String name = "Библиотека";  // Всегда будет св-во библиотека
    private Book[] books = new Book[5];

    public String getName() {
        return name;
    }

    // добавление одной книги
    public void addBook(Book newBook)   {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                newBook.setInLibrary(true);
                books[i] = newBook;
                break;  //return - выход из метода
            }
        }
    }

    // добавление нескольких книг
    public void addBook(Book ...newBooks)   {   // три точки - переменное кол-во аргументов
        //newBooks - это массив
        //TODO реализация метода
    }

    public Book getHome(String title)   {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null &&
                    books[i].getTitle() == title &&
                    books[i].isForHome() &&
                    books[i].isInLibrary()
            )   {
                books[i].setInLibrary(false);
                return books[i];
            }
        }
        return null;
    }
}
