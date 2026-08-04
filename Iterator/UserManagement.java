import java.util.ArrayList;

public class UserManagement {
    private ArrayList<User> user = new ArrayList<>();

    public void addUser(User user) {
        this.user.add(user);
    }

    public User getUser(int index) {
        return this.user.get(index);
    }

    public MyIterator getIterator() {
        return new MyIterator(user);
    }
}
