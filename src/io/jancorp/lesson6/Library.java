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
        int count = 0;
        for (Book b:books) {
            if (b == null)  {
                count++;
            }
        }
        if (count < newBooks.length)    {
            return;
        }   else    {
            for (int i = 0; i < newBooks.length; i++) {
                for (int j = 0; j < books.length; j++) {
                    if (books[j] == null) {
                        books[j].setInLibrary(true);
                        books[j] = newBooks[i];
                        break;  //return - выход из метода
                    }
                }
            }
        }
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
