package io.jancorp.lesson9;

import java.util.Objects;

public class Author implements Cloneable{
//    String name; // по дефолту внутри пакета
//    protected String name; // доступно внутри пакета и внутри дочерних классов
    private String name;
    private String surName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(surName, author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }

    @Override
    public Author clone() throws CloneNotSupportedException {
        return (Author) super.clone();
    }
}
