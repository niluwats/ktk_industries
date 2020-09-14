-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.62 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for central_insdustries
CREATE DATABASE IF NOT EXISTS `central_insdustries` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `central_insdustries`;

-- Dumping structure for table central_insdustries.account_types
CREATE TABLE IF NOT EXISTS `account_types` (
  `id` varchar(15) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.account_types: ~0 rows (approximately)
DELETE FROM `account_types`;
/*!40000 ALTER TABLE `account_types` DISABLE KEYS */;
/*!40000 ALTER TABLE `account_types` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.allowances
CREATE TABLE IF NOT EXISTS `allowances` (
  `idallowances` int(11) NOT NULL,
  `id_employee` varchar(15) NOT NULL,
  `type` varchar(50) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `valid_period` date DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idallowances`),
  KEY `fk_allowances_employee1_idx` (`id_employee`),
  CONSTRAINT `fk_allowances_employee1` FOREIGN KEY (`id_employee`) REFERENCES `employee` (`id_employee`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.allowances: ~0 rows (approximately)
DELETE FROM `allowances`;
/*!40000 ALTER TABLE `allowances` DISABLE KEYS */;
/*!40000 ALTER TABLE `allowances` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.attendance
CREATE TABLE IF NOT EXISTS `attendance` (
  `idattendance` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `inTime` time DEFAULT NULL,
  `outTime` time DEFAULT NULL,
  `id_employee` varchar(15) NOT NULL,
  `shift` varchar(45) DEFAULT NULL,
  `id_leave` int(11) DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  `status` varchar(50) NOT NULL,
  PRIMARY KEY (`idattendance`),
  KEY `fk_attendance_employee1_idx` (`id_employee`),
  KEY `fk_attendance_emp_leave1_idx` (`id_leave`),
  CONSTRAINT `fk_attendance_employee1` FOREIGN KEY (`id_employee`) REFERENCES `employee` (`id_employee`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_attendance_emp_leave1` FOREIGN KEY (`id_leave`) REFERENCES `emp_leave` (`id_leave`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=114 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.attendance: ~104 rows (approximately)
DELETE FROM `attendance`;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` (`idattendance`, `date`, `inTime`, `outTime`, `id_employee`, `shift`, `id_leave`, `department`, `status`) VALUES
	(1, '2019-09-20', NULL, NULL, 'EMP0001', '08:00-17:00', 0, '', 'Present'),
	(2, '2019-09-20', NULL, NULL, 'EMP0003', '08:00-17:00', 0, '', 'Present'),
	(3, '2019-09-20', NULL, NULL, 'EMP0004', '07:00-19:00', 0, '', 'Present'),
	(4, '2019-09-22', NULL, NULL, 'EMP0004', '08:00-17:30', 0, 'Production', 'Present'),
	(5, '2019-09-23', NULL, NULL, 'EMP0001', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(6, '2018-08-23', NULL, NULL, 'EMP0003', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(7, '2019-09-25', NULL, NULL, 'EMP0004', '07:00-19:00', 0, 'Production', 'Half day - Morning'),
	(8, '2019-09-26', NULL, NULL, 'EMP0004', '08:00-17:00', 0, 'Production', 'Half day - Morning'),
	(9, '2019-09-25', NULL, NULL, 'EMP0005', '08:00-17:00', 0, 'Human Resource', 'Present'),
	(10, '2019-09-25', NULL, NULL, 'EMP0006', '08:00-17:00', 0, 'Human Resource', 'paid/Half day - Morning'),
	(11, '2019-09-25', NULL, NULL, 'EMP0007', '08:00-17:00', 0, 'Human Resource', 'Present'),
	(12, '2019-09-26', NULL, NULL, 'EMP0005', '08:00-17:00', 0, 'Human Resource', 'Present'),
	(13, '2019-09-26', NULL, NULL, 'EMP0006', '08:00-17:00', 0, 'Human Resource', 'Present'),
	(14, '2019-09-26', NULL, NULL, 'EMP0007', '08:00-17:00', 0, 'Human Resource', 'paid/Half day - Evening'),
	(15, '2019-09-27', NULL, NULL, 'EMP0005', '08:00-17:00', 0, 'Human Resource', 'paid/Half day - Evening'),
	(16, '2019-09-27', NULL, NULL, 'EMP0006', '08:00-17:00', 0, 'Human Resource', 'Present'),
	(17, '2019-09-27', NULL, NULL, 'EMP0007', '08:00-17:00', 0, 'Human Resource', 'Present'),
	(18, '2019-09-28', NULL, NULL, 'EMP0005', '08:00-17:00', 0, 'Human Resource', 'paid/Absent'),
	(19, '2019-09-28', NULL, NULL, 'EMP0006', '08:00-17:00', 0, 'Human Resource', 'Present'),
	(20, '2019-09-28', NULL, NULL, 'EMP0007', '08:00-17:00', 0, 'Human Resource', 'paid/Half day - Evening'),
	(21, '2019-09-29', NULL, NULL, 'EMP0005', '08:00-17:00', 0, 'Human Resource', 'Present'),
	(22, '2019-09-29', NULL, NULL, 'EMP0006', '08:00-17:00', 0, 'Human Resource', 'Present'),
	(23, '2019-09-29', NULL, NULL, 'EMP0007', '08:00-17:00', 0, 'Human Resource', 'Present'),
	(24, '2019-09-25', NULL, NULL, 'EMP0001', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(25, '2019-09-25', NULL, NULL, 'EMP0003', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(26, '2019-09-25', NULL, NULL, 'EMP0008', '08:00-17:30', 0, 'Sales & Marketing', 'paid/Half day - Morning'),
	(27, '2019-09-25', NULL, NULL, 'EMP0010', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(28, '2019-09-26', NULL, NULL, 'EMP0001', '08:00-17:30', 0, 'Sales & Marketing', 'paid/Half day - Morning'),
	(29, '2019-09-26', NULL, NULL, 'EMP0003', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(30, '2019-09-26', NULL, NULL, 'EMP0008', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(31, '2019-09-26', NULL, NULL, 'EMP0010', '08:00-17:30', 0, 'Sales & Marketing', 'No pay/ Half day - Morning'),
	(32, '2019-09-27', NULL, NULL, 'EMP0001', '08:00-17:30', 0, 'Sales & Marketing', 'paid/Absent'),
	(33, '2019-09-27', NULL, NULL, 'EMP0003', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(34, '2019-09-27', NULL, NULL, 'EMP0008', '08:00-17:30', 0, 'Sales & Marketing', 'Short leave - Morning'),
	(35, '2019-09-27', NULL, NULL, 'EMP0010', '08:00-17:30', 0, 'Sales & Marketing', 'paid/Half day - Evening'),
	(36, '2019-09-28', NULL, NULL, 'EMP0001', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(37, '2019-09-28', NULL, NULL, 'EMP0003', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(38, '2019-09-28', NULL, NULL, 'EMP0008', '08:00-17:30', 0, 'Sales & Marketing', 'Short leave - Evening'),
	(39, '2019-09-28', NULL, NULL, 'EMP0010', '08:00-17:30', 0, 'Sales & Marketing', 'No pay/ Half day - Evening'),
	(40, '2019-09-30', NULL, NULL, 'EMP0001', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(41, '2019-09-30', NULL, NULL, 'EMP0003', '08:00-17:30', 0, 'Sales & Marketing', 'paid/Half day - Evening'),
	(42, '2019-09-30', NULL, NULL, 'EMP0008', '08:00-17:30', 0, 'Sales & Marketing', 'Present'),
	(43, '2019-09-30', NULL, NULL, 'EMP0010', '08:00-17:30', 0, 'Sales & Marketing', 'Short leave - Evening'),
	(44, '2019-09-27', NULL, NULL, 'EMP0004', '07:00-19:00', 0, 'Production', 'Present'),
	(45, '2019-09-27', NULL, NULL, 'EMP0012', '07:00-19:00', 0, 'Production', 'Present'),
	(46, '2019-09-27', NULL, NULL, 'EMP0013', '07:00-19:00', 0, 'Production', 'Short leave - Evening'),
	(47, '2019-09-27', NULL, NULL, 'EMP0014', '07:00-19:00', 0, 'Production', 'Present'),
	(48, '2019-09-27', NULL, NULL, 'EMP0015', '07:00-19:00', 0, 'Production', 'Present'),
	(49, '2019-09-27', NULL, NULL, 'EMP0016', '07:00-19:00', 0, 'Production', 'paid/Half day - Morning'),
	(50, '2019-09-27', NULL, NULL, 'EMP0017', '07:00-19:00', 0, 'Production', 'Present'),
	(51, '2019-09-27', NULL, NULL, 'EMP0018', '07:00-19:00', 0, 'Production', 'Present'),
	(52, '2019-09-27', NULL, NULL, 'EMP0019', '07:00-19:00', 0, 'Production', 'Present'),
	(53, '2019-09-28', NULL, NULL, 'EMP0004', '07:00-19:00', 0, 'Production', 'Present'),
	(54, '2019-09-28', NULL, NULL, 'EMP0012', '08:00-17:00', 0, 'Production', 'Present'),
	(55, '2019-09-28', NULL, NULL, 'EMP0013', '08:00-17:00', 0, 'Production', 'Present'),
	(56, '2019-09-28', NULL, NULL, 'EMP0014', '07:00-19:00', 0, 'Production', 'Present'),
	(57, '2019-09-28', NULL, NULL, 'EMP0015', '07:00-19:00', 0, 'Production', 'Present'),
	(58, '2019-09-28', NULL, NULL, 'EMP0016', '07:00-19:00', 0, 'Production', 'Present'),
	(59, '2019-09-28', NULL, NULL, 'EMP0017', '07:00-19:00', 0, 'Production', 'paid/Half day - Evening'),
	(60, '2019-09-28', NULL, NULL, 'EMP0018', '07:00-19:00', 0, 'Production', 'Present'),
	(61, '2019-09-28', NULL, NULL, 'EMP0019', '07:00-19:00', 0, 'Production', 'Present'),
	(62, '2019-09-30', NULL, NULL, 'EMP0004', '07:00-19:00', 0, 'Production', 'Present'),
	(63, '2019-09-30', NULL, NULL, 'EMP0012', '07:00-19:00', 0, 'Production', 'Present'),
	(64, '2019-09-30', NULL, NULL, 'EMP0013', '07:00-19:00', 0, 'Production', 'Present'),
	(65, '2019-09-30', NULL, NULL, 'EMP0014', '07:00-19:00', 0, 'Production', 'paid/Absent'),
	(66, '2019-09-30', NULL, NULL, 'EMP0015', '07:00-19:00', 0, 'Production', 'Present'),
	(67, '2019-09-30', NULL, NULL, 'EMP0016', '07:00-19:00', 0, 'Production', 'Present'),
	(68, '2019-09-30', NULL, NULL, 'EMP0017', '07:00-19:00', 0, 'Production', 'paid/Half day - Evening'),
	(69, '2019-09-30', NULL, NULL, 'EMP0018', '07:00-19:00', 0, 'Production', 'Present'),
	(70, '2019-09-30', NULL, NULL, 'EMP0019', '07:00-19:00', 0, 'Production', 'No pay/ Full day'),
	(71, '2019-09-24', NULL, NULL, 'EMP0004', '07:00-19:00', 0, 'Production', 'Present'),
	(72, '2019-09-24', NULL, NULL, 'EMP0012', '07:00-19:00', 0, 'Production', 'Present'),
	(73, '2019-09-24', NULL, NULL, 'EMP0013', '07:00-19:00', 0, 'Production', 'paid/Absent'),
	(74, '2019-09-24', NULL, NULL, 'EMP0014', '07:00-19:00', 0, 'Production', 'Present'),
	(75, '2019-09-24', NULL, NULL, 'EMP0015', '07:00-19:00', 0, 'Production', 'Present'),
	(76, '2019-09-24', NULL, NULL, 'EMP0016', '07:00-19:00', 0, 'Production', 'Present'),
	(77, '2019-09-24', NULL, NULL, 'EMP0017', '07:00-19:00', 0, 'Production', 'Present'),
	(78, '2019-09-24', NULL, NULL, 'EMP0018', '07:00-19:00', 0, 'Production', 'Present'),
	(79, '2019-09-24', NULL, NULL, 'EMP0019', '07:00-19:00', 0, 'Production', 'Present'),
	(80, '2019-09-23', NULL, NULL, 'EMP0004', '07:00-19:00', 0, 'Production', 'Present'),
	(81, '2019-09-23', NULL, NULL, 'EMP0012', '07:00-19:00', 0, 'Production', 'Present'),
	(82, '2019-09-23', NULL, NULL, 'EMP0013', '07:00-19:00', 0, 'Production', 'Present'),
	(83, '2019-09-23', NULL, NULL, 'EMP0014', '07:00-19:00', 0, 'Production', 'Present'),
	(84, '2019-09-23', NULL, NULL, 'EMP0015', '07:00-19:00', 0, 'Production', 'paid/Half day - Morning'),
	(85, '2019-09-23', NULL, NULL, 'EMP0016', '07:00-19:00', 0, 'Production', 'Present'),
	(86, '2019-09-23', NULL, NULL, 'EMP0017', '07:00-19:00', 0, 'Production', 'Present'),
	(87, '2019-09-23', NULL, NULL, 'EMP0018', '07:00-19:00', 0, 'Production', 'Present'),
	(88, '2019-09-23', NULL, NULL, 'EMP0019', '07:00-19:00', 0, 'Production', 'Present'),
	(89, '2019-09-02', NULL, NULL, 'EMP0004', '07:00-19:00', NULL, 'Production', 'Present'),
	(90, '2019-09-02', NULL, NULL, 'EMP0012', '07:00-19:00', NULL, 'Production', 'paid/Half day - Morning'),
	(91, '2019-09-02', NULL, NULL, 'EMP0013', '07:00-19:00', NULL, 'Production', 'Present'),
	(92, '2019-09-02', NULL, NULL, 'EMP0014', '07:00-19:00', NULL, 'Production', 'Present'),
	(93, '2019-09-02', NULL, NULL, 'EMP0015', 'null', NULL, 'Production', 'null'),
	(94, '2019-09-02', NULL, NULL, 'EMP0016', 'null', NULL, 'Production', 'null'),
	(95, '2019-09-02', NULL, NULL, 'EMP0017', 'null', NULL, 'Production', 'null'),
	(96, '2019-09-02', NULL, NULL, 'EMP0018', 'null', NULL, 'Production', 'null'),
	(97, '2019-09-02', NULL, NULL, 'EMP0019', 'null', NULL, 'Production', 'null'),
	(98, '2019-09-02', NULL, NULL, 'EMP0022', 'null', NULL, 'Production', 'null'),
	(99, '2019-09-03', NULL, NULL, 'EMP0005', '19:00-07:00', NULL, 'Human Resource', 'Present'),
	(100, '2019-09-03', NULL, NULL, 'EMP0006', '08:00-17:00', NULL, 'Human Resource', 'Present'),
	(101, '2019-09-03', NULL, NULL, 'EMP0007', '08:00-17:00', NULL, 'Human Resource', 'Present'),
	(102, '2019-09-04', NULL, NULL, 'EMP0005', '08:00-17:00', NULL, 'Human Resource', 'Present'),
	(103, '2019-09-04', NULL, NULL, 'EMP0006', '07:00-19:00', NULL, 'Human Resource', 'Present'),
	(104, '2019-09-04', NULL, NULL, 'EMP0007', '07:00-19:00', NULL, 'Human Resource', 'Present'),
	(105, '2019-09-04', NULL, NULL, 'EMP0005', '08:00-17:00', NULL, 'Human Resource', 'Present'),
	(106, '2019-09-04', NULL, NULL, 'EMP0006', '07:00-19:00', NULL, 'Human Resource', 'Present'),
	(107, '2019-09-04', NULL, NULL, 'EMP0007', '07:00-19:00', NULL, 'Human Resource', 'Present'),
	(108, '2019-09-07', NULL, NULL, 'EMP0005', '08:00-17:00', NULL, 'Human Resource', 'Present'),
	(109, '2019-09-07', NULL, NULL, 'EMP0006', '08:00-17:00', NULL, 'Human Resource', 'Present'),
	(110, '2019-09-07', NULL, NULL, 'EMP0007', '08:00-17:00', NULL, 'Human Resource', 'Present'),
	(111, '2019-09-07', NULL, NULL, 'EMP0023', '08:00-17:00', NULL, 'Human Resource', 'paid/Half day - Morning'),
	(112, '2019-09-07', NULL, NULL, 'EMP0024', '08:00-17:00', NULL, 'Human Resource', 'Short leave - Evening'),
	(113, '2019-09-07', NULL, NULL, 'EMP0025', '08:00-17:00', NULL, 'Human Resource', 'paid/Absent');
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.attendance_status
CREATE TABLE IF NOT EXISTS `attendance_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.attendance_status: ~19 rows (approximately)
DELETE FROM `attendance_status`;
/*!40000 ALTER TABLE `attendance_status` DISABLE KEYS */;
INSERT INTO `attendance_status` (`id`, `date`, `department`, `status`) VALUES
	(1, '2019-09-23', 'Sales & Marketing', 'ok'),
	(2, '2019-09-25', 'Production', 'ok'),
	(3, '2019-09-26', 'Production', 'ok'),
	(4, '2019-09-25', 'Human Resource', 'ok'),
	(5, '2019-09-26', 'Human Resource', 'ok'),
	(6, '2019-09-27', 'Human Resource', 'ok'),
	(7, '2019-09-28', 'Human Resource', 'ok'),
	(8, '2019-09-29', 'Human Resource', 'ok'),
	(9, '2019-09-25', 'Sales & Marketing', 'ok'),
	(10, '2019-09-26', 'Sales & Marketing', 'ok'),
	(11, '2019-09-27', 'Sales & Marketing', 'ok'),
	(12, '2019-09-28', 'Sales & Marketing', 'ok'),
	(13, '2019-09-30', 'Sales & Marketing', 'ok'),
	(14, '2019-09-26', '- Select -', 'ok'),
	(15, '2019-09-27', 'Production', 'ok'),
	(16, '2019-09-28', 'Production', 'ok'),
	(17, '2019-09-30', 'Production', 'ok'),
	(18, '2019-09-24', 'Production', 'ok'),
	(19, '2019-09-23', 'Production', 'ok'),
	(20, '2019-09-04', 'Human Resource', 'ok'),
	(21, '2019-09-07', 'Human Resource', 'ok');
/*!40000 ALTER TABLE `attendance_status` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.basicsalary
CREATE TABLE IF NOT EXISTS `basicsalary` (
  `idsalary` int(11) NOT NULL AUTO_INCREMENT,
  `id_employee` varchar(15) NOT NULL,
  `basicSalary` double DEFAULT NULL,
  `salary_period` varchar(45) DEFAULT NULL,
  `saved_date` date DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idsalary`,`id_employee`),
  KEY `fk_basicBalary_employee1_idx` (`id_employee`),
  CONSTRAINT `fk_basicBalary_employee1` FOREIGN KEY (`id_employee`) REFERENCES `employee` (`id_employee`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.basicsalary: ~26 rows (approximately)
DELETE FROM `basicsalary`;
/*!40000 ALTER TABLE `basicsalary` DISABLE KEYS */;
INSERT INTO `basicsalary` (`idsalary`, `id_employee`, `basicSalary`, `salary_period`, `saved_date`, `status`) VALUES
	(2, 'EMP0001', 45000, '25', NULL, '1'),
	(3, 'EMP0003', 25000, '25', NULL, '1'),
	(4, 'EMP0002', 35000, '23', NULL, '1'),
	(6, 'EMP0007', 25000, '25', NULL, '1'),
	(7, 'EMP0006', 30000, '25', NULL, '1'),
	(8, 'EMP0005', 35000, '25', '2019-10-03', '1'),
	(9, 'EMP0008', 30000, '25', NULL, '1'),
	(10, 'EMP0010', 28000, '25', NULL, '1'),
	(11, 'EMP0004', 45000, '25', NULL, '0'),
	(12, 'EMP0009', 28000, '25', NULL, '1'),
	(13, 'EMP0011', 32000, '25', NULL, '1'),
	(14, 'EMP0012', 25000, '25', NULL, '1'),
	(15, 'EMP0013', 25000, '25', NULL, '1'),
	(17, 'EMP0014', 20000, '25', NULL, '1'),
	(18, 'EMP0016', 20000, '25', NULL, '1'),
	(21, 'EMP0015', 25000, '25', NULL, '1'),
	(22, 'EMP0017', 20000, '25', NULL, '1'),
	(23, 'EMP0018', 25000, '25', NULL, '1'),
	(24, 'EMP0019', 25000, '25', NULL, '1'),
	(25, 'EMP0021', 30000, '25', NULL, '1'),
	(26, 'EMP0020', 30000, '25', NULL, '1'),
	(27, 'EMP0005', 35000, '25', '2019-10-02', '0'),
	(28, 'EMP0005', 35000, '25', '2019-10-01', '0'),
	(29, 'EMP0004', 2000, '25', '2019-10-05', '1'),
	(30, 'EMP0011', 32500, '25', '2019-10-05', '0'),
	(31, 'EMP0011', 32550, '25', '2019-10-05', '1'),
	(32, 'EMP0025', NULL, NULL, NULL, '1'),
	(33, 'EMP0026', NULL, NULL, NULL, '1'),
	(34, 'EMP0026', 30000, '', '2019-10-05', '1');
/*!40000 ALTER TABLE `basicsalary` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.bill_of_matrial
CREATE TABLE IF NOT EXISTS `bill_of_matrial` (
  `job_id` varchar(20) NOT NULL,
  `id_product` varchar(30) NOT NULL,
  `product_qty` double DEFAULT NULL,
  `unit` varchar(12) DEFAULT NULL,
  `bom_date` date DEFAULT NULL,
  `req_department` varchar(45) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `finish_date` date DEFAULT NULL,
  `approved` tinyint(2) DEFAULT '0',
  `approve_by` varchar(45) DEFAULT NULL,
  `approve_date` date DEFAULT NULL,
  `state` tinyint(2) DEFAULT '0',
  `created_by` varchar(15) DEFAULT NULL,
  `created_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`job_id`),
  KEY `fk_bill_of_matrial_product1_idx` (`id_product`),
  CONSTRAINT `fk_bill_of_matrial_product1` FOREIGN KEY (`id_product`) REFERENCES `product` (`id_product`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.bill_of_matrial: ~12 rows (approximately)
DELETE FROM `bill_of_matrial`;
/*!40000 ALTER TABLE `bill_of_matrial` DISABLE KEYS */;
INSERT INTO `bill_of_matrial` (`job_id`, `id_product`, `product_qty`, `unit`, `bom_date`, `req_department`, `start_date`, `finish_date`, `approved`, `approve_by`, `approve_date`, `state`, `created_by`, `created_date`) VALUES
	('JOB201808260001', 'PVCWP-012456', 1000, 'Meter', '2019-08-26', 'Section No:01', '2019-08-26', '2019-08-31', 1, NULL, NULL, 0, NULL, '2019-08-26 16:06:25'),
	('JOB201808260002', 'PVCWP-012456', 150, 'Meter', '2019-08-26', 'Section No:01', '2019-08-30', '2019-08-31', 1, NULL, NULL, 0, NULL, '2019-08-26 17:11:53'),
	('JOB201809030003', 'PVCWP-012456', 100, 'Meter', '2019-09-03', 'Section No:01', '2019-09-03', '2019-09-19', 1, NULL, NULL, 0, NULL, '2019-09-03 11:44:30'),
	('JOB201809040004', 'PVCWP-012456', 10, 'Meter', '2019-09-18', 'Section No:01', '2019-09-02', '2019-09-23', 0, NULL, NULL, 0, NULL, '2019-09-04 08:56:01'),
	('JOB201809040005', 'PVCWP-012456', 100, 'Meter', '2019-09-01', 'Section No:01', '2019-09-18', '2019-09-20', 1, NULL, NULL, 0, NULL, '2019-09-04 08:56:53'),
	('JOB201809070006', 'PVCWP-012456', 100, 'Meter', '2019-09-07', 'Section No:01', '2019-09-07', '2019-09-08', 1, NULL, NULL, 0, NULL, '2019-09-07 11:08:28'),
	('JOB201809070007', '1222546', 100, 'Meter', '2019-09-07', 'Section No:01', '2019-09-07', '2019-09-08', 0, NULL, NULL, 0, NULL, '2019-09-07 11:13:06'),
	('JOB201909180008', 'PRD0003', 100, 'NOS', '2019-09-18', 'Section No:01', '2019-09-18', '2019-09-19', 1, NULL, NULL, 0, NULL, '2019-09-18 23:17:31'),
	('JOB201909280009', 'PRD0009', 100, 'NOS', '2019-09-28', 'Section No:01', '2019-09-29', '2019-09-30', 1, NULL, NULL, 0, NULL, '2019-09-28 11:04:29'),
	('JOB201910040010', 'PRD0003', 100, 'NOS', '2019-10-04', 'Section No:01', '2019-10-04', '2019-10-04', 0, NULL, NULL, 0, NULL, '2019-10-04 21:47:26'),
	('JOB201910040011', 'PRD0003', 100, 'NOS', '2019-10-04', 'Section No:01', '2019-10-04', '2019-10-10', 1, NULL, NULL, 0, NULL, '2019-10-04 23:37:22'),
	('JOB201910050012', 'PRD0003', 1, 'NOS', '2019-10-05', 'Section No:01', '2019-10-05', '2019-10-10', 0, NULL, NULL, 0, NULL, '2019-10-05 00:25:01'),
	('JOB201910050013', '1222546', 2, 'Meter', '2019-10-05', 'Section No:01', '2019-10-05', '2019-10-10', 0, NULL, NULL, 0, NULL, '2019-10-05 11:29:28');
/*!40000 ALTER TABLE `bill_of_matrial` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.bom_item
CREATE TABLE IF NOT EXISTS `bom_item` (
  `idbom_item` int(11) NOT NULL AUTO_INCREMENT,
  `job_id` varchar(20) NOT NULL,
  `idraw_stock` int(11) NOT NULL,
  `unit` varchar(45) DEFAULT NULL,
  `qty` double DEFAULT NULL,
  PRIMARY KEY (`idbom_item`,`job_id`),
  KEY `fk_bom_item_bill_of_matrial1_idx` (`job_id`),
  KEY `fk_bom_item_raw_stock1_idx` (`idraw_stock`),
  CONSTRAINT `fk_bom_item_bill_of_matrial1` FOREIGN KEY (`job_id`) REFERENCES `bill_of_matrial` (`job_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_bom_item_raw_stock` FOREIGN KEY (`idraw_stock`) REFERENCES `raw_stock` (`idraw_stock`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.bom_item: ~65 rows (approximately)
DELETE FROM `bom_item`;
/*!40000 ALTER TABLE `bom_item` DISABLE KEYS */;
INSERT INTO `bom_item` (`idbom_item`, `job_id`, `idraw_stock`, `unit`, `qty`) VALUES
	(1, 'JOB201808260001', 1, 'Kilogram', 650),
	(2, 'JOB201808260001', 2, 'Kilogram', 400),
	(3, 'JOB201808260001', 3, 'Kilogram', 1000),
	(4, 'JOB201808260001', 5, 'Liter', 1250),
	(5, 'JOB201808260001', 4, 'Kilogram', 250),
	(6, 'JOB201808260001', 6, 'Kilogram', 65),
	(7, 'JOB201808260001', 7, 'Kilogram', 350),
	(8, 'JOB201808260002', 1, 'Kilogram', 97.5),
	(9, 'JOB201808260002', 2, 'Kilogram', 60),
	(10, 'JOB201808260002', 3, 'Kilogram', 150),
	(11, 'JOB201808260002', 5, 'Liter', 187.5),
	(12, 'JOB201808260002', 4, 'Kilogram', 37.5),
	(13, 'JOB201808260002', 6, 'Kilogram', 9.75),
	(14, 'JOB201808260002', 7, 'Kilogram', 52.5),
	(15, 'JOB201809030003', 1, 'Kilogram', 65),
	(16, 'JOB201809030003', 2, 'Kilogram', 40),
	(17, 'JOB201809030003', 3, 'Kilogram', 100),
	(18, 'JOB201809030003', 5, 'Liter', 125),
	(19, 'JOB201809030003', 4, 'Kilogram', 25),
	(20, 'JOB201809030003', 6, 'Kilogram', 6.5),
	(21, 'JOB201809030003', 7, 'Kilogram', 35),
	(22, 'JOB201809040004', 1, 'Kilogram', 6.5),
	(23, 'JOB201809040004', 2, 'Kilogram', 4),
	(24, 'JOB201809040004', 3, 'Kilogram', 10),
	(25, 'JOB201809040004', 5, 'Liter', 12.5),
	(26, 'JOB201809040004', 4, 'Kilogram', 2.5),
	(27, 'JOB201809040004', 6, 'Kilogram', 0.65),
	(28, 'JOB201809040004', 7, 'Kilogram', 3.5),
	(29, 'JOB201809040005', 1, 'Kilogram', 0.65),
	(30, 'JOB201809040005', 2, 'Kilogram', 0.4),
	(31, 'JOB201809040005', 3, 'Kilogram', 1),
	(32, 'JOB201809040005', 5, 'Liter', 1.25),
	(33, 'JOB201809040005', 4, 'Kilogram', 0.25),
	(34, 'JOB201809040005', 6, 'Kilogram', 0.07),
	(35, 'JOB201809040005', 7, 'Kilogram', 0.35),
	(36, 'JOB201809070006', 8, 'Kilogram', 6.5),
	(37, 'JOB201809070006', 2, 'Kilogram', 4),
	(38, 'JOB201809070006', 3, 'Kilogram', 10),
	(39, 'JOB201809070006', 5, 'Liter', 12.5),
	(40, 'JOB201809070006', 4, 'Kilogram', 2.5),
	(41, 'JOB201809070006', 6, 'Kilogram', 0.65),
	(42, 'JOB201809070006', 7, 'Kilogram', 3.5),
	(43, 'JOB201809070007', 3, 'Kilogram', 10),
	(44, 'JOB201809070007', 4, 'Kilogram', 100),
	(45, 'JOB201809070007', 6, 'Kilogram', 50),
	(46, 'JOB201909180008', 2, 'Kilogram', 2),
	(47, 'JOB201909180008', 2, 'Kilogram', 2),
	(48, 'JOB201909280009', 14, 'NOS', 1),
	(49, 'JOB201909280009', 20, 'Kilogram', 0.5),
	(50, 'JOB201909280009', 14, 'Kilogram', 0.6),
	(51, 'JOB201910040010', 22, 'Kilogram', 1),
	(52, 'JOB201910040010', 22, 'Kilogram', 1),
	(53, 'JOB201910040010', 14, 'Kilogram', 20),
	(54, 'JOB201910040010', 25, 'Kilogram', 1),
	(55, 'JOB201910040010', 25, 'Kilogram', 1),
	(56, 'JOB201910040011', 22, 'Kilogram', 1),
	(57, 'JOB201910040011', 22, 'Kilogram', 1),
	(58, 'JOB201910040011', 14, 'Kilogram', 20),
	(59, 'JOB201910040011', 27, 'Kilogram', 1),
	(60, 'JOB201910040011', 27, 'Kilogram', 1),
	(61, 'JOB201910050012', 22, 'Kilogram', 1),
	(62, 'JOB201910050012', 22, 'Kilogram', 1),
	(63, 'JOB201910050012', 14, 'Kilogram', 20),
	(64, 'JOB201910050012', 27, 'Kilogram', 1),
	(65, 'JOB201910050012', 27, 'Kilogram', 1),
	(66, 'JOB201910050013', 14, 'Kilogram', 4),
	(67, 'JOB201910050013', 27, 'Kilogram', 40),
	(68, 'JOB201910050013', 24, 'Kilogram', 20),
	(69, 'JOB201910050013', 23, 'Kilogram', 2);
/*!40000 ALTER TABLE `bom_item` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `id_customer` varchar(15) NOT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `business_name` varchar(145) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `telephoneno` varchar(15) DEFAULT NULL,
  `mobile` varchar(15) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `fax` varchar(15) DEFAULT NULL,
  `state` tinyint(4) DEFAULT '1',
  `createby` varchar(12) DEFAULT NULL,
  `date_created` date DEFAULT NULL,
  `modifiedby` varchar(12) DEFAULT NULL,
  `last_modified` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `grade` varchar(15) DEFAULT NULL,
  `nic` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.customer: ~3 rows (approximately)
DELETE FROM `customer`;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`id_customer`, `fname`, `lname`, `business_name`, `street`, `city`, `telephoneno`, `mobile`, `email`, `fax`, `state`, `createby`, `date_created`, `modifiedby`, `last_modified`, `grade`, `nic`) VALUES
	('CUS00001', 'Kanishka', 'Viraj', 'Kani', 'lake rd', 'horana', '0767407507', '0767407507', 'lakshankkn@gmail.com', '0125478', 1, 'panda', '2019-09-06', 'panda', '2019-10-05 00:09:25', NULL, NULL),
	('CUS0002', 'Pasindu', 'Maduranga', 'pasi', 'asfad', 'Bandaragama', '0000000000', '0710000000', 'pasindu@gmail.com', NULL, 1, '', '2019-09-06', NULL, '2019-10-05 00:09:28', 'Brownse', '975888888v'),
	('CUS0003', 'pasindu', 'Maduranga', 'plex', 'www', 'bhvh', '2222122522', '2123524222', 'pasindu@gmail.com', NULL, 1, '', '2019-09-07', NULL, '2019-10-05 00:09:45', 'Brownse', '973632914v');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.customer_business
CREATE TABLE IF NOT EXISTS `customer_business` (
  `idcustomer_business` int(11) NOT NULL AUTO_INCREMENT,
  `id_customer` varchar(15) NOT NULL,
  `street` varchar(145) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `telephone` varchar(12) DEFAULT NULL,
  `credit_period` varchar(3) DEFAULT NULL,
  `credit_limit` double DEFAULT NULL,
  PRIMARY KEY (`idcustomer_business`),
  KEY `fk_customer_business_customer1_idx` (`id_customer`),
  CONSTRAINT `fk_customer_business_customer1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.customer_business: ~2 rows (approximately)
DELETE FROM `customer_business`;
/*!40000 ALTER TABLE `customer_business` DISABLE KEYS */;
INSERT INTO `customer_business` (`idcustomer_business`, `id_customer`, `street`, `city`, `telephone`, `credit_period`, `credit_limit`) VALUES
	(1, 'CUS0002', 'asfad', 'Bandaragama', NULL, '40', 50000),
	(2, 'CUS0003', 'www', 'bhvh', NULL, '20', 500000);
/*!40000 ALTER TABLE `customer_business` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.deductions
CREATE TABLE IF NOT EXISTS `deductions` (
  `iddeductions` int(11) NOT NULL AUTO_INCREMENT,
  `id_employee` varchar(15) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `valid_period` date DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`iddeductions`),
  KEY `fk_deductions_employee1_idx` (`id_employee`),
  CONSTRAINT `fk_deductions_employee1` FOREIGN KEY (`id_employee`) REFERENCES `employee` (`id_employee`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.deductions: ~0 rows (approximately)
DELETE FROM `deductions`;
/*!40000 ALTER TABLE `deductions` DISABLE KEYS */;
/*!40000 ALTER TABLE `deductions` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.department_section
CREATE TABLE IF NOT EXISTS `department_section` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `section` varchar(45) DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.department_section: ~9 rows (approximately)
DELETE FROM `department_section`;
/*!40000 ALTER TABLE `department_section` DISABLE KEYS */;
INSERT INTO `department_section` (`id`, `section`, `department`) VALUES
	(1, 'Cutting', 'Production'),
	(2, 'ProductionLine', 'Production'),
	(3, 'packing', 'Production'),
	(4, 'HR', 'Human Resource'),
	(5, 'sales', 'Sales & Marketing'),
	(6, 'marketing', 'Sales & Marketing'),
	(7, 'purchasing', 'Purchasing'),
	(8, 'finance', 'Finance'),
	(9, 'Accounting', 'Finance'),
	(10, 'packingA', 'Production');
/*!40000 ALTER TABLE `department_section` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.dispatch
CREATE TABLE IF NOT EXISTS `dispatch` (
  `id_dispatch` varchar(15) NOT NULL,
  `date` date DEFAULT NULL,
  `driver` varchar(45) DEFAULT NULL,
  `vehicle` varchar(45) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_dispatch`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.dispatch: ~5 rows (approximately)
DELETE FROM `dispatch`;
/*!40000 ALTER TABLE `dispatch` DISABLE KEYS */;
INSERT INTO `dispatch` (`id_dispatch`, `date`, `driver`, `vehicle`, `total`, `created_by`) VALUES
	('DIS000001', '2019-09-28', 'Lakshan', 'wp CAG-3766', 16550, NULL),
	('DIS000002', '2019-09-28', 'Kanishka', 'tfycgvhbjnm', 10, NULL),
	('DIS000003', '2019-09-28', 'Kanishka', 'jk', 16550, NULL),
	('DIS000004', '2019-09-28', 'Kanishka', 'fghjk', 62500, NULL),
	('DIS000005', '2019-09-28', 'Kanishka', 'dfghj', 1200, NULL),
	('DIS000006', '2019-10-05', 'akni', 'asf6543', 1895, '');
/*!40000 ALTER TABLE `dispatch` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.dispatch_invoices
CREATE TABLE IF NOT EXISTS `dispatch_invoices` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_dispatch` varchar(15) NOT NULL,
  `id_invoice` varchar(15) NOT NULL,
  `delivered_date` date DEFAULT NULL,
  `customer` varchar(50) DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_dispatch_invoices_dispatch1_idx` (`id_dispatch`),
  KEY `fk_dispatch_invoices_invoice_AOD1_idx` (`id_invoice`),
  CONSTRAINT `fk_dispatch_invoices_dispatch1` FOREIGN KEY (`id_dispatch`) REFERENCES `dispatch` (`id_dispatch`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_dispatch_invoices_invoice_AOD1` FOREIGN KEY (`id_invoice`) REFERENCES `invoice_aod` (`id_invoice`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.dispatch_invoices: ~5 rows (approximately)
DELETE FROM `dispatch_invoices`;
/*!40000 ALTER TABLE `dispatch_invoices` DISABLE KEYS */;
INSERT INTO `dispatch_invoices` (`id`, `id_dispatch`, `id_invoice`, `delivered_date`, `customer`, `total`) VALUES
	(1, 'DIS000001', 'AOD000001', '2019-09-28', 'Kani', 16550),
	(2, 'DIS000002', 'AOD000004', '2019-09-28', 'Kani', 10),
	(3, 'DIS000003', 'AOD000008', '2019-09-28', 'Kani', 16550),
	(4, 'DIS000004', 'AOD000003', '2019-09-28', 'Kani', 62500),
	(5, 'DIS000005', 'AOD000009', '2019-09-28', 'Kani', 1200),
	(6, 'DIS000006', 'AOD000006', '2019-10-05', 'pasi', 1655),
	(7, 'DIS000006', 'AOD000010', '2019-10-05', 'plex', 240);
/*!40000 ALTER TABLE `dispatch_invoices` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `id_employee` varchar(15) NOT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `mname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `nic` varchar(13) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `mobile` varchar(15) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `category` int(11) DEFAULT NULL,
  `depat_section` int(11) DEFAULT NULL,
  `designation` varchar(20) DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  `date_created` date DEFAULT NULL,
  `last_modified` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_by` varchar(15) DEFAULT NULL,
  `image_path` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id_employee`),
  UNIQUE KEY `nic_UNIQUE` (`nic`),
  KEY `FK_employee_employee_category` (`category`),
  KEY `FK_employee_department_section` (`depat_section`),
  CONSTRAINT `FK_employee_department_section` FOREIGN KEY (`depat_section`) REFERENCES `department_section` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_employee_employee_category` FOREIGN KEY (`category`) REFERENCES `employee_category` (`id_category`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.employee: ~22 rows (approximately)
DELETE FROM `employee`;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`id_employee`, `fname`, `mname`, `lname`, `gender`, `dob`, `nic`, `street`, `city`, `mobile`, `email`, `department`, `category`, `depat_section`, `designation`, `state`, `date_created`, `last_modified`, `created_by`, `image_path`) VALUES
	('EMP0001', 'akni', '', 'vid', 'Male', '2018-09-04', '960982657v', '', '', '0767407507', 'lakshankkn@gmail.com', 'Sales & Marketing', 1, 1, 'staffofficer', 3, '2019-10-05', '2019-10-05 11:43:09', '', NULL),
	('EMP0002', 'pttt', 'sdf', 'jnjn', 'Male', '2012-09-26', '123456754323', 'xectrhj', 'rdtcgh', '2345678987', 'pemitharandiya@gmail.com', 'Purchasing', 1, 2, 'staffofficer', 1, '2019-10-05', '2019-10-05 10:41:50', '', NULL),
	('EMP0003', 'alex', 'vyths', '', 'Male', '2018-09-07', '985214587v', '', '', '0765894688', 'lakshankkn@gmail.com', 'Sales & Marketing', 5, 2, 'staffofficer', 3, '2019-10-05', '2019-10-05 11:46:29', '', NULL),
	('EMP0004', 'kanishka', 'viraj', 'viraj', 'Male', '1995-08-25', '957361064v', 'midar', 'oind', '0771234567', 'frjj234@gmail.com', 'Production', 3, 3, 'operator', 1, '2019-10-05', '2019-10-05 10:41:29', '', NULL),
	('EMP0005', 'pasindu', 'pasi', '', 'Male', '1997-09-25', '984729429V', 'ggrg', 'ereee', '0774555555', 'wgfbir34@gmail.com', 'Human Resource', 5, 4, 'staff officer', 1, '2019-10-05', '2019-10-05 11:46:35', '', NULL),
	('EMP0006', 'hasith', 'sathsindu', '', 'Male', '1997-09-03', '9745555555V', 'main street', 'downtown', '0777777777', 'hasith.sathsindu@gmail.com', 'Human Resource', 2, 4, 'staff officer', 1, '2019-10-05', '2019-10-05 10:41:55', '', NULL),
	('EMP0007', 'devon', 'falls', '', 'Female', '1998-12-04', '984576557V', 'willy street', 'colombo', '0775633253', 'devon98@gmail.com', 'Human Resource', 4, 4, 'staff officer', 1, '2019-10-05', '2019-10-05 10:41:58', '', NULL),
	('EMP0008', 'calvin', 'harris', 'haris', 'Male', '1995-07-26', '957344856V', 'vista mawatha', 'dehiwala', '0775688891', 'cal34harris@gmail.com', 'Sales & Marketing', 2, 6, 'marketing manager', 1, '2019-10-05', '2019-10-05 10:42:01', '', NULL),
	('EMP0009', 'camelia', 'cabelo', 'camn', 'Female', '1996-12-28', '967898456V', 'bauddaloka mawatha', 'kottawa', '0715468766', 'camelia456@gmail.com', 'Purchasing', 2, 7, 'purchasing manager', 1, '2019-10-05', '2019-10-05 10:42:03', '', NULL),
	('EMP0010', 'shane', 'ward', '', 'Male', '1994-09-08', '9456781621V', 'westerose', 'rajagiriya', '0785666666', 'shane1994@gmail.com', 'Sales & Marketing', 4, 5, 'sales rep', 1, '2019-10-05', '2019-10-05 10:42:05', '', NULL),
	('EMP0011', 'ed', 'sheeran', 'shen', 'Male', '1995-03-01', '957868761V', 'yalk street', 'kohuwala', '0775669875', 'edwin2340@gamil.com', 'Finance', 2, 8, 'financial manager', 1, '2019-10-05', '2019-10-05 10:42:07', '', NULL),
	('EMP0012', 'Ariana', 'Grande', '', 'Female', '1997-05-01', '975225888V', 'race street', 'colombo', '0715468565', 'ariana35@gmail.com', 'Production', 3, 2, 'machine operator', 1, '2019-10-04', '2019-10-05 10:42:24', '', NULL),
	('EMP0013', 'Alessia', 'Cara', '', 'Female', '1995-04-03', '9565845684V', 'sine street', 'Kottawa', '0775468888', 'aless45@gmail.com', 'Production', 3, 2, 'machine operator', 1, '2019-10-05', '2019-10-05 10:42:26', '', NULL),
	('EMP0014', 'willie', 'wonka', '', 'Male', '1994-08-12', '945687999V', 'wise road', 'nawalapitiya', '0764855666', 'willie1994@gmail.com', 'Production', 3, 2, 'machine operator', 1, '2019-10-05', '2019-10-05 10:42:37', '', NULL),
	('EMP0015', 'alan', 'walker', '', 'Male', '1992-08-17', '928565845V', 'bestly street', 'rajagiriya', '0784566666', 'alan34walker@gmail.com', 'Production', 3, 3, 'operator', 1, '2019-10-05', '2019-10-05 10:42:39', '', NULL),
	('EMP0016', 'bryan', 'adams', '', 'Male', '1999-12-31', '994486666V', 'well street', 'thalawathugoda', '0725687866', 'bryan3456@gmail.com', 'Production', 3, 2, 'machine operator', 1, '2019-10-05', '2019-10-05 10:42:43', '', NULL),
	('EMP0017', 'bruno', 'mars', '', 'Male', '1991-01-15', '9154688662V', 'main street', 'divulapitiya', '0775555555', 'bruno99@gmail.com', 'Production', 4, 3, 'supervisor', 1, '2019-10-05', '2019-10-05 10:42:45', '', NULL),
	('EMP0018', 'katy', 'pery', '', 'Female', '1995-08-17', '9546874122V', 'raben street ', 'maththegoda', '0786666666', 'katy67@gmail.com', 'Production', 4, 1, 'supervisor', 1, '2019-10-05', '2019-10-05 10:42:47', '', NULL),
	('EMP0019', 'anne', 'marie', '', 'Female', '1996-02-08', '967866233V', 'farm street', 'kottawa', '0784635413', 'anne34marie@gmail.com', 'Production', 4, 2, 'supervisor', 1, '2019-10-05', '2019-10-05 10:42:49', '', NULL),
	('EMP0020', 'nimarr', 'noma', '', 'Male', '1998-09-10', '985647523V', 'trhwj street', 'hhelwa', '0777556666', 'hkarhk@gmail.com', 'Purchasing', 4, 7, 'officer', 1, '2019-10-05', '2019-10-05 10:42:51', '', NULL),
	('EMP0021', 'tens', 'jpl', '', 'Male', '1992-09-05', '925468725V', 'grg', 'heburei', '0718666666', 'fyewvku@gmail.com', 'Finance', 4, 9, 'officer', 1, '2019-10-05', '2019-10-05 10:42:55', '', NULL),
	('EMP0022', 'nilupulee', 'wathsala', '', 'Female', '1995-10-05', '95746221V', 'vrhihr14orr', 'rbee', '0785555555', 'griebi2@gmail.com', 'Production', 4, 3, 'supervisor', 1, '2019-10-05', '2019-10-05 10:44:03', '', NULL),
	('EMP0023', 'ygrg', 'gurg', 'ugru', 'Male', '2019-10-10', '75937539V', 'feefbe', 'guw', '0775638579', 'ebiu647@gmail.com', 'Human Resource', 4, 4, 'junior executive', 1, '2019-10-05', '2019-10-05 10:50:13', '', NULL),
	('EMP0024', 'erer', 'eeeer', 'dgr', 'Female', '2019-10-10', '456447484V', 'frtey', 'htrhr', '0776555555', 'dhr1618@gmail.com', 'Human Resource', 4, 4, 'executive', 1, NULL, '2019-10-05 10:56:35', '', NULL),
	('EMP0025', 'gwr', 'grr', 'gru', 'Male', '2019-10-16', '472850824', 'xerrgw', 'wgeiuw', '0775555555', 'trfwey572@gmail.com', 'Human Resource', 4, 4, 'officer', 1, NULL, '2019-10-05 10:57:53', '', NULL),
	('EMP0026', 'Ruwan', 'aer', 'Senarathne', 'Male', '2019-10-01', '35431354555v', 'afsa', 'afd', '0175652555', 'assa@gmail.com', 'Sales & Marketing', 4, 6, 'Selsrep', 1, NULL, '2019-10-05 11:42:29', '', NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.employee_bank_data
CREATE TABLE IF NOT EXISTS `employee_bank_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` varchar(15) DEFAULT '0',
  `bank` varchar(20) DEFAULT '0',
  `branch` varchar(20) DEFAULT '0',
  `account_no` varchar(20) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK_employee_bank_data_employee` (`emp_id`),
  CONSTRAINT `FK_employee_bank_data_employee` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`id_employee`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.employee_bank_data: ~22 rows (approximately)
DELETE FROM `employee_bank_data`;
/*!40000 ALTER TABLE `employee_bank_data` DISABLE KEYS */;
INSERT INTO `employee_bank_data` (`id`, `emp_id`, `bank`, `branch`, `account_no`) VALUES
	(1, 'EMP0001', 'BOC', 'kohuwala', '105468866'),
	(4, 'EMP0002', 'BOC', 'kohuwala', '105468866'),
	(5, 'EMP0003', 'BOC', 'kohuwala', '105468866'),
	(6, 'EMP0004', 'BOC', 'kohuwala', '105468866'),
	(7, 'EMP0005', 'BOC', 'kohuwala', '105468866'),
	(8, 'EMP0006', 'BOC', 'kohuwala', '105468866'),
	(9, 'EMP0007', 'BOC', 'kohuwala', '105468866'),
	(10, 'EMP0008', 'BOC', 'kohuwala', '105468866'),
	(11, 'EMP0009', 'BOC', 'kohuwala', '105468866'),
	(12, 'EMP0010', 'BOC', 'kohuwala', '105468866'),
	(13, 'EMP0011', 'BOC', 'kohuwala', '105468866'),
	(14, 'EMP0012', 'BOC', 'kohuwala', '105468866'),
	(15, 'EMP0013', 'BOC', 'kohuwala', '105468866'),
	(16, 'EMP0014', 'BOC', 'kohuwala', '105468866'),
	(17, 'EMP0015', 'BOC', 'kohuwala', '105468866'),
	(18, 'EMP0016', 'BOC', 'kohuwala', '105468866'),
	(19, 'EMP0017', 'BOC', 'kohuwala', '105468866'),
	(20, 'EMP0018', 'BOC', 'kohuwala', '105468866'),
	(21, 'EMP0019', 'BOC', 'kohuwala', '105468866'),
	(22, 'EMP0020', 'BOC', 'kohuwala', '105468866'),
	(23, 'EMP0021', 'BOC', 'kohuwala', '105468866'),
	(24, 'EMP0022', 'BOC', 'kohuwala', '105468866'),
	(26, 'EMP0023', 'daj', 'hbfhvfl', '7397593'),
	(27, 'EMP0024', 'ygyvr', 'rygtergt', '65274'),
	(28, 'EMP0025', 'wgufw', 'wo4ugwou', '724982'),
	(29, 'EMP0026', 'asd', 'asd', '354133584');
/*!40000 ALTER TABLE `employee_bank_data` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.employee_category
CREATE TABLE IF NOT EXISTS `employee_category` (
  `id_category` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_category`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.employee_category: ~4 rows (approximately)
DELETE FROM `employee_category`;
/*!40000 ALTER TABLE `employee_category` DISABLE KEYS */;
INSERT INTO `employee_category` (`id_category`, `category`) VALUES
	(1, 'Driver'),
	(2, 'Manager'),
	(3, 'operator'),
	(4, 'staffofficer'),
	(5, 'SalesRep'),
	(6, 'salesrep');
/*!40000 ALTER TABLE `employee_category` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.emp_leave
CREATE TABLE IF NOT EXISTS `emp_leave` (
  `id_leave` int(11) NOT NULL AUTO_INCREMENT,
  `reason` varchar(250) DEFAULT NULL,
  `statusNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_leave`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.emp_leave: ~0 rows (approximately)
DELETE FROM `emp_leave`;
/*!40000 ALTER TABLE `emp_leave` DISABLE KEYS */;
/*!40000 ALTER TABLE `emp_leave` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.entry_account
CREATE TABLE IF NOT EXISTS `entry_account` (
  `identry_account` int(11) NOT NULL,
  `id_entry` varchar(15) NOT NULL,
  `idledgerAccounts` varchar(15) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `debit` double DEFAULT NULL,
  `credit` double DEFAULT NULL,
  PRIMARY KEY (`identry_account`),
  KEY `fk_entry_account_journal_entry1_idx` (`id_entry`),
  KEY `fk_entry_account_ledgerAccounts1_idx` (`idledgerAccounts`),
  CONSTRAINT `fk_entry_account_journal_entry1` FOREIGN KEY (`id_entry`) REFERENCES `journal_entry` (`id_entry`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_entry_account_ledgerAccounts1` FOREIGN KEY (`idledgerAccounts`) REFERENCES `ledger_accounts` (`idledgerAccounts`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.entry_account: ~0 rows (approximately)
DELETE FROM `entry_account`;
/*!40000 ALTER TABLE `entry_account` DISABLE KEYS */;
/*!40000 ALTER TABLE `entry_account` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.forgot_password
CREATE TABLE IF NOT EXISTS `forgot_password` (
  `sec_id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT '0',
  `status` varchar(45) DEFAULT '0',
  `username` varchar(15) DEFAULT '0',
  PRIMARY KEY (`sec_id`),
  KEY `FK_forget_password_user` (`username`),
  CONSTRAINT `FK_forget_password_user` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.forgot_password: ~3 rows (approximately)
DELETE FROM `forgot_password`;
/*!40000 ALTER TABLE `forgot_password` DISABLE KEYS */;
INSERT INTO `forgot_password` (`sec_id`, `code`, `status`, `username`) VALUES
	(1, 'MZ15-7v07-22', 'used', 'nima'),
	(2, 'MZ25-4323-0821', 'true', 'panda'),
	(3, 'MZ31-0v10-29', 'false', 'Wemba'),
	(4, 'MZ45-55V0-517', 'false', 'Wemba'),
	(5, 'MZ55-55V0-531', 'false', 'Wemba');
/*!40000 ALTER TABLE `forgot_password` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.grn_item
CREATE TABLE IF NOT EXISTS `grn_item` (
  `id_grnitem` int(11) NOT NULL AUTO_INCREMENT,
  `id_product` varchar(30) NOT NULL,
  `grn_no` varchar(15) NOT NULL,
  `unit` varchar(12) DEFAULT NULL,
  `qty` double DEFAULT NULL,
  PRIMARY KEY (`id_grnitem`),
  KEY `fk_grn_item_product1_idx` (`id_product`),
  KEY `fk_grn_item_grn_finished_good1_idx` (`grn_no`),
  CONSTRAINT `fk_grn_item_grn_finished_good1` FOREIGN KEY (`grn_no`) REFERENCES `grn_product` (`grn_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_grn_item_product1` FOREIGN KEY (`id_product`) REFERENCES `product` (`id_product`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.grn_item: ~24 rows (approximately)
DELETE FROM `grn_item`;
/*!40000 ALTER TABLE `grn_item` DISABLE KEYS */;
INSERT INTO `grn_item` (`id_grnitem`, `id_product`, `grn_no`, `unit`, `qty`) VALUES
	(1, 'PVCWP-012456', 'GRN-PI000001', 'NOS', 1000),
	(2, '1222546', 'GRN-PI000002', 'NOS', 100),
	(5, 'PRD0004', 'GRN-PI000007', 'NOS', 100),
	(6, '1222546', 'GRN-PI000007', 'NOS', 20),
	(7, 'PRD0007', 'GRN-PI000007', 'Inch', 25),
	(8, 'PRD0003', 'GRN-PI000009', 'NOS', 1000),
	(9, 'PRD0004', 'GRN-PI000010', 'NOS', 10),
	(10, 'PRD0003', 'GRN-PI000011', 'NOS', 2),
	(11, 'PRD0003', 'GRN-PI000012', 'NOS', 1),
	(12, 'PRD0003', 'GRN-PI000013', 'NOS', 1),
	(13, 'PRD0003', 'GRN-PI000014', 'NOS', 1),
	(14, 'PRD0003', 'GRN-PI000015', 'NOS', 1),
	(15, 'PRD0003', 'GRN-PI000016', 'NOS', 1),
	(16, 'PRD0003', 'GRN-PI000017', 'NOS', 1),
	(17, 'PRD0003', 'GRN-PI000018', 'NOS', 1),
	(18, 'PRD0003', 'GRN-PI000019', 'NOS', 1),
	(19, 'PRD0003', 'GRN-PI000020', 'NOS', 1),
	(20, 'PRD0004', 'GRN-PI000021', 'NOS', 1),
	(21, '1222546', 'GRN-PI000022', 'NOS', 1),
	(22, 'PRD0005', 'GRN-PI000023', 'NOS', 1),
	(23, '1222546', 'GRN-PI000024', 'NOS', 1),
	(24, 'PRD0003', 'GRN-PI000025', 'NOS', 1),
	(25, 'PRD0005', 'GRN-PI000026', 'NOS', 1),
	(26, 'PRD0003', 'GRN-PI000027', 'NOS', 1000),
	(27, 'PRD0004', 'GRN-PI000028', '', 4),
	(28, 'PRD0003', 'GRN-PI000029', '', 12),
	(29, 'PRD0003', 'GRN-PI000030', 'NOS', 10);
/*!40000 ALTER TABLE `grn_item` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.grn_product
CREATE TABLE IF NOT EXISTS `grn_product` (
  `grn_no` varchar(15) NOT NULL,
  `date` date DEFAULT NULL,
  `last_modified` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `state` tinyint(4) DEFAULT NULL,
  `created_by` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`grn_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.grn_product: ~27 rows (approximately)
DELETE FROM `grn_product`;
/*!40000 ALTER TABLE `grn_product` DISABLE KEYS */;
INSERT INTO `grn_product` (`grn_no`, `date`, `last_modified`, `state`, `created_by`) VALUES
	('GRN-PI000001', '2019-09-06', '2019-10-05 00:14:01', 1, 'sample'),
	('GRN-PI000002', '2019-09-07', '2019-10-05 00:14:05', 1, 'sample'),
	('GRN-PI000003', '2019-09-14', '2019-09-14 19:53:17', 1, 'sample'),
	('GRN-PI000004', '2019-09-27', '2019-09-14 23:05:43', 1, 'sample'),
	('GRN-PI000005', '2019-09-17', '2019-09-16 09:42:27', 1, 'sample'),
	('GRN-PI000006', '2019-09-13', '2019-09-16 09:52:13', 1, 'sample'),
	('GRN-PI000007', '2019-09-16', '2019-09-16 17:18:40', 1, 'sample'),
	('GRN-PI000008', '2019-09-19', '2019-09-19 09:54:46', 1, 'sample'),
	('GRN-PI000009', '2019-09-19', '2019-09-19 10:14:46', 1, 'sample'),
	('GRN-PI000010', '2019-09-26', '2019-09-26 16:31:17', 1, 'sample'),
	('GRN-PI000011', '2019-09-26', '2019-09-26 16:32:23', 1, 'sample'),
	('GRN-PI000012', '2019-09-26', '2019-09-26 16:34:07', 1, 'sample'),
	('GRN-PI000013', '2019-09-26', '2019-09-26 16:35:33', 1, 'sample'),
	('GRN-PI000014', '2019-09-26', '2019-09-26 16:36:25', 1, 'sample'),
	('GRN-PI000015', '2019-09-26', '2019-09-26 16:38:32', 1, 'sample'),
	('GRN-PI000016', '2019-09-26', '2019-09-26 16:39:13', 1, 'sample'),
	('GRN-PI000017', '2019-09-26', '2019-09-26 16:41:09', 1, 'sample'),
	('GRN-PI000018', '2019-09-26', '2019-09-26 16:43:14', 1, 'sample'),
	('GRN-PI000019', '2019-09-26', '2019-09-26 16:45:20', 1, 'sample'),
	('GRN-PI000020', '2019-09-26', '2019-09-26 16:52:12', 1, 'sample'),
	('GRN-PI000021', '2019-09-26', '2019-09-26 16:53:14', 1, 'sample'),
	('GRN-PI000022', '2019-09-26', '2019-09-26 16:55:13', 1, 'sample'),
	('GRN-PI000023', '2019-09-26', '2019-09-26 16:56:07', 1, 'sample'),
	('GRN-PI000024', '2019-09-26', '2019-09-26 16:59:20', 1, 'sample'),
	('GRN-PI000025', '2019-09-26', '2019-09-26 17:00:20', 1, 'sample'),
	('GRN-PI000026', '2019-09-26', '2019-09-26 18:59:02', 1, 'sample'),
	('GRN-PI000027', '2019-10-04', '2019-10-04 23:29:51', 1, 'sample'),
	('GRN-PI000028', '2019-10-02', '2019-10-05 11:31:27', 1, 'sample'),
	('GRN-PI000029', '2019-10-10', '2019-10-05 11:32:23', 1, 'sample'),
	('GRN-PI000030', '2019-10-05', '2019-10-05 12:07:38', 1, 'sample');
/*!40000 ALTER TABLE `grn_product` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.grn_raw
CREATE TABLE IF NOT EXISTS `grn_raw` (
  `grn_no` varchar(15) NOT NULL,
  `id_supplier` varchar(15) NOT NULL,
  `date` date DEFAULT NULL,
  `value` double DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  `created_by` varchar(15) DEFAULT NULL,
  `last_modified` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `approved_by` varchar(45) DEFAULT NULL,
  `payment_voucherNo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`grn_no`),
  KEY `fk_grn_supplier1_idx` (`id_supplier`),
  CONSTRAINT `fk_grn_supplier1` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.grn_raw: ~17 rows (approximately)
DELETE FROM `grn_raw`;
/*!40000 ALTER TABLE `grn_raw` DISABLE KEYS */;
INSERT INTO `grn_raw` (`grn_no`, `id_supplier`, `date`, `value`, `state`, `created_by`, `last_modified`, `approved_by`, `payment_voucherNo`) VALUES
	('GRN-RM000001', 'SP0001', '2019-09-05', 25000, 1, 'null', '2019-10-05 00:14:23', NULL, 'SPV000009'),
	('GRN-RM000002', 'SP0001', '2019-09-06', 1239000, 1, 'null', '2019-10-05 00:14:31', NULL, 'SPV000005'),
	('GRN-RM000003', 'SP0001', '2019-09-06', 100000, 1, 'null', '2019-10-05 00:14:29', NULL, 'SPV000005'),
	('GRN-RM000004', 'SP0001', '2019-09-06', 10000, 1, 'null', '2019-10-05 12:04:18', NULL, 'SPV000012'),
	('GRN-RM000005', 'SP0001', '2019-09-06', 10000, 1, 'null', '2019-10-05 00:14:39', NULL, 'SPV000001'),
	('GRN-RM000006', 'SP0001', '2019-09-07', 32500, 1, 'null', '2019-10-05 00:14:42', NULL, 'SPV000001'),
	('GRN-RM000007', 'SP0001', '2019-09-16', 7300, 1, 'null', '2019-10-05 12:04:18', NULL, 'SPV000012'),
	('GRN-RM000008', 'SP0002', '2019-09-19', 12000, 1, 'null', '2019-10-04 20:44:33', NULL, 'SPV000010'),
	('GRN-RM000009', 'SP0002', '2019-09-19', 60990, 1, 'null', '2019-10-04 17:13:37', NULL, 'SPV000002'),
	('GRN-RM000010', 'SP0001', '2019-09-19', 345100, 1, 'null', '2019-10-04 20:41:37', NULL, 'SPV000008'),
	('GRN-RM000011', 'SP0001', '2019-09-26', 592, 1, 'null', '2019-09-28 16:27:01', NULL, 'SPV000001'),
	('GRN-RM000012', 'SP0001', '2019-09-26', 238, 1, 'null', '2019-09-28 16:27:01', NULL, 'SPV000001'),
	('GRN-RM000013', 'SP0002', '2019-10-04', 100, 1, 'null', '2019-10-04 20:48:36', NULL, 'SPV000011'),
	('GRN-RM000014', 'SP0001', '2019-10-04', 224, 1, 'null', '2019-10-04 20:00:37', NULL, 'SPV000004'),
	('GRN-RM000015', 'SP0001', '2019-10-04', 10, 1, 'null', '2019-10-04 20:29:32', NULL, 'SPV000006'),
	('GRN-RM000016', 'SP0002', '2019-10-04', 200, 1, 'null', '2019-10-04 20:44:33', NULL, 'SPV000010'),
	('GRN-RM000017', 'SP0001', '2019-10-04', 10000, 1, 'null', '2019-10-05 12:04:18', NULL, 'SPV000012'),
	('GRN-RM000018', 'SP0001', '2019-10-05', 5000, 1, 'null', '2019-10-05 12:04:18', NULL, 'SPV000012');
/*!40000 ALTER TABLE `grn_raw` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.grn_rawitem
CREATE TABLE IF NOT EXISTS `grn_rawitem` (
  `id_items` int(11) NOT NULL AUTO_INCREMENT,
  `grn_no` varchar(15) NOT NULL,
  `id_raw` varchar(15) NOT NULL,
  `qty` double DEFAULT NULL,
  `value` double DEFAULT NULL,
  `unit_price` double NOT NULL,
  PRIMARY KEY (`id_items`),
  KEY `fk_grn_item_raw_grn_raw1_idx` (`grn_no`),
  KEY `fk_grn_item_raw_raw_matrials1_idx` (`id_raw`),
  CONSTRAINT `fk_grn_item_raw_grn_raw1` FOREIGN KEY (`grn_no`) REFERENCES `grn_raw` (`grn_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_grn_item_raw_raw_matrials1` FOREIGN KEY (`id_raw`) REFERENCES `raw_matrials` (`idraw_matrials`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.grn_rawitem: ~25 rows (approximately)
DELETE FROM `grn_rawitem`;
/*!40000 ALTER TABLE `grn_rawitem` DISABLE KEYS */;
INSERT INTO `grn_rawitem` (`id_items`, `grn_no`, `id_raw`, `qty`, `value`, `unit_price`) VALUES
	(1, 'GRN-RM000001', 'RMI0001', 10, 25000, 0),
	(2, 'GRN-RM000002', 'RMI0001', 1000, 1200000, 0),
	(3, 'GRN-RM000002', 'RMI0002', 150, 39000, 0),
	(4, 'GRN-RM000003', 'RMI0001', 1000, 100000, 0),
	(5, 'GRN-RM000004', 'RMI0001', 100, 10000, 0),
	(6, 'GRN-RM000005', 'RMI0001', 100, 10000, 0),
	(7, 'GRN-RM000006', 'RMI0001', 100, 12500, 0),
	(8, 'GRN-RM000006', 'RMI0001', 125, 20000, 0),
	(9, 'GRN-RM000007', 'RMI0005', 25, 2500, 0),
	(10, 'GRN-RM000007', 'RMI0003', 24, 4800, 0),
	(11, 'GRN-RM000008', 'RMI0005', 100, 12000, 0),
	(12, 'GRN-RM000009', 'RMI0003', 100, 24500, 0),
	(13, 'GRN-RM000009', 'RMI0005', 178, 36490, 0),
	(14, 'GRN-RM000010', 'RMI0004', 420, 90300, 0),
	(15, 'GRN-RM000010', 'RMI0008', 700, 254800, 0),
	(16, 'GRN-RM000011', 'RMI0001', 2, 400, 200),
	(17, 'GRN-RM000011', 'RMI0005', 3, 192, 64),
	(18, 'GRN-RM000012', 'RMI0004', 2, 64, 32),
	(19, 'GRN-RM000012', 'RMI0005', 2, 174, 87),
	(20, 'GRN-RM000013', 'RMI0002', 1, 100, 100),
	(21, 'GRN-RM000014', 'RMI0001', 1, 120, 120),
	(22, 'GRN-RM000014', 'RMI0006', 1, 104, 104),
	(23, 'GRN-RM000015', 'RMI0004', 1, 10, 10),
	(24, 'GRN-RM000016', 'RMI0005', 1, 200, 200),
	(25, 'GRN-RM000017', 'RMI0004', 100, 10000, 100),
	(26, 'GRN-RM000018', 'RMI0001', 4, 4000, 1000),
	(27, 'GRN-RM000018', 'RMI0003', 5, 1000, 200);
/*!40000 ALTER TABLE `grn_rawitem` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.incentive
CREATE TABLE IF NOT EXISTS `incentive` (
  `incentive_id` int(11) NOT NULL AUTO_INCREMENT,
  `grade` varchar(5) DEFAULT '0',
  `percentage` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`incentive_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.incentive: ~4 rows (approximately)
DELETE FROM `incentive`;
/*!40000 ALTER TABLE `incentive` DISABLE KEYS */;
INSERT INTO `incentive` (`incentive_id`, `grade`, `percentage`) VALUES
	(1, 'A', 100),
	(2, 'B', 85),
	(3, 'C', 65),
	(4, 'D', 50);
/*!40000 ALTER TABLE `incentive` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.invoice_aod
CREATE TABLE IF NOT EXISTS `invoice_aod` (
  `id_invoice` varchar(15) NOT NULL,
  `id_customer` varchar(15) NOT NULL,
  `employee_salesrep` varchar(15) NOT NULL,
  `date` date DEFAULT NULL,
  `payment_type` varchar(15) DEFAULT NULL,
  `sub_total` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `net_total` double DEFAULT NULL,
  `state` tinyint(4) DEFAULT '1',
  PRIMARY KEY (`id_invoice`),
  KEY `fk_invoice_customer1_idx` (`id_customer`),
  KEY `fk_invoice_AOD_employee1_idx` (`employee_salesrep`),
  CONSTRAINT `fk_invoice_AOD_employee1` FOREIGN KEY (`employee_salesrep`) REFERENCES `employee` (`id_employee`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_invoice_customer1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.invoice_aod: ~13 rows (approximately)
DELETE FROM `invoice_aod`;
/*!40000 ALTER TABLE `invoice_aod` DISABLE KEYS */;
INSERT INTO `invoice_aod` (`id_invoice`, `id_customer`, `employee_salesrep`, `date`, `payment_type`, `sub_total`, `discount`, `net_total`, `state`) VALUES
	('AOD000001', 'CUS00001', 'EMP0001', '2019-09-06', 'Cheque', 16550, 0, 6350, 3),
	('AOD000002', 'CUS0003', 'EMP0001', '2019-09-14', 'Cash', 62500, 0, 57500, 3),
	('AOD000003', 'CUS0003', 'EMP0001', '2019-09-07', 'Cash', 62500, 0, 62500, 3),
	('AOD000004', 'CUS00001', 'EMP0001', '2019-09-07', 'Cash', 10, 0, 0, 5),
	('AOD000005', 'CUS00001', 'EMP0001', '2019-09-07', 'Cash', 1655, 0, 0, 5),
	('AOD000006', 'CUS0002', 'EMP0001', '2019-09-07', 'Cash', 1655, 0, 1655, 3),
	('AOD000007', 'CUS00001', 'EMP0001', '2019-09-07', 'Cash', 1655, 0, 0, 5),
	('AOD000008', 'CUS00001', 'EMP0001', '2019-09-07', 'Cash', 16550, 0, 16550, 3),
	('AOD000009', 'CUS00001', 'EMP0001', '2019-09-24', 'Cheque', 1200, 0, 0, 5),
	('AOD000010', 'CUS0003', 'EMP0003', '2019-09-24', 'Cash', 240, 0, 240, 3),
	('AOD000011', 'CUS00001', 'EMP0004', '2019-09-28', 'Cash', 1200, 0, 1200, 1),
	('AOD000012', 'CUS00001', 'EMP0004', '2019-09-28', 'Cash', 1200, 0, 1200, 1),
	('AOD000013', 'CUS0002', 'EMP0004', '2019-09-28', 'Cheque', 12500, 0, 12500, 1),
	('AOD000014', 'CUS00001', 'EMP0003', '2019-10-05', 'Cash', 3800, 0, 3800, 1);
/*!40000 ALTER TABLE `invoice_aod` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.invoice_item
CREATE TABLE IF NOT EXISTS `invoice_item` (
  `id_orderitem` int(11) NOT NULL AUTO_INCREMENT,
  `id_invoice` varchar(15) NOT NULL,
  `idproduct_stock` int(11) NOT NULL,
  `qty` double DEFAULT NULL,
  `value` double DEFAULT NULL,
  PRIMARY KEY (`id_orderitem`),
  KEY `fk_invoice_item_product_stock1_idx` (`idproduct_stock`),
  KEY `fk_order_item_invoice1_idx` (`id_invoice`),
  CONSTRAINT `fk_invoice_item_product_stock1` FOREIGN KEY (`idproduct_stock`) REFERENCES `product_stock` (`idproduct_stock`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_item_invoice1` FOREIGN KEY (`id_invoice`) REFERENCES `invoice_aod` (`id_invoice`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.invoice_item: ~13 rows (approximately)
DELETE FROM `invoice_item`;
/*!40000 ALTER TABLE `invoice_item` DISABLE KEYS */;
INSERT INTO `invoice_item` (`id_orderitem`, `id_invoice`, `idproduct_stock`, `qty`, `value`) VALUES
	(1, 'AOD000001', 1, 100, 16550),
	(2, 'AOD000002', 2, 50, 62500),
	(3, 'AOD000003', 2, 50, 62500),
	(4, 'AOD000004', 2, 1250, 10),
	(5, 'AOD000005', 1, 165.5, 10),
	(6, 'AOD000006', 1, 165.5, 10),
	(7, 'AOD000007', 1, 165.5, 10),
	(8, 'AOD000008', 1, 165.5, 100),
	(9, 'AOD000009', 8, 120, 10),
	(10, 'AOD000010', 8, 120, 2),
	(11, 'AOD000011', 8, 10, 1200),
	(12, 'AOD000012', 8, 10, 1200),
	(13, 'AOD000013', 6, 10, 12500),
	(14, 'AOD000014', 8, 10, 1200),
	(15, 'AOD000014', 5, 20, 2600);
/*!40000 ALTER TABLE `invoice_item` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.journal_entry
CREATE TABLE IF NOT EXISTS `journal_entry` (
  `id_entry` varchar(15) NOT NULL,
  `date` date DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `last_modified` date DEFAULT NULL,
  `modified_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_entry`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.journal_entry: ~0 rows (approximately)
DELETE FROM `journal_entry`;
/*!40000 ALTER TABLE `journal_entry` DISABLE KEYS */;
/*!40000 ALTER TABLE `journal_entry` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.ledger_accounts
CREATE TABLE IF NOT EXISTS `ledger_accounts` (
  `idledgerAccounts` varchar(15) NOT NULL,
  `account_name` varchar(100) DEFAULT NULL,
  `account_type` varchar(15) NOT NULL,
  `opening-balance` double DEFAULT NULL,
  PRIMARY KEY (`idledgerAccounts`),
  KEY `fk_ledgerAccounts_account_types1_idx` (`account_type`),
  CONSTRAINT `fk_ledgerAccounts_account_types1` FOREIGN KEY (`account_type`) REFERENCES `account_types` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.ledger_accounts: ~0 rows (approximately)
DELETE FROM `ledger_accounts`;
/*!40000 ALTER TABLE `ledger_accounts` DISABLE KEYS */;
/*!40000 ALTER TABLE `ledger_accounts` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.payroll
CREATE TABLE IF NOT EXISTS `payroll` (
  `payid` int(11) NOT NULL AUTO_INCREMENT,
  `id_employee` varchar(15) NOT NULL,
  `date_saved` date DEFAULT NULL,
  `month` varchar(20) DEFAULT NULL,
  `year` varchar(20) DEFAULT NULL,
  `incentive_grade` varchar(10) DEFAULT NULL,
  `incentive_val` double DEFAULT NULL,
  `commission_rate` double DEFAULT NULL,
  `commission_value` double DEFAULT NULL,
  `netsalary` double DEFAULT NULL,
  `epf` double DEFAULT NULL,
  `etf` double DEFAULT NULL,
  `tot_worked_hours` double DEFAULT NULL,
  `tot_leaves` double DEFAULT NULL,
  `tot_nopay` double DEFAULT NULL,
  `total_deduction` double DEFAULT NULL,
  `gross_salary` double DEFAULT NULL,
  PRIMARY KEY (`payid`),
  KEY `FK_payroll_employee` (`id_employee`),
  CONSTRAINT `FK_payroll_employee` FOREIGN KEY (`id_employee`) REFERENCES `employee` (`id_employee`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.payroll: ~0 rows (approximately)
DELETE FROM `payroll`;
/*!40000 ALTER TABLE `payroll` DISABLE KEYS */;
INSERT INTO `payroll` (`payid`, `id_employee`, `date_saved`, `month`, `year`, `incentive_grade`, `incentive_val`, `commission_rate`, `commission_value`, `netsalary`, `epf`, `etf`, `tot_worked_hours`, `tot_leaves`, `tot_nopay`, `total_deduction`, `gross_salary`) VALUES
	(42, 'EMP0005', '2019-10-05', 'September', '2019', 'A', 10000, 10, 3500, 48500, 1750, 1050, 7.5, 0.5, 0, 2800, 45700),
	(43, 'EMP0006', '2019-10-05', 'September', '2019', 'B', 8500, 10, 3000, 41500, 1500, 900, 8.5, 0.5, 0, 2400, 39100),
	(44, 'EMP0007', '2019-10-05', 'September', '2019', 'C', 5525, 10, 0, 30525, 1250, 750, 8, 1, 0, 2000, 28525),
	(45, 'EMP0025', '2019-10-05', 'September', '2019', 'D', 2762.5, 10, 0, 2762.5, 0, 0, 0, 0, 0, 0, 2762.5),
	(46, 'EMP0011', '2019-10-05', 'September', '2019', 'A', 10000, 10, 3200, 45200, 1600, 960, 0, 0, 0, 2560, 42640),
	(47, 'EMP0011', '2019-10-05', 'September', '2019', 'B', 8500, 10, 3250, 44250, 1625, 975, 0, 0, 0, 2600, 41650),
	(48, 'EMP0011', '2019-10-05', 'September', '2019', 'C', 5525, 10, 3255, 41330, 1627.5, 976.5, 0, 0, 0, 2604, 38726),
	(49, 'EMP0021', '2019-10-05', 'September', '2019', 'D', 2762.5, 10, 3000, 35762.5, 1500, 900, 0, 0, 0, 2400, 33362.5),
	(50, 'EMP0011', '2019-10-05', 'September', '2019', 'A', 10000, 10, 3200, 45200, 1600, 960, 0, 0, 0, 2560, 42640),
	(51, 'EMP0011', '2019-10-05', 'September', '2019', 'B', 8500, 10, 3250, 44250, 1625, 975, 0, 0, 0, 2600, 41650),
	(52, 'EMP0011', '2019-10-05', 'September', '2019', 'C', 5525, 10, 3255, 41330, 1627.5, 976.5, 0, 0, 0, 2604, 38726),
	(53, 'EMP0021', '2019-10-05', 'September', '2019', 'A', 5525, 10, 3000, 38525, 1500, 900, 0, 0, 0, 2400, 36125),
	(54, 'EMP0001', '2019-10-05', 'September', '2019', 'A', 10000, 10, 4500, 59500, 2250, 1350, 5.5, 0.5, 0, 3600, 55900),
	(55, 'EMP0003', '2019-10-05', 'September', '2019', 'B', 8500, 10, 2500, 36000, 1250, 750, 5.5, 0.5, 0, 2000, 34000),
	(56, 'EMP0008', '2019-10-05', 'September', '2019', 'A', 8500, 10, 3000, 41500, 1500, 900, 4.5, 0.5, 0, 2400, 39100),
	(57, 'EMP0010', '2019-10-05', 'September', '2019', 'C', 5525, 10, 0, 33525, 1400, 840, 3.5, 1.5, 1, 3360, 30165),
	(58, 'EMP0026', '2019-10-05', 'September', '2019', 'A', 5525, 10, 0, 5525, 0, 0, 0, 0, 0, 0, 5525),
	(59, 'EMP0026', '2019-10-05', 'September', '2019', 'D', 2762.5, 10, 0, 32762.5, 1500, 900, 0, 0, 0, 2400, 30362.5);
/*!40000 ALTER TABLE `payroll` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.payroll_status
CREATE TABLE IF NOT EXISTS `payroll_status` (
  `id` int(11) NOT NULL DEFAULT '0',
  `department` varchar(50) DEFAULT NULL,
  `month` varchar(50) DEFAULT NULL,
  `year` varchar(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.payroll_status: ~0 rows (approximately)
DELETE FROM `payroll_status`;
/*!40000 ALTER TABLE `payroll_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `payroll_status` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.privilege_finance
CREATE TABLE IF NOT EXISTS `privilege_finance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL DEFAULT '0',
  `add_journal` tinyint(2) NOT NULL DEFAULT '0',
  `ledger_accounts` tinyint(2) NOT NULL DEFAULT '0',
  `discounts_offers` tinyint(2) NOT NULL DEFAULT '0',
  `reports` tinyint(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`,`username`),
  UNIQUE KEY `username` (`username`),
  CONSTRAINT `FK_privilege_finance_user` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.privilege_finance: ~0 rows (approximately)
DELETE FROM `privilege_finance`;
/*!40000 ALTER TABLE `privilege_finance` DISABLE KEYS */;
/*!40000 ALTER TABLE `privilege_finance` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.privilege_hr_department
CREATE TABLE IF NOT EXISTS `privilege_hr_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL DEFAULT '0',
  `employee_registration` tinyint(2) DEFAULT '0',
  `attendance_management` tinyint(2) DEFAULT '0',
  `attendance_management_save` tinyint(2) DEFAULT '0',
  `attendance_management_print` tinyint(2) DEFAULT '0',
  `payroll` tinyint(2) DEFAULT '0',
  `department_sections` tinyint(2) DEFAULT '0',
  `reports` tinyint(2) DEFAULT '0',
  `user_management` tinyint(2) DEFAULT '0',
  `last_updated` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`,`username`),
  UNIQUE KEY `username` (`username`),
  CONSTRAINT `FK_privilege_hr_department_user` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.privilege_hr_department: ~0 rows (approximately)
DELETE FROM `privilege_hr_department`;
/*!40000 ALTER TABLE `privilege_hr_department` DISABLE KEYS */;
/*!40000 ALTER TABLE `privilege_hr_department` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.privilege_production_department
CREATE TABLE IF NOT EXISTS `privilege_production_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL DEFAULT '0',
  `product_details` tinyint(2) NOT NULL DEFAULT '0',
  `product_details_export` tinyint(2) NOT NULL DEFAULT '0',
  `product_details_addbrand` tinyint(2) NOT NULL DEFAULT '0',
  `product_details_addcategory` tinyint(2) NOT NULL DEFAULT '0',
  `product_details_addproduct` tinyint(2) NOT NULL DEFAULT '0',
  `raw_materials` tinyint(2) NOT NULL DEFAULT '0',
  `raw_materials_add` tinyint(2) NOT NULL DEFAULT '0',
  `raw_materials_export` tinyint(2) NOT NULL DEFAULT '0',
  `product_stock` tinyint(2) NOT NULL DEFAULT '0',
  `product_stock_export` tinyint(2) NOT NULL DEFAULT '0',
  `bom` tinyint(2) NOT NULL DEFAULT '0',
  `bom_pending` tinyint(2) NOT NULL DEFAULT '0',
  `bom_addnew` tinyint(2) NOT NULL DEFAULT '0',
  `grn_product` tinyint(2) NOT NULL DEFAULT '0',
  `grn_raw` tinyint(2) NOT NULL DEFAULT '0',
  `raw_cost_perproduct` tinyint(2) NOT NULL DEFAULT '0',
  `report` tinyint(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`,`username`),
  UNIQUE KEY `username` (`username`),
  CONSTRAINT `FK_privilege_production_department_user` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.privilege_production_department: ~0 rows (approximately)
DELETE FROM `privilege_production_department`;
/*!40000 ALTER TABLE `privilege_production_department` DISABLE KEYS */;
/*!40000 ALTER TABLE `privilege_production_department` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.privilege_purchasing
CREATE TABLE IF NOT EXISTS `privilege_purchasing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL DEFAULT '0',
  `supplier_reg` tinyint(2) DEFAULT '0',
  `supplier_payment` tinyint(2) DEFAULT '0',
  `sales_commission` tinyint(2) DEFAULT '0',
  `item_movement` tinyint(2) DEFAULT '0',
  `report` tinyint(2) DEFAULT '0',
  PRIMARY KEY (`id`,`username`),
  UNIQUE KEY `username` (`username`),
  CONSTRAINT `FK_privilege_purchasing_user` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.privilege_purchasing: ~0 rows (approximately)
DELETE FROM `privilege_purchasing`;
/*!40000 ALTER TABLE `privilege_purchasing` DISABLE KEYS */;
/*!40000 ALTER TABLE `privilege_purchasing` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.privilege_salesmarketing
CREATE TABLE IF NOT EXISTS `privilege_salesmarketing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL DEFAULT '0',
  `dashboard` tinyint(2) DEFAULT '0',
  `customer_registration` tinyint(2) DEFAULT '0',
  `aod` tinyint(2) DEFAULT '0',
  `new_aod` tinyint(2) DEFAULT '0',
  `aod_approve` tinyint(2) DEFAULT '0',
  `aod_print` tinyint(2) DEFAULT '0',
  `customer_history` tinyint(2) DEFAULT '0',
  `payment_receipt` tinyint(2) DEFAULT '0',
  `dispatch_note` tinyint(2) DEFAULT '0',
  `sales_return` tinyint(2) DEFAULT '0',
  `credit_note` tinyint(2) DEFAULT '0',
  `report` tinyint(2) DEFAULT '0',
  PRIMARY KEY (`id`,`username`),
  UNIQUE KEY `username` (`username`),
  CONSTRAINT `FK_privilege_salesmarketing_user` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.privilege_salesmarketing: ~0 rows (approximately)
DELETE FROM `privilege_salesmarketing`;
/*!40000 ALTER TABLE `privilege_salesmarketing` DISABLE KEYS */;
/*!40000 ALTER TABLE `privilege_salesmarketing` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.product
CREATE TABLE IF NOT EXISTS `product` (
  `id_product` varchar(30) NOT NULL,
  `brand` varchar(15) NOT NULL,
  `category` varchar(15) NOT NULL,
  `productname` varchar(45) DEFAULT NULL,
  `unit` varchar(45) DEFAULT NULL,
  `retail_price` double DEFAULT NULL,
  `description` varchar(350) DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  `date_created` date DEFAULT NULL,
  PRIMARY KEY (`id_product`),
  KEY `fk_product_product_brand1_idx` (`brand`),
  KEY `fk_product_product_category1_idx` (`category`),
  CONSTRAINT `fk_product_product_brand1` FOREIGN KEY (`brand`) REFERENCES `product_brand` (`idbrand`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_product_product_category1` FOREIGN KEY (`category`) REFERENCES `product_category` (`idcategory`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.product: ~15 rows (approximately)
DELETE FROM `product`;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`id_product`, `brand`, `category`, `productname`, `unit`, `retail_price`, `description`, `state`, `date_created`) VALUES
	('1222546', 'ITB0002', 'ITC0002', 'PVC pipe 6m', 'NOS', 1250, 'nkadvmldas', 1, '2019-09-07'),
	('PRD0003', 'ITB0001', 'ITC0004', 'wembatz', 'NOS', 120, 'good', 1, '2019-09-14'),
	('PRD0004', 'ITB0001', 'ITC0004', 'Somadasa', 'NOS', 130, 'very good', 1, '2019-09-14'),
	('PRD0005', 'ITB0001', 'ITC0004', 'Siripala', 'NOS', 250, 'bad', 1, '2019-09-14'),
	('PRD0006', 'ITB0002', 'ITC0002', 'Siriyawathi', 'Milimeter', 462, 'hello', 1, '2019-09-14'),
	('PRD0007', 'ITB0002', 'ITC0001', 'Dana', 'Inch', 160, 'aaa', 1, '2019-09-14'),
	('PRD0008', 'ITB0001', 'ITC0003', 'Dammika', 'NOS', 75, 'sasa', 1, '2019-09-14'),
	('PRD0009', 'ITB0001', 'ITC0001', 'aasa', 'NOS', 452, 'klj', 1, '2019-09-14'),
	('PRD0010', 'ITB0003', 'ITC0005', 'goda', 'Inch', 200, 'good', 1, '2019-09-26'),
	('PRD0011', 'ITB0004', 'ITC0006', '700ml bottle', 'NOS', 1020, 'good', 1, '2019-09-28'),
	('PRD0012', 'ITB0004', 'ITC0006', 'safda', 'NOS', 100, 'good', 1, '2019-09-28'),
	('PRD0013', 'ITB0004', 'ITC0006', '600ml bottle', 'NOS', 220, 'good', 1, '2019-09-28'),
	('PRD0014', 'ITB0001', 'ITC0004', 'jkl', 'NOS', 410, 'good', 1, '2019-09-28'),
	('PRD0015', 'ITB0005', 'ITC0007', 'abc', 'NOS', 100, 'good', 1, '2019-10-04'),
	('PRD0016', 'ITB0006', 'ITC0007', 'abcd', 'NOS', 100, 'good', 1, '2019-10-05'),
	('PVCWP-012456', 'ITB0002', 'ITC0002', 'Water Pipe 20mm Thickness 6meters length', 'NOS', 165.5, 'Water Pipe 20mm Thickness 6meters length\nNational PVC Pvt Ltd', 1, '2018-08-24');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.product_brand
CREATE TABLE IF NOT EXISTS `product_brand` (
  `idbrand` varchar(15) NOT NULL,
  `brand` varchar(100) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idbrand`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.product_brand: ~5 rows (approximately)
DELETE FROM `product_brand`;
/*!40000 ALTER TABLE `product_brand` DISABLE KEYS */;
INSERT INTO `product_brand` (`idbrand`, `brand`, `description`) VALUES
	('ITB0001', 'Kripton Electricals', 'Kripton Electricals - Central Industries Pvt Ltd'),
	('ITB0002', 'National PVC', 'National PVC Pvt Ltd'),
	('ITB0003', 'lg', 'good'),
	('ITB0004', 'vat 69', 'good'),
	('ITB0005', 'abc', 'good'),
	('ITB0006', 'abcd', 'good');
/*!40000 ALTER TABLE `product_brand` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.product_category
CREATE TABLE IF NOT EXISTS `product_category` (
  `idcategory` varchar(15) NOT NULL,
  `category` varchar(100) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idcategory`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.product_category: ~7 rows (approximately)
DELETE FROM `product_category`;
/*!40000 ALTER TABLE `product_category` DISABLE KEYS */;
INSERT INTO `product_category` (`idcategory`, `category`, `description`) VALUES
	('ITC0001', 'PVC-Fittings', 'PVC-Fittings @ National PVC Ltd'),
	('ITC0002', 'PVC-Water Pipes', 'PVC-Water Pipes National PVC Pvt Ltd'),
	('ITC0003', 'PVC - Conduit Pipes', 'PVC - Conduit Pipes - Nnational PVC Pvt Ltd & Kripton Electricals'),
	('ITC0004', 'sdvsdv', 'dsvds'),
	('ITC0005', 'lgi', 'good'),
	('ITC0006', 'bebaddoo', 'good'),
	('ITC0007', 'abc', 'good'),
	('ITC0008', 'abcd', 'good');
/*!40000 ALTER TABLE `product_category` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.product_rawcost
CREATE TABLE IF NOT EXISTS `product_rawcost` (
  `id` varchar(15) NOT NULL,
  `id_product` varchar(15) NOT NULL,
  `qty` varchar(25) DEFAULT NULL,
  `per_unit` varchar(25) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  `createdby` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`,`id_product`),
  KEY `fk_product_has_raw_stock_product1_idx` (`id_product`),
  CONSTRAINT `fk_product_has_raw_stock_product1` FOREIGN KEY (`id_product`) REFERENCES `product` (`id_product`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.product_rawcost: ~8 rows (approximately)
DELETE FROM `product_rawcost`;
/*!40000 ALTER TABLE `product_rawcost` DISABLE KEYS */;
INSERT INTO `product_rawcost` (`id`, `id_product`, `qty`, `per_unit`, `create_date`, `createdby`) VALUES
	('FG-RI0001', 'PVCWP-012456', '1', 'Meter', '2019-09-26', 'Testing_User'),
	('FG-RI0002', '1222546', '01', 'Meter', '2019-09-07', 'Testing_User'),
	('FG-RI0003', 'PRD0003', '01', 'NOS', '2019-09-16', 'Testing_User'),
	('FG-RI0004', 'PRD0003', '10', 'NOS', '2019-09-18', 'Testing_User'),
	('FG-RI0005', 'PRD0009', '01', 'NOS', '2019-09-28', 'Testing_User'),
	('FG-RI0006', 'PRD0003', '01', 'NOS', '2019-10-04', 'Testing_User'),
	('FG-RI0007', '1222546', '01', 'NOS', '2019-10-04', 'Testing_User'),
	('FG-RI0008', 'PRD0004', '01', 'NOS', '2019-10-04', 'Testing_User'),
	('FG-RI0009', 'PRD0003', '01', 'Milimeter', '2019-10-05', 'Testing_User');
/*!40000 ALTER TABLE `product_rawcost` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.product_raw_items
CREATE TABLE IF NOT EXISTS `product_raw_items` (
  `idrowItems` int(11) NOT NULL AUTO_INCREMENT,
  `rawcost_id` varchar(15) NOT NULL,
  `id_raw` varchar(15) NOT NULL,
  `unit` varchar(15) DEFAULT NULL,
  `volume` double DEFAULT NULL,
  PRIMARY KEY (`idrowItems`),
  KEY `fk_rowItems_for_perUnit_per_unit_rawcost1_idx` (`rawcost_id`),
  KEY `fk_rowItems_for_perUnit_raw_matrials1_idx` (`id_raw`),
  CONSTRAINT `fk_rowItems_for_perUnit_per_unit_rawcost1` FOREIGN KEY (`rawcost_id`) REFERENCES `product_rawcost` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_rowItems_for_perUnit_raw_matrials1` FOREIGN KEY (`id_raw`) REFERENCES `raw_matrials` (`idraw_matrials`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.product_raw_items: ~20 rows (approximately)
DELETE FROM `product_raw_items`;
/*!40000 ALTER TABLE `product_raw_items` DISABLE KEYS */;
INSERT INTO `product_raw_items` (`idrowItems`, `rawcost_id`, `id_raw`, `unit`, `volume`) VALUES
	(1, 'FG-RI0001', 'RMI0001', 'Kilogram', 0.65),
	(2, 'FG-RI0001', 'RMI0002', 'Kilogram', 0.4),
	(3, 'FG-RI0001', 'RMI0003', 'Kilogram', 1),
	(4, 'FG-RI0001', 'RMI0005', 'Liter', 1.25),
	(5, 'FG-RI0001', 'RMI0004', 'Kilogram', 0.25),
	(6, 'FG-RI0001', 'RMI0006', 'Kilogram', 0.065),
	(7, 'FG-RI0001', 'RMI0007', 'Kilogram', 0.35),
	(8, 'FG-RI0002', 'RMI0003', 'Kilogram', 2),
	(9, 'FG-RI0002', 'RMI0004', 'Kilogram', 20),
	(10, 'FG-RI0002', 'RMI0006', 'Kilogram', 10),
	(11, 'FG-RI0003', 'RMI0002', 'Kilogram', 1),
	(12, 'FG-RI0003', 'RMI0002', 'Kilogram', 1),
	(13, 'FG-RI0004', 'RMI0003', 'Kilogram', 20),
	(14, 'FG-RI0005', 'RMI0009', 'NOS', 0.5),
	(15, 'FG-RI0005', 'RMI0004', 'Kilogram', 0.25),
	(16, 'FG-RI0005', 'RMI0003', 'Kilogram', 0.3),
	(17, 'FG-RI0006', 'RMI0004', 'Kilogram', 1),
	(18, 'FG-RI0006', 'RMI0004', 'Kilogram', 1),
	(19, 'FG-RI0007', 'RMI0001', 'Kilogram', 1),
	(20, 'FG-RI0008', 'RMI0006', 'Kilogram', 1),
	(21, 'FG-RI0009', 'RMI0003', 'Kilogram', 6),
	(22, 'FG-RI0009', 'RMI0001', 'Kilogram', 6);
/*!40000 ALTER TABLE `product_raw_items` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.product_stock
CREATE TABLE IF NOT EXISTS `product_stock` (
  `idproduct_stock` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` varchar(30) NOT NULL,
  `qty` double DEFAULT NULL,
  `state` tinyint(2) DEFAULT '1',
  `last_update` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idproduct_stock`),
  KEY `fk_product_stock_product1_idx` (`product_id`),
  CONSTRAINT `fk_product_stock_product1` FOREIGN KEY (`product_id`) REFERENCES `product` (`id_product`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.product_stock: ~24 rows (approximately)
DELETE FROM `product_stock`;
/*!40000 ALTER TABLE `product_stock` DISABLE KEYS */;
INSERT INTO `product_stock` (`idproduct_stock`, `product_id`, `qty`, `state`, `last_update`) VALUES
	(1, 'PVCWP-012456', 338, 1, '2019-09-07 16:33:03'),
	(2, '1222546', -1200, 1, '2019-09-07 12:37:37'),
	(5, 'PRD0004', 80, 1, '2019-10-05 11:48:04'),
	(6, '1222546', 10, 1, '2019-09-28 15:34:32'),
	(7, 'PRD0007', 25, 1, '2019-09-16 17:18:40'),
	(8, 'PRD0003', 730, 1, '2019-10-05 11:48:04'),
	(9, 'PRD0004', 10, 1, '2019-09-26 16:31:17'),
	(10, 'PRD0003', 2, 1, '2019-09-26 16:32:23'),
	(11, 'PRD0003', 1, 1, '2019-09-26 16:34:07'),
	(12, 'PRD0003', 1, 1, '2019-09-26 16:35:34'),
	(13, 'PRD0003', 1, 1, '2019-09-26 16:36:25'),
	(14, 'PRD0003', 1, 1, '2019-09-26 16:38:32'),
	(15, 'PRD0003', 1, 1, '2019-09-26 16:39:14'),
	(16, 'PRD0003', 1, 1, '2019-09-26 16:41:09'),
	(17, 'PRD0003', 1, 1, '2019-09-26 16:43:14'),
	(18, 'PRD0003', 1, 1, '2019-09-26 16:45:20'),
	(19, 'PRD0003', 1, 1, '2019-09-26 16:52:12'),
	(20, 'PRD0004', 1, 1, '2019-09-26 16:53:14'),
	(21, '1222546', 1, 1, '2019-09-26 16:55:14'),
	(22, 'PRD0005', 1, 1, '2019-09-26 16:56:07'),
	(23, '1222546', 1, 1, '2019-09-26 16:59:21'),
	(24, 'PRD0003', 1, 1, '2019-09-26 17:00:20'),
	(25, 'PRD0005', 1, 1, '2019-09-26 18:59:03'),
	(26, 'PRD0003', 1000, 1, '2019-10-04 23:29:51'),
	(27, 'PRD0004', 4, 1, '2019-10-05 11:31:27'),
	(28, 'PRD0003', 12, 1, '2019-10-05 11:32:23'),
	(29, 'PRD0003', 10, 1, '2019-10-05 12:07:38');
/*!40000 ALTER TABLE `product_stock` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.raw_category
CREATE TABLE IF NOT EXISTS `raw_category` (
  `id` varchar(15) NOT NULL,
  `category` varchar(50) DEFAULT NULL,
  `description` varchar(300) DEFAULT NULL,
  `state` tinyint(2) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.raw_category: ~3 rows (approximately)
DELETE FROM `raw_category`;
/*!40000 ALTER TABLE `raw_category` DISABLE KEYS */;
INSERT INTO `raw_category` (`id`, `category`, `description`, `state`) VALUES
	('RAWC0001', 'PVC_C001', 'PVC C001 for pipes & switches', 1),
	('RAWC0002', 'PVC_C002', 'Pipes 6mm', 1),
	('RAWC0003', 'PVC_C003', 'Walves', 1);
/*!40000 ALTER TABLE `raw_category` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.raw_matrials
CREATE TABLE IF NOT EXISTS `raw_matrials` (
  `idraw_matrials` varchar(15) NOT NULL,
  `category` varchar(15) NOT NULL,
  `name` varchar(75) DEFAULT NULL,
  `unit` varchar(15) DEFAULT NULL,
  `description` varchar(350) DEFAULT NULL,
  `state` tinyint(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idraw_matrials`),
  KEY `FK_raw_matrials_raw_category` (`category`),
  CONSTRAINT `FK_raw_matrials_raw_category` FOREIGN KEY (`category`) REFERENCES `raw_category` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.raw_matrials: ~11 rows (approximately)
DELETE FROM `raw_matrials`;
/*!40000 ALTER TABLE `raw_matrials` DISABLE KEYS */;
INSERT INTO `raw_matrials` (`idraw_matrials`, `category`, `name`, `unit`, `description`, `state`) VALUES
	('RMI0001', 'RAWC0001', 'Plastic PVC Grade6', 'Kilogram', 'Plastic PVC Grade6', 1),
	('RMI0002', 'RAWC0001', 'DOP', 'Kilogram', 'Dioctyl Phthalate, (DOP)\nDi-2-ethylhexyl phthalate (DEHP), Bis(2-ethylhexyl) phthalate', 1),
	('RMI0003', 'RAWC0001', 'PVC resin', 'Kilogram', 'PVC resin', 1),
	('RMI0004', 'RAWC0001', 'Stabilizer', 'Kilogram', 'Stabilizer', 1),
	('RMI0005', 'RAWC0001', 'Processing acids', 'Liter', 'Processing acids', 1),
	('RMI0006', 'RAWC0001', 'Colourant', 'Kilogram', 'Colourant', 1),
	('RMI0007', 'RAWC0001', 'Filler', 'Kilogram', 'Filler', 1),
	('RMI0008', 'RAWC0001', 'pvcpipe', 'NOS', 'dvwdvwcs', 1),
	('RMI0009', 'RAWC0001', 'haa', 'NOS', 'good', 1),
	('RMI0010', 'RAWC0001', 'abc', 'NOS', 'good', 1),
	('RMI0011', 'RAWC0001', 'abcd', 'NOS', 'good', 1);
/*!40000 ALTER TABLE `raw_matrials` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.raw_stock
CREATE TABLE IF NOT EXISTS `raw_stock` (
  `idraw_stock` int(11) NOT NULL AUTO_INCREMENT,
  `id_rawMatrial` varchar(15) NOT NULL,
  `qty` double DEFAULT NULL,
  `state` tinyint(2) DEFAULT '1',
  PRIMARY KEY (`idraw_stock`),
  KEY `fk_raw_stock_raw_matrials1_idx` (`id_rawMatrial`),
  CONSTRAINT `fk_raw_stock_raw_matrials1` FOREIGN KEY (`id_rawMatrial`) REFERENCES `raw_matrials` (`idraw_matrials`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.raw_stock: ~26 rows (approximately)
DELETE FROM `raw_stock`;
/*!40000 ALTER TABLE `raw_stock` DISABLE KEYS */;
INSERT INTO `raw_stock` (`idraw_stock`, `id_rawMatrial`, `qty`, `state`) VALUES
	(1, 'RMI0001', 171.85, 1),
	(2, 'RMI0002', 1981.6, 1),
	(3, 'RMI0003', 2654.4, 1),
	(4, 'RMI0004', 1185.75, 1),
	(5, 'RMI0005', 896.25, 1),
	(6, 'RMI0006', 13847.380000000001, 1),
	(7, 'RMI0007', 1800.15, 1),
	(8, 'RMI0001', 91.5, 1),
	(9, 'RMI0001', 98, 1),
	(10, 'RMI0001', 123, 1),
	(11, 'RMI0005', 25, 1),
	(12, 'RMI0003', -40.6, 1),
	(14, 'RMI0003', 35.400000000000006, 1),
	(15, 'RMI0005', 178, 1),
	(16, 'RMI0004', 373.5, 1),
	(17, 'RMI0008', 700, 1),
	(18, 'RMI0001', 0, 1),
	(19, 'RMI0005', 3, 1),
	(20, 'RMI0004', -44.5, 1),
	(21, 'RMI0005', 2, 1),
	(22, 'RMI0002', 996, 1),
	(23, 'RMI0001', 98, 1),
	(24, 'RMI0006', 80, 1),
	(25, 'RMI0004', 56, 1),
	(26, 'RMI0005', 100, 1),
	(27, 'RMI0004', 56, 1),
	(28, 'RMI0001', 4, 1),
	(29, 'RMI0003', 5, 1);
/*!40000 ALTER TABLE `raw_stock` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.receipts
CREATE TABLE IF NOT EXISTS `receipts` (
  `id_receipts` varchar(15) NOT NULL,
  `id_customer` varchar(15) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id_receipts`),
  KEY `fk_receipts_customer1_idx` (`id_customer`),
  CONSTRAINT `fk_receipts_customer1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.receipts: ~9 rows (approximately)
DELETE FROM `receipts`;
/*!40000 ALTER TABLE `receipts` DISABLE KEYS */;
INSERT INTO `receipts` (`id_receipts`, `id_customer`, `type`, `date`, `amount`, `state`) VALUES
	('1', 'CUS00001', 'cash', '2019-09-28', 200, 1),
	('10', 'CUS00001', 'Cash', '2019-10-05', 16750, 1),
	('2', 'CUS0003', 'Cash', '2019-09-28', 5000, 1),
	('3', 'CUS00001', 'Cash', '2019-09-28', 800, 1),
	('4', 'CUS00001', 'Cash', '2019-09-28', 200, 1),
	('5', 'CUS00001', 'Cash', '2019-10-04', 1355, 1),
	('6', 'CUS00001', 'Cheque', '2019-10-04', 10, 1),
	('7', 'CUS00001', 'Cheque', '2019-10-04', 1555, 1),
	('8', 'CUS00001', 'Cheque', '2019-10-04', 1555, 1),
	('9', 'CUS00001', 'Cheque', '2019-10-04', 1200, 1);
/*!40000 ALTER TABLE `receipts` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.receipts_has_aod
CREATE TABLE IF NOT EXISTS `receipts_has_aod` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_receipts` varchar(15) NOT NULL,
  `id_invoice` varchar(15) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_receipts_has_invoice_AOD_invoice_AOD1_idx` (`id_invoice`),
  KEY `fk_receipts_has_invoice_AOD_receipts1_idx` (`id_receipts`),
  CONSTRAINT `fk_receipts_has_invoice_AOD_invoice_AOD1` FOREIGN KEY (`id_invoice`) REFERENCES `invoice_aod` (`id_invoice`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_receipts_has_invoice_AOD_receipts1` FOREIGN KEY (`id_receipts`) REFERENCES `receipts` (`id_receipts`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.receipts_has_aod: ~9 rows (approximately)
DELETE FROM `receipts_has_aod`;
/*!40000 ALTER TABLE `receipts_has_aod` DISABLE KEYS */;
INSERT INTO `receipts_has_aod` (`id`, `id_receipts`, `id_invoice`) VALUES
	(1, '2', 'AOD000002'),
	(2, '3', 'AOD000005'),
	(3, '4', 'AOD000005'),
	(4, '4', 'AOD000007'),
	(5, '4', 'AOD000005'),
	(6, '5', 'AOD000005'),
	(7, '6', 'AOD000004'),
	(8, '8', 'AOD000007'),
	(9, '9', 'AOD000009'),
	(10, '10', 'AOD000001'),
	(11, '10', 'AOD000001');
/*!40000 ALTER TABLE `receipts_has_aod` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.salary_advance
CREATE TABLE IF NOT EXISTS `salary_advance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_employee` varchar(15) NOT NULL,
  `amount` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_salary_advance_employee1_idx` (`id_employee`),
  CONSTRAINT `fk_salary_advance_employee1` FOREIGN KEY (`id_employee`) REFERENCES `employee` (`id_employee`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.salary_advance: ~0 rows (approximately)
DELETE FROM `salary_advance`;
/*!40000 ALTER TABLE `salary_advance` DISABLE KEYS */;
/*!40000 ALTER TABLE `salary_advance` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.sales_return
CREATE TABLE IF NOT EXISTS `sales_return` (
  `idsales_return` varchar(15) NOT NULL,
  `id_invoice` varchar(15) NOT NULL,
  `date_created` date DEFAULT NULL,
  `time_created` time DEFAULT NULL,
  `value` double DEFAULT NULL,
  `created_by` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idsales_return`),
  KEY `fk_sales_return_invoice1_idx` (`id_invoice`),
  CONSTRAINT `fk_sales_return_invoice1` FOREIGN KEY (`id_invoice`) REFERENCES `invoice_aod` (`id_invoice`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.sales_return: ~0 rows (approximately)
DELETE FROM `sales_return`;
/*!40000 ALTER TABLE `sales_return` DISABLE KEYS */;
/*!40000 ALTER TABLE `sales_return` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.sales_return_items
CREATE TABLE IF NOT EXISTS `sales_return_items` (
  `id_return_items` int(11) NOT NULL,
  `id_sales_return` varchar(15) NOT NULL,
  `id_product` varchar(30) NOT NULL,
  `qty` double DEFAULT NULL,
  `value` double DEFAULT NULL,
  PRIMARY KEY (`id_return_items`),
  KEY `fk_sales_return_items_sales_return1_idx` (`id_sales_return`),
  KEY `fk_sales_return_items_product1_idx` (`id_product`),
  CONSTRAINT `fk_sales_return_items_product1` FOREIGN KEY (`id_product`) REFERENCES `product` (`id_product`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sales_return_items_sales_return1` FOREIGN KEY (`id_sales_return`) REFERENCES `sales_return` (`idsales_return`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.sales_return_items: ~0 rows (approximately)
DELETE FROM `sales_return_items`;
/*!40000 ALTER TABLE `sales_return_items` DISABLE KEYS */;
/*!40000 ALTER TABLE `sales_return_items` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.supplier
CREATE TABLE IF NOT EXISTS `supplier` (
  `id_supplier` varchar(15) NOT NULL,
  `company` varchar(45) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `telephoneno` varchar(15) DEFAULT NULL,
  `mobile` varchar(15) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `fax` varchar(15) DEFAULT NULL,
  `contact_person` varchar(45) DEFAULT NULL,
  `contact_person_mobile` varchar(15) DEFAULT NULL,
  `contact_person_email` varchar(100) DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  `date_created` date DEFAULT NULL,
  `created_by` varchar(15) DEFAULT NULL,
  `last_modified` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifiedby` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_supplier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.supplier: ~2 rows (approximately)
DELETE FROM `supplier`;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` (`id_supplier`, `company`, `street`, `city`, `telephoneno`, `mobile`, `email`, `fax`, `contact_person`, `contact_person_mobile`, `contact_person_email`, `state`, `date_created`, `created_by`, `last_modified`, `modifiedby`) VALUES
	('SP0001', 'Leader Manufacturer Pvt Ltd', 'Colombo Rd', 'Bandaragama', '0755555555', '7777777777', 'lakshankkn@gmail.com', '7777777777', 'Nimantha', '0767507407', 'lakshankkn@gmail.com', 1, '2018-09-05', 'Panda', '2018-09-05 09:17:52', 'Panda'),
	('SP0002', 'Sampath Pvt ltd', 'mmm', 'colombo', '1216848648', '2465464564', 'aaa@gmail.com', '1213212113', 'wrewt', '1468468465', 'ccc@gmail.com', 1, '2018-09-07', 'Panda', '2019-10-05 00:18:21', 'Panda'),
	('SP0003', 'CBS', 'Nawala Road', 'Nawala', '0112741795', '0716055709', 'g6462.thilina@gmail.com', '0112741795', 'Sampath', '0776055708', 'sampath23@gmail.com', 1, NULL, 'Panda', '2019-10-05 12:03:32', 'Panda');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.supplier_payment
CREATE TABLE IF NOT EXISTS `supplier_payment` (
  `payment_voucherNo` varchar(50) NOT NULL,
  `grn_no` varchar(15) DEFAULT NULL,
  `id_supplier` varchar(15) NOT NULL,
  `value` double DEFAULT NULL,
  `payment_method` varchar(45) DEFAULT NULL,
  `created_by` varchar(15) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`payment_voucherNo`),
  KEY `fk_payment_supplier1_idx` (`id_supplier`),
  KEY `fk_payment_grn1_idx` (`grn_no`),
  CONSTRAINT `fk_payment_grn1` FOREIGN KEY (`grn_no`) REFERENCES `grn_raw` (`grn_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_payment_supplier1` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.supplier_payment: ~11 rows (approximately)
DELETE FROM `supplier_payment`;
/*!40000 ALTER TABLE `supplier_payment` DISABLE KEYS */;
INSERT INTO `supplier_payment` (`payment_voucherNo`, `grn_no`, `id_supplier`, `value`, `payment_method`, `created_by`, `date`, `state`) VALUES
	('SPV000001', NULL, 'SP0001', 1769730, 'Cash', NULL, '2019-09-28', NULL),
	('SPV000002', NULL, 'SP0002', 72990, 'Cash', 'nima', '2019-10-04', NULL),
	('SPV000003', NULL, 'SP0002', 100, 'Cash', 'nima', '2019-10-04', NULL),
	('SPV000004', NULL, 'SP0001', 224, 'Cash', 'wemba', '2019-10-04', NULL),
	('SPV000005', NULL, 'SP0001', 1364000, 'Cash', 'wemba', '2019-10-04', NULL),
	('SPV000006', NULL, 'SP0001', 10, 'Cash', 'null', '2019-10-04', NULL),
	('SPV000007', NULL, 'SP0002', 200, 'Cash', 'wemba', '2019-10-04', NULL),
	('SPV000008', NULL, 'SP0001', 387400, 'Cash', 'wemba', '2019-10-04', NULL),
	('SPV000009', NULL, 'SP0001', 25000, 'Cash', 'wemba', '2019-10-04', NULL),
	('SPV000010', NULL, 'SP0002', 12300, 'Cash', 'wemba', '2019-10-04', NULL),
	('SPV000011', NULL, 'SP0002', 100, 'Cash', 'wemba', '2019-10-04', NULL),
	('SPV000012', NULL, 'SP0001', 32300, 'Cash', 'wemba', '2019-10-05', NULL);
/*!40000 ALTER TABLE `supplier_payment` ENABLE KEYS */;

-- Dumping structure for table central_insdustries.user
CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(15) NOT NULL,
  `id_employee` varchar(15) NOT NULL,
  `password` varchar(130) DEFAULT NULL,
  `state` tinyint(2) DEFAULT NULL,
  `date_created` date DEFAULT NULL,
  `last_modified` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Seq1_id` text,
  `Seq1_ans` text,
  `Seq2_id` text,
  `Seq2_ans` text,
  `Seq3_id` text,
  `Seq3_ans` text,
  PRIMARY KEY (`username`,`id_employee`),
  UNIQUE KEY `id_employee` (`id_employee`),
  KEY `fk_user_employee1_idx` (`id_employee`),
  CONSTRAINT `fk_user_employee1` FOREIGN KEY (`id_employee`) REFERENCES `employee` (`id_employee`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table central_insdustries.user: ~3 rows (approximately)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`username`, `id_employee`, `password`, `state`, `date_created`, `last_modified`, `Seq1_id`, `Seq1_ans`, `Seq2_id`, `Seq2_ans`, `Seq3_id`, `Seq3_ans`) VALUES
	('nima', 'EMP0001', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 1, '2019-09-07', '2019-10-05 00:18:51', 'What school did you attend for sixth grade?', 'zz', 'Who was your childhood hero?', 'xx', 'What was your favorite food as a child?', 'cc'),
	('panda', 'EMP0002', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 1, '2019-09-07', '2019-10-05 00:18:54', 'In what year was your father born?', '1231', 'Who was your childhood hero?', '123', 'What was your childhood nickname?', '1233'),
	('Wemba', 'EMP0006', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 1, '2019-09-08', '2019-10-05 10:27:11', 'What was the last name of your favourite teacher?', 'Chathuri', 'What was your favorite food?', 'Cheese Koththu', 'In what town or city was your first job?', 'Teaching');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
