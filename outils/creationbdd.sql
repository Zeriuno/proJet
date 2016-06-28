/*
Il faut tout d'abord se connecter au SGBD en root. Le mot de passe par défault change selon les installations et les plate-formes.
Commande pour se connecter en root:
mysql -u root -p
Ensuite il faut saisir le mot de passe.
*/
CREATE DATABASE javadb; --on créé une nouvelle base de données
CREATE USER 'java'@'localhost' IDENTIFIED BY 'javapassword'; --on créé un nouvel utilisateur et on donne son mot de passe
GRANT ALL PRIVILEGES ON javadb.* TO 'java'@'localhost'; --on donne à l'utilisateur les droits pour travailler sur la base que l'on vient de créer
FLUSH PRIVILEGES; --on met à jour les droits
