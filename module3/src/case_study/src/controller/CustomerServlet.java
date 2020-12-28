package controller;

import bo.CustomerBO;
import bo.TypeCustomerBO;
import dao.CustomerDAO;
import dao.ICustomerDAO;
import model.Customer;
import model.CustomerType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    private CustomerBO customerBO = new CustomerBO();
    private TypeCustomerBO typeCustomerBO = new TypeCustomerBO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                addNewCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "search":
                searchCustomer(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    showNewForm(request, response);
                case "edit":
                    listCustomer(request, response);
                case "delete":
                    listCustomer(request, response);
                case "search":
                    listCustomer(request, response);
                default:
                    listCustomer(request, response);
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Customer> listCustomer = customerBO.findAllCustomer();
        request.setAttribute("listCustomer", listCustomer);

        List<CustomerType> customerTypeList = typeCustomerBO.findAllTypeCustomer();
        request.setAttribute("customerTypeList", customerTypeList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/view.jsp");

        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher dispatcher = request.getRequestDispatcher("customer");
//        dispatcher.forward(request, response);
        response.sendRedirect("customer/view.jsp");
    }


    private void addNewCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id =request.getParameter("id");
        String customer_name =request.getParameter("customer_name");
        String customer_birth =request.getParameter("customer_birth");
        String customer_gender =request.getParameter("customer_gender");
        String customer_id_card =request.getParameter("customer_id_card");
        String customer_phone =request.getParameter("customer_phone");
        String customer_email =request.getParameter("customer_email");
        String customer_type_id =request.getParameter("customer_type_id");
        String customer_address =request.getParameter("customer_address");
        Customer customer = new Customer(id,customer_name,customer_birth,customer_gender,customer_id_card,customer_phone,
                customer_email,customer_type_id,customer_address);
        String message = customerBO.addNewCustomer(customer);
        request.setAttribute("message", message);
        if (!message.equals("Create successfully")){
            request.setAttribute("customer",customer);
        }

        List<Customer> listCustomer = customerBO.findAllCustomer();
        request.setAttribute("listCustomer", listCustomer);
        List<CustomerType> customerTypeList = typeCustomerBO.findAllTypeCustomer();
        request.setAttribute("customerTypeList", customerTypeList);
//        List<Customer> listCustomer = this.customerBO.findAllCustomer();
//        listCustomer.add(newCustomer);
//        request.setAttribute("listCustomer", listCustomer);
//        showNewForm(request, response);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/view.jsp");
        dispatcher.forward(request, response);
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customer_name =request.getParameter("customer_name");
        String customer_birth =request.getParameter("customer_birth");
        String customer_gender =request.getParameter("customer_gender");
        String customer_id_card =request.getParameter("customer_id_card");
        String customer_phone =request.getParameter("customer_phone");
        String customer_email =request.getParameter("customer_email");
        String customer_type_id =request.getParameter("customer_type_id");
        String customer_address =request.getParameter("customer_address");
        String id =request.getParameter("id");
        Customer customer = new Customer(id,customer_name,customer_birth,customer_gender,customer_id_card,customer_phone,
                customer_email,customer_type_id,customer_address);
        String message = customerBO.editCustomer(id, customer);
        request.setAttribute("message", message);
        if (!message.equals("Edit successfully")){
            request.setAttribute("customer",customer);
        }

        List<Customer> listCustomer = customerBO.findAllCustomer();
        request.setAttribute("listCustomer", listCustomer);
        List<CustomerType> customerTypeList = typeCustomerBO.findAllTypeCustomer();
        request.setAttribute("customerTypeList", customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/view.jsp");
        dispatcher.forward(request,response);
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idCus = request.getParameter("id_customer");
        customerBO.deleteCustomer(idCus);
//        request.setAttribute("message",message);

        List<Customer> listCustomer = customerBO.findAllCustomer();
        request.setAttribute("listCustomer", listCustomer);
        List<CustomerType> customerTypeList = typeCustomerBO.findAllTypeCustomer();
        request.setAttribute("customerTypeList", customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/view.jsp");
        dispatcher.forward(request,response);
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customer_name = request.getParameter("customer_name");
        List<Customer> listCustomer = customerBO.searchCustomer(customer_name);
        request.setAttribute("listCustomer", listCustomer);
        List<CustomerType> customerTypeList = typeCustomerBO.findAllTypeCustomer();
        request.setAttribute("customerTypeList", customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/view.jsp");
        dispatcher.forward(request,response);
    }
}
