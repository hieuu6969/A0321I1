package repository;

import model.customer.Contract;
import model.customer.Customer;
import model.service.OtherService;
import model.service.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();


    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from customer;");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setCustomerName(resultSet.getString("customer_name"));
                customer.setCustomerBirthday(resultSet.getString("customer_birthday"));
                customer.setCustomerGender(resultSet.getInt("customer_gender"));
                customer.setCustomerIdCard(resultSet.getInt("customer_id_card"));
                customer.setCustomerPhone(resultSet.getString("customer_phone"));
                customer.setCustomerTypeId(resultSet.getInt("customer_type_id"));
                customer.setCustomerAddress(resultSet.getString("customer_address"));
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public Customer findById(int customerId) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from customer where customerId = ?");
            preparedStatement.setInt(1,customerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setCustomerName(resultSet.getString("customer_name"));
                customer.setCustomerBirthday(resultSet.getString("customer_birthday"));
                customer.setCustomerGender(resultSet.getInt("customer_gender"));
                customer.setCustomerIdCard(resultSet.getInt("customer_id_card"));
                customer.setCustomerPhone(resultSet.getString("customer_phone"));
                customer.setCustomerTypeId(resultSet.getInt("customer_type_id"));
                customer.setCustomerAddress(resultSet.getString("customer_address"));
                break;
            }
            return customer;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(int customerId, String customerName, String customerBirthday, int customerGender, int customerIdCard, String customerPhone, int customerTypeId, String customerAddress) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("update customer set customerName = ?, customerBirthday = ?, customerGender = ?, customerIdCard = ?, customerPhone = ?, customerTypeId = ?,customerAddress =? where customerId = ?;");
            preparedStatement.setInt(1,customerId);
            preparedStatement.setString(2,customerName);
            preparedStatement.setString(3,customerBirthday);
            preparedStatement.setInt(4,customerGender);
            preparedStatement.setInt(5,customerIdCard);
            preparedStatement.setString(6,customerPhone);
            preparedStatement.setInt(7,customerTypeId);
            preparedStatement.setString(8,customerAddress);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void createCustomer(Customer customer) {
        try {
//            String customerId,
//            String customerName,
//            String customerBirthday,
//            String customerGender,
//            int customerIdCard,
//            String customerPhone,
//            String customerTypeId,
//            String customerAddress
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into customer(customerId,customerName,customerBirthday,customerGender,customerIdCard,customerPhone,customerTypeId,customerAddress value (?,?,?,?,?,?,?,?));");
            preparedStatement.setInt(1,customer.getCustomerId());
            preparedStatement.setString(2,customer.getCustomerName());
            preparedStatement.setString(3,customer.getCustomerBirthday());
            preparedStatement.setInt(4,customer.getCustomerGender());
            preparedStatement.setInt(5,customer.getCustomerIdCard());
            preparedStatement.setString(6,customer.getCustomerPhone());
            preparedStatement.setInt(7,customer.getCustomerTypeId());
            preparedStatement.setString(8,customer.getCustomerAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean deleteCustomer(int customerId) {
        boolean rowDeleted = false;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("delete from customer where customerId = ?;");
            preparedStatement.setInt(1,customerId);
            rowDeleted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }
}
