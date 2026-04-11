package hw3;

public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public  int pages;


    public Book(String title, int releaseYear, Author author, int pages){
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig(Book book){
        if(book.pages > 500){
           return true;
       }
       else {
           return false;
       }
    }

    public  int estimePrice(Book book){
        int pricePage;
        pricePage = book.pages * 3;
        //умножение на квадратный корень рейтинга писателя
        double sqrt = Math.sqrt(pricePage);
        int resultSqrt = (int)Math.floor(sqrt * author.reting);

        return resultSqrt;

    }

    public boolean matches(Book book,Author author,String word){

        if(
        book.title.contains(word) || author.name.contains(word) || author.surname.contains(word) == true){
            return true;
        }else{
        return false;
        }
    }


    public String toString(){
        return "[ " + title +", "+ releaseYear +"г."+ " ] - " + author + "  " + pages + " стр. ";
    }

}
