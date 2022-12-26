package HWObjects;

public class All {
    public static void main(String[] args) {

        Author JoanRowling = new Author("Joan", "Rowling");


        Book HarryPotter = new Book("Harry Potter", 2000, JoanRowling);

        HarryPotter.setPublisherYear(2001);

        Author DanBrown = new Author("Dan", "Brown");

        Book TheDaVinciCode = new Book("The Da Vinci Code", 2003, DanBrown);

        TheDaVinciCode.setPublisherYear(2010);












    }






}
