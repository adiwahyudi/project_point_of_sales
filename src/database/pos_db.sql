-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
<<<<<<< Updated upstream
-- Generation Time: Jan 14, 2022 at 07:35 PM
=======
<<<<<<< Updated upstream
-- Generation Time: Jan 05, 2022 at 12:00 PM
=======
<<<<<<< Updated upstream
-- Generation Time: Jan 14, 2022 at 07:35 PM
>>>>>>> Stashed changes
>>>>>>> Stashed changes
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8
=======
-- Generation Time: Jan 14, 2022 at 02:20 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10
>>>>>>> Stashed changes

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
(8, 'mirja', 'mirja', 'cikoneng', '2019-01-03');

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
(5, 'Indomie', 'makanan', 3500, 1500);

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
(1, 1, 2, 'Rinso', 'Alat', 15000, 5, 75000),
(2, 1, 3, 'Roll', 'Makanan', 5000, 2, 10000),
(3, 1, 4, 'Aqua pack', 'Minuman', 10000, 7, 70000);

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

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` int(10) NOT NULL,
  `nama_supplier` varchar(60) DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL,
  `alamat_supplier` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`, `no_telp`, `alamat_supplier`) VALUES
(1, 'Indofood', '0855234567', 'Jakarta');

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
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `data_barang`
--
ALTER TABLE `data_barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `transaksi`
--
<<<<<<< Updated upstream
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
=======

ALTER TABLE `data_detailbelanja`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;


ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `data_detailbelanja`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id_supplier` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

>>>>>>> Stashed changes
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
