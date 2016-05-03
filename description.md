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
* Possibilité de reporter un évènement
* Composition d'un évènement
   * nom
   * lieu
   * participants
   * début et fin (possibilité de couvrir plusieurs jours à étudier)
   * Répétitions de l'évènement
      * Jamais
      * Tous les X jours
      * Tous les mois
      * Tous les ans
      * (Personnalisé: "tous les premier Lundi du mois")
      * fin de la répétition
   * Statut (occupé/libre)
   * Rappel
      * Début du rappel
      * périodicité du rappel
      (* modalité du rappel : mail, SMS, popup...)
   (* Privé/Pro : évènement ou calendrier peuvent être privé ou professionnel: ne serait-il plutôt à l'utilisateur de créer un calendrier PRO ou Privé?)
		OK Possibilité de définir un calendrier comme pro ou privé
   * Remarques pour l'évènement (voir la RFC de l'icalendar)
   * Suivi(Estimation) pour l'évènement (Je ne vois pas à quoi correspond cette fonction, est-ce qu'il est possible de détailler?)
   * Pièce jointe (voir la RFC de l'icalendar)

* Une personne associée à l'évènement
 * Fiche personne en vcard
 * Avant de fermer la session le programme montre une liste des personnes à prévenir. Les personnes à prévenir sont celles présentes dans des évènements créés ou bien modifiés.
* Calcul du total des heures
  * des évènements selectionnés
  * d'un calendrier

#### Tâches

L'agenda peut stocker des tâches, classées dans des projets. (Doivent pouvoir être associé ou pas à un évènement/projet)

* Possibilité de créer une tâche
* Composition d'une tâche
  * nom de la tâche
  * échéance
  * Evènement associé
  * rappel
    * périodicité du rappel
    * modalité du rappel
  * pièce jointe
  * priorité (par note ou par classement global?) plutôt par échéance
* Rappel quotidien des tâches et évènements classé par échéance
* Possibilité de modifier (supprimer) une tâche

#### Export

* Possibilité d'exporter (format ics pour les évènements, RFC 5545)
    * export de l'agenda
    * export d'un projet
    * export d'une seule tâche (sélection multiple possible)

### Base de données

La base de données stocke

* les utilisateurs
* les calendriers
* les évènements
* les fiches de personnes
* les tâches

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


### Prolongement

Commentaire Daniele:
Je vous propose de mettre ici des fonctionnalités qu'on croit possibles ou intéressantes, mais qui ne sont pas fondamentales. Nous pourrons soit:

* les réaliser juste si nous en avons le temps
* les passer dans le coeur du projet si cela est demandé par M. Boyer.

* Envoi de courriels

#### Fonctionnalité de suivi de projet

Commentaire Daniele: Je trouve cette idée très intéressante, mais potentiellement très compliquée. Je voudrais avoir plus de détails sur comment on en envisage le fonctionnement. @GG89, est-ce que tu pourrais nous décrire l'utilisation (action de l'utilisateur, action de l'application) que tu imagines? Parce que je me dis que nous avons probablement tous les outils déjà en place avec les évènements et les tâches toutes simples.

Si on adapte l'application à la gestion de projet, en plus des projets, nous pourrions avoir les processus, pour classer les tâches. Ou bien on peut envisager que l'on associe une tâche à un calendrier et on la classe, éventuellement, dans un processus.


* charges totales de la tâche

  Commentaire Patrick: Je ne vois pas à quoi correspond cette fonction, est-ce qu'il est possible de détailler?

  Commentiare Li: On peux donner à  l'agenda un temps total pour réaliser le projet et le temps disponible pour chaque jour(ou le délai du projet).
  l'appli peux calculer le délai pour le projet (ou le temps nécessaire pour réaliser le proejt par jour).
  encore une idée: on peux ajouter aussi la notion j/h . l'agenda peux prendre en compte les resources du projet (nombre de personne dispos) pour obtenir le délai / le temps nécessaire pour réaliser le proejt par jorus.

  Commentaire Daniele: Je suis contre. C'est intéressant, mais ça nous amène trop loin, à mon avis. Il faudrait créer la notion d'équipe (nombre de personnes disponibles), avec un taux de disponibilité pour chacun. À chaque création d'évènement pour une personne de l'équipe se crée le bordel dans le planning (il est occupé, il a 2h de moins, tout est décalé…). Tout ça me semble difficile à tenir dans le cadre de la création de l'application: on a déjà un effort de conception assez grand.

  Commentaire Patrick: Je suis plutôt favorable à des tâches simples, au moins dans un premier temps. Sinon ça risque de partir vers une application de gestion de projet plutôt qu'un agenda.
  
* charges par jour de la tâche

  Commentaire Patrick: Pour moi une täche est à effectuer un jour donné. Si plusieurs jours ça ferait pluieurs tâche.

  Commentaire Li: Exemple : révieion de réseaux est comme un proejet dans l'agenda et on peux donner des tâches par jour. par ex: lundi-vendredi relire deux heurs cours pour chaque jours. semdi et dimanche, faire 3 heure des exos.
  on a donc le porjet et les charges par jours.

  Commentaire Daniele: Je suis contre. Tout d'abord l'avis de Patrick me semble fondé. Il faudrait donc différencier entre la tâche et les bouts de temps pendant lesquels tu exécutes la tâche.
  Je suis pour:
  1. avoir, pour une tâche, une durée estimée et une durée effectuée.
  2. associer une ou plusieurs tâches à un évènement: si l'évènement de 2 h a une seule tâche, on dira que la durée effectuée de la tâche est de 2 heures. Si on met deux tâches dans un évènements d'une heure, on le programme calculera que chaque tâche a une durée effectuée de 1h. Si on n'est pas d'accord (dans l'évènement on ne va consacrer que 15 minutes à la première et 30 à la seconde, et le reste à autre chose qu'on n'a pas noté), on change les valeurs manuellement. Donc voilà, je formalise ma proposition:

  Prolongement

  * Une tâche a une durée estimée et une durée effectuée.
  * Possibilité d'associer à un évènement une tâche. La durée effectuée de la tâche changera donc en incrémentant de la durée de l'évènement. Si plusieurs tâches sont assignées à un évènement, elles auront une incrémentation  de durée effectuée égale à la durée de l'évènement / n. de tâches.
  * L'utilisateur peut manuellement changer la durée effectuée totale ainsi qu'incrémenter manuellement la durée effectuée.

  Patrick : OK pour moi

* suivi de la tâches (réalisé ou pas)

  Commentaire Daniele: Pour moi il n'y a pas de "suivi" si les choix sont "fait/pas fait", mais juste une case à cocher. Si l'on parle de suivi j'ai l'impression qu'on doit suivre l'évolution au jour le jour: 8 heures faites aujourd'hui, 2 hier...)

  Commentaire Li: Oui je pense qu'on peux laisser l'utilisateur estimer la réalisation du taches de chaque jours par %. 100% = fait 0% = non fait.
  Selon le pourcetage de chaque jours. l'application peut calculer la réalisation total du projet.

  Commentaire Daniele: je suis contre un suivi, je crois que la tâche doit être "faite/à faire" et rien d'autre.

  Patrick : Pareil