package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import repository.CustomerTypeRepository;
import repository.ICustomerTypeRepository;
import service.CustomerService;
import service.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();
    private ICustomerTypeRepository iCustomerTypeRepository = new CustomerTypeRepository();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    createCustomer(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "update":
                try {
                    updateCustomer(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                List<CustomerType> customerTypeList = iCustomerTypeRepository.findAll();
                request.setAttribute("customerTypeList",customerTypeList);
                request.getRequestDispatcher("create_customer.jsp").forward(request,response);
                break;
            case "update":
                int customerId = Integer.parseInt(request.getParameter("customerId"));
                Customer customer = iCustomerService.findById(customerId);
                request.setAttribute("customer",customer);
                request.getRequestDispatcher("update_customer.jsp").forward(request,response);
                break;
            case "delete":
                try {
                    deleteCustomer(request,response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            default:
                List<Customer> customerList = iCustomerService.findAll();
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("list_customer.jsp").forward(request,response);

        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        iCustomerService.deleteCustomer(customerId);

        List<Customer> customerList = iCustomerService.findAll();
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("list_customer.jsp").forward(request,response);
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException,ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        String customerName = request.getParameter("customerName");
        String customerBirthday = request.getParameter("customerBirthday");
        int customerGender = Integer.parseInt(request.getParameter("customerGender"));
        int customerIdCard = Integer.parseInt(request.getParameter("customerIdCard"));
        String customerPhone = request.getParameter("customerPhone");
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String customerAddress = request.getParameter("customerAddress");
        Customer customer = new Customer(customerId,customerName,customerBirthday,customerGender,customerIdCard,customerPhone,customerTypeId,customerAddress);
        if(iCustomerService.createCustomer(customer)) {
            request.setAttribute("msg","A Customer Added!");
            List<Customer> customerList = iCustomerService.findAll();
            request.setAttribute("customerList",customerList);
            request.getRequestDispatcher("list_customer.jsp");
        } else {
            request.setAttribute("msg","Create Failed!");
            request.getRequestDispatcher("create_customer.jsp").forward(request,response);
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        String customerName = request.getParameter("customerName");
        String customerBirthday = request.getParameter("customerBirthday");
        int customerGender = Integer.parseInt(request.getParameter("customerGender"));
        int customerIdCard = Integer.parseInt(request.getParameter("customerIdCard"));
        String customerPhone = request.getParameter("customerPhone");
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String customerAddress = request.getParameter("customerAddress");
        iCustomerService.save(customerId,customerName,customerBirthday,customerGender,customerIdCard,customerPhone,customerTypeId,customerAddress);
        response.sendRedirect("/customer");
    }
}
