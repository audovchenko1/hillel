public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1@test.com");
        user1.setPassword("1234");
        System.out.println(user1.getLogin());
        System.out.println(user1.getPassword());

        User user2 = new User();
        user2.setLogin("user2@test.com");
        user2.setPassword("12345678");
        System.out.println(user2.getLogin());
        System.out.println(user2.getPassword());

        Admin admin = new Admin();
        admin.createUser("test@y.com");
        admin.createUser("test2@r.com");
        admin.createUser("tes3434@r.com");
        System.out.println(admin.getUsers());

        System.out.println(admin.findUser("test@y.com"));

        admin.removeUser("test2@r.com");
        System.out.println(admin.getUsers());
        System.out.println(admin.usersCount());

        Customer customer = new Customer("customer@r.com");
        customer.buySomething(25);
        customer.updateBalance(50);
        customer.checkBalance();

        user1.setFirstName("Adam");
        user1.setLastName("Smith");

        user2.setLastName("Damien");
        user2.setLastName("Smith");

        admin.setFirstName("Admin");
        admin.setLastName("Admin");

        customer.setFirstName("Kelvin");
        customer.setLastName("Klein");

        user1.update(
                "Damien",
                "Goldshtein",
                "dam_gold@google.com"
        );

        admin.update(
                "admin",
                "admin",
                "admin@admin.com"
        );


        UserInterface.logStatic(user1.getSomething());
        UserInterface.logStatic(customer.getSomething());
        UserInterface.logStatic(admin.getSomething());

        Customer.NestedBasket basket = customer.new NestedBasket(55.0);
        double totalSum = basket.getTotalSum();
        basket.checkout();
        customer.buySomething(totalSum);
    }

}