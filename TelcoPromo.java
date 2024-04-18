public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco("Smart", 500, 15, false);
        TelcoSubscription globe = new Telco("Globe", 450, 10, true);
        TelcoSubscription ditto = new Telco("Ditto", 400, 8, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance("Smart", ((Telco) smart).getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " + promo.showAllowance("Globe", ((Telco) globe).getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " + promo.showAllowance("Ditto", ((Telco) ditto).getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer("Smart", ((Telco) smart).isUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer("Globe", ((Telco) globe).isUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer("Ditto", ((Telco) ditto).isUnliCallText()));
    }
}