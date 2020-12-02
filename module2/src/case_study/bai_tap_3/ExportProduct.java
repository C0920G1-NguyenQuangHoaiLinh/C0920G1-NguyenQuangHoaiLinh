package case_study.bai_tap_3;

public class ExportProduct extends Product {
    public String priceExport;
    public String countryImport;

    public ExportProduct() {
    }

    public ExportProduct(int idProduct, String codeProduct, String nameProduct, String price, String amount,
                         String producer, String priceExport, String countryImport) {
        super(idProduct, codeProduct, nameProduct, price, amount, producer);
        this.priceExport = priceExport;
        this.countryImport = countryImport;
    }

    public String getPriceExport() {
        return priceExport;
    }

    public void setPriceExport(String priceExport) {
        this.priceExport = priceExport;
    }

    public String getCountryImport() {
        return countryImport;
    }

    public void setCountryImport(String countryImport) {
        this.countryImport = countryImport;
    }

    @Override
    public String toString() {
        return super.toString()+"ExportProduct{" +
                "priceExport='" + priceExport + '\'' +
                ", countryImport='" + countryImport + '\'' +
                '}'+"\n";
    }
}
