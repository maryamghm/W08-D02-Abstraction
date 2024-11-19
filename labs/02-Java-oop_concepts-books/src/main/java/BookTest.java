public class BookTest {

  public static void main(String[] args) {
    //TODO initialize authors below!
    Author author1 = new Author("Gabriel", "gabriel@email.com", Gender.MALE);
    Author author2 = new Author("Lara", "joan@email.com", Gender.FEMALE);
    Author author3 = new Author("Joan", "joan@email.com", Gender.NON_BINARY);

    System.out.println(author1);
    System.out.println(author2);
    System.out.println(author3); // Test toString()
    author3.setEmail("changedemail@email.com"); // Test setter
    System.out.println("name is: " + author3.getName()); // Test getter
    System.out.println("email is: " + author3.getEmail()); // Test getter
    System.out.println("gender is: " + author3.getGender()); // Test getter
    System.out.println(
        "Author after changed email: " + author3); // pay attention! author3 now has a changed email

    System.out.println("========================");

    //TODO initialize books below!
    Book book1 = new Book("Java Book", author2, 18.79, 4);
    Book book2 = new Book("Kid's Book", author1, 9.99);
    Book book3 = new Book("How to Construct a New Society", author3, 13.5, 20);

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);

    // Test Getters and Setters
    book3.setPrice(29.95);
    book3.setQty(28);
    System.out.println("name is: " + book3.getName());
    System.out.println("price is: " + book3.getPrice());
    System.out.println("qty is: " + book3.getQty());
    System.out.println("Author is: " + book3.getAuthor()); // Author's toString()
    System.out.println("Author's name is: " + book3.getAuthorName());
    System.out.println("Author's email is: " +  book3.getAuthorEmail());
    System.out.println("Book after changed price and quantity: " + book3);
  }
}
