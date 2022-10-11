import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uteis {
    public static boolean isValidTelephoneRegex(String telephone) {
        if (telephone != null && telephone.length() > 0) {
            String expression = "^(\\([0-9]{2}\\))\\s([9]{1})?([0-9]{4})-([0-9]{4})$";
            Pattern pattern = Pattern.compile(expression);
            Matcher matcher = pattern.matcher(telephone);
            return matcher.matches();
        }
        return false;
    }
    public static boolean isValidAnoRegex(String ano) {
        if (ano != null && ano.length() > 0) {
            String expression = "[0-9]{4}";
            Pattern pattern = Pattern.compile(expression);
            Matcher matcher = pattern.matcher(ano);
            return matcher.matches();
        }
        return false;
    }

}
