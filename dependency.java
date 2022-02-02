//Low level module
class Book {
    String name;
    void seeReviews() {

    }

    void readSample() {

    }
}

//High level module
class Shelf {

    Book book;
    void addBook(Book book) {
        System.out.println("Adding "+book.name+" to shelf");

    }

    DVD dvd;
    void addDVD(DVD dvd) {
        System.out.println("Adding "+dvd.dname+" to shelf");

    }

    void customizeShelf() {

    }
}

//Low level module
class DVD {
    String dname;
    void seeReviews() {

    }

    void watchSample() {

    }
}

public class dependency {
    public static void main(String[] args){
        Book b= new Book();
        b.name="Gone Girl";
        DVD d=new DVD();
        d.dname="Bird Box";
        Shelf sh=new Shelf();
        sh.addBook(b);
        sh.addDVD(d);

    }

}