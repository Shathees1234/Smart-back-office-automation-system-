public class AIRuleEngine {

    public static String evaluateLeave(int leaveDays) {

        if (leaveDays <= 2) {
            return "AUTO-APPROVED";
        } else if (leaveDays <= 5) {
            return "MANAGER APPROVAL REQUIRED";
        } else {
            return "REJECTED";
        }
    }
}
