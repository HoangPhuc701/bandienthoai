package entity;

public class KhachHang {
    private int SdtKH;
    private String MatKhau;
    private String TenKhachHang;
    private String DiaChi;

    public KhachHang() {
    }

    public KhachHang(int sdtKH, String matKhau, String tenKhachHang, String diaChi) {
        SdtKH = sdtKH;
        MatKhau = matKhau;
        TenKhachHang = tenKhachHang;
        DiaChi = diaChi;
    }

    public int getSdtKH() {
        return SdtKH;
    }

    public void setSdtKH(int sdtKH) {
        SdtKH = sdtKH;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "SdtKH=" + SdtKH +
                ", MatKhau='" + MatKhau + '\'' +
                ", TenKhachHang='" + TenKhachHang + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                '}';
    }
}
