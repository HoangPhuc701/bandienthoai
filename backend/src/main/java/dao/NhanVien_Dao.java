package dao;

import connect.connectDB;
import entity.KhachHang;
import entity.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVien_Dao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<NhanVien> LoginNhanVien(NhanVien nv)
    {
        List<NhanVien> ListNV = new ArrayList<>();
        try
        {
            conn = connectDB.getConnection();
            String sql = "select * from nhanvien where MaNV=? and matkhau=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,nv.getManv());
            ps.setString(2,nv.getMatKhau());
            rs = ps.executeQuery();
            while (rs.next())
            {
                String MaNV = rs.getString("MaNV");
                String TenNV = rs.getString("TenNV");
                String MatKhau = rs.getString("MatKhau");
                String ChucVu = rs.getString("ChucVu");
                String MaCH = rs.getString("MaCuaHang");
                nv.setManv(MaNV);
                nv.setTenNV(TenNV);
                nv.setMatKhau(MatKhau);
                nv.setChucVu(ChucVu);
                nv.setMaCuaHang(MaCH);
                ListNV.add(nv);
            }
        }catch (Exception e){

        }
        return ListNV;
    }


    public static void main(String[] args) {
        NhanVien_Dao nvd = new NhanVien_Dao();
        NhanVien nv = new NhanVien();
        nv.setManv("NV01");
        nv.setMatKhau("12345678");

        List<NhanVien> lnv = nvd.LoginNhanVien(nv);

        System.out.println(nv);
    }
}
