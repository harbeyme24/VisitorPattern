import java.util.*;
public class Telco implements TelcoSubscription {

    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, double promoPrice, int dataAllowance, boolean unliCallText) {
        //setter method
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }
    public double getPromoPrice() {
        return promoPrice;
    }
    public boolean isUnliCallText() {
        return unliCallText;
    }
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(telcoName, price);
    }


    public String accept(UnliCallOffer unliCallOffer, boolean unliCallTextEnabled) {
        return unliCallOffer.showUnliCallsTextOffer(telcoName, unliCallTextEnabled);
    }
}