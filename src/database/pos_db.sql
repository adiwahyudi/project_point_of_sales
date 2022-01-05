-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2022 at 12:00 PM
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
(1, 'admin', 'admin', 'admin', 'admin');

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
(4, 'Aqua pack', 'Minuman', 10000, 6000);

-- --------------------------------------------------------

--
-- Table structure for table `data_detailbelanja`
--

CREATE TABLE `data_detailbelanja` (
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

INSERT INTO `data_detailbelanja` (`id_barang`, `nama_Barang`, `kategori`, `Harga_jual`, `jumlah_item`, `harga_Total`) VALUES
(2, 'Rinso', 'Alat', 15000, 5, 75000),
(3, 'Roll', 'Makanan', 5000, 2, 10000),
(4, 'Aqua pack', 'Minuman', 10000, 4, 40000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cashier`
--
ALTER TABLE `cashier`
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
  ADD PRIMARY KEY (`id_barang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cashier`
--
ALTER TABLE `cashier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `data_barang`
--
ALTER TABLE `data_barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `data_detailbelanja`
--
ALTER TABLE `data_detailbelanja`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
