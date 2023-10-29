package dao;

import connect.connectDB;
import entity.DienThoai;
import entity.KhachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DienThoai_Dao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public static void main(String[] args) {
        DienThoai_Dao dt = new DienThoai_Dao();
        dt.getDienThoai();
    }


    public DienThoai themDienThoai(DienThoai dt){
        conn = connectDB.getConnection();
        String sql = "insert into DienThoai " +
                "(MaDienThoai,TenDienThoai,ThongTinDienThoai,HinhAnh,DungLuong,SoLuong,GiaBan,MaNCC,MaCuaHang) " +
                "VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,dt.getMaDienThoai());
            ps.setString(2,dt.getTenDienThoai());
            ps.setString(3,dt.getThongTinDienThoai());
            ps.setString(4,dt.getHinhAnh());
            ps.setString(5,dt.getDungLuong());
            ps.setInt(6,dt.getSoLuong());
            ps.setDouble(7,dt.getGiaBan());
            ps.setString(8,dt.getMaNCC());
            ps.setString(9,dt.getMaCuaHang());
            ps.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return dt;
    }


    public List<DienThoai> getDienThoai()
    {
        DienThoai dt = new DienThoai();
        List<DienThoai> ListDT = new ArrayList<>();
        try
        {
            conn = connectDB.getConnection();
            String sql = "select * from DienThoai";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String MaDienThoai = rs.getString("MaDienThoai");
                String TenDienThoai = rs.getString("TenDienThoai");
                String ThongTinDienThoai = rs.getString("ThongTinDienThoai");
                String HinhAnh = rs.getString("HinhAnh");
                String DungLuong = rs.getString("DungLuong");
                int SoLuong = rs.getInt("SoLuong");
                double GiaBan = rs.getDouble("GiaBan");
                String MaNCC = rs.getString("MaNCC");
                String MaCuaHang = rs.getString("MaCuaHang");
                dt.setMaDienThoai(MaDienThoai);
                dt.setTenDienThoai(TenDienThoai);
                dt.setThongTinDienThoai(ThongTinDienThoai);
                dt.setHinhAnh(HinhAnh);
                dt.setDungLuong(DungLuong);
                dt.setSoLuong(SoLuong);
                dt.setGiaBan(GiaBan);
                dt.setMaNCC(MaNCC);
                dt.setMaCuaHang(MaCuaHang);
                ListDT.add(dt);
            }
        }catch (Exception e){

        }
        return ListDT;
    }

    public List<DienThoai> getDienThoaiList() {
        List<DienThoai> ListDT = new ArrayList<>();
        try {
            conn = connectDB.getConnection();
            String sql = "select * from DienThoai";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DienThoai dt = new DienThoai();
                String MaDienThoai = rs.getString("MaDienThoai");
                String TenDienThoai = rs.getString("TenDienThoai");
                String ThongTinDienThoai = rs.getString("ThongTinDienThoai");
                String HinhAnh = rs.getString("HinhAnh");
                String DungLuong = rs.getString("DungLuong");
                int SoLuong = rs.getInt("SoLuong");
                double GiaBan = rs.getDouble("GiaBan");
                String MaNCC = rs.getString("MaNCC");
                String MaCuaHang = rs.getString("MaCuaHang");
                dt.setMaDienThoai(MaDienThoai);
                dt.setTenDienThoai(TenDienThoai);
                dt.setThongTinDienThoai(ThongTinDienThoai);
                dt.setHinhAnh(HinhAnh);
                dt.setDungLuong(DungLuong);
                dt.setSoLuong(SoLuong);
                dt.setGiaBan(GiaBan);
                dt.setMaNCC(MaNCC);
                dt.setMaCuaHang(MaCuaHang);
                ListDT.add(dt);
            }
        } catch (Exception e) {
            e.printStackTrace(); // In lỗi ra console hoặc xử lý nó một cách phù hợp
        }
        return ListDT;
    }

}
