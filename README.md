## Création de la base de données ***forknow***

Le projet nécessite la création d'une base de données Postgres pour fonctionner.

Il faut donc tout d'abord créer cette base de données qui sera nommée : ***"forknow"***

Pour cela : 

Il faut installer (si ce n'est déjà fait) _PostgresSQL_ sur le poste : https://www.postgresql.org/

Ensuite, ouvrir à partir du dossier _PostgresSQL 16_ : ___SQL Shell___

Puis taper les commandes : 
- _postgres=# CREATE DATABASE forknow;_
- _postgres=# \c forknow_

==> Vous êtes maintenant connecté à la base de données « forknow » en tant qu'utilisateur « postgres ».

## Lancement de l'application ##

1. Cloner l'appli
2. Ouvrir le dossier avec un ide. Par exemple : ***VScode***
3. Pour lancer l'appli :
   - aller dans le Terminal de VSCode, puis
   - et taper la commande : _./gradlew boorun_

4. L'appli s'ouvre dans le navigateur à l'adresse : http://localhost:8080/

5. Pour arrêter l'appli, faire :   _ctrl+C_

## Fonctionnement ##
L'appli ***FrokNow*** permet :

- d'accéder à la page d'accueil
- de créer un compte via le bouton ***Register*** (en haut, à droite)
- de se connecter lorsque l'on possède un compte via le bouton ***Login***.

    --> La page s'actualise alors et apparaissent en haut à droite :

    - ***Welcome*** suivi du ***nom*** de la personne connectée
    - le bouton ***Logout*** qui permet de se déconnecter.



Lorsque l'on possède un compte et que l'on est connecté :
1. On peut passer une commande :

   - en cliquant sur le bouton ***Order Now*** (qui permet d'avoir accès à le liste des restaurants disponibles)
   - cliquer ensuite sur le bouton ***Select*** afin de choisir le restaurant dans lequel on souhaite commander (pour le moment, seul la page lié au restaurant1 s'affiche sans pouvoir avanacer dans la commande)

2. On peut créer un restaurant en indiquant :

   - le **nom** du restaurant
   - la **spécialité** du restaurant

Les pages d'enregistrement d'un _nouveau compte_ et d'un _nouveau restaurant_ permettent un retour à la page d'accueil (bouton ***Back to Home***) si l'on veut arrêter la procédure



