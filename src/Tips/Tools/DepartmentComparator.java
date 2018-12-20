package Tips.Tools;

import java.util.Comparator;

public class DepartmentComparator implements Comparator {

    public int compare(Employee employee1, Employee employee2) {
        return employee1.getDepartment().compareTo(employee2.getDepartment());
    }

    @Override
    public int compare(Object arg0, Object arg1) {
        return 0;
    }

}
