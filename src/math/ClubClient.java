package math;

public class ClubClient extends Client {

    int discount;

    public ClubClient(String name, int amount, int discount) {
        super(name, amount);
        this.discount = discount;
    }



    @Override
    public String toString() {
        return super.toString() + " Discount: " + discount;
    }
}
