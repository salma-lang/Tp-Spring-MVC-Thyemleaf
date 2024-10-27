## TP Spring MVC et Thyemleaf
## objectif du projet :
Dans ce TP, nous allons apprendre à développer une application Web CRUD avec Spring Boot et Thymeleaf.Le projet permet de créer, lire, mettre à jour et supprimer des utilisateurs, tout en intégrant une validation des formulaires. Son interface utilisateur est simple et claire, et le code source est facilement compréhensible.

## Prérequis:
-Java 8 ou supérieur

-Maven

-MySQL

-Un IDE : IntelliJ

-Thymeleaf

-SpringBoot

## Structure du projet:

![image](https://github.com/user-attachments/assets/6097d2af-171f-4723-99ae-68519d2dcb05)

## Test:
Pour tester le projet, assurez-vous que votre serveur MySQL est en cours d'exécution, puis compilez et exécutez Main.java pour insérer et récupérer des données.

Commencez par créer une nouvelle base de données avec la commande SQL suivante :
```sql
CREATE DATABASE thymeleaf;
```

Ensuite, dans le fichier de configuration application.properties
```properties
server.port=8080
```

Définissez le port du serveur à 8080 et configurez la base de données avec l'URL jdbc:mysql://localhost:3306/thymeleaf?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC, le nom d'utilisateur root et laissez le mot de passe vide.

Assurez-vous également que la configuration JPA affiche les requêtes SQL et met à jour le schéma de la base de données.

Enfin, visitez http://localhost:8080 dans votre navigateur.

## Démonstration Vidéo:

Voila la démonstration vidéo de ce projet :








