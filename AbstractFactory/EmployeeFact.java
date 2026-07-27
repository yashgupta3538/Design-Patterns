public class EmployeeFact {

    public static Employee getEmployee(AbstractEmployeeFact abstractEmployeeFactory) {
        return abstractEmployeeFactory.createEmployee();
    }
}