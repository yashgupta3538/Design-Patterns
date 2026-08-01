import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String data;
    private List<String> domains = new ArrayList<>();

    public NetworkConnection() {
        
    }

    public List<String> getDomains() {
        return this.domains;
    }

    public String getIp() {
        return this.ip;
    }

    public String getData() {
        return this.data;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String toString() {
        return this.ip + " " + this.data + ":" + this.domains;
    }

    public Object clone() throws CloneNotSupportedException {

        // custom logic to implement deep copy
        NetworkConnection connection = new NetworkConnection();
        connection.setIp(this.getIp());
        connection.setData(this.getData());
        for (String str : this.getDomains()) {
            connection.getDomains().add(str);
        }
        return connection;

        // By default Shallow copy will be done
        // return this;
    }

    public void loadDomains() {
        domains.add("www.yahoo.com");
        domains.add("www.google.com");
        domains.add("www.stackoverflow.com");
    }
}
