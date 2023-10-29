package dao;

import connect.connectDB;
import entity.KhachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhachHang_Dao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public static void main(String[] args) {
        KhachHang_Dao k = new KhachHang_Dao();
        KhachHang kh = new KhachHang();
        kh.setSdtKH(111);
        k.KtraKhachHang(kh);
        System.out.println(kh);
//        KhachHang kh=new KhachHang();
//        kh.setTenKhachHang("aaa");
//        kh.setSdtKH("123456");
//        kh.setDiaChi("215 dbp");
//        kh.setMatKhau("123456");
//        k.themKhachHang(kh);
        //k.getKhachHang();
       // System.out.println(k.getKhachHang());
    }

    public KhachHang themKhachHang(KhachHang kh)
    {
        conn = connectDB.getConnection();
        String sql = "insert into KhachHang (SdtKH,TenKhachHang,DiaChi) VALUES (?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,kh.getSdtKH());
            ps.setString(2,kh.getTenKhachHang());
            ps.setString(3,kh.getDiaChi());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return kh;
    }
//    public KhachHang KTraKhachHang(KhachHang kh)
//    {
//        //List<KhachHang> ListKH = new ArrayList<>();
//        //KhachHang kh = new KhachHang();
//        try
//        {
//            conn = connectDB.getConnection();
//            String sql = "select * from khachhang where SdtKH=?";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1,kh.getSdtKH());
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                //KhachHang kh = new KhachHang();
//                int SdtKH = rs.getInt("SdtKH");
//                String MatKhau = rs.getString("MatKhau");
//                String TenKhachHang = rs.getString("TenKhachHang");
//                String DiaChi = rs.getString("DiaChi");
//                kh.setSdtKH(SdtKH);
//                kh.setMatKhau(MatKhau);
//                kh.setTenKhachHang(TenKhachHang);
//                kh.setDiaChi(DiaChi);
//                //ListKH.add(kh);
//            }
//        }catch (Exception e){
//
//        }
//        return kh;
//    }
public List<KhachHang> QuanLyKhachHang(KhachHang kh)
{
    List<KhachHang> ListKH = new ArrayList<>();
    try
    {
        conn = connectDB.getConnection();
        String sql = "select * from khachhang";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        if (rs.next())
        {
            int sdt = rs.getInt("SdtKH");
            String matkhau =rs.getString("MatKhau");
            String ten =rs.getString("TenKhachHang");
            String diachi =rs.getString("diachi");
            kh.setSdtKH(sdt);
            kh.setMatKhau(matkhau);
            kh.setTenKhachHang(ten);
            kh.setDiaChi(diachi);
            ListKH.add(kh);
        }
    }catch (Exception e){

    }
    return ListKH;
}
public KhachHang LoginKhachHang(KhachHang kh)
{
    try
    {
        conn = connectDB.getConnection();
        String sql = "select * from khachhang where SdtKH=? and matkhau=?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1,kh.getSdtKH());
        ps.setString(2,kh.getMatKhau());
        rs = ps.executeQuery();
        if (rs.next())
        {
            int sdt = rs.getInt("SdtKH");
            String matkhau =rs.getString("MatKhau");
            String ten =rs.getString("TenKhachHang");
            String diachi =rs.getString("diachi");
            kh.setSdtKH(sdt);
            kh.setMatKhau(matkhau);
            kh.setTenKhachHang(ten);
            kh.setDiaChi(diachi);
        }else{
            kh = null;
        }
    }catch (Exception e){
        kh = null;
    }
    return kh;
}
    public KhachHang KtraKhachHang(KhachHang kh)
    {
        try
        {
            conn = connectDB.getConnection();
            String sql = "select * from khachhang where SdtKH=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,kh.getSdtKH());
            rs = ps.executeQuery();
            if (rs.next())
            {
                int sdt = rs.getInt("SdtKH");
                String matkhau =rs.getString("MatKhau");
                String ten =rs.getString("TenKhachHang");
                String diachi =rs.getString("diachi");
                kh.setSdtKH(sdt);
                kh.setMatKhau(matkhau);
                kh.setTenKhachHang(ten);
                kh.setDiaChi(diachi);
            }else{
                kh = null;
            }
        }catch (Exception e){
            kh = null;
        }
        return kh;
    }
}
