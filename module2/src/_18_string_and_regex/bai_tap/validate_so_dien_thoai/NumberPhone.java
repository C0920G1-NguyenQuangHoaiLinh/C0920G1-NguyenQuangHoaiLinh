package _18_string_and_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String NUMBER_PHONE = "^\\d{2}-0+\\d{9}$";

    public NumberPhone() {
    }

    public static boolean checkNumberPhone(String regex){
        Pattern pattern = Pattern.compile(NUMBER_PHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
