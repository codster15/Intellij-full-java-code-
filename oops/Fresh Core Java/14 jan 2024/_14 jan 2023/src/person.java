

public class person {
// to generate setter getter select all the variable and press (alt + insert) list will apper --> to select all press swift + up-down key or mouse

    public int id() {
        return id;
    }

    public person setId(int id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public person setName(String name) {
        this.name = name;
        return this;
    }

    public String lname() {
        return lname;
    }

    public person setLname(String lname) {
        this.lname = lname;
        return this;
    }

    public long pno() {
        return pno;
    }

    public person setPno(long pno) {
        this.pno = pno;
        return this;
    }

    public String city() {
        return city;
    }

    public person setCity(String city) {
        this.city = city;
        return this;
    }

    public String country() {
        return country;
    }

    public person setCountry(String country) {
        this.country = country;
        return this;
    }

    private int id;
    private String name;
    private String lname;
    private long pno ;

    private String city;
    private String country;



}


