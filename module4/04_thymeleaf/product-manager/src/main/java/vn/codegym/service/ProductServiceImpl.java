package vn.codegym.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import vn.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@Primary
public class ProductServiceImpl implements ProductService {
    private static HashMap<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Iphone X","500","img1","abc"));
        products.put(2,new Product(2,"Iphone Xs Max","700","img2","abc"));
        products.put(3,new Product(3,"Iphone 11","800","img3","abc"));
        products.put(4,new Product(4,"Iphone 12","900","img4","abc"));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getIdProduct(), product);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }
}
