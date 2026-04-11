import hw.hw3.Author;
import hw.hw3.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Гоголь", 8);
        Book book1 = new Book("Мертвые души", 1842, author1, 384);
        System.out.println(author1);
        System.out.println(book1);


        //вычисление является ли книга большой
        System.out.println(book1.isBig(book1));
        //вычисление стоимости книги,3р за страницу
        System.out.println("Стоимость данной книги: " + book1.estimePrice(book1) + " руб.");
        //Поиск слова в названии книги,в имени и фамилии писателя
        System.out.println(book1.matches(book1,author1,"Гоголь"));
    }

}

