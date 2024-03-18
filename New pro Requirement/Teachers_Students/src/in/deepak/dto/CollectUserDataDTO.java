package in.deepak.dto;

public class CollectUserDataDTO {
    public String fname() {
        return fname;
    }

    public CollectUserDataDTO setFname(String fname) {
        this.fname = fname;
        return this;
    }

    public String lname() {
        return lname;
    }

    public CollectUserDataDTO setLname(String lname) {
        this.lname = lname;
        return this;
    }

    public String email() {
        return email;
    }

    public CollectUserDataDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String pwd() {
        return pwd;
    }

    public CollectUserDataDTO setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public String gender() {
        return gender;
    }

    public CollectUserDataDTO setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String role() {
        return role;
    }

    public CollectUserDataDTO setRole(String role) {
        this.role = role;
        return this;
    }

    private String fname ;
    private String lname ;
    private String email ;
    private String pwd ;
    private String gender ;
    private String role;

    public int uID() {
        return uID;
    }

    public CollectUserDataDTO setuID(int uID) {
        this.uID = uID;
        return this;
    }

    private int uID;


    @Override
    public String toString() {
        return  fname + "\t" +  lname + "\t" +   email + "\t"  +   pwd + "\t"   +gender + "\t"  +role;
    }
}
