

package jdbcTesting;

import java.util.Comparator;

public class EmpIDComparator implements Comparator<employee> {

    @Override
    public int compare(employee e1, employee e2) {
        return e1.id - e2.id;
    }
}
