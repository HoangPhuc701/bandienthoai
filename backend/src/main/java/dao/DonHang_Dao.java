package dao;

import connect.connectDB;
import entity.ChiTietDonHang;
import entity.DienThoai;
import entity.DonHang;
import entity.DonHangKhachHang;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class DonHang_Dao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public static void main(String[] args) {
        DonHang_Dao d = new DonHang_Dao();
        DonHangKhachHang dk = new DonHangKhachHang();
        dk.setSdtKH(111);
        List<DonHangKhachHang> ListDH = d.selectDonHang(dk);
        System.out.println(ListDH);
    }

    public List<DonHangKhachHang> QuanLyDonHang(DonHangKhachHang dhkh){
        List<DonHangKhachHang> ListDH = new ArrayList<>();
        conn = connectDB.getConnection();
        String sql = "select * from donhang dh\n" +
                "inner join chitietdonhang ct on ct.madonhang=dh.madonhang and dh.NgayLapDon =?\n" +
                "inner join dienthoai dt on ct.madienthoai=dt.madienthoai";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,dhkh.getNgayLapDon());
            rs = ps.executeQuery();
            while(rs.next()){
                DonHangKhachHang dhkhh = new DonHangKhachHang();
                String MaDonHang = rs.getString("MaDonHang");
                String NgayLap = rs.getString("NgayLapDon");
                String TenDienThoai = rs.getString("TenDienThoai");
                int GiaBan = rs.getInt("GiaBan");
                double TongTien = rs.getDouble("TongTien");
                int sdt = rs.getInt("SdtKH");
                dhkhh.setMaDonHang(MaDonHang);
                dhkhh.setNgayLapDon(NgayLap);
                dhkhh.setTenDienThoai(TenDienThoai);
                dhkhh.setGiaBan(GiaBan);
                dhkhh.setTongTien(TongTien);
                dhkhh.setSdtKH(sdt);
                ListDH.add(dhkhh);
            }
        }catch (Exception e){

        }
        return ListDH;
    }

    public List<DonHangKhachHang> selectDonHang(DonHangKhachHang dhkh){
        List<DonHangKhachHang> ListDH = new ArrayList<>();
        conn = connectDB.getConnection();
        String sql = "select * from donhang dh\n" +
                "inner join chitietdonhang ct on ct.madonhang=dh.madonhang and dh.SdtKH =?\n" +
                "inner join dienthoai dt on ct.madienthoai=dt.madienthoai";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,dhkh.getSdtKH());
            rs = ps.executeQuery();
            while(rs.next()){
                DonHangKhachHang dhkhh = new DonHangKhachHang();
                String MaDonHang = rs.getString("MaDonHang");
                String NgayLap = rs.getString("NgayLapDon");
                String TenDienThoai = rs.getString("TenDienThoai");
                int GiaBan = rs.getInt("GiaBan");
                double TongTien = rs.getDouble("TongTien");
                int sdt = rs.getInt("SdtKH");
                dhkhh.setMaDonHang(MaDonHang);
                dhkhh.setNgayLapDon(NgayLap);
                dhkhh.setTenDienThoai(TenDienThoai);
                dhkhh.setGiaBan(GiaBan);
                dhkhh.setTongTien(TongTien);
                dhkhh.setSdtKH(sdt);
                ListDH.add(dhkhh);
            }
        }catch (Exception e){

        }
        return ListDH;
    }
    public DonHang addDonHang(DonHang dh){
        conn = connectDB.getConnection();
        String sql = "insert into DonHang(MaDonHang,NgayLapDon,TongTien,TrangThai,SdtKH) values(?,?,?,?,?)";
        try
        {
            ps = conn.prepareStatement(sql);
            ps.setString(1,dh.getMaDonHang());
//            ps.setDate(2, (java.sql.Date) dh.getNgayLap());
            ps.setString(2,dh.getNgayLap());
            ps.setDouble(3,dh.getTongTien());
            ps.setString(4,dh.getTrangThai());
            ps.setInt(5,dh.getSdtKH());
            ps.executeUpdate();
        }catch(Exception e){

        }
        return dh;
    }
}
