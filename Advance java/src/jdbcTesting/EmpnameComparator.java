package jdbcTesting;

import java.util.Comparator;

public class EmpnameComparator implements Comparator<employee> {
    public static void main(String[] args) {

    }

    @Override
    public int compare(employee e1, employee e2) {
        return e1.name.compareTo(e2.name);
    }
}
