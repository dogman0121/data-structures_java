package lab11.Task1;

import java.util.Date;

public class Task {
    Employee employee;
    Date startDate;
    Date endDate;

    public Task(Employee employee) {
        this.employee = employee;
        this.startDate = new Date();
    }

    public void end() {
        this.endDate = new Date();
    }

    @Override
    public String toString() {
        return "Сотрудник: " + this.employee.toString() + "\nДата начала: "
                + this.startDate.toString() + "\nДата окончания: " + this.endDate.toString();
    }
}
