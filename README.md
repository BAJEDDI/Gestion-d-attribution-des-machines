# Projet - Gestion d'Attribution de Machines

Ce projet vise à développer une application de gestion permettant d'attribuer des machines aux employés. L'application sera basée sur les technologies JSF, PrimeFaces, Facelets et EJB, avec GlassFish comme serveur d'application.

## Prérequis
- GlassFish Server installé localement ou accessible pour le déploiement.
- Environnement de développement Java compatible avec les technologies JSF, PrimeFaces, Facelets et EJB.
- Base de données avec les tables `Employe` et `Machine` comme spécifiées dans la section Entités.

## Étapes de Développement
1. **Initialisation du Projet Web**
   - Création d'une structure de projet adaptée aux technologies utilisées.
  

2. **Génération des Entités depuis la Base de Données**
   - Extraction des entités `Employe` et `Machine` à partir de la base de données existante.
   -  **Entités de la Base de Données**
- Table `Employe` : (id, nom, prénom, salaire, chef)
- Table `Machine` : (id, référence, marque, date d'achat, prix, employé)
   
3. **Création des Pages JSF à partir des Entités**
   - Développement des interfaces utilisateur basées sur les entités extraites.
   
4. **Configuration de la Source de Données dans GlassFish**
   - Établissement de la connexion entre l'application et la base de données dans GlassFish.

5. **Personnalisation des Interfaces Utilisateur**
   - Optimisation des interfaces en supprimant les identifiants des interfaces d'ajout et en ajustant l'affichage dans les listes.

6. **Ajout de Fonctionnalités de Filtrage et de Tri**
   - Intégration de fonctionnalités pour filtrer par employé et trier par date dans la liste des machines.

7. **Page de Répertoire des Machines attribuées à un Employé**
   - Implémentation d'une page dédiée répertoriant les machines attribuées à un employé spécifique.

8. **Incorporation d'un Graphique Statistique**
   - Intégration d'un graphique illustrant l'évolution des acquisitions de machines par année.

9. **Prise en Charge Multilingue**
   - Ajout de fonctionnalités pour rendre l'interface utilisateur disponible en anglais et en français.

10. **Ajout de Fonctionnalité de Connexion**
    - Mise en place d'une option de connexion pour les utilisateurs.

## Installation et Utilisation
1. Cloner le dépôt du projet.
2. Configurer l'environnement de développement avec les technologies JSF, PrimeFaces, Facelets et EJB.
3. Importer les entités dans votre base de données.
4. Déployer l'application sur GlassFish.
## Authors
**-BAJEDDI**
**killer-beep07**
