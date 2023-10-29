package com.example.backend;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.KhachHang_Dao;
import entity.HttpUtil;
import entity.KhachHang;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/api/khachhang")
public class KhachHangServlet extends HttpServlet {
    KhachHang_Dao kht = new KhachHang_Dao();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json; charset=UTF-8");

//        int sdt =Integer.parseInt(request.getParameter("sdtKH"));
//        String MatKhau=request.getParameter("matKhau");

        KhachHang_Dao khd = new KhachHang_Dao();
        KhachHang kh = new KhachHang();
//        kh.setSdtKH(sdt);
//        kh.setMatKhau(MatKhau);
//        kh = khd.LoginKhachHang(kh);
        //kh = khd.QuanLyKhachHang(kh);
        List<KhachHang> ListKH = khd.QuanLyKhachHang(kh);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(response.getWriter(), ListKH);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        KhachHang kh = HttpUtil.of(req.getReader()).toModel(KhachHang.class);
        kh = kht.themKhachHang(kh);
        mapper.writeValue(resp.getOutputStream(), kh);

    }
}
