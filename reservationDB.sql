-- phpMyAdmin SQL Dump
-- version 2.11.2.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 10, 2021 at 11:30 AM
-- Server version: 5.0.45
-- PHP Version: 5.2.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `reservationdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `AccountNo` int(255) NOT NULL auto_increment,
  `email` varchar(50) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(2) NOT NULL,
  `gender` varchar(9) NOT NULL,
  `type` varchar(10) NOT NULL,
  PRIMARY KEY  (`AccountNo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`AccountNo`, `email`, `username`, `password`, `age`, `gender`, `type`) VALUES
(1, 'iamadmin@admin.com', 'admin', '92668751', 69, 'Male', 'admin'),
(2, 'almarjavier24@gmail.com', 'almar', '92906835', 20, 'Male', 'user'),
(3, 'johnnysins@gmail.com', 'johnny', '-1154558954', 22, 'Male', 'user'),
(4, 'sdf', 'sdf', '113717', 23, 'sd', 'user'),
(5, 'dfg', 'dfg', '99365', 24, 'Male', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `package`
--

CREATE TABLE `package` (
  `Package_ID` int(50) NOT NULL auto_increment,
  `PackageName` varchar(50) NOT NULL,
  `Max_Guests` int(2) NOT NULL,
  `Rate` float NOT NULL,
  PRIMARY KEY  (`Package_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `package`
--

INSERT INTO `package` (`Package_ID`, `PackageName`, `Max_Guests`, `Rate`) VALUES
(1, 'Solo Package', 1, 600),
(2, 'Trio Package', 3, 1000),
(3, 'Hexa Package', 6, 1800),
(4, 'Deca Package', 10, 3000),
(5, 'The VIP Package', 8, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `ReserveID` int(255) NOT NULL auto_increment,
  `Package_ID` int(50) NOT NULL,
  `AccountNo` int(255) NOT NULL,
  `reservee` varchar(255) NOT NULL,
  `Date_Reserved` datetime NOT NULL,
  `check_in` datetime NOT NULL,
  `check_out` datetime NOT NULL,
  `night_stay` int(2) NOT NULL,
  `Guests` int(2) NOT NULL,
  `RoomNo` varchar(50) NOT NULL,
  PRIMARY KEY  (`ReserveID`),
  KEY `AccountNo` (`AccountNo`),
  KEY `Package_ID` (`Package_ID`),
  KEY `RoomNo` (`RoomNo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=96 ;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`ReserveID`, `Package_ID`, `AccountNo`, `reservee`, `Date_Reserved`, `check_in`, `check_out`, `night_stay`, `Guests`, `RoomNo`) VALUES
(78, 1, 1, 'dfg', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '1-101'),
(79, 5, 1, 'fghgffg', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '5-105'),
(80, 5, 1, 'fdgfdgfd', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '5-107'),
(81, 1, 1, 'ggj', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '1-102'),
(82, 4, 1, 'almar', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '5-100'),
(83, 1, 1, 'qwerty', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '1-103'),
(84, 1, 1, 'dfgdf', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '1-104'),
(85, 1, 2, 'ghjg', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '1-107'),
(86, 2, 2, 'hk', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '2-109'),
(87, 1, 1, 'gfghk', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '1-105'),
(88, 3, 1, 'fdg', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '3-109'),
(89, 1, 1, 'fdg', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '2-101'),
(90, 1, 1, 'testing', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '2-102'),
(91, 1, 1, 'testing2', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '2-103'),
(92, 1, 2, 'fgddfgg', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '2-100'),
(93, 1, 2, 'vip', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '2-104'),
(94, 1, 1, 'almar', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '2-106'),
(95, 2, 2, 'fgdhfghfgh', '2021-07-10 00:00:00', '2021-01-01 00:00:00', '2021-01-02 00:00:00', 1, 1, '2-108');

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `RoomNo` varchar(50) NOT NULL,
  `Package_ID` int(50) NOT NULL,
  `No_of_Reservations` int(1) NOT NULL,
  PRIMARY KEY  (`RoomNo`),
  KEY `Class_ID` (`Package_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`RoomNo`, `Package_ID`, `No_of_Reservations`) VALUES
('1-100', 1, 0),
('1-101', 1, 1),
('1-102', 1, 1),
('1-103', 1, 1),
('1-104', 1, 1),
('1-105', 1, 1),
('1-106', 1, 0),
('1-107', 1, 1),
('1-108', 2, 0),
('1-109', 2, 0),
('2-100', 1, 1),
('2-101', 1, 1),
('2-102', 1, 1),
('2-103', 1, 1),
('2-104', 1, 1),
('2-105', 1, 0),
('2-106', 1, 1),
('2-107', 1, 0),
('2-108', 2, 1),
('2-109', 2, 1),
('3-100', 2, 0),
('3-101', 2, 0),
('3-102', 2, 0),
('3-103', 2, 0),
('3-104', 2, 0),
('3-105', 2, 0),
('3-106', 2, 0),
('3-107', 2, 0),
('3-108', 3, 0),
('3-109', 3, 1),
('4-100', 3, 0),
('4-101', 3, 0),
('4-102', 3, 0),
('4-103', 3, 0),
('4-104', 3, 0),
('4-105', 3, 0),
('4-106', 3, 0),
('4-107', 3, 0),
('4-108', 3, 0),
('4-109', 4, 0),
('5-100', 4, 1),
('5-101', 4, 0),
('5-102', 4, 0),
('5-103', 4, 0),
('5-104', 4, 0),
('5-105', 5, 1),
('5-106', 5, 0),
('5-107', 5, 1),
('5-108', 5, 0),
('5-109', 5, 0);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `reservations_ibfk_2` FOREIGN KEY (`Package_ID`) REFERENCES `package` (`Package_ID`),
  ADD CONSTRAINT `reservations_ibfk_3` FOREIGN KEY (`AccountNo`) REFERENCES `accounts` (`AccountNo`),
  ADD CONSTRAINT `reservations_ibfk_4` FOREIGN KEY (`RoomNo`) REFERENCES `rooms` (`RoomNo`);

--
-- Constraints for table `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `rooms_ibfk_1` FOREIGN KEY (`Package_ID`) REFERENCES `package` (`Package_ID`);
