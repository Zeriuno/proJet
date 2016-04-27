# Agenda

Imane Nedjima Dahmani
Li Deng
Daniele Pitrolo
Patrick Rivera

## Description

L'application permet de créer, modifier et afficher un agenda.

![Maquette agenda](agenda.png)

### Caractéristiques

* Possibilité de charger un agenda déjà créé
* Multi-utilisateur: au démarrage on demande avec quel utilisateur on veut accéder
* Un agenda peut être composé de plusieurs calendriers
* Différences dans l'affichage de chaque calendrier (couleur)
* Possibilité de lier un calendrier à une adresse mail de contact
* Possibilité d'ajouter un évènement
* Possibilité d'ajouter des tâches
* Composition d'un évènement
   * nom
   * lieu
   * participants
   * début
   * fin
   * durée (possibilité d'indiquer des journées entières)
   * Répétitions de l'évènement
      * Jamais
      * Tous les jours
      * Chaque mercredi ...
      * Tous les mois
      * Tous les ans
      * Personnalisé
      * fin de la répétition
   * Calendrier local ou compte mail associé
   * Calendrier associé à un compte mail
   * Statut (occupé/libre)
   * Rappel
      * Début du rappel
      * périodicité du rappel
      * modalité du rappel
   * Privé/Pro
   * Notes
   * Pièce jointe
* Composition d'une Tâche
  * nom de la tâche
  * échéance
  * Calendrier local ou compte mail associé
  * Evènement associé
  * rappel
    * périodicité du rappel
    * modalité du rappel
  * pièce jointe
* Rappel quotidien des tâches et évènements classé par échéance et priorité
* Possibilité de modifier (supprimer) un évènement
* Possibilité de sauvegarder l'agenda
* Possibilité d'exporter (format ical, et [?])
    * export de l'agenda
    * export d'un calendier
    * export d'un seul évènement (possibilité de permettre la sélection multiple)

* Une personne associée à l'évènement
  * Fiche personne en vcard
  * Avant de fermer la session le programme montre une liste des personnes à prévenir. Les personnes à prévenir sont celles présentes dans des évènements créés ou bien modifiés.
* Calcul du total des heures
    * des évènements selectionnés
    * d'un calendrier

### Fonctionnement de l'interface graphique

#### Les éléments de l'interface:

* Affichage des évènements et calendriers
* Un bouton pour créer un nouvel évènement
* Un bouton pour créer un nouveau calendrier
* Liste des calendriers créés avec case de sélection (afficher/cacher)
* Chaque évènement a une case qui peut être cochée ou décochée

#### Fonctionnement de l'interface:

Evènement:

* Un double clic sur l'évènement ouvre une fenêtre qui en montre les détails.
  * Un bouton permet de passer en mode *Modification*, un bouton permet de supprimer l'évènement
* En sélectionnant l'évènement on peut en faire un copier-coller
* En traînant les marges supérieures et inférieures de l'évènement on peut modifier son heure de début et de fin.
