package math;

public class Client {

    String name;
    int amount;

    public Client(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void printSomething(){
        System.out.println("something");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Amount: " + amount + ".";
    }
}
