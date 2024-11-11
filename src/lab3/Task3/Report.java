package lab3.Task3;

import java.util.ArrayList;
import java.util.Formatter;
import java.text.NumberFormat;

public class Report {
    public static String generateReport(ArrayList<Employee> v) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        StringBuilder report = new StringBuilder();

        for (Employee employee : v) {
            Formatter formatter = new Formatter();
            report.append(formatter.format("Работник %s имеет зарплату %s\n",
                    employee.name,
                    numberFormat.format(employee.salary)
            ).toString());
        }
        return report.toString();
    }
}
