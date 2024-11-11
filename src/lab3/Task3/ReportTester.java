package lab3.Task3;

import java.util.ArrayList;

public class ReportTester {
    public static void main(String[] args) {
        ArrayList<Employee> v = new ArrayList<>();
        Employee e1 = new Employee("Zeliboba", 34534);
        Employee e2 = new Employee("Aboba", 56456);
        v.add(e1);
        v.add(e2);
        System.out.println(Report.generateReport(v));
    }
}
