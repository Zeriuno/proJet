Un propriétaire pour le calendrier? Cela supposerait qu'il y a un propriétaire, mais il peut être passé à d'autres en lecture?

 utilisateurs
+-------------+
*idUtilisateur
nomUtilisateur
//il faut ajouter  numéro téléphone,email, adresse postale etc - Li
mot de passe (?)

utilisateurs 1, 1 --- ont --- 1,1 agenda
//un contact/participant peut être utilisé dans pluiseurs agendas ? - Li
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
 //Mel signifie quoi ? - Li

calendrier 1,* --- se compose --- 0,* evenement

  evenement
 +-----------+
  idEvenement
  nomEvenement
  heureDebut //au format AAAA-MM-DD-HH-MM-SS
  heureFin //idem
  repetitionEvenement
  remarquesEvenement
  pjEvenement// what does pj mean ? - Li
  statut //true: libre; false: occupé
  rappelEvenement
  // on a oublié de mettre participant (personne ?) -Li

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
// effectivement, il faut prendre un temps pour bien réflechir...   - Li

evenement 1,1 --- prevoit --- 0,* rappel
tache 1,1 --- prevoit --- 0,* rappel

  rappel
+--------+
  idRappel
  dateReference
  distanceTemporalle// what does it mean ? - Li
  modalite// what is the diffrence between modalite and intervalle repetition ? - Li
  intervalleRepetition



evenement 0,* --- prévoit --- 0,* personne

   personnes
 +-----------+
 *idPersonne
 prenomPersonne
 nomPersonne
 melPersonne
 telPersonne
