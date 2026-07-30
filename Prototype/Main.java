public class Main {
    public static void main(String[] args) {
        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.168.0.1");
        networkConnection.setData("Data which takes time to load!!");

        System.out.println(networkConnection);

        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            System.out.print(e.getMessage());
        }
    }
}
