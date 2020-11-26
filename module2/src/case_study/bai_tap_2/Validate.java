package case_study.bai_tap_2;

public class Validate {
    private static String NAME_REGEX = "^([A-Za-z]+\\s)*([A-Za-z]+)$";
    private static final String NUMBERPHONE_REGEX = "^0\\d{3}\\s\\d{3}\\s\\d{3}$";
    private static final String GROUP_REGEX = "^([\\w]+\\s)*([\\w]+)$";
    private static final String ADDRESS_REGEX = "^([\\w]+\\s)*([\\w]+)$";
    private static final String EMAILL_REGEX = "^[\\w]{1,}[\\w.+-]{0,}@[\\w-]{2,}([.][a-zA-Z]{2,}|[.][\\w-]{2,}[.][a-zA-Z]{2,})$";
    private static final String GENDER_REGEX = "^(Nam|Nu|Khac)$";
    private static final String BIRTHDAY_REGEX = "^((((0[1-9]|[12]\\d|3[01])\\/(0[13578]|10|12))|((0[1-9]|[12]\\d|30)" +
            "\\/(0[469]|11))|((0[1-9]|1[0-9]|2[0-8]))\\/02)\\/(19\\d\\d|(200\\d|201[0-9])))|" +
            "(29\\/02\\/((?!1900)19([02468][048]|[13579][26])|(2000)|(2004)|(2008)|(2012)|(2016)))$";

    public Validate() {
    }

    public static boolean checkFullName(String fullName){
        return fullName.matches(NAME_REGEX);
    }

    public static boolean checkNumberPhone(String numberPhone){
        return numberPhone.matches(NUMBERPHONE_REGEX);
    }

    public static boolean checkGroup(String group){
        return group.matches(GROUP_REGEX);
    }

    public static boolean checkAddress(String address){
        return address.matches(ADDRESS_REGEX);
    }

    public static boolean checkEmail(String email){
        return email.matches(EMAILL_REGEX);
    }

    public static boolean checkGender(String gender){
        return gender.matches(GENDER_REGEX);
    }

    public static boolean checkBirthday(String dateOfBirth){
        return dateOfBirth.matches(BIRTHDAY_REGEX);
    }
}
