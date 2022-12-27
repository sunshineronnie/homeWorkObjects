package HWObjects;

public class All {
    public static void main(String[] args) {

        Author joanRowling = new Author("Joan", "Rowling");


        Book harryPotter = new Book("Harry Potter", 2000, joanRowling);

        harryPotter.setPublisherYear(2001);

        Author danBrown = new Author("Dan", "Brown");

        Book theDaVinciCode = new Book("The Da Vinci Code", 2003, danBrown);

        theDaVinciCode.setPublisherYear(2010);


        System.out.println(harryPotter);
        System.out.println(harryPotter.equals(theDaVinciCode));











    }






}
