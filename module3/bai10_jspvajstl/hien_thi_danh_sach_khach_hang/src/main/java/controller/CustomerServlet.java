package controller;

import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "service.CustomerServlet", urlPatterns ={"/customer_list"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Đinh Văn Hiếu","1998-25-06","Hà Nội","https://9xwedding.com/wp-content/uploads/2020/09/61103071_2361422507447925_6222318223514140672_n_1.jpg"));
        customerList.add(new Customer("Nguyễn Văn Hiếu","1997-27-07","Hà Nội","https://toigingiuvedep.vn/wp-content/uploads/2021/07/mau-anh-the-dep-lam-the-can-cuoc.jpg"));
        customerList.add(new Customer("Phạm Văn Hiếu","1996-26-06","Hà Nội", "https://toplist.vn/images/800px/trung-tam-anh-mau-hoang-tram-319533.jpg"));
        customerList.add(new Customer("Trần Văn Hiếu","1995-25-04","Hà Nội","https://toplist.vn/images/800px/dino-studio-anh-vien-cho-be-va-gia-dinh-317623.jpg"));
        customerList.add(new Customer("Phan Văn Hiếu","1994-23-04","Hà Nội","https://image.vtc.vn/resize/th/upload/2021/04/07/ek6qycqxiaiyiun-11052098.jpg"));
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("customer_list.jsp").forward(request,response);
    }
}
