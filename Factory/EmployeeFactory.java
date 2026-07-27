public class EmployeeFactory {
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("Android Developer")) {
            return new AndroidDev();
        } else if (empType.trim().equalsIgnoreCase("Web Developer")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
