package Businessobjects;

public class User {
    private String email;
    private String password;

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public User() {
        this.email = "rrtest@mailinator.com";
        this.password = "654321";
    }
}
