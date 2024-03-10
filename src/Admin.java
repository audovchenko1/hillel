import java.util.HashMap;

public class Admin {
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
}
