-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Lun 08 Août 2016 à 01:48
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=79 ;

--
-- Contenu de la table `evenement`
--

INSERT INTO `evenement` (`idEven`, `nomEven`, `textEven`, `debutEven`, `finEven`) VALUES
(66, 'pot pour JAVA', 'Chez Moi', '2016-08-07 16:00:00', '2016-08-07 16:30:00'),
(69, 'Retour au boulot', 'Bureau', '2016-08-08 09:00:00', '2016-08-08 17:00:00'),
(76, 'Encore Java', 'Chez moi', '2016-08-07 19:00:00', '2016-08-07 21:00:00'),
(77, 'Boire du java', 'Chez moi', '2016-08-01 15:30:00', '2016-08-01 18:30:00'),
(78, 'Dodo', 'Sur le Lit', '2016-08-10 14:30:00', '2016-08-10 18:00:00');

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
(76, 'patrickrivera@orange.fr', 0),
(77, 'daniele@pitrolo.it', 0),
(78, 'ldeng89@gmail.com', 0);

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
('Pitrolo', 'Daniele', 'daniele@pitrolo.it'),
('DENG', 'Li', 'ldeng89@gmail.com'),
('Rivera', 'Patrick', 'patrickrivera@orange.fr');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
