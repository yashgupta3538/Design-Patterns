import java.util.ArrayList;

public class MyIterator implements Iterator {

    private int length;
    private ArrayList<User> user;
    private int position = 0;

    public MyIterator(ArrayList<User> user) {
        this.user = user;
        this.length = user.size();
    }

    @Override
    public boolean hashNext() {
        if (position >= length)
            return false;
        return true;
    }

    @Override
    public Object next() {
        User user = this.user.get(position);
        this.position++;
        return user;
    }
}
