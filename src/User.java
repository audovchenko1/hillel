public class User extends AbstractUser implements UserInterface {

    public User() {

    }

    public User(String login) {
        this.login = login;
    }

    @Override
    public boolean update(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = email;

        log("update user data in table " + databaseTableName);

        return true;
    }

    @Override
    public String getSomething() {
        return "User something";
    }
}
