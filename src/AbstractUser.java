abstract public class AbstractUser {

    protected String login;
    protected String password;

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
}
