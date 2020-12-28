package dao;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {

    DatabaseDAO databaseDAO = new DatabaseDAO();

    private static final String INSERT_CUSTOMER_SQL = "insert into customer(id ,customer_name, customer_birth, customer_gender, customer_id_card," +
            "customer_phone, customer_email,customer_type_id,customer_address) values (?,?,?,?,?,?,?,?,?)";
    private static final String SELECT_ALL_CUSTOMERS = "select * from customer";
    private static final String DELETE_CUSTOMER_SQL = "delete from customer where id = ?";
    private static final String EDIT_CUSTOMER_SQL = "update customer set customer_name = ?, customer_birth= ?, customer_gender= ?," +
            " customer_id_card=?, customer_phone= ?, customer_email =?, customer_type_id =?, customer_address= ? where id=?";
    private static final String SEARCH_CUSTOMER_SQL = "select * from customer where customer_name like ?";

    public CustomerDAO() {
    }

    @Override
    public String addNewCustomer(Customer customer) {
        try {
            PreparedStatement preparedStatement = databaseDAO.getConnection().prepareStatement(INSERT_CUSTOMER_SQL);
            preparedStatement.setString(1,customer.getId());
            preparedStatement.setString(2,customer.getCustomer_name());
            preparedStatement.setString(3,customer.getCustomer_birth());
            preparedStatement.setString(4,customer.getCustomer_gender());
            preparedStatement.setString(5,customer.getCustomer_id_card());
            preparedStatement.setString(6,customer.getCustomer_phone());
            preparedStatement.setString(7,customer.getCustomer_email());
            preparedStatement.setString(8,customer.getCustomer_type_id());
            preparedStatement.setString(9,customer.getCustomer_address());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Create successfully";
    }

    @Override
    public List<Customer> findAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        try{
            PreparedStatement preparedStatement = databaseDAO.getConnection().
                    prepareStatement(SELECT_ALL_CUSTOMERS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String customer_name = resultSet.getString("customer_name");
                String customer_birth = resultSet.getString("customer_birth");
                String customer_gender = resultSet.getString("customer_gender");
                String customer_id_card = resultSet.getString("customer_id_card");
                String customer_phone = resultSet.getString("customer_phone");
                String customer_email = resultSet.getString("customer_email");
                String customer_type_id = resultSet.getString("customer_type_id");
                String customer_address = resultSet.getString("customer_address");
                customerList.add(new Customer(id,customer_name,customer_birth,customer_gender,customer_id_card,customer_phone,
                        customer_email,customer_type_id,customer_address));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public String deleteCustomer(String id) {
        try {
            PreparedStatement preparedStatement = databaseDAO.getConnection().
                    prepareStatement(DELETE_CUSTOMER_SQL);
            preparedStatement.setString(1,id);
            preparedStatement.executeUpdate() ;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "delete successfully";
    }

    @Override
    public String editCustomer(String id, Customer customer) {
        try {
            PreparedStatement preparedStatement = databaseDAO.getConnection().prepareStatement(EDIT_CUSTOMER_SQL);
            preparedStatement.setString(1,customer.getCustomer_name());
            preparedStatement.setString(2,customer.getCustomer_birth());
            preparedStatement.setString(3,customer.getCustomer_gender());
            preparedStatement.setString(4,customer.getCustomer_id_card());
            preparedStatement.setString(5,customer.getCustomer_phone());
            preparedStatement.setString(6,customer.getCustomer_email());
            preparedStatement.setString(7,customer.getCustomer_type_id());
            preparedStatement.setString(8,customer.getCustomer_address());
            preparedStatement.setString(9,customer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Edit successfully";
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = databaseDAO.getConnection().
                    prepareStatement(SEARCH_CUSTOMER_SQL);
            preparedStatement.setString(1,'%' + name + '%');
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String customer_name = resultSet.getString("customer_name");
                String customer_birth = resultSet.getString("customer_birth");
                String customer_gender = resultSet.getString("customer_gender");
                String customer_id_card = resultSet.getString("customer_id_card");
                String customer_phone = resultSet.getString("customer_phone");
                String customer_email = resultSet.getString("customer_email");
                String customer_type_id = resultSet.getString("customer_type_id");
                String customer_address = resultSet.getString("customer_address");
                customerList.add(new Customer(id,customer_name,customer_birth,customer_gender,customer_id_card,customer_phone,
                        customer_email,customer_type_id,customer_address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
