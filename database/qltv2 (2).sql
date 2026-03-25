-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3307
-- Thời gian đã tạo: Th3 25, 2026 lúc 07:50 AM
-- Phiên bản máy phục vụ: 10.4.27-MariaDB
-- Phiên bản PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qltv2`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ct_phieumuon`
--

CREATE TABLE `ct_phieumuon` (
  `MaPM` varchar(10) NOT NULL,
  `MaSach` varchar(10) NOT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  `SoLuongTra` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `ct_phieumuon`
--

INSERT INTO `ct_phieumuon` (`MaPM`, `MaSach`, `SoLuong`, `SoLuongTra`) VALUES
('PM001', 'S001', 1, 0),
('PM001', 'S007', 2, 0),
('PM002', 'S002', 1, 0),
('PM003', 'S003', 1, 1),
('PM003', 'S004', 1, 0),
('PM004', 'S005', 1, 0),
('PM004', 'S006', 1, 0),
('PM005', 'S002', 2, 0),
('PM006', 'S002', 2, 0),
('PM007', 'S001', 2, 0),
('PM009', 'S002', 2, 0),
('PM009', 'S004', 2, 0),
('PM010', 'S004', 3, 2),
('PM010', 'S005', 3, 2),
('PM011', 'S004', 2, 1),
('PM011', 'S005', 4, 3),
('PM012', 'S005', 4, 0),
('PM013', 'S002', 2, 0),
('PM014', 'S001', 2, 0),
('PM015', 'S003', 1, 0),
('PM015', 'S004', 1, 0),
('PM016', 'S003', 1, 0),
('PM017', 'S002', 1, 0),
('PM018', 'S004', 1, 0),
('PM019', 'S005', 1, 0),
('PM019', 'S007', 1, 0),
('PM020', 'S003', 1, 0),
('PM020', 'S005', 1, 0),
('PM020', 'S007', 1, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ct_phieunhap`
--

CREATE TABLE `ct_phieunhap` (
  `MaPN` varchar(10) NOT NULL,
  `MaSach` varchar(10) NOT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  `DonGia` decimal(12,2) DEFAULT NULL,
  `ThanhTien` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `ct_phieunhap`
--

INSERT INTO `ct_phieunhap` (`MaPN`, `MaSach`, `SoLuong`, `DonGia`, `ThanhTien`) VALUES
('PM06', 'S002', 10, '10000.00', 100000),
('PM06', 'S006', 10, '10000.00', 100000),
('PM6', 'S003', 10, '10000.00', 100000),
('PN001', 'S001', 10, '20000.00', 200000),
('PN002', 'S002', 20, '10000.00', 200000),
('PN003', 'S003', 7, '15000.00', 105000),
('PN004', 'S004', 15, '25000.00', 375000),
('PN005', 'S005', 5, '10000.00', 50000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ct_phieuphat`
--

CREATE TABLE `ct_phieuphat` (
  `MaPP` varchar(10) NOT NULL,
  `MaSach` varchar(10) NOT NULL,
  `MaQDP` varchar(10) NOT NULL,
  `SoLuong` int(10) NOT NULL,
  `LyDo` varchar(256) DEFAULT NULL,
  `ThanhTien` decimal(12,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `ct_phieuphat`
--

INSERT INTO `ct_phieuphat` (`MaPP`, `MaSach`, `MaQDP`, `SoLuong`, `LyDo`, `ThanhTien`) VALUES
('PP01', 'S004', 'QDP01', 1, 'Làm rách sách', '30000.00'),
('PP01', 'S005', 'QDP01', 1, 'Làm rách sách', '30000.00'),
('PP02', 'S004', 'QDP01', 1, 'Làm rách sách', '30000.00'),
('PP02', 'S005', 'QDP01', 1, 'Làm rách sách', '30000.00'),
('PP03', 'S004', 'QDP01', 1, 'Làm rách sách', '30000.00');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `docgia`
--

CREATE TABLE `docgia` (
  `MaDG` varchar(10) NOT NULL,
  `Ho` varchar(50) DEFAULT NULL,
  `Ten` varchar(50) DEFAULT NULL,
  `SDT` varchar(15) DEFAULT NULL,
  `DiaChi` varchar(255) DEFAULT NULL,
  `TrangThai` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `docgia`
--

INSERT INTO `docgia` (`MaDG`, `Ho`, `Ten`, `SDT`, `DiaChi`, `TrangThai`) VALUES
('DG01', 'Nguyễn Văn', 'An', '0901234567', 'Hà Nội', 0),
('DG02', 'Trần Thị', 'Bình', '0912345678', 'TP. Hồ Chí Minh', 1),
('DG03', 'Lê Minh', 'Châu', '0923456789', 'Đà Nẵng', 0),
('DG04', 'Phạm Quốc', 'Dũng', '0934567890', 'Hải Phòng', 0),
('DG05', 'Hoàng Thị', 'Hà', '0945678901', 'Cần Thơ', 1),
('DG06', 'Vũ Đức', 'Long', '0956789012', 'Bắc Ninh', 0),
('DG07', 'Đặng Thị', 'Mai', '0967890123', 'Nghệ An', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `MaNCC` varchar(10) NOT NULL,
  `TenNCC` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`MaNCC`, `TenNCC`) VALUES
('NCC001', 'Công Ty Cổ Phần TACA Việt Nam'),
('NCC002', 'FAHASA');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` varchar(10) NOT NULL,
  `Ho` varchar(50) DEFAULT NULL,
  `Ten` varchar(50) DEFAULT NULL,
  `SDT` varchar(15) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `ChucVu` varchar(50) DEFAULT NULL,
  `MatKhau` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `Ho`, `Ten`, `SDT`, `NgaySinh`, `ChucVu`, `MatKhau`) VALUES
('NV01', 'Nguyễn', 'An', '0901234567', '1995-04-12', 'Nhân viên', '123456'),
('NV02', 'Trần', 'Bình', '0912345678', '1992-08-25', 'Nhân viên', '310503'),
('NV03', 'Lê', 'Hà', '0987654321', '1998-01-15', 'Nhân viên', ''),
('NV04', 'Phạm', 'Minh', '0978123456', '1996-11-30', 'Nhân viên', ''),
('NV05', 'Võ', 'Lan', '0934567890', '1994-06-20', 'Nhân viên', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhaxuatban`
--

CREATE TABLE `nhaxuatban` (
  `MaNXB` varchar(10) NOT NULL,
  `TenNXB` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhaxuatban`
--

INSERT INTO `nhaxuatban` (`MaNXB`, `TenNXB`) VALUES
('NXB01', 'NXB Trẻ'),
('NXB02', 'NXB Kim Đồng'),
('NXB03', 'NXB Giáo Dục'),
('NXB04', 'NXB Lao Động'),
('NXB05', 'NXB Văn Học');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieumuon`
--

CREATE TABLE `phieumuon` (
  `MaPM` varchar(10) NOT NULL,
  `MaDG` varchar(10) DEFAULT NULL,
  `MaNV` varchar(10) DEFAULT NULL,
  `NgayMuon` date DEFAULT NULL,
  `HanTra` date DEFAULT NULL,
  `NgayTraThucTe` date DEFAULT NULL,
  `TrangThai` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phieumuon`
--

INSERT INTO `phieumuon` (`MaPM`, `MaDG`, `MaNV`, `NgayMuon`, `HanTra`, `NgayTraThucTe`, `TrangThai`) VALUES
('PM001', 'DG01', 'NV01', '2024-10-01', '2024-10-10', '2026-03-21', 2),
('PM002', 'DG02', 'NV01', '2024-10-02', '2024-10-12', '2024-10-09', 1),
('PM003', 'DG03', 'NV02', '2024-10-03', '2024-10-13', '2026-03-21', 2),
('PM004', 'DG01', 'NV02', '2024-10-05', '2024-10-15', '2026-03-04', 2),
('PM005', 'DG03', 'NV01', '2026-02-19', '2026-02-28', '2026-03-25', 1),
('PM006', 'DG04', 'NV01', '2026-02-02', '2026-02-15', '2026-03-21', 2),
('PM007', 'DG01', 'NV01', '2026-02-01', '2026-02-21', '2026-03-23', 2),
('PM008', 'DG01', 'NV01', '2026-02-18', '2026-02-28', '2026-03-23', 2),
('PM009', 'DG03', 'NV01', '2026-02-18', '2026-02-28', '2026-03-23', 2),
('PM010', 'DG03', 'NV01', '2026-02-18', '2026-02-28', '2026-02-19', 1),
('PM011', 'DG03', 'NV01', '2026-02-11', '2026-02-28', '2026-02-18', 1),
('PM012', 'DG03', 'NV01', '2026-02-11', '2026-02-28', '2026-02-18', 1),
('PM013', 'DG06', 'NV01', '2026-02-12', '2026-02-20', '2026-03-03', 2),
('PM014', 'DG01', 'NV01', '2026-03-03', '2026-03-26', '2026-03-04', 2),
('PM015', 'DG04', 'NV01', '2026-03-01', '2026-03-03', '2026-03-04', 2),
('PM016', 'DG03', 'NV01', '2026-03-04', '2026-03-11', '2026-03-04', 1),
('PM017', 'DG04', 'NV01', '2026-03-21', '2026-03-25', NULL, 0),
('PM018', 'DG02', 'NV01', '2026-03-21', '2026-03-24', '2026-03-24', 1),
('PM019', 'DG03', 'NV01', '2026-03-24', '2026-03-26', '2026-03-24', 1),
('PM020', 'DG02', 'NV01', '2026-03-25', '2026-03-26', NULL, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPN` varchar(10) NOT NULL,
  `MaNV` varchar(10) DEFAULT NULL,
  `MaNCC` varchar(10) DEFAULT NULL,
  `NgayNhap` date DEFAULT NULL,
  `TongTien` decimal(12,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phieunhap`
--

INSERT INTO `phieunhap` (`MaPN`, `MaNV`, `MaNCC`, `NgayNhap`, `TongTien`) VALUES
('PM06', 'NV01', 'NCC002', '2026-03-24', '200000.00'),
('PM6', 'NV01', 'NCC002', '2026-03-21', '100000.00'),
('PN001', 'NV01', 'NCC001', '2026-03-01', '150000.00'),
('PN002', 'NV02', 'NCC002', '2026-03-02', '220000.00'),
('PN003', 'NV01', 'NCC001', '2026-03-03', '175000.00'),
('PN004', 'NV03', 'NCC001', '2026-03-04', '300000.00'),
('PN005', 'NV02', 'NCC001', '2026-03-06', '125000.00');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieuphat`
--

CREATE TABLE `phieuphat` (
  `MaPP` varchar(10) NOT NULL,
  `MaPM` varchar(10) DEFAULT NULL,
  `MaDG` varchar(10) DEFAULT NULL,
  `NgayLap` date NOT NULL,
  `SoNgayTre` int(10) DEFAULT NULL,
  `TongTien` decimal(12,2) DEFAULT NULL,
  `TrangThai` varchar(30) DEFAULT NULL,
  `MaNV` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phieuphat`
--

INSERT INTO `phieuphat` (`MaPP`, `MaPM`, `MaDG`, `NgayLap`, `SoNgayTre`, `TongTien`, `TrangThai`, `MaNV`) VALUES
('PP01', 'PM010', 'DG03', '2026-03-25', 0, '60000.00', '0', 'NV01'),
('PP02', 'PM011', 'DG03', '2026-03-25', 0, '60000.00', '0', 'NV01'),
('PP03', 'PM003', 'DG03', '2026-03-25', 524, '10510000.00', '0', 'NV02');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quydinhphat`
--

CREATE TABLE `quydinhphat` (
  `MaQDP` varchar(10) NOT NULL,
  `QuyDinh` varchar(255) DEFAULT NULL,
  `DonGia` decimal(12,2) DEFAULT NULL,
  `LoaiPhat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `quydinhphat`
--

INSERT INTO `quydinhphat` (`MaQDP`, `QuyDinh`, `DonGia`, `LoaiPhat`) VALUES
('QDP01', 'Làm rách sách', '30000.00', 'huhong'),
('QDP02', 'Trễ hạn', '20000.00', 'trehan'),
('QDP03', 'Không trả sách', '150000.00', 'matsach');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sach`
--

CREATE TABLE `sach` (
  `MaSach` varchar(10) NOT NULL,
  `TenSach` varchar(200) NOT NULL,
  `MaTL` varchar(10) DEFAULT NULL,
  `MaNXB` varchar(10) DEFAULT NULL,
  `NgayXuatBan` date DEFAULT NULL,
  `DonGia` decimal(12,2) DEFAULT NULL,
  `SoLuong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sach`
--

INSERT INTO `sach` (`MaSach`, `TenSach`, `MaTL`, `MaNXB`, `NgayXuatBan`, `DonGia`, `SoLuong`) VALUES
('S001', 'Cho tôi xin một vé đi tuổi thơ', 'TL01', 'NXB01', '2010-06-01', '85000.00', 18),
('S002', 'Lão Hạc', 'TL01', 'NXB05', '2005-03-15', '45000.00', 37),
('S003', 'Rừng Na Uy', 'TL01', 'NXB05', '2012-09-10', '120000.00', 16),
('S004', 'Nhà giả kim', 'TL01', 'NXB04', '2014-01-20', '95000.00', 28),
('S005', 'Đắc nhân tâm', 'TL05', 'NXB04', '2016-05-05', '110000.00', 48),
('S006', 'Giáo trình Java cơ bản', 'TL03', 'NXB03', '2020-08-01', '150000.00', 40),
('S007', 'Doraemon tập 1', 'TL04', 'NXB02', '2018-02-12', '30000.00', 38);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sach_tacgia`
--

CREATE TABLE `sach_tacgia` (
  `MaSach` varchar(10) NOT NULL,
  `MaTG` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sach_tacgia`
--

INSERT INTO `sach_tacgia` (`MaSach`, `MaTG`) VALUES
('S001', 'TG01'),
('S002', 'TG02'),
('S003', 'TG03'),
('S004', 'TG04'),
('S005', 'TG05'),
('S006', 'TG05'),
('S007', 'TG01');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tacgia`
--

CREATE TABLE `tacgia` (
  `MaTG` varchar(10) NOT NULL,
  `TenTG` varchar(150) NOT NULL,
  `QuocTich` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tacgia`
--

INSERT INTO `tacgia` (`MaTG`, `TenTG`, `QuocTich`) VALUES
('TG01', 'Nguyễn Nhật Ánh', 'Việt Nam'),
('TG02', 'Nam Cao', 'Việt Nam'),
('TG03', 'Haruki Murakami', 'Nhật Bản'),
('TG04', 'Paulo Coelho', 'Brazil'),
('TG05', 'Dale Carnegie', 'Hoa Kỳ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `theloai`
--

CREATE TABLE `theloai` (
  `MaTL` varchar(10) NOT NULL,
  `TenTL` varchar(100) NOT NULL,
  `MoTa` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `theloai`
--

INSERT INTO `theloai` (`MaTL`, `TenTL`, `MoTa`) VALUES
('TL01', 'Văn học', 'Tiểu thuyết, truyện ngắn, văn học trong và ngoài nước'),
('TL02', 'Khoa học', 'Sách khoa học, công nghệ, nghiên cứu'),
('TL03', 'Giáo trình', 'Sách phục vụ học tập, giảng dạy'),
('TL04', 'Thiếu nhi', 'Sách dành cho trẻ em'),
('TL05', 'Kỹ năng sống', 'Phát triển bản thân, kỹ năng mềm');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `ct_phieumuon`
--
ALTER TABLE `ct_phieumuon`
  ADD PRIMARY KEY (`MaPM`,`MaSach`),
  ADD KEY `MaSach` (`MaSach`);

--
-- Chỉ mục cho bảng `ct_phieunhap`
--
ALTER TABLE `ct_phieunhap`
  ADD PRIMARY KEY (`MaPN`,`MaSach`),
  ADD KEY `MaSach` (`MaSach`);

--
-- Chỉ mục cho bảng `ct_phieuphat`
--
ALTER TABLE `ct_phieuphat`
  ADD PRIMARY KEY (`MaPP`,`MaSach`,`MaQDP`),
  ADD KEY `fk_ctpp_sach` (`MaSach`),
  ADD KEY `MaQDP` (`MaQDP`);

--
-- Chỉ mục cho bảng `docgia`
--
ALTER TABLE `docgia`
  ADD PRIMARY KEY (`MaDG`);

--
-- Chỉ mục cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`MaNCC`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`);

--
-- Chỉ mục cho bảng `nhaxuatban`
--
ALTER TABLE `nhaxuatban`
  ADD PRIMARY KEY (`MaNXB`);

--
-- Chỉ mục cho bảng `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD PRIMARY KEY (`MaPM`),
  ADD KEY `MaDG` (`MaDG`),
  ADD KEY `MaNV` (`MaNV`);

--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPN`),
  ADD KEY `MaNV` (`MaNV`),
  ADD KEY `MaNCC` (`MaNCC`);

--
-- Chỉ mục cho bảng `phieuphat`
--
ALTER TABLE `phieuphat`
  ADD PRIMARY KEY (`MaPP`),
  ADD KEY `MaPM` (`MaPM`),
  ADD KEY `MaDG` (`MaDG`),
  ADD KEY `fk_pp_nhanvien` (`MaNV`);

--
-- Chỉ mục cho bảng `quydinhphat`
--
ALTER TABLE `quydinhphat`
  ADD PRIMARY KEY (`MaQDP`);

--
-- Chỉ mục cho bảng `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`MaSach`),
  ADD KEY `MaTL` (`MaTL`),
  ADD KEY `MaNXB` (`MaNXB`);

--
-- Chỉ mục cho bảng `sach_tacgia`
--
ALTER TABLE `sach_tacgia`
  ADD PRIMARY KEY (`MaSach`,`MaTG`),
  ADD KEY `MaTG` (`MaTG`);

--
-- Chỉ mục cho bảng `tacgia`
--
ALTER TABLE `tacgia`
  ADD PRIMARY KEY (`MaTG`);

--
-- Chỉ mục cho bảng `theloai`
--
ALTER TABLE `theloai`
  ADD PRIMARY KEY (`MaTL`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `ct_phieumuon`
--
ALTER TABLE `ct_phieumuon`
  ADD CONSTRAINT `ct_phieumuon_ibfk_1` FOREIGN KEY (`MaPM`) REFERENCES `phieumuon` (`MaPM`) ON DELETE CASCADE,
  ADD CONSTRAINT `ct_phieumuon_ibfk_2` FOREIGN KEY (`MaSach`) REFERENCES `sach` (`MaSach`);

--
-- Các ràng buộc cho bảng `ct_phieunhap`
--
ALTER TABLE `ct_phieunhap`
  ADD CONSTRAINT `ct_phieunhap_ibfk_1` FOREIGN KEY (`MaPN`) REFERENCES `phieunhap` (`MaPN`) ON DELETE CASCADE,
  ADD CONSTRAINT `ct_phieunhap_ibfk_2` FOREIGN KEY (`MaSach`) REFERENCES `sach` (`MaSach`);

--
-- Các ràng buộc cho bảng `ct_phieuphat`
--
ALTER TABLE `ct_phieuphat`
  ADD CONSTRAINT `ct_phieuphat_ibfk_1` FOREIGN KEY (`MaPP`) REFERENCES `phieuphat` (`MaPP`) ON DELETE CASCADE,
  ADD CONSTRAINT `ct_phieuphat_ibfk_2` FOREIGN KEY (`MaQDP`) REFERENCES `quydinhphat` (`MaQDP`),
  ADD CONSTRAINT `fk_ctpp_sach` FOREIGN KEY (`MaSach`) REFERENCES `sach` (`MaSach`);

--
-- Các ràng buộc cho bảng `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD CONSTRAINT `phieumuon_ibfk_1` FOREIGN KEY (`MaDG`) REFERENCES `docgia` (`MaDG`),
  ADD CONSTRAINT `phieumuon_ibfk_2` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

--
-- Các ràng buộc cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`),
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`MaNCC`) REFERENCES `nhacungcap` (`MaNCC`);

--
-- Các ràng buộc cho bảng `phieuphat`
--
ALTER TABLE `phieuphat`
  ADD CONSTRAINT `fk_pp_nhanvien` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`),
  ADD CONSTRAINT `phieuphat_ibfk_1` FOREIGN KEY (`MaPM`) REFERENCES `phieumuon` (`MaPM`),
  ADD CONSTRAINT `phieuphat_ibfk_2` FOREIGN KEY (`MaDG`) REFERENCES `docgia` (`MaDG`);

--
-- Các ràng buộc cho bảng `sach`
--
ALTER TABLE `sach`
  ADD CONSTRAINT `sach_ibfk_1` FOREIGN KEY (`MaTL`) REFERENCES `theloai` (`MaTL`),
  ADD CONSTRAINT `sach_ibfk_2` FOREIGN KEY (`MaNXB`) REFERENCES `nhaxuatban` (`MaNXB`);

--
-- Các ràng buộc cho bảng `sach_tacgia`
--
ALTER TABLE `sach_tacgia`
  ADD CONSTRAINT `sach_tacgia_ibfk_1` FOREIGN KEY (`MaSach`) REFERENCES `sach` (`MaSach`) ON DELETE CASCADE,
  ADD CONSTRAINT `sach_tacgia_ibfk_2` FOREIGN KEY (`MaTG`) REFERENCES `tacgia` (`MaTG`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
