# Agenda, guide utilisateur

**Groupe C**
Équipe projet:

* Imane Nedjima Dahmani
* Li Deng
* Daniele Pitrolo
* Patrick Rivera

## Description

L'application permet de créer, modifier et afficher un agenda.

## Installation

Le programme nécessite de:

* Java 8 (à cause de l'utilisation de `java.time.Duration` et `java.time.Instant`)
* JDBC (intéraction avec la base de données)
* présence d'une base de données (appellée `java`) de type MYSQL (cf. BDD.sql)


## Caractéristiques techniques

* Possibilité d'ajouter un évènement
* Composition d'un évènement
   * nom
   * lieu
   * participant
   * date
   * heure début et fin

* Une personne peut être associée à l'évènement
* Composition d'une personne
	* nom
	* prénom
	* mail
  * Avant de fermer la session le programme montre une liste des personnes à prévenir. Les personnes à prévenir sont celles présentes dans des évènements créés ou bien modifiés (les prérequis pour cette fonctionnalité sont implémentés (structure de la base de données et récupération des invités) mais elle n'est pas complète).

### Base de données

La base de données stocke

* les personnes
* les évènements

Une table de relation garde trace des personnes invitées à des évènements.

### Fonctionnement de l'interface graphique

#### Les éléments de l'interface:

* Affichage des évènements
* Un bouton pour créer un nouvel évènement
* Un bouton pour créer une nouvelle personne
* Deux boutons pour changer de semaine (`Précédente` et `Suivante`)

#### Fonctionnement de l'interface:

Evènement:

* Un clic sur l'évènement ouvre une fenêtre qui en montre les détails.

## Saisie évènement

1. Un clic sur le texte de remplissage le fait disparaître. Il indique le format à respecter pour la saisie des champs des heures et des dates: l'heure 8:00 est à saisir `08:00`, et le 1/1/2016 `01/01/2016`, faute de quoi le programme ne pourra pas traiter correctement les données fournies.
2. Le programme ne gère pas les évènements en dehors de la plage horaire 7-21h.
3. Le programme ne contrôle pas si la date et l'heure saisies sont correctes (l'heure 54:98 ou la date 98/66/007).

## Saisie personne

L'adresse mél de la personne est la clef primaire de la table personne. Il est donc interdit de saisir deux personnes avec la même adresse mél sous peine de plantage.

## Résèrve

1. Pas de bouton pour modifier ou supprimer les évènements.
2. Impossible d'inviter plusieurs personnes (des préconisations à ce but sont notées dans le code en commentaire).
3. Impossible d'ajouter plusieurs évènements dans la même plage horaire.
