package controller;

import model.MatBang;
import org.omg.PortableInterceptor.INACTIVE;
import service.IMatBangService;
import service.MatBangService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "MatBangServlet", urlPatterns = {"/matbang"})
public class MatBangServlet extends HttpServlet {
    private IMatBangService iMatBangService = new MatBangService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "tao":
                int ma_mb = Integer.parseInt(request.getParameter("ma_mb"));
                String dien_tich =request.getParameter("dien_tich");
                String trang_thai = request.getParameter("trang_thai");
                int so_tang = Integer.parseInt(request.getParameter("so_tang"));
                String loai_vp = request.getParameter("loai_vp");
                String mo_ta = request.getParameter("mo_ta");
                String gia = request.getParameter("gia");
                String ngay_bat_dau = request.getParameter("ngay_bat_dau");
                String ngay_ket_thuc = request.getParameter("ngay_ket_thuc");
                MatBang matBang = new MatBang(ma_mb,
                        dien_tich,
                        trang_thai,
                        so_tang,
                        loai_vp,
                        mo_ta,
                        gia,
                        ngay_bat_dau,
                        ngay_ket_thuc);
                if (iMatBangService.taoMatBang(matBang)) {
                    request.setAttribute("msg","Them moi thanh cong!");
                    List<MatBang> matBangList = iMatBangService.findAll();
                    request.setAttribute("matBangList",matBangList);
                    request.getRequestDispatcher("list_mat_bang.jsp").forward(request,response);
                } else {
                    request.setAttribute("msg","Them moi that bai!");
                    request.getRequestDispatcher("tao_mat_bang.jsp").forward(request,response);
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
            case "tao":
                request.getRequestDispatcher("tao_mat_bang.jsp").forward(request,response);
                break;
            case "xoa":
                int ma_mb = Integer.parseInt(request.getParameter("ma_mb"));
                try {
                    iMatBangService.xoaMatBang(ma_mb);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

                List<MatBang> matBangList1 = iMatBangService.findAll();
                request.setAttribute("matBangList",matBangList1);
                request.getRequestDispatcher("list_mat_bang.jsp").forward(request,response);
                break;
            default:
                List<MatBang> matBangList = iMatBangService.findAll();
                request.setAttribute("matBangList",matBangList);
                request.getRequestDispatcher("list_mat_bang.jsp").forward(request,response);
        }
    }
}
