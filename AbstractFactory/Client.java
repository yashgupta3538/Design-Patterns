public class Client {
    public static void main(String[] args) {
        Employee emp1 = EmployeeFact.getEmployee(new AndroidDevFact());
        System.out.println(emp1.getSalary());
        Employee emp2 = EmployeeFact.getEmployee(new WebDevFact());
        System.out.println(emp2.getSalary());
    }
}
