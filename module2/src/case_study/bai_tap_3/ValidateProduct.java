package case_study.bai_tap_3;

public class ValidateProduct {
    private static final String CODE_REGEX = "^SP00[\\d]{3}$";
    private static final String NAME_REGEX = "^([A-Za-z]+\\s)*([A-Za-z]+)$";
    private static final String PRICE_REGEX = "^\\d+$";
    private static final String AMOUNT_REGEX = "^\\d+$";
    private static final String PRODUCER_REGEX = "^([A-Za-z]+\\s)*([A-Za-z]+)$";
    private static final String PRICE_IMPORT_REGEX = "^\\d+";
    private static final String PROVINCE_REGEX = "^([A-Za-z]+\\s)*([A-Za-z]+)$";
    private static final String TAX_REGEX = "^\\d+";
    private static final String PRICE_EXPORT_REGEX = "^\\d+";
    private static final String COUNTRY_REGEX = "^([A-Za-z]+\\s)*([A-Za-z]+)$";

    public ValidateProduct() {
    }

    public static boolean checkCode(String codeProduct){
        return codeProduct.matches(CODE_REGEX);
    }
    public static boolean checkNameProduct(String nameProduct){
        return nameProduct.matches(NAME_REGEX);
    }
    public static boolean checkPrice(String price){
        return price.matches(PRICE_REGEX);
    }
    public static boolean checkAmount(String amount){
        return amount.matches(AMOUNT_REGEX);
    }
    public static boolean checkProducer(String producer){
        return producer.matches(PRODUCER_REGEX);
    }
    public static boolean checkPriceImport(String priceImport){
        return priceImport.matches(PRICE_IMPORT_REGEX);
    }
    public static boolean checkProvince(String provinceImport){
        return provinceImport.matches(PROVINCE_REGEX);
    }
    public static boolean checkTax(String importTax){
        return importTax.matches(TAX_REGEX);
    }
    public static boolean checkPriceExport(String priceExport){
        return priceExport.matches(PRICE_EXPORT_REGEX);
    }
    public static boolean checkCountry(String countryImport){
        return countryImport.matches(COUNTRY_REGEX);
    }

}
