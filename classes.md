Un propriétaire pour le calendrier? Cela supposerait qu'il y a un propriétaire, mais il peut être passé à d'autres en lecture?

 utilisateurs
+-------------+
*idUtilisateur
nomUtilisateur
mot de passe (?)

utilisateurs 1, 1 --- ont --- 1,1 agenda

  agenda
+-----------+
 *idAgenda
 nomAgenda

agenda 1,1 --- contient --- 1,* calendrier
//on va commencer simple: on ne partage pas les calendriers. Un utilisateur peut l'exporter et un autre l'importer, mais ce ne sera pas le partage du même calendrier

  calendrier
 +----------+
 *idCalendrier
 nomCalendrier
 adresseMel
 motDePasseMel

calendrier 1,* --- se compose --- 0,* evenement

  evenement
 +-----------+
  idEvenement
  nomEvenement
  heureDebut //au format AAAA-MM-DD-HH-MM-SS
  heureFin //idem
  repetitionEvenement
  remarquesEvenement
  pjEvenement
  statut //true: libre; false: occupé
  rappelEvenement

calendrier 1,* --- prévoit --- 0,* tache
evenement 0,* --- inclut --- 0,* tache

  tache
+-------+
  idTache
  nomTache
  echeance
  pjTache
  priorite
  dureeEstimee
  //dureeEffectuee: j'ai des doutes avec celui-ci: une table à part ou pas? Car la duree effectuée se compose d'une somme de durées (événement 1, ...), de ce que l'utilisateur ajoute manuellement ou bien du total qu'il saisit directement.


evenement 1,1 --- prevoit --- 0,* rappel
tache 1,1 --- prevoit --- 0,* rappel

  rappel
+--------+
  idRappel
  dateReference
  distanceTemporalle
  modalite
  intervalleRepetition



evenement 0,* --- prévoit --- 0,* personne

   personnes
 +-----------+
 *idPersonne
 prenomPersonne
 nomPersonne
 melPersonne
 telPersonne
