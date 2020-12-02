package case_study.bai_tap_3;

import case_study.bai_tap_2.Person;
import case_study.bai_tap_3.common.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static ArrayList<Product> productList = new ArrayList<Product>();
    Scanner scanner = new Scanner(System.in);

    public void addNewProduct(String fileName) {
        int idProduct = 0;
        System.out.println("Please enter code product : ");
        String codeProduct = scanner.nextLine();
        while (!ValidateProduct.checkCode(codeProduct)) {
            System.err.println("Code Product cannot be left blank ! ");
            System.out.println("Please enter code product : ");
            codeProduct = scanner.nextLine();
            ValidateProduct.checkCode(codeProduct);
        }

        System.out.println("Please enter name product : ");
        String nameProduct = scanner.nextLine();
        while (!ValidateProduct.checkNameProduct(nameProduct)) {
            System.err.println("Name Product cannot be left blank ! ");
            System.out.println("Please enter name product : ");
            nameProduct = scanner.nextLine();
            ValidateProduct.checkNameProduct(nameProduct);
        }

        System.out.println("Please enter price product : ");
        String priceProduct = scanner.nextLine();
        while (!ValidateProduct.checkPrice(priceProduct)) {
            System.err.println("Price must be a positive number ! ");
            System.out.println("Please enter price product : ");
            priceProduct = scanner.nextLine();
            ValidateProduct.checkPrice(priceProduct);
        }

        System.out.println("Please enter amount product : ");
        String amount = scanner.nextLine();
        while (!ValidateProduct.checkAmount(amount)) {
            System.err.println("Amount must be a positive number ! ");
            System.out.println("Please enter amount product : ");
            amount = scanner.nextLine();
            ValidateProduct.checkAmount(amount);
        }

        System.out.println("Please enter producer product : ");
        String producer = scanner.nextLine();
        while (!ValidateProduct.checkProducer(producer)) {
            System.err.println("Producer must be a positive number ! ");
            System.out.println("Please enter producer product : ");
            producer = scanner.nextLine();
            ValidateProduct.checkProducer(producer);
        }
//        FileUtils.setPath();

        if (fileName.equals("importProduct")) {
            System.out.println("Please enter price import of product : ");
            String priceImport = scanner.nextLine();
            while (!ValidateProduct.checkPriceImport(priceImport)) {
                System.err.println("Price import must be a positive number !");
                System.out.println("Please enter price import of product : ");
                priceImport = scanner.nextLine();
                ValidateProduct.checkPriceImport(priceImport);
            }

            System.out.println("Please enter province import of product : ");
            String provinceImport = scanner.nextLine();
            while (!ValidateProduct.checkProvince(provinceImport)) {
                System.err.println("Province import cannot be left blank !");
                System.out.println("Please enter province import of product : ");
                provinceImport = scanner.nextLine();
                ValidateProduct.checkProvince(provinceImport);
            }

            System.out.println("Please enter import tax of product : ");
            String importTax = scanner.nextLine();
            while (!ValidateProduct.checkTax(importTax)) {
                System.err.println("Import tax must be a positive number !");
                System.out.println("Please enter import tax of product : ");
                importTax = scanner.nextLine();
                ValidateProduct.checkTax(importTax);
            }
//            FileUtils.writeFile(new String[]{String.valueOf(idProduct), codeProduct, nameProduct, priceProduct, amount,
//                    producer, priceImport, provinceImport, importTax});

            Product product1 = new ImportProduct(idProduct, codeProduct, nameProduct, priceProduct, amount, producer, priceImport,
                    provinceImport, importTax);
            productList.add(product1);

        } else if (fileName.equals("exportProduct")) {
            System.out.println("Please enter price export of product : ");
            String priceExport = scanner.nextLine();
            while (!ValidateProduct.checkPriceExport(priceExport)) {
                System.err.println("Price export must be a positive number !");
                System.out.println("Please enter price export of product : ");
                priceExport = scanner.nextLine();
                ValidateProduct.checkPriceExport(priceExport);
            }

            System.out.println("Please enter country import product : ");
            String countryImport = scanner.nextLine();
            while (!ValidateProduct.checkCountry(countryImport)) {
                System.err.println("country import product cannot be left blank ! ");
                System.out.println("Please enter country import product : ");
                countryImport = scanner.nextLine();
                ValidateProduct.checkCountry(countryImport);
            }

//            FileUtils.writeFile(new String[]{String.valueOf(idProduct), codeProduct, nameProduct, priceProduct, amount,
//                    producer, priceExport, countryImport});

            Product product2 = new ExportProduct(idProduct, codeProduct, nameProduct, priceProduct, amount, producer, priceExport,
                    countryImport);
            productList.add(product2);
        }
        String[] temp;
        FileUtils.setPath();
        for (Product product :productList) {
            temp = product.toString().split(",");
            FileUtils.writeFile(temp);
        }
        System.out.println("add new product successfully !");
        scanner.nextLine();
    }

    //    private static List<Product> readProduct(){
//        List<String> stringList = FileUtils.readFile();
////        List<Product> list =new ArrayList<>();
//        String[] temp =null;
//        Product product = null;
//        for (String str: stringList){
//            temp = str.split(",");
//            if (temp.length == 9){
//                product = new ImportProduct();
//                ((ImportProduct) product).setPriceImport(temp[6]);
//                ((ImportProduct) product).setProvinceImport(temp[7]);
//                ((ImportProduct) product).setImportTax(temp[8]);
//            }else if (temp.length == 8){
//                product = new ExportProduct();
//                ((ExportProduct) product).setPriceExport(temp[6]);
//                ((ExportProduct) product).setCountryImport(temp[7]);
//            }
//            product.setIdProduct(Integer.parseInt(temp[0]));
//            product.setCodeProduct(temp[1]);
//            product.setNameProduct(temp[2]);
//            product.setPrice(temp[3]);
//            product.setAmount(temp[4]);
//            product.setProducer(temp[5]);
//
//            productList.add(product);
//        }
//        return productList;
//    }
    public List<Product> readProduct() {
        File csvContacts = new File("src/case_study/bai_tap_3/data/products.csv");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvContacts));
            String line = null;
            Product product = null;
            String[] temp = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                if (temp.length == 9) {
//                    addNewProduct("importProduct");
                    product = new ImportProduct();
                    ((ImportProduct) product).setPriceImport(temp[6]);
                    ((ImportProduct) product).setProvinceImport(temp[7]);
                    ((ImportProduct) product).setImportTax(temp[8]);
                } else if (temp.length == 8) {
//                    addNewProduct("exportProduct");
                    product = new ExportProduct();
                    ((ExportProduct) product).setPriceExport(temp[6]);
                    ((ExportProduct) product).setCountryImport(temp[7]);
                }
                product.setIdProduct(Integer.parseInt(temp[0]));
                product.setCodeProduct(temp[1]);
                product.setNameProduct(temp[2]);
                product.setPrice(temp[3]);
                product.setAmount(temp[4]);
                product.setProducer(temp[5]);

                productList.add(product);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public void deleteProduct() {
        System.out.println("Enter code product want to delete ! ");
        String temp = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCodeProduct().equals(temp)) {
//                System.out.println("Do you want to delete this product ? ");
//                System.out.println("1. Yes ");
//                System.out.println("2. No ");
//                int choose = scanner.nextInt();
//                switch (choose) {
//                    case 1:
//                        productList.remove(i);
//                        break;
//                    case 2:
//                        return;
//                }
                productList.remove(productList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.err.println(new NotFoundProductException());
            System.out.println("Please press any key to input again. (Enter to exit) ");
            if (scanner.nextLine().equals("")) {
                MainMenu.displayMenu();
            } else {
                deleteProduct();
            }
        }
    }

    public void showProduct(){
        System.out.println(productList);
    }
//    public void writeProduct(){
//        try {
//            FileWriter csvProduct = new FileWriter("src/case_study/bai_tap_3/data/products.csv");
//            BufferedWriter bufferedWriter = new BufferedWriter(csvProduct);
//            for (Product product: productList){
//                if (productList.size() == 9){
//                    bufferedWriter.write(product.getIdProduct()+","+product.getCodeProduct()+","+product.getNameProduct()
//                            +","+product.getPrice()+","+product.getAmount()+","+product.getProducer()
//                            +","+((ImportProduct)product).getPriceImport()+","+((ImportProduct)product).getProvinceImport()
//                            +","+((ImportProduct)product).getImportTax());
//                    bufferedWriter.newLine();
//                }else if (productList.size() == 8){
//                    bufferedWriter.write(product.getIdProduct()+","+product.getCodeProduct()+","+product.getNameProduct()
//                            +","+product.getPrice()+","+product.getAmount()+","+product.getProducer()
//                            +","+((ExportProduct)product).getPriceExport()+","+((ExportProduct)product).getCountryImport());
//                    bufferedWriter.newLine();
//                }
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
