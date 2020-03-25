package io.jancorp.lesson9;

import java.util.Arrays;

public class ChildBook extends Book implements Cloneable{
    private String[] pics;

    public ChildBook(String[] pics) {   //При создании обьекта мы обязаны передать массив с конструкторами
        this.pics = pics;
    }

    public String[] getPics() {
        return pics;
    }

    public void setPics(String[] pics) {
        this.pics = pics;
    }

    @Override
    public String toString() {
        return "ChildBook{" +
                "pics=" + Arrays.toString(pics) +
                ", title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChildBook)) return false;
        if (!super.equals(o)) return false;
        ChildBook childBook = (ChildBook) o;
        return Arrays.equals(pics, childBook.pics);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(pics);
        return result;
    }

    @Override
    public ChildBook clone() throws CloneNotSupportedException {   // нужно поменять тип
//        ChildBook book =  (ChildBook) super.clone();   // в базовой реализации возврашает тип Object
//        book.setAuthor(author.clone());

        ChildBook book = new ChildBook(pics);   // здесь сами создаем алгоритм копирования
        book.setAuthor(author.clone());
        book.setTitle(title);
        book.setPageCount(pageCount);
        return book;
    }
}
