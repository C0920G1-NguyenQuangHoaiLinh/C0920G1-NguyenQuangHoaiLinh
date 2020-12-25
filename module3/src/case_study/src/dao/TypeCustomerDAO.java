package dao;

import model.CustomerType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeCustomerDAO implements ITypeCustomerDAO {
    private DatabaseDAO databaseDAO = new DatabaseDAO();

    @Override
    public List<CustomerType> findAllTypeCustomer() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = databaseDAO.getConnection().
                    prepareStatement("select * from customer_type");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String customer_type_id = resultSet.getString("customer_type_id");
                String customer_type_name = resultSet.getString("customer_type_name");
                customerTypeList.add(new CustomerType(customer_type_id,customer_type_name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypeList;
    }
}
