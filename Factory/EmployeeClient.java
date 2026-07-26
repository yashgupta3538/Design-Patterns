public class EmployeeClient {

    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(employee1.getSalary());

        Employee employee2 = EmployeeFactory.getEmployee("Web Developer");
        System.out.print(employee2.getSalary());
    }
}
