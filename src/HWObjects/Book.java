package HWObjects;

import java.util.Objects;

public class Book {

    private final String title;
    private  int publisherYear;
    private final Author author;



    public Book(String title, int publisherYear, Author author) {
        this.title = title;
        this.publisherYear = publisherYear;
        this.author = author;
    }

    public String getTitle() {
        return this.title;

    }

    public int getPublisherYear() {
        return this.publisherYear;
    }

    public Author getAuthor() {
        return this.author;

    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;


    }

    @Override
    public String toString() {
        return "Book: " +
                "title: '" + title + '\'' +
                ", publisherYear: " + publisherYear +
                ", author: " + author
                ;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherYear == book.publisherYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}

