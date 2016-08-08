# Documentation

## Structure des classes

* testGUI: programme principale. Lancer celui-ci pour lancer l'application.
* BDConnect: nouvelle classe pour gérer la base de données. Ne créer qu'un objet connexion que les autres classes appellent au besoin. Introduite tardivement, cette classe n'a été utilisée que pour peu d'intéractions avec la base. Compléter la bascule améliorerait la factorisation du code.
* Bdmanager: première implémentation de l'intéraction avec la base de données. Contient des intéractions avec la base de données pour toute classe.
* Dates: classe pour traiter les dates. Elle permet d'ouvrir le programme sur la semaine courante (heure du système), 
* Evenement:
* FDialogue:
* Personne:
* SaisieEvenFenetre: classe permettant de saisir les événements et de les enregistrer dans la base de données et de les afficher dans le calendrier.
* SasiePersFenetre: classe permettant de saisir les personnes et de les enregistrer dans la base de données.
* VoirEvenFenetre: affichage des événements suite à un clic sur l'événement dans le calendrier.
