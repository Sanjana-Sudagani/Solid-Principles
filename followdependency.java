interface Products {
    void seeReviews();

    void getSample();
    public String getname();
}

class Books implements Products {
    String name;
    Books(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void seeReviews() {

    }


    public void getSample() {

    }
}

class DVDs implements Products {
    String name;
    DVDs(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void seeReviews() {

    }

    public void getSample() {

    }
}
class Shelves {

    Products product;

    void addProduct(Products product) {
        System.out.println("Adding "+product.getname()+" to the shelf");

    }

    void customizeShelf() {

    }
}


public class followdependency {
    public static void main(String[] args){
        Shelves s=new Shelves();
        Books b=new Books("Gone Girl");
        s.addProduct(b);
        DVDs d=new DVDs("Bird Box");
        s.addProduct(d);
    }
}