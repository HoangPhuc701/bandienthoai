package dao;

import connect.connectDB;
import entity.ChiTietDonHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ChiTietDonHang_Dao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ChiTietDonHang addChiTietDonHang(ChiTietDonHang ctdh){
        try
        {
            conn = connectDB.getConnection();
            String sql = "insert into ChiTietDonHang(MaCTDH,SoLuong,TongTien,MaDonHang,MaDienThoai) values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,ctdh.getMaCTDH());
            ps.setInt(2,ctdh.getSoLuong());
            ps.setDouble(3,ctdh.getTongTien());
            ps.setString(4,ctdh.getMaDonHang());
            ps.setString(5,ctdh.getMaDienThoai());
            ps.executeUpdate();
//            int a = ps.executeUpdate();
//            if(a>0)
//            {
//                ctdh.setMaCTDH(ctdh.getMaCTDH());
//                ctdh.setSoLuong(ctdh.getSoLuong());
//                ctdh.setTongTien(ctdh.getTongTien());
//                ctdh.setMaDonHang(ctdh.getMaDonHang());
//                ctdh.setMaDienThoai(ctdh.getMaDienThoai());
//            }

        }catch(Exception e){

        }
        return ctdh;
    }

}
