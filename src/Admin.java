import java.util.HashMap;

public class Admin extends AbstractUser {
    private HashMap<String, User> users;

    public Admin(){
        users = new HashMap<>();
    }

    public User createUser(String email)
    {
        User user = new User(email);
        this.users.put(email, user);
        return user;
    }

    public void removeUser(String email)
    {
        this.users.remove(email);
    }

    public HashMap<String, User> getUsers()
    {
        return this.users;
    }

    public User findUser(String email){
        return this.users.get(email);
    }

    int usersCount()
    {
        return this.users.size();
    }

    @Override
    public boolean update(String firstName, String lastName, String email) {
        log("admin type of user can not be updated");
        return false;
    }
}
