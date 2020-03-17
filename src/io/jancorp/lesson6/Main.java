package io.jancorp.lesson6;

public class Main {
    //библиотека
    //  можно добавлять книги по 1й или несколько сразу
    //  можно брать книгу (указав автора)
    //  домой / для чтения в библиотеке
    //книги:
    //  название
    //  количество стр
    //  автор (имя фамилия)
    //  можно ли забрать домой
    //  доступна ли для выдачи

    public static void main(String[] args) {
        Author author1 = new Author();  // вызов конструктора, обьект создан
        //author1.name = "Брюс";  // так нельзя после того как обьект стал private
        author1.setName("Брюс");
        author1.setSurname("Эккель");

        Author author2 = new Author();
        author2.setName("Роберт");
        author2.setSurname("Мартин");
        System.out.println(author2.toString());

        System.out.println(author1.getName());
        String name = author2.getName();
        System.out.println(name);

        Book book1 = new Book("Философия Java");
        book1.setPageCount(1350);
        book1.setAuthor(author1);
        book1.setForHome(true);
        System.out.println(book1);

        Book book2 = new Book("Чистый код", 500);
        book2.setAuthor(author2);

        System.out.println(book2);

        String book1AuthorName = book1.getAuthor().getName() + " " + book1.getAuthor().getSurname();
        System.out.println(book1AuthorName);

        Book[] books = {book1,book2};
        //  фамилия автора в книге
        for (Book book: books) {
            System.out.println(book.getAuthor().getSurname());
        }
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getAuthor().getSurname());
        }


        Library library = new Library();
        library.addBook(book1, book2);
        library.addBook(book1);

    }
}
