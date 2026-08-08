public class Main {
    public static void main(String[] args) {
        IphoneCharger charger = new Adapter(new AndroidChargerImpl());
        Iphone16 iphone16 = new Iphone16(charger);
        iphone16.charge();
    }
}