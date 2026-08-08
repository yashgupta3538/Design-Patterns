public class Iphone16 {
    
    private IphoneCharger charger;

    public Iphone16(IphoneCharger charger) {
        this.charger = charger;
    }

    public void charge() {
        charger.chargeIphone();
    }

}