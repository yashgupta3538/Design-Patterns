public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Yash", 1));
        userManagement.addUser(new User("Anmol", 2));
        userManagement.addUser(new User("Deepak", 3));
        userManagement.addUser(new User("Saurav", 4));

        MyIterator itr = userManagement.getIterator();

        while (itr.hashNext()) {
            User user = (User) itr.next();
            System.out.println(user.getName());
        }
    }
}
