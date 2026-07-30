public class NetworkConnection implements Cloneable{
    private String ip;
    private String data;

    public NetworkConnection() {

    }

    public String getIp() {
        return this.ip;
    }

    public String getData() {
        return this.data;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String toString() {
        return this.ip + " " + this.data;
    }

    public Object clone() throws CloneNotSupportedException {
        return this;
    }
}
