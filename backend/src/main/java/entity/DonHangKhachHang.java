package entity;

public class DonHangKhachHang {
    private String MaDonHang;
    private String NgayLapDon;
    private String TenDienThoai;
    private double GiaBan;
    private double TongTien;
    private int SdtKH;

    public DonHangKhachHang() {
    }

    public DonHangKhachHang(String maDonHang, String ngayLapDon, String tenDienThoai, double giaBan, double tongTien, int sdtKH) {
        MaDonHang = maDonHang;
        NgayLapDon = ngayLapDon;
        TenDienThoai = tenDienThoai;
        GiaBan = giaBan;
        TongTien = tongTien;
        SdtKH = sdtKH;
    }

    public String getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        MaDonHang = maDonHang;
    }

    public String getNgayLapDon() {
        return NgayLapDon;
    }

    public void setNgayLapDon(String ngayLapDon) {
        NgayLapDon = ngayLapDon;
    }

    public String getTenDienThoai() {
        return TenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        TenDienThoai = tenDienThoai;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double giaBan) {
        GiaBan = giaBan;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double tongTien) {
        TongTien = tongTien;
    }

    public int getSdtKH() {
        return SdtKH;
    }

    public void setSdtKH(int sdtKH) {
        SdtKH = sdtKH;
    }

    @Override
    public String toString() {
        return "DonHangKhachHang{" +
                "MaDonHang='" + MaDonHang + '\'' +
                ", NgayLapDon='" + NgayLapDon + '\'' +
                ", TenDienThoai='" + TenDienThoai + '\'' +
                ", GiaBan=" + GiaBan +
                ", TongTien=" + TongTien +
                ", SdtKH=" + SdtKH +
                '}';
    }
}
