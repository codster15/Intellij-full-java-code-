package jdbcTesting;

public class employee {
    int id ;
    String name ;
    int salary;

    public employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "emp id = "+ id + " , name = " + name + " , rank  = " + salary  ;
    }

}
