package text;

public class PblWork {
    public static void main(String[] args) {
        Customer customer = new Customer("linzong");
        customer.addRental(new Rental(new Movie("��",Movie.REGULAR),2));
        customer.addRental(new Rental(new Movie("��",Movie.NEW_RELEASE),1));
        customer.addRental(new Rental(new Movie("־",Movie.CHILDRENS),1));
        System.out.println(customer.statement());
    }
}