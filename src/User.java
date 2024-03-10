public class User extends AbstractUser {

    public User() {

    }

    public User(String login) {
        this.login = login;
    }
}
