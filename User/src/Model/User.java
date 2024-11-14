package Model;

public class User {

    private int id;
    private String user;
    private String email;
    private String password;
    

    public User() {
    }
    
    public User(int id, String user, String email, String password) {
        this.id = id;
        this.user = user;
        this.email = email;
        this.password = password;
    }

    public int getId() {
       return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", user=" + user + ", email=" + email + ", password=" + password + "]";
    }

}
