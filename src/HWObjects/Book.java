package HWObjects;

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


}

