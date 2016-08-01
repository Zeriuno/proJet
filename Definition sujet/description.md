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
* Possibilité de modifier un évènement
* Composition d'un évènement
   * nom
   * lieu
   * participants
   * début et fin
   * Remarques pour l'évènement (cf. RFC 5545)

* Une personne peut être associée à l'évènement
 * Avant de fermer la session le programme montre une liste des personnes à prévenir. Les personnes à prévenir sont celles présentes dans des évènements créés ou bien modifiés.

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
  * Un bouton permet de passer en mode *Modification*, un bouton permet de supprimer l'évènement
