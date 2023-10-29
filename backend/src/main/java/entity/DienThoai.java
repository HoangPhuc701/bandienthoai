package entity;

public class DienThoai {
    private String MaDienThoai;
    private String TenDienThoai;
    private String ThongTinDienThoai;
    private String HinhAnh;
    private String DungLuong;
    private int SoLuong;
    private double GiaBan;
    private String MaNCC;
    private String MaCuaHang;

    public DienThoai() {
    }

    public DienThoai(String maDienThoai, String tenDienThoai, String thongTinDienThoai, String hinhAnh, String dungLuong, int soLuong, double giaBan, String maNCC, String maCuaHang) {
        MaDienThoai = maDienThoai;
        TenDienThoai = tenDienThoai;
        ThongTinDienThoai = thongTinDienThoai;
        HinhAnh = hinhAnh;
        DungLuong = dungLuong;
        SoLuong = soLuong;
        GiaBan = giaBan;
        MaNCC = maNCC;
        MaCuaHang = maCuaHang;
    }

    public String getMaDienThoai() {
        return MaDienThoai;
    }

    public void setMaDienThoai(String maDienThoai) {
        MaDienThoai = maDienThoai;
    }

    public String getTenDienThoai() {
        return TenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        TenDienThoai = tenDienThoai;
    }

    public String getThongTinDienThoai() {
        return ThongTinDienThoai;
    }

    public void setThongTinDienThoai(String thongTinDienThoai) {
        ThongTinDienThoai = thongTinDienThoai;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getDungLuong() {
        return DungLuong;
    }

    public void setDungLuong(String dungLuong) {
        DungLuong = dungLuong;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double giaBan) {
        GiaBan = giaBan;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String maNCC) {
        MaNCC = maNCC;
    }

    public String getMaCuaHang() {
        return MaCuaHang;
    }

    public void setMaCuaHang(String maCuaHang) {
        MaCuaHang = maCuaHang;
    }

    @Override
    public String toString() {
        return "DienThoai{" +
                "MaDienThoai='" + MaDienThoai + '\'' +
                ", TenDienThoai='" + TenDienThoai + '\'' +
                ", ThongTinDienThoai='" + ThongTinDienThoai + '\'' +
                ", HinhAnh='" + HinhAnh + '\'' +
                ", DungLuong='" + DungLuong + '\'' +
                ", SoLuong=" + SoLuong +
                ", GiaBan=" + GiaBan +
                ", MaNCC='" + MaNCC + '\'' +
                ", MaCuaHang='" + MaCuaHang + '\'' +
                '}';
    }
}
