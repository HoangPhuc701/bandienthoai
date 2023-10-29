package entity;

public class ChiTietDonHang {
    private String MaCTDH;
    private int SoLuong;
    private double TongTien;
    private String MaDonHang;
    private String MaDienThoai;

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(String maCTDH, int soLuong, double tongTien, String maDonHang, String maDienThoai) {
        MaCTDH = maCTDH;
        SoLuong = soLuong;
        TongTien = tongTien;
        MaDonHang = maDonHang;
        MaDienThoai = maDienThoai;
    }

    public String getMaCTDH() {
        return MaCTDH;
    }

    public void setMaCTDH(String maCTDH) {
        MaCTDH = maCTDH;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double tongTien) {
        TongTien = tongTien;
    }

    public String getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        MaDonHang = maDonHang;
    }

    public String getMaDienThoai() {
        return MaDienThoai;
    }

    public void setMaDienThoai(String maDienThoai) {
        MaDienThoai = maDienThoai;
    }
}
