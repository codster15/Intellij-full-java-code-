package jdbcTesting;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<employee> {

    @Override
    public int compare(employee e1, employee e2) {
        return e1.salary - e2.salary;
    }
}
