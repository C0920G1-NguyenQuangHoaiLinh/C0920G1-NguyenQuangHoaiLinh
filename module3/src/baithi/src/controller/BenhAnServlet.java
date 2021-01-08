package controller;

import bo.BenhAnBO;
import bo.BenhNhanBO;
import model.BenhAn;
import model.BenhNhan;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "BenhAnServlet", urlPatterns = {"/home"})
public class BenhAnServlet extends HttpServlet {
    private BenhAnBO benhAnBO = new BenhAnBO();
    private BenhNhanBO benhNhanBO = new BenhNhanBO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "edit":
                editInfor(request,response);

        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        try {
            switch (action){
                case "edit":
                    break;
                default:
                    list(request, response);
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void list(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<BenhAn> benhAnList = benhAnBO.findAll();
        request.setAttribute("benhAnList", benhAnList);

        List<BenhNhan> benhNhanList = benhNhanBO.showAll();
        request.setAttribute("benhNhanList", benhNhanList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("home/index.jsp");
        dispatcher.forward(request, response);
    }


    private void editInfor(HttpServletRequest request, HttpServletResponse response) {
    }
}
