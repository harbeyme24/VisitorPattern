import java.util.*;
public class TelcoAllowance implements UsagePromo {
    private static final Map<String, Double> allowanceMap = new HashMap<>();
    static {
        allowanceMap.put("Smart", 15.0);
        allowanceMap.put("Globe", 10.0);
        allowanceMap.put("Ditto", 8.0);
    }

    public String showAllowance(String telcoName, double money) {
        double allowance = allowanceMap.getOrDefault(telcoName, 0.0);
        return "₱" + allowance + " the allowance of " + telcoName;
    }
}