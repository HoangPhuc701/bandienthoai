package com.example.backend;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.NhanVien_Dao;
import entity.NhanVien;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/api/nhanvien")
public class NhanVienServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json; charset=UTF-8");

        String MaNV=req.getParameter("manv");
        String MatKhau=req.getParameter("matKhau");
        NhanVien_Dao nvd = new NhanVien_Dao();
        NhanVien nv = new NhanVien();
        nv.setManv(MaNV);
        nv.setMatKhau(MatKhau);


        List<NhanVien>ListNV = nvd.LoginNhanVien(nv);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getWriter(), ListNV);

    }
}
