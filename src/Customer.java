public final class Customer extends User {
    private double balance;

    public class NestedBasket {

        protected double totalSum;

        public NestedBasket(double totalSum)
        {
            this.totalSum = totalSum;
        }

        public void checkout()
        {
            System.out.println("Yeee-Haaa we buy something for " + totalSum + " USD!");
        }

        public double getTotalSum() {
            return totalSum;
        }
    }

    public Customer(String login) {
        super(login);
        balance = 150.0;
        log();
    }

    public double getBalance() {
        return balance;
    }

    public final void buySomething(double price) {
        balance -= price;
    }

    public final void updateBalance(double money) {
        balance += money;
    }

    public final void checkBalance() {
        this.log("My balance is " + balance);
    }

    @Override
    protected void log(String message) {
        System.out.println("Customer log info:");
        super.log(message);
    }

    private void log() {
        System.out.println("Customer overloaded log: " + this.getLogin());
    }

    @Override
    public String getSomething() {
        return "Customer something";
    }
}
