package com.example.backend;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.DienThoai_Dao;
import dao.KhachHang_Dao;
import entity.DienThoai;
import entity.HttpUtil;
import entity.KhachHang;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/api/dienthoai/*")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    DienThoai_Dao dtd = new DienThoai_Dao();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("application/json; charset=UTF-8");


        //String product = request.getParameter("product");//aaa

        String pathInfo= request.getPathInfo();// local..../employees/giay/nu
        if(pathInfo==null){
            List<DienThoai> ListDT = dtd.getDienThoaiList();

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(response.getWriter(), ListDT);
        }else{
            String[] parts = pathInfo.substring(1).split("/");
            RequestDispatcher dispatch = request.getRequestDispatcher("/vnpay_pay.jsp");
            dispatch.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json; charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        DienThoai dt = HttpUtil.of(req.getReader()).toModel(DienThoai.class);
        dt = dtd.themDienThoai(dt);
        mapper.writeValue(resp.getOutputStream(), dt);
    }

    public void destroy() {
    }
}