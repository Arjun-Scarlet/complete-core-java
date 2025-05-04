package e_oopsConcepts.DesignPattern.Singleton;

class MovieHall {
    private int seats = 150;
    private static MovieHall m = null;
    private MovieHall(){}

    public void bookTicket(int n){
        if(n<=seats){
            seats-=n;
            System.out.println(n+" seats are booked!");
        }
        else if(n>seats && seats!=0) System.out.println("Only "+seats+" is availabe!");
        else System.out.println("Sorry all seats are booked!");
    }
    public static MovieHall getInstance(){
        if(m==null)
        m = new MovieHall();
        return m;
    }
}
