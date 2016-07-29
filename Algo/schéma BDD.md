personne(#idPers, nomPers, prenomPers, mailPers, telPers)
utilisateur(#idUtil, logiUtil, mdpUtil, idPers*)
evenement(#idEven, nomEven, hDebEven, hFinEven, repEven, finRepEven, remarqueEven, idUtil*)
persEven(#(idPers*, idEven*), etatPersEven)
