interface UserInterface {
    static final String databaseTableName = "users";

    String getFirstName();

    String getLastName();

    void setFirstName(String firstName);

    void setLastName(String lastName);

    String getLogin();

    void setLogin(String login);

    String getPassword();

    void setPassword(String password);

    boolean update(
            String firstName,
            String lastName,
            String email
    );

    default String getSomething()
    {
        return "default something";
    }

    static void logStatic(String msg)
    {
        System.out.println(msg);
    }
}
