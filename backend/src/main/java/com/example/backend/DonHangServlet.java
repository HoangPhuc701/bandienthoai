package com.example.backend;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.DonHang_Dao;
import entity.DonHangKhachHang;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.ws.rs.Path;
import java.io.*;
import java.util.List;

@WebServlet("/api/donhang/*")
public class DonHangServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json; charset=UTF-8");
        int sdtKH = Integer.parseInt(req.getParameter("sdtKH"));
//        String ngaylapdon= req.getParameter("ngaylapdon");
        DonHang_Dao dh = new DonHang_Dao();
        DonHangKhachHang dhkh = new DonHangKhachHang();
        dhkh.setSdtKH(sdtKH);
//        dhkh.setNgayLapDon(ngaylapdon);
        List<DonHangKhachHang> ListDH = dh.selectDonHang(dhkh);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getWriter(), ListDH);

    }

}
