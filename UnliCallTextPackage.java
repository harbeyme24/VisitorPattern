import java.util.*;
public class UnliCallTextPackage implements UnliCallOffer {
    private static final Map<String, Double> insuranceMap = new HashMap<>();

    static {
        insuranceMap.put("Smart", 500.0);
        insuranceMap.put("Globe", 450.0);
        insuranceMap.put("Ditto", 400.0);
    }

    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        double insuranceValue = insuranceMap.getOrDefault(telcoName, 0.0);

        if (insuranceValue == 0.0) {
            return "Unavailable package set for: " + telcoName;
        }

        if (unliCallText) {
            return "Unlimited call and text ₱" + insuranceValue;
        } else {
            return "Call and text package for ₱" + insuranceValue;
        }
    }
}