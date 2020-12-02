package case_study.bai_tap_3;

public class ImportProduct extends Product {
    public String priceImport;
    public String provinceImport;
    public String importTax;

    public ImportProduct() {
    }

    public ImportProduct(int idProduct, String codeProduct, String nameProduct, String price, String amount,
                         String producer, String priceImport, String provinceImport, String importTax) {
        super(idProduct, codeProduct, nameProduct, price, amount, producer);
        this.priceImport = priceImport;
        this.provinceImport = provinceImport;
        this.importTax = importTax;
    }

    public String getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(String priceImport) {
        this.priceImport = priceImport;
    }

    public String getProvinceImport() {
        return provinceImport;
    }

    public void setProvinceImport(String provinceImport) {
        this.provinceImport = provinceImport;
    }

    public String getImportTax() {
        return importTax;
    }

    public void setImportTax(String importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return super.toString()+"ImportProduct{" +
                "priceImport='" + priceImport + '\'' +
                ", provinceImport='" + provinceImport + '\'' +
                ", importTax='" + importTax + '\'' +
                '}'+"\n";
    }
}
