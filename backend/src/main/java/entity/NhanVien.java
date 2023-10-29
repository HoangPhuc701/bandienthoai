package entity;

public class NhanVien {
    private String Manv;
    private String TenNV;
    private String MatKhau;
    private String ChucVu;
    private String MaCuaHang;

    public NhanVien() {
    }

    public NhanVien(String manv, String tenNV, String matKhau, String chucVu, String maCuaHang) {
        Manv = manv;
        TenNV = tenNV;
        MatKhau = matKhau;
        ChucVu = chucVu;
        MaCuaHang = maCuaHang;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String manv) {
        Manv = manv;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String chucVu) {
        ChucVu = chucVu;
    }

    public String getMaCuaHang() {
        return MaCuaHang;
    }

    public void setMaCuaHang(String maCuaHang) {
        MaCuaHang = maCuaHang;
    }
}
