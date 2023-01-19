package entity;

public class AdminEntity {
    private String name;
    private String username;
    private String password;

    public AdminEntity(String username, String password,String name) {
        this.username = username;
        this.password = password;
        this.name=name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
