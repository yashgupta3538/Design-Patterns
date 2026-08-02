public class Subscriber implements Observer {

    String name;

    Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println("Hi " + this.name + ", new vedio is uploaded on my channel please check it out");
    }
}