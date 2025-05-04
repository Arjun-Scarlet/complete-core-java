package e_oopsConcepts.DesignPattern.Singleton;

public class MovieTicketBook {
    public static void main(String[] args) {
        MovieHall m1 = MovieHall.getInstance();
        m1.bookTicket(80);

        MovieHall m2 = MovieHall.getInstance();
        m2.bookTicket(70);

        MovieHall m3 = MovieHall.getInstance();
        m3.bookTicket(30);
    }
}
