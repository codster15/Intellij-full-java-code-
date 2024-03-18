package jdbcTesting;

public class Studentclass implements Comparable<Studentclass> {
    int id ;
    String name ;
    int rank;

    public Studentclass(int id, String name, int rank){
        this.id = id;
        this.name = name;
        this.rank = rank;

    }

    @Override
    public String toString() {
        return "student id = "+ id + " , name = " + name + " , rank  = " + rank  ;
    }


    @Override
    public int compareTo(Studentclass s) {
       // return this.id - s.id;
        //return this.name.compareTo(s.name);
        return  this.rank - s.rank;
    }


}
