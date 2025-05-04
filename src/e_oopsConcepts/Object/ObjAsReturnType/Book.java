package e_oopsConcepts.Object.ObjAsReturnType;

class Book {
    String title;
    String author;
    double price;
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price+"Rs");
        System.out.println("-------------");
    }
}
