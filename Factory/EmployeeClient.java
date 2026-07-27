public class EmployeeClient {

    public static void main(String[] args) {
        Employee employee1 = EmployeeFact.getEmployee("Android Developer");
        System.out.println(employee1.getSalary());

        Employee employee2 = EmployeeFact.getEmployee("Web Developer");
        System.out.print(employee2.getSalary());
    }
}
