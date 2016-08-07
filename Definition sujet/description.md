# Agenda

Équipe projet:

* Imane Nedjima Dahmani
* Li Deng
* Daniele Pitrolo
* Patrick Rivera

## Description

L'application permet de créer, modifier et afficher un agenda.

![Maquette agenda](agenda.png)

### Caractéristiques

* Possibilité d'ajouter un évènement
* Composition d'un évènement
   * nom
   * lieu
   * participants
   * date
   * heure début et fin

* Une personne peut être associée à l'évènement
* Composition d'une personne
	* nom
	* prénom
	* mail
 * Avant de fermer la session le programme montre une liste des personnes à prévenir. Les personnes à prévenir sont celles présentes dans des évènements créés ou bien modifiés. [les prérequis pour cette fonctionnalité sont implémentés (structure de la bdd) mais elle n'est pas complète]

### Base de données

La base de données stocke

* les personnes
* les évènements

### Fonctionnement de l'interface graphique

#### Les éléments de l'interface:

* Affichage des évènements
* Un bouton pour créer un nouvel évènement

#### Fonctionnement de l'interface:

Evènement:

* Un double clic sur l'évènement ouvre une fenêtre qui en montre les détails.
  * Un bouton permet de supprimer l'évènement
