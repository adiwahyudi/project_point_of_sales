-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 16, 2022 at 04:08 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pos_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `cashier`
--

CREATE TABLE `cashier` (
  `id` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `kode` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cashier`
--

INSERT INTO `cashier` (`id`, `username`, `password`, `nama`, `kode`) VALUES
(1, 'admin', 'admin', 'admin', 'admin'),
(2, 'adi', 'adi', 'adi', 'adi');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `name` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `dob` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `username`, `name`, `alamat`, `dob`) VALUES
(1, 'adi', 'adi', 'Denpasar', '2001-01-14'),
(2, 'ikram', 'ikram', 'Kendari', '2001-05-02'),
(3, 'fahrul', 'fahrul', 'Makassar', '2001-06-28'),
(5, 'updaye', 'user', 'user', '2020-04-15'),
(8, 'mirja', 'mirja', 'cikoneng', '2019-01-03'),
(9, 'emmmbeeeeeeeeeekkk', 'embek', 'Telekomunikasi', '2013-05-20');

-- --------------------------------------------------------

--
-- Table structure for table `data_barang`
--

CREATE TABLE `data_barang` (
  `id_barang` int(11) NOT NULL,
  `nama_Barang` varchar(60) DEFAULT NULL,
  `kategori` varchar(60) DEFAULT NULL,
  `harga_jual` bigint(20) DEFAULT NULL,
  `harga_beli` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_barang`
--

INSERT INTO `data_barang` (`id_barang`, `nama_Barang`, `kategori`, `harga_jual`, `harga_beli`) VALUES
(1, 'cheetos', 'makanan', 10000, 5000),
(2, 'Rinso', 'Alat', 15000, 10000),
(4, 'Aqua pack', 'Minuman', 10000, 6000),
(5, 'Indomie', 'makanan', 3500, 1500),
(6, 'Baju Koko', 'Fashion Pria', 150000, 100000);

-- --------------------------------------------------------

--
-- Table structure for table `data_detailbelanja`
--

CREATE TABLE `data_detailbelanja` (
  `id` int(11) NOT NULL,
  `id_transaksi` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `nama_Barang` varchar(60) NOT NULL,
  `kategori` varchar(60) NOT NULL,
  `Harga_jual` bigint(20) NOT NULL,
  `jumlah_item` bigint(20) NOT NULL,
  `harga_Total` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_detailbelanja`
--

INSERT INTO `data_detailbelanja` (`id`, `id_transaksi`, `id_barang`, `nama_Barang`, `kategori`, `Harga_jual`, `jumlah_item`, `harga_Total`) VALUES
(2, 1, 3, 'Roll', 'Makanan', 5000, 2, 10000),
(8, 4, 4, 'Aqua pack', 'Minuman', 10000, 2, 20000),
(9, 4, 1, 'cheetos', 'makanan', 10000, 5, 50000),
(16, 5, 4, 'Aqua pack', 'Minuman', 10000, 2, 20000),
(19, 2, 5, 'Indomie', 'makanan', 3500, 4, 14000),
(20, 2, 1, 'cheetos', 'makanan', 10000, 2, 20000),
(21, 5, 6, 'Baju Koko', 'Fashion Pria', 150000, 1, 150000),
(22, 6, 1, 'cheetos', 'makanan', 10000, 3, 30000),
(23, 7, 5, 'Indomie', 'makanan', 3500, 3, 10500),
(24, 8, 6, 'Baju Koko', 'Fashion Pria', 150000, 1, 150000),
(25, 9, 1, 'cheetos', 'makanan', 10000, 2, 20000),
(26, 10, 5, 'Indomie', 'makanan', 3500, 3, 10500),
(27, 11, 1, 'cheetos', 'makanan', 10000, 12, 120000),
(30, 12, 2, 'Rinso', 'Alat', 15000, 2, 30000),
(31, 12, 4, 'Aqua pack', 'Minuman', 10000, 3, 30000),
(37, 13, 6, 'Baju Koko', 'Fashion Pria', 150000, 3, 450000),
(38, 14, 4, 'Aqua pack', 'Minuman', 10000, 2, 20000),
(39, 15, 4, 'Aqua pack', 'Minuman', 10000, 2, 20000),
(40, 16, 4, 'Aqua pack', 'Minuman', 10000, 2, 20000),
(41, 17, 4, 'Aqua pack', 'Minuman', 10000, 3, 30000),
(42, 18, 6, 'Baju Koko', 'Fashion Pria', 150000, 2, 300000),
(43, 18, 1, 'cheetos', 'makanan', 10000, 2, 20000),
(44, 19, 5, 'Indomie', 'makanan', 3500, 2, 7000),
(45, 19, 2, 'Rinso', 'Alat', 15000, 2, 30000),
(46, 20, 5, 'Indomie', 'makanan', 3500, 2, 7000),
(47, 20, 1, 'cheetos', 'makanan', 10000, 3, 30000),
(48, 21, 1, 'cheetos', 'makanan', 10000, 3, 30000),
(49, 21, 6, 'Baju Koko', 'Fashion Pria', 150000, 1, 150000),
(50, 22, 2, 'Rinso', 'Alat', 15000, 2, 30000),
(51, 22, 6, 'Baju Koko', 'Fashion Pria', 150000, 1, 150000),
(52, 22, 5, 'Indomie', 'makanan', 3500, 3, 10500),
(53, 23, 2, 'Rinso', 'Alat', 15000, 1, 15000),
(54, 23, 5, 'Indomie', 'makanan', 3500, 3, 10500),
(57, 24, 6, 'Baju Koko', 'Fashion Pria', 150000, 3, 450000),
(58, 24, 1, 'cheetos', 'makanan', 10000, 2, 20000),
(59, 25, 4, 'Aqua pack', 'Minuman', 10000, 3, 30000),
(60, 25, 2, 'Rinso', 'Alat', 15000, 2, 30000),
(61, 25, 6, 'Baju Koko', 'Fashion Pria', 150000, 3, 450000),
(62, 26, 5, 'Indomie', 'makanan', 3500, 3, 10500),
(63, 26, 4, 'Aqua pack', 'Minuman', 10000, 1, 10000),
(64, 27, 5, 'Indomie', 'makanan', 3500, 1, 3500),
(65, 28, 5, 'Indomie', 'makanan', 3500, 2, 7000),
(66, 28, 1, 'cheetos', 'makanan', 10000, 3, 30000),
(67, 29, 2, 'Rinso', 'Alat', 15000, 3, 45000),
(68, 29, 6, 'Baju Koko', 'Fashion Pria', 150000, 2, 300000),
(69, 29, 1, 'cheetos', 'makanan', 10000, 2, 20000),
(70, 30, 4, 'Aqua pack', 'Minuman', 10000, 3, 30000),
(71, 30, 6, 'Baju Koko', 'Fashion Pria', 150000, 2, 300000),
(72, 31, 2, 'Rinso', 'Alat', 15000, 3, 45000),
(73, 31, 6, 'Baju Koko', 'Fashion Pria', 150000, 3, 450000),
(74, 32, 2, 'Rinso', 'Alat', 15000, 3, 45000),
(75, 32, 6, 'Baju Koko', 'Fashion Pria', 150000, 3, 450000),
(76, 32, 1, 'cheetos', 'makanan', 10000, 3, 30000),
(77, 33, 4, 'Aqua pack', 'Minuman', 10000, 2, 20000),
(78, 33, 6, 'Baju Koko', 'Fashion Pria', 150000, 1, 150000),
(79, 34, 2, 'Rinso', 'Alat', 15000, 2, 30000),
(80, 34, 5, 'Indomie', 'makanan', 3500, 3, 10500),
(81, 35, 5, 'Indomie', 'makanan', 3500, 2, 7000),
(82, 35, 1, 'cheetos', 'makanan', 10000, 3, 30000),
(83, 36, 1, 'cheetos', 'makanan', 10000, 2, 20000),
(84, 36, 6, 'Baju Koko', 'Fashion Pria', 150000, 1, 150000),
(85, 37, 1, 'cheetos', 'makanan', 10000, 2, 20000),
(86, 37, 4, 'Aqua pack', 'Minuman', 10000, 3, 30000),
(87, 38, 2, 'Rinso', 'Alat', 15000, 3, 45000),
(88, 40, 5, 'Indomie', 'makanan', 3500, 3, 10500),
(89, 40, 6, 'Baju Koko', 'Fashion Pria', 150000, 1, 150000),
(90, 41, 6, 'Baju Koko', 'Fashion Pria', 150000, 3, 450000),
(91, 41, 4, 'Aqua pack', 'Minuman', 10000, 2, 20000),
(92, 42, 6, 'Baju Koko', 'Fashion Pria', 150000, 3, 450000),
(93, 42, 4, 'Aqua pack', 'Minuman', 10000, 2, 20000),
(94, 42, 1, 'cheetos', 'makanan', 10000, 3, 30000),
(95, 43, 6, 'Baju Koko', 'Fashion Pria', 150000, 3, 450000),
(96, 43, 1, 'cheetos', 'makanan', 10000, 3, 30000),
(97, 44, 6, 'Baju Koko', 'Fashion Pria', 150000, 3, 450000),
(98, 44, 1, 'cheetos', 'makanan', 10000, 2, 20000),
(99, 44, 5, 'Indomie', 'makanan', 3500, 2, 7000),
(100, 45, 6, 'Baju Koko', 'Fashion Pria', 150000, 2, 300000),
(101, 45, 2, 'Rinso', 'Alat', 15000, 2, 30000),
(102, 45, 5, 'Indomie', 'makanan', 3500, 3, 10500),
(103, 45, 1, 'cheetos', 'makanan', 10000, 4, 40000),
(104, 46, 6, 'Baju Koko', 'Fashion Pria', 150000, 3, 450000),
(105, 46, 1, 'cheetos', 'makanan', 10000, 5, 50000),
(106, 46, 4, 'Aqua pack', 'Minuman', 10000, 2, 20000),
(107, 47, 6, 'Baju Koko', 'Fashion Pria', 150000, 2, 300000),
(108, 47, 1, 'cheetos', 'makanan', 10000, 4, 40000),
(109, 47, 5, 'Indomie', 'makanan', 3500, 2, 7000);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(11) NOT NULL,
  `id_cashier` int(11) NOT NULL,
  `id_customer` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `waktu` varchar(255) NOT NULL,
  `pembayaran` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `id_cashier`, `id_customer`, `total`, `waktu`, `pembayaran`) VALUES
(1, 2, 1, 139500, 'Sab, 15 Jan 2022. 03:48:33', 'Credit'),
(2, 2, 3, 37000, 'Sab, 15 Jan 2022. 16:29:22', 'Cash'),
(3, 2, 2, 37000, 'Sab, 15 Jan 2022. 16:31:35', 'Cash'),
(4, 1, 1, 63000, 'Sab, 15 Jan 2022. 16:39:46', 'Credit'),
(5, 2, 3, 170000, 'Min, 16 Jan 2022. 02:52:17', 'Cash'),
(6, 2, 2, 30000, 'Min, 16 Jan 2022. 02:56:29', 'Cash'),
(7, 2, 2, 10500, 'Min, 16 Jan 2022. 02:57:26', 'Cash'),
(8, 2, 1, 150000, 'Min, 16 Jan 2022. 03:02:24', 'Cash'),
(9, 2, 3, 20000, 'Min, 16 Jan 2022. 03:06:36', 'Cash'),
(10, 2, 3, 10500, 'Min, 16 Jan 2022. 12:55:43', 'Cash'),
(11, 2, 3, 120000, 'Min, 16 Jan 2022. 12:58:08', 'Cash'),
(12, 1, 3, 60000, 'Min, 16 Jan 2022. 13:12:12', 'Cash'),
(13, 2, 3, 450000, 'Min, 16 Jan 2022. 14:32:52', 'Cash'),
(14, 2, 1, 20000, 'Min, 16 Jan 2022. 14:34:06', 'Cash'),
(15, 2, 3, 20000, 'Min, 16 Jan 2022. 14:36:35', 'Cash'),
(16, 2, 2, 20000, 'Min, 16 Jan 2022. 15:01:48', 'Cash'),
(17, 2, 2, 30000, 'Min, 16 Jan 2022. 15:03:06', 'Cash'),
(18, 2, 1, 320000, 'Min, 16 Jan 2022. 15:31:27', 'Cash'),
(19, 2, 3, 37000, 'Min, 16 Jan 2022. 15:45:41', 'Cash'),
(20, 2, 1, 37000, 'Min, 16 Jan 2022. 16:40:22', 'Cash'),
(21, 2, 2, 180000, 'Min, 16 Jan 2022. 16:43:28', 'Cash'),
(22, 2, 1, 190500, 'Min, 16 Jan 2022. 16:48:00', 'Cash'),
(23, 2, 2, 25500, 'Min, 16 Jan 2022. 16:56:28', 'Cash'),
(24, 2, 2, 470000, 'Min, 16 Jan 2022. 16:59:58', 'Cash'),
(25, 2, 2, 510000, 'Min, 16 Jan 2022. 17:09:15', 'Cash'),
(26, 2, 2, 20500, 'Min, 16 Jan 2022. 19:49:40', 'Cash'),
(27, 2, 3, 3500, 'Min, 16 Jan 2022. 19:52:31', 'Cash'),
(28, 2, 3, 37000, 'Min, 16 Jan 2022. 19:57:23', 'Cash'),
(29, 2, 2, 365000, 'Min, 16 Jan 2022. 20:10:28', 'Cash'),
(30, 2, 2, 330000, 'Min, 16 Jan 2022. 20:40:39', 'Cash'),
(31, 2, 2, 495000, 'Min, 16 Jan 2022. 21:11:53', 'Cash'),
(32, 2, 2, 525000, 'Min, 16 Jan 2022. 21:17:19', 'Cash'),
(33, 2, 3, 170000, 'Min, 16 Jan 2022. 21:21:05', 'Cash'),
(34, 2, 3, 40500, 'Min, 16 Jan 2022. 21:27:56', 'Cash'),
(35, 2, 2, 37000, 'Min, 16 Jan 2022. 21:30:07', 'Cash'),
(36, 2, 2, 170000, 'Min, 16 Jan 2022. 21:33:39', 'Cash'),
(37, 2, 3, 50000, 'Min, 16 Jan 2022. 21:36:44', 'Cash'),
(38, 2, 2, 45000, 'Min, 16 Jan 2022. 21:40:59', 'Cash'),
(39, 2, 3, 0, 'Min, 16 Jan 2022. 21:47:45', 'Cash'),
(40, 2, 3, 160500, 'Min, 16 Jan 2022. 21:48:09', 'Cash'),
(41, 2, 9, 470000, 'Min, 16 Jan 2022. 21:49:22', 'Cash'),
(42, 2, 1, 500000, 'Min, 16 Jan 2022. 21:53:53', 'Cash'),
(43, 2, 2, 480000, 'Min, 16 Jan 2022. 21:55:49', 'Cash'),
(44, 2, 2, 477000, 'Min, 16 Jan 2022. 21:58:49', 'Cash'),
(45, 2, 2, 380500, 'Min, 16 Jan 2022. 22:01:56', 'Cash'),
(46, 2, 3, 520000, 'Min, 16 Jan 2022. 22:03:09', 'Cash'),
(47, 2, 2, 347000, 'Min, 16 Jan 2022. 22:05:22', 'Cash');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cashier`
--
ALTER TABLE `cashier`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `data_barang`
--
ALTER TABLE `data_barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `data_detailbelanja`
--
ALTER TABLE `data_detailbelanja`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cashier`
--
ALTER TABLE `cashier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `data_barang`
--
ALTER TABLE `data_barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `data_detailbelanja`
--
ALTER TABLE `data_detailbelanja`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=110;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
