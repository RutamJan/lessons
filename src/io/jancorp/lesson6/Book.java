package io.jancorp.lesson6;

public class Book {
    //  название
    //  количество стр
    //  автор (имя фамилия)
    //  можно ли забрать домой
    //  доступна ли для выдачи
    private String title;
    private int pageCount;
    private Author author;
    private boolean isForHome;  // boolean обычно начинается на is
    private boolean isInLibrary;
    //  обьекты создаются со значениями по умолчанию/ ссылочные - null, int - 0, boolean - false

    // конструктор
    // свойства в момент создания обьекта
    // если есть хотя бы 1 конструктор с пар-ми, то создание обьекта без параметров будет недоступно
    public Book(){}; // с этим конструктором можно без параметров, и здесь можно производить действия

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean isForHome() {
        return isForHome;
    }

    public void setForHome(boolean forHome) {
        isForHome = forHome;
    }

    public boolean isInLibrary() {
        return isInLibrary;
    }

    public void setInLibrary(boolean inLibrary) {
        isInLibrary = inLibrary;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author +
                ", isForHome=" + isForHome +
                ", isInLibrary=" + isInLibrary +
                '}';
    }
}
