-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Sam 06 Août 2016 à 16:03
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12


--USE database java;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `java`
--

-- --------------------------------------------------------

--
-- Structure de la table `evenement`
--

CREATE TABLE IF NOT EXISTS `evenement` (
  `idEven` int(11) NOT NULL AUTO_INCREMENT,
  `nomEven` varchar(50) NOT NULL,
  `textEven` text,
  `debutEven` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `finEven` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idEven`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=57 ;

--
-- Contenu de la table `evenement`
--

INSERT INTO `evenement` (`idEven`, `nomEven`, `textEven`, `debutEven`, `finEven`) VALUES
(26, 'give me a id', NULL, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(27, 'lo', 'yo', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(28, 'ha', 'ha', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(29, 'Yo', 'Lo', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(30, 'Yo', 'Lo', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(31, 'Yo', 'Lo', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(32, 'Yo', 'Lo', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(33, 'give me a id', NULL, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(34, 'Give me five', 'lala', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(35, 'gogo', 'yoyo', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(36, 'give me a id', NULL, '2016-08-05 16:08:13', '2016-08-05 16:08:13'),
(37, 'give me a id', NULL, '2016-08-05 19:06:20', '2016-08-05 19:06:20'),
(38, 'give me a id', NULL, '2016-08-05 19:07:06', '2016-08-05 19:07:06'),
(39, 'give me a id', NULL, '2016-08-05 19:10:42', '2016-08-05 19:10:42'),
(40, 'give me a id', NULL, '2016-08-05 19:12:43', '2016-08-05 19:12:43'),
(41, 'RDV', 'Lieu', '1989-12-25 11:44:00', '2016-08-05 19:34:23'),
(42, 'give me a id', NULL, '2016-08-05 19:57:14', '2016-08-05 19:57:14'),
(43, 'give me a id', NULL, '2016-08-05 19:59:20', '2016-08-05 19:59:20'),
(44, 'give me a id', NULL, '2016-08-05 20:03:43', '2016-08-05 20:03:43'),
(45, 'RDV', 'Lieu', '2016-08-05 20:15:00', '2016-08-05 01:15:00'),
(46, 'give me a five', 'chez moi', '2016-08-05 20:34:00', '2016-08-05 12:00:00'),
(47, 'here we are', 'Chez moi', '2016-08-06 22:20:00', '2016-08-06 22:30:00'),
(48, 'give me a id', NULL, '2016-08-05 22:27:12', '2016-08-05 22:27:12'),
(49, 'give me a id', NULL, '2016-08-05 22:27:32', '2016-08-05 22:27:32'),
(50, 'b-day', 'chez moi', '1989-06-25 16:00:00', '1989-06-25 19:20:00'),
(51, 'Go', 'Go', '1989-06-25 16:00:00', '1989-06-25 16:50:00'),
(52, 'Go', 'Go', '1989-06-25 16:00:00', '1989-06-25 16:50:00'),
(53, 'Go', 'Go', '1989-06-25 16:00:00', '1989-06-25 16:50:00'),
(54, 'Bday', 'chez moi', '1989-06-25 16:12:00', '1989-06-25 18:30:00'),
(55, 'give me a id', NULL, '2016-08-05 22:39:01', '2016-08-05 22:39:01'),
(56, 'RDV', 'Lieu', '2016-06-05 13:15:00', '2016-06-05 16:15:00');

-- --------------------------------------------------------

--
-- Structure de la table `invitation`
--

CREATE TABLE IF NOT EXISTS `invitation` (
  `idEven` int(11) NOT NULL,
  `mailPers` varchar(120) NOT NULL,
  `si_prevenu` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idEven`,`mailPers`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `invitation`
--

INSERT INTO `invitation` (`idEven`, `mailPers`, `si_prevenu`) VALUES
(26, 'hotmail', 0),
(27, 'hotmail', 0),
(28, 'hotmail', 0),
(29, 'hotmail', 0),
(30, 'hotmail', 0),
(56, '@hotmail', 0);

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE IF NOT EXISTS `personne` (
  `nomPers` varchar(50) NOT NULL,
  `prenomPers` varchar(50) NOT NULL,
  `mailPers` varchar(150) NOT NULL,
  PRIMARY KEY (`mailPers`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `personne`
--

INSERT INTO `personne` (`nomPers`, `prenomPers`, `mailPers`) VALUES
('P', 'Daniele', '@gmail'),
('P', 'Daniele', '@hotmail'),
('D', 'Li', '@yoyo'),
('Votre Nome', 'Votre Prenom', 'address@mail'),
('YO', 'Paul', 'hihi@mail'),
('Deng', 'Li', 'ldeng@gmail.com'),
('Votre Nome', 'Votre Prenom', 'lideng@');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
