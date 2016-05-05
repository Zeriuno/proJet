Un propriétaire pour le calendrier? Cela supposerait qu'il y a un propriétaire, mais il peut être passé à d'autres en lecture?

 utilisateurs
+-------------+
*idUtilisateur
nomUtilisateur
mot de passe (?)


  agenda
+-----------+
 *idAgenda
 nomAgenda

  calendrier
 +----------+
 *idCalendrier
 nomCalendrier

  evenement
 +-----------+
  idEvenement
  nomEvenement
  heureDebut //au format AAAA-MM-DD-HH-MM-SS
  heureFin //idem
  repetitionEvenement
  remarquesEvenement
  pjEvenement
  statut
  rappelEvenement



  tâche
+-------+
  idTache
  nomTache
  //dureeEstimee
  //dureeEffectuee
  pjTache

   personnes
 +-----------+
 *idPersonne
 prenomPersonne
 nomPersonne
 melPersonne
 telPersonne
