public class Adapter implements IphoneCharger {

    private final AndroidCharger androidCharger;

    Adapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeIphone() {
        androidCharger.chargeAndroid();
        System.out.println("Your phone is charging with the help of adapter");
    }
}