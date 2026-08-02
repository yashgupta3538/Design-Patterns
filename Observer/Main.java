public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber aman = new Subscriber("aman");
        Subscriber yash = new Subscriber("yash");
        channel.subscribe(aman);
        channel.subscribe(yash);
        channel.newVedioUploaded();
    }
}
