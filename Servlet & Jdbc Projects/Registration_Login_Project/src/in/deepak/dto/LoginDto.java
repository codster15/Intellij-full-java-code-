package in.deepak.dto;

public class LoginDto {
    public String email() {
        return email;
    }

    public LoginDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String password() {
        return password;
    }

    public LoginDto setPassword(String password) {
        this.password = password;
        return this;
    }

    private String email;
    private String password;

}

