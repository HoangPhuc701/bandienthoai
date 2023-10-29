package entity;

import java.util.Date;

public class DonHang {
    private String MaDonHang;
    private String NgayLap;
    private double TongTien;
    private String TrangThai;
    private int SdtKH;

    public DonHang() {
    }

    public DonHang(String maDonHang, String ngayLap, double tongTien, String trangThai, int sdtKH) {
        MaDonHang = maDonHang;
        NgayLap = ngayLap;
        TongTien = tongTien;
        TrangThai = trangThai;
        SdtKH = sdtKH;
    }

    public String getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        MaDonHang = maDonHang;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String ngayLap) {
        NgayLap = ngayLap;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double tongTien) {
        TongTien = tongTien;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

    public int getSdtKH() {
        return SdtKH;
    }

    public void setSdtKH(int sdtKH) {
        SdtKH = sdtKH;
    }

    @Override
    public String toString() {
        return "DonHang{" +
                "MaDonHang='" + MaDonHang + '\'' +
                ", NgayLap='" + NgayLap + '\'' +
                ", TongTien=" + TongTien +
                ", TrangThai='" + TrangThai + '\'' +
                ", SdtKH=" + SdtKH +
                '}';
    }
}
