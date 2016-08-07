# Guide utilisateur

## Installation

Le programme nécessite de Java 8 pour fonctionner (à cause de l'utilisation de `java.time.Duration` et `java.time.Instant`).

## Saisie évènement

1. Un clic sur le texte de remplissage le fait disparaître. Il indique le format à respecter pour la saisie des champs des heures et des dates: l'heure 8:00 est à saisir `08:00`, et le 1/1/2016 `01/01/2016`, faute de quoi le programme ne pourra pas traiter correctement les données fournies.
2. Le programme ne gère pas les évènements en dehors de la plage horaire 7-21h.
3. Le programme ne contrôle pas si la date et l'heure saisies sont correctes.

## Résèrve

1. Pas de bouton pour modifier les évènements. Juste supprimer et créer à nouveau
2. Pas plusieurs personnes invitées
3. Pas plusieurs évènements en même temps
4. Uniquement des heures entières (il faudrait doubler la grille pour permettre les demi-heures)
5. une fenêtre créée pour chaque semaine vue
