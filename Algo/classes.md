Un propriétaire pour le calendrier? Cela supposerait qu'il y a un propriétaire, mais il peut être passé à d'autres en lecture?

 utilisateur
+-------------+
*idUtilisateur
nomUtilisateur
//il faut ajouter  numéro téléphone,email, adresse postale etc - Li
//non, là c'est juste un utilisateur, pas un contact (cf personnes) - Daniele
motDePasse (?)

utilisateur 1 --- a --- 0,* melContact

 melUtilisateur
+------------------+
 adresseMel
 motDePasseMel
 //Mel = Méssagerie électronique (mail, en somme, mais en français) - Daniele
 //Cetet classe nous sert pour envoyer les alertes depuis l'adresse de l'utilisateur.

utilisateurs 1, 1 --- ont --- 1,1 agenda
//un contact/participant peut être utilisé dans pluiseurs agendas ? - Li
//Là je pensais aux utilisateurs, ceux qui ont un compte, pas aux contacts. Mais en effet, c'est une question importante. Je crois que le mieux est que chaque agenda ait sa base de contacts indépendante des autres. De cette manière si tu donnes ton numéro nouveau à Patrick mais pas à moi, la fiche que j'ai sur toi n'est pas mise à jour automatiquement. - Daniele

  agenda
+-----------+
 *idAgenda
 ~~nomAgenda~~ //pas nécessaire: l'agenda n'a pas un nom que l'on puisse choisir

agenda 1,1 --- contient --- 1,* calendrier
//on va commencer simple: on ne partage pas les calendriers. Un utilisateur peut l'exporter et un autre l'importer, mais ce ne sera pas le partage du même calendrier - Daniele

  calendrier
 +----------+
 *idCalendrier
 nomCalendrier
 
calendrier 1,* --- se compose --- 0,* evenement

  evenement
 +-----------+
  idEvenement
  nomEvenement
  heureDebut //au format AAAA-MM-DD-HH-MM-SS - Daniele
  heureFin //idem
  repetitionEvenement
  remarquesEvenement
  pjEvenement// pièce jointe
  statut //true: libre; false: occupé
  rappelEvenement
  
  //Comment on intègre les participants à un évènement? Je me demande si cela peut même être une classe à part. Car on a besoin des contacts mais aussi du statut "prévenu ou pas".
  

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
  contactsTache //ça nous sert à
  //dureeEffectuee: j'ai des doutes avec celui-ci: une table à part ou pas? Car la duree effectuée se compose d'une somme de durées (événement 1, ...), de ce que l'utilisateur ajoute manuellement ou bien du total qu'il saisit directement. - Daniele
// effectivement, il faut prendre un temps pour bien réflechir...   - Li

evenement 1,1 --- prevoit --- 0,* rappel
tache 1,1 --- prevoit --- 0,* rappel

  rappel
+--------+
  idRappel
  dateReference
  distanceTemporalle //À quelle distance (temporelle) de l'évènement on doit déclencher le rappel? 24 avant ou 5 minutes?
  modalite //modalité du rappel: est-ce que c'est un mail, est-ce que c'est un son, une alerte sans son...
  intervalleRepetition //J'ai eu le rappel et j'ai appuyé "Me rappeller ultérieurement dans 5 minutes". 5 Minutes c'est l'intervalle de répétition. Mais en effet cela rend les choses plus complexes car il faut introduire une autre donnée
  rappelFait //Ici on peut avoir 0: rappel à faire; 1: rappel fait, tout conclu; 2: rappel à refaire (et dans ce cas on va voir lintervalle de répétition. - Daniele



evenement 0,* --- prévoit --- 0,* personne

   personne
   //ce sera plus approprié de parler de contact, plus génériquement
 +-----------+
 *idPersonne
 prenomPersonne
 nomPersonne
 melPersonne
 telPersonne
