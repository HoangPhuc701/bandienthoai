create database phonestore

use phonestore

create table NhaCungCap(
MaNCC varchar(50) primary key,
TenNCC varchar(50)
)

create table CuaHang(
MaCuaHang varchar(50) primary key,
TenCuaHang varchar(50),
DiaChi varchar(100)
)

create table KhachHang(
SdtKH int primary key,
MatKhau varchar(50),
TenKhachHang varchar(100),
DiaChi varchar(100)
)

create table DonHang(
MaDonHang varchar(50) primary key,
NgayLapDon date,
TongTien double,
TrangThai varchar(50),
SdtKH int,
FOREIGN KEY (SdtKH) REFERENCES KhachHang(SdtKH)
)

create table NhanVien(
MaNV varchar(50) primary key,
TenNV varchar(100),
MatKhau varchar(50),
ChucVu varchar(50),
MaCuaHang varchar(50),
FOREIGN KEY (MaCuaHang) REFERENCES CuaHang(MaCuaHang)
)

create table DienThoai(
MaDienThoai varchar(50) primary key,
TenDienThoai varchar(50),
ThongTinDienThoai text,
HinhAnh varchar(50),
DungLuong varchar(50),
SoLuong int,
GiaBan double,
MaNCC  varchar(50),
MaCuaHang  varchar(50),
FOREIGN KEY (MaCuaHang) REFERENCES CuaHang(MaCuaHang),
FOREIGN KEY (MaNCC) REFERENCES NhaCungCap(MaNCC)
)

create table ChiTietDonHang(
MaCTDH varchar(50) primary key,
SoLuong int,
TongTien double,
MaDonHang varchar(50),
MaDienThoai varchar(50),
FOREIGN KEY (MaDonHang) REFERENCES DonHang(MaDonHang),
FOREIGN KEY (MaDienThoai) REFERENCES DienThoai(MaDienThoai)
)

--nha cung cap
insert into NhaCungCap values('IP','IPHONE'),
							('SS','SAMSUNG'),
                            ('OP','OPPO'),
                            ('XA','XIAOMI'),
                            ('VV','VIVO'),
                            ('RM','REALME'),
                            ('NO','NOKIA')
--cua hang
insert into CuaHang values('CH1','WWOANGFUTT STORE','215 Điện Biên Phủ, Bình Thạnh')
--dien thoai
insert into DienThoai values('IP14PRM127','Iphone 14 Pro Max 128GB',N'iPhone 14 Pro Max một siêu phẩm trong giới smartphone được nhà Táo tung ra thị trường vào tháng 09/2022. Máy trang bị con chip Apple A16 Bionic vô cùng mạnh mẽ, đi kèm theo đó là thiết kế hình màn hình mới, hứa hẹn mang lại những trải nghiệm đầy mới mẻ cho người dùng iPhone.','IP14PRM128.jpg','128GB','10','26490000','IP','CH1')
insert into DienThoai values('IP13PRM128','Iphone 13 Pro Max 128GB',N'iPhone 13 Pro Max một siêu phẩm trong giới smartphone được nhà Táo tung ra thị trường vào tháng 09/2022. Máy trang bị con chip Apple A16 Bionic vô cùng mạnh mẽ, đi kèm theo đó là thiết kế hình màn hình mới, hứa hẹn mang lại những trải nghiệm đầy mới mẻ cho người dùng iPhone.','IP13PRM128.jpg','128GB','10','16690000','IP','CH1')
insert into DienThoai values('IP12PRM128','Iphone 12 Pro Max 128GB',N'iPhone 12 Pro Max một siêu phẩm trong giới smartphone được nhà Táo tung ra thị trường vào tháng 09/2022. Máy trang bị con chip Apple A16 Bionic vô cùng mạnh mẽ, đi kèm theo đó là thiết kế hình màn hình mới, hứa hẹn mang lại những trải nghiệm đầy mới mẻ cho người dùng iPhone.','IP12PRM128.jpg','128GB','10','14490000','IP','CH1')
insert into DienThoai values('SSZFLIP5G256GB','Samsung Galaxy Z Flip5 5G 256GB',N'Samsung Galaxy Z Flip5 đã chính thức ra mắt vào ngày 26 tháng 7. Đây là một chiếc điện thoại thông minh có thiết kế độc đáo với màn hình gập, được trang bị bộ vi xử lý cao cấp Snapdragon 8 Gen 2 for Galaxy, RAM 8 GB, bộ nhớ trong 256 GB, camera kép 12 MP và pin 3700 mAh','ZFLIP5G.jpg','256GB','10','19990000','SS','CH1')
insert into DienThoai values('IP15PRM128','Iphone 15 Pro Max 128GB',N'iPhone 15 Pro Max một siêu phẩm trong giới smartphone được nhà Táo tung ra thị trường vào tháng 09/2022. Máy trang bị con chip Apple A16 Bionic vô cùng mạnh mẽ, đi kèm theo đó là thiết kế hình màn hình mới, hứa hẹn mang lại những trải nghiệm đầy mới mẻ cho người dùng iPhone.','P15PRM128.jpg','128GB','10','34990000','IP','CH1')

insert into DienThoai values('XI13TPR5','Xiaomi 13T Pro 5G',N'Xiaomi 13T Pro 5G là mẫu máy thuộc phân khúc tầm trung đáng chú ý tại thị trường Việt Nam. Điện thoại ấn tượng nhờ được trang bị chip Dimensity 9200+, camera 50 MP có kèm sự hợp tác với Leica cùng kiểu thiết kế tinh tế đầy sang trọng.','XIAOMI13T5PRO.jpg','12GB','10','14990000','XA','CH1')
insert into DienThoai values('VVV295G','Vivo V29 5G',N'Công nghệ màn hình: AMOLED. Màn hình rộng: 6.78" - Tần số quét 120 Hz','VIVOV295G.jpg','12GB','10','12290000','VV','CH1')
insert into DienThoai values('SSZFLOD5G256GB','Samsung Galaxy Z Flold5 5G 256GB',N'Samsung Galaxy Z Fold5 5G 512GB cũng đã chính thức ra mắt vào tháng 07/2023 với sự bứt phá mạnh mẽ, mở ra những trải nghiệm linh hoạt mới mẻ thông qua khả năng gập độc đáo, màn hình lớn sắc nét, hiệu năng vượt trội cho khả năng đa nhiệm tối ưu và cùng nhiều tính năng hấp dẫn khác đáp ứng những yêu cầu cao hơn từ người dùng. Thiết kế bản lề gập mở linh hoạt
Samsung Galaxy Z Fold5 tiếp tục nâng tầm thiết kế gập độc đáo của dòng Galaxy Z Fold trước đó, mang lại một trải nghiệm di động đáng chú ý và đáng nhớ. Với sự sáng tạo và tính năng mới, chiếc điện thoại này đem đến sự khác biệt rõ rệt so với các phiên bản trước đó. 
Samsung đã tập trung vào việc tối ưu hóa kích thước và khối lượng của Galaxy Z Fold5, giúp điện thoại trở nên nhẹ nhàng hơn và dễ dàng cất giữ trong túi áo hay túi xách của bạn. Khi mở ra, bạn sẽ được trải nghiệm một màn hình to, đem đến không gian rộng lớn và ấn tượng cho việc xem nội dung và làm việc. 
','ZFOLD5G.jpg','512GB','10','40990000','SS','CH1')

--nhanvien
insert into NhanVien values('NV01','Chau Thai Bao','12345678','Nhan Vien','CH1')
--khach hang
insert into KhachHang values(0967023242,'12345678','WwoangFutt',N'Tây Ninh')
select * from khachhang k where k.SdtKH = '967023242'
select * from dienthoai
select * from khachhang
select * from nhanvien
select * from donhang