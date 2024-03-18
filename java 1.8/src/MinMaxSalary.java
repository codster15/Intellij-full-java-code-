import java.util.*;
import java.util.stream.Collectors;

public class MinMaxSalary {
    public static void main(String[] args) {

        emp e1 = new emp("aman", 24000);
        emp e2 = new emp("kamal", 14000);
        emp e3 = new emp("suresh", 84000);
        emp e4 = new emp("mahesh", 44000);
        emp e5 = new emp("arjun", 64000);


        List<emp> li = Arrays.asList(e1, e2, e3, e4, e5);

        Optional<emp> max = li.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
        System.out.println(max.get().salary);


        Optional<emp> min = li.stream().collect(Collectors.minBy(Comparator.comparing(emp -> emp.salary)));
        System.out.println(min.get().salary);

        Double avg = li.stream().collect(Collectors.averagingInt(e -> e.salary));
        System.out.println(avg);

        Map<String, List<emp>> name = li.stream().collect(Collectors.groupingBy(e -> e.name));




      //  System.out.println(name.get());



    }

}



    class emp {

        String name;
        int salary;


        emp(String name, int salary) {
            this.name = name;
            this.salary = salary;

        }

        @Override
        public String toString() {
            return "name - "+ name + "\t" + "salary - " +salary;
        }
    }

    class salaryCompare implements Comparator<emp> {

        @Override
        public int compare(emp e1, emp e2) {
            return e1.salary - e2.salary;
        }
    }

