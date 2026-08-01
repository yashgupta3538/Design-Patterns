public class Main {
    public static void main(String[] args) {
        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.168.0.1");
        networkConnection.setData("Data which takes time to load");
        networkConnection.loadDomains();

        System.out.println(networkConnection);

        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            networkConnection.getDomains().remove(0);
            System.out.println(networkConnection);
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            System.out.print(e.getMessage());
        }
    }
}

// O/P with shallow copy
// 192.168.0.1 Data which takes time to load:[www.yahoo.com, www.google.com, www.stackoverflow.com]
// 192.168.0.1 Data which takes time to load:[www.google.com, www.stackoverflow.com]
// 192.168.0.1 Data which takes time to load:[www.google.com, www.stackoverflow.com]

// O/P with deep copy
// 192.168.0.1 Data which takes time to load:[www.yahoo.com, www.google.com, www.stackoverflow.com]
// 192.168.0.1 Data which takes time to load:[www.google.com, www.stackoverflow.com]
// 192.168.0.1 Data which takes time to load:[www.yahoo.com, www.google.com, www.stackoverflow.com]