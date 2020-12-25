package dao;

import model.CustomerType;

import java.util.List;

public interface ITypeCustomerDAO {
    List<CustomerType> findAllTypeCustomer();
}
