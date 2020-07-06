
/** Utility methods for processing strings */
public class StringUtils {
    /* Determines if the given response indicates an affirmative. */
    static boolean isYesResponse(String resp) {
        String resplc = resp.toLowerCase();
        return (resplc.contains("yes") ||
                resplc.contains("yep") ||
                resplc.contains("yeah") ||
                resplc.startsWith("y"));
    }
}
