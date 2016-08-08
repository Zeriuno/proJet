# Documentation

Ici est donné un aperçu de l'organisation générale des classes. Pour plus de détails, voir les nombreux commentaires insérés dans le code.

## Structure des classes

* testGUI: programme principale. Lancer celui-ci pour lancer l'application.
* BDConnect: nouvelle classe pour gérer la base de données. Ne créer qu'un objet connexion que les autres classes appellent au besoin. Introduite tardivement, cette classe n'a été utilisée que pour peu d'intéractions avec la base. Compléter la bascule améliorerait la factorisation du code.
* Bdmanager: première implémentation de l'intéraction avec la base de données. Contient des intéractions avec la base de données pour toute classe.
* CalendrierFenetre **GUI**: fenêtre d'affichage principal, contient la grille de la semaine et y affiche les évènements.
* SaisieEvenFenetre **GUI**: classe permettant de saisir les événements et de les enregistrer dans la base de données et de les afficher dans le calendrier.
* VoirEvenFenetre **GUI**: affichage des événements suite à un clic sur l'événement dans CalendrierFenetre.
* SasiePersFenetre **GUI**: classe permettant de saisir les personnes et de les enregistrer dans la base de données.
* FDialogue **GUI**: fenêtre conçue pour gérer les erreurs, pas utilisée.
* Dates: classe pour traiter les dates. Elle permet d'ouvrir le programme sur la semaine courante (heure du système),
* Evenement: classe utilisée pour créer un objet évènement lors de la saisie via SaisieEvenFenetre, pour le rentrer dans la base de données, et pour construire un ArrayList qui sera utilisé par la fenêtre d'affichage principal.
* Personne: classe utilisée pour enregistrer les personnes saisies via SaisiePersFenêtre.
