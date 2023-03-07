-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Mar 07, 2023 at 01:54 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `chef`
--

CREATE TABLE `chef` (
  `CHEFCODE` varchar(10) NOT NULL,
  `CHEFNAME` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `chef`
--

INSERT INTO `chef` (`CHEFCODE`, `CHEFNAME`) VALUES
('C001', 'Gordon Ramsay');

-- --------------------------------------------------------

--
-- Table structure for table `dietfood`
--

CREATE TABLE `dietfood` (
  `DIETCODE` varchar(10) NOT NULL,
  `FOODCODE` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dietfood`
--

INSERT INTO `dietfood` (`DIETCODE`, `FOODCODE`) VALUES
('D001', 'F251L'),
('D002', 'F0123S'),
('D002', 'F100S'),
('D002', 'F101S'),
('D033', 'F332S'),
('D033', 'F622S'),
('D111', 'F111S'),
('D123', 'F201S'),
('D123', 'F203S'),
('D123', 'F205S'),
('D123', 'F207S'),
('DDDDD', 'FFFFFF'),
('FFFFFF', 'C001');

-- --------------------------------------------------------

--
-- Table structure for table `food`
--

CREATE TABLE `food` (
  `FOODCODE` varchar(10) NOT NULL,
  `FOODNAME` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `food`
--

INSERT INTO `food` (`FOODCODE`, `FOODNAME`) VALUES
('F0123S', 'Chicken Fried Rice'),
('F100S', 'Boiled vegetables'),
('F101S', 'String Hoppers'),
('F111S', 'Chopsy'),
('F200L', 'Vegetable Soup'),
('F201S', 'KADALA'),
('F203S', 'HOPPERS'),
('F205S', 'THOSEI'),
('F207S', 'NOODLES'),
('F209S', 'ROTTI'),
('F211S', 'PITTU'),
('F213S', 'Sweet Patato'),
('F251L', 'Low sugar liquid diet'),
('F332S', 'Bread & Butter'),
('F622S', 'Milk Rice'),
('FF215F', 'Oats'),
('FFFFFF', 'xyz');

-- --------------------------------------------------------

--
-- Table structure for table `foodchef`
--

CREATE TABLE `foodchef` (
  `FOODCODE` varchar(10) NOT NULL,
  `CHEFCODE` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `foodchef`
--

INSERT INTO `foodchef` (`FOODCODE`, `CHEFCODE`) VALUES
('F0123S', 'C001'),
('F251L', 'C002');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `PCODE` varchar(10) NOT NULL,
  `FOODCODE` varchar(10) NOT NULL,
  `FOODNAME` varchar(40) DEFAULT NULL,
  `DATE` datetime NOT NULL DEFAULT current_timestamp(),
  `ATTCODE` varchar(10) DEFAULT NULL,
  `DELIVERED` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`PCODE`, `FOODCODE`, `FOODNAME`, `DATE`, `ATTCODE`, `DELIVERED`) VALUES
('P001', 'F1023', 'Poteto', '2023-02-25 20:53:28', NULL, 0),
('P005', 'F0123L', 'Low sugar liquid diet', '2023-02-19 06:17:49', 'W001', 0),
('P005', 'F0123S', 'Chicken Fried Rice', '2023-02-21 17:23:52', 'W001', 1),
('P005', 'F100S', 'Boiled vegetables', '2023-02-28 09:52:18', 'W006', 0),
('P005', 'F251L', 'Low sugar liquid diet', '2023-02-28 10:33:38', 'null', 0),
('P005', 'F251L', 'Low sugar liquid diet', '2023-03-02 22:19:33', 'null', 0),
('P006', 'F100S', 'Bread & Butter', '2023-02-25 16:48:40', 'W002', 1),
('P009', 'F622S', 'Milk Rice', '2023-02-25 16:52:57', 'W001', 0),
('P009', 'F332S', 'Bread & Butter', '2023-02-28 10:06:28', 'W006', 0),
('P009', 'F332S', 'Bread & Butter', '2023-02-28 10:07:15', 'W006', 0),
('P009', 'F622S', 'Milk Rice', '2023-02-28 10:34:58', 'W002', 0),
('P009', 'F332S', 'Bread & Butter', '2023-03-02 22:30:10', 'null', 0),
('P100', 'F201S', 'KADALA', '2023-02-21 11:50:42', NULL, 0),
('P100', 'F205S', 'THOSEI', '2023-02-21 17:24:57', 'W001', 1),
('P100', 'F201S', 'KADALA', '2023-02-28 09:50:00', 'null', 0),
('P100', 'F207S', 'NOODLES', '2023-02-28 10:09:16', 'W002', 0),
('P100', 'F205S', 'THOSEI', '2023-03-02 22:28:18', 'null', 0),
('P100', 'F203S', 'HOPPERS', '2023-03-02 22:34:08', 'null', 0),
('P666', 'F1023', 'Poteto', '2023-02-21 16:53:08', 'W001', 0);

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `PCODE` varchar(10) NOT NULL,
  `PNAME` varchar(30) NOT NULL,
  `DIETCODE` varchar(10) NOT NULL,
  `BEDCODE` varchar(10) NOT NULL,
  `ALLERGY` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`PCODE`, `PNAME`, `DIETCODE`, `BEDCODE`, `ALLERGY`) VALUES
('P005', 'F.B. Amarasinghe', 'D001', 'W03B111', 'Peanut'),
('P006', 'Ryan', 'D006', 'W03B008', 'Tomato'),
('P009', 'Dilupa Theekshana', 'D033', 'W05B055', ''),
('P100', 'Padma Ranaweera', 'D123', 'W05B212', 'no'),
('P335', 'Bimindu', 'D033', 'W35B225', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `usernamepassword`
--

CREATE TABLE `usernamepassword` (
  `EMP_CODE` varchar(10) NOT NULL,
  `USERNAME` varchar(30) NOT NULL,
  `PASSWORD` varchar(30) NOT NULL,
  `POSITION` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usernamepassword`
--

INSERT INTO `usernamepassword` (`EMP_CODE`, `USERNAME`, `PASSWORD`, `POSITION`) VALUES
('W006', 'abc', 'W006', 'Ward Clerk'),
('W001', 'amaris@hospital', 'W001', 'Ward Clerk'),
('A001', 'bimindu@admin', 'A001', 'admin'),
('C001', 'gordon@kitchen', '', 'Chef'),
('W008', 'John@hospital', 'W008', 'Ward Clerk'),
('W002', 'ranil@hospital', 'W002', 'Ward Clerk');

-- --------------------------------------------------------

--
-- Table structure for table `wardclerk`
--

CREATE TABLE `wardclerk` (
  `ATTCODE` varchar(10) NOT NULL,
  `NAME` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `wardclerk`
--

INSERT INTO `wardclerk` (`ATTCODE`, `NAME`) VALUES
('W001', 'P.K. Amaris'),
('W007', 'Anne Marie'),
('W008', 'John');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chef`
--
ALTER TABLE `chef`
  ADD PRIMARY KEY (`CHEFCODE`);

--
-- Indexes for table `dietfood`
--
ALTER TABLE `dietfood`
  ADD PRIMARY KEY (`DIETCODE`,`FOODCODE`),
  ADD KEY `FOODCODE` (`FOODCODE`);

--
-- Indexes for table `food`
--
ALTER TABLE `food`
  ADD PRIMARY KEY (`FOODCODE`);

--
-- Indexes for table `foodchef`
--
ALTER TABLE `foodchef`
  ADD PRIMARY KEY (`FOODCODE`,`CHEFCODE`),
  ADD KEY `CHEFCODE` (`CHEFCODE`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`PCODE`,`DATE`),
  ADD KEY `ATTCODE` (`ATTCODE`),
  ADD KEY `FOODCODE` (`FOODCODE`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`PCODE`),
  ADD KEY `DIETCODE` (`DIETCODE`);

--
-- Indexes for table `usernamepassword`
--
ALTER TABLE `usernamepassword`
  ADD PRIMARY KEY (`USERNAME`);

--
-- Indexes for table `wardclerk`
--
ALTER TABLE `wardclerk`
  ADD PRIMARY KEY (`ATTCODE`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
