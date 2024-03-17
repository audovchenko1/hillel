abstract public class AbstractUser implements UserInterface {

    protected String login;
    protected String password;

    protected String firstName;

    protected String lastName;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        if(!this.validatePassword(password)){
            return;
        }
        this.password = password;
    }

    private boolean validatePassword(String password)
    {
        if(password.length() < 6){
            this.log("password must be six or more");
            return false;
        }

        return true;
    }

    protected void log(String message)
    {
        System.out.println(message);
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
