package repository;

import model.customer.Customer;
import model.customer.CustomerType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepository implements ICustomerTypeRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<CustomerType> findAll() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        CustomerType customerType;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from customer_type");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                    customerType = new CustomerType();
                    customerType.setId(resultSet.getInt("customer_type_id"));
                    customerType.setName(resultSet.getString("customer_type_name"));
                    customerTypeList.add(customerType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypeList;
    }

    @Override
    public CustomerType findById(int id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from customer_type where customer_type_id = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            CustomerType customerType = null;
            while (resultSet.next()) {
                customerType = new CustomerType();
                customerType.setId(resultSet.getInt("customer_type_id"));
                customerType.setName(resultSet.getString("customer_type_name"));
                break;
            }
            return customerType;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(int id, String name) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("update customer_type set customer_type_id = ?, customer_type_name = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createCustomerType(CustomerType customerType) {

    }

    @Override
    public boolean deleteCustomerType(int id) {
        return false;
    }
}
