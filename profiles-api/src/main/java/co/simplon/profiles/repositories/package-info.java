/**
 * Ce package contient tous les "repositories" de l'application.
 * <p>
 * Un repository est une couche d'acces aux donnees d'un certain type. Autrement
 * dit, chaque repository facilite les access pour une "entite" specifique.
 * <p>
 * Spring data fournit des interfaces generiques a etendre pour faciliter la
 * tache du developpeur. Ces interfaces proposent les operations CRUD
 * fondamentales.
 * <p>
 * Il n'est pas necessaire d'ecrire des classes concretes, le framework fournit
 * des implementations par defaut, autrement dit des classes concretes qui
 * implementent les interfaces que nous declarons.
 * <p>
 * La pratique est de declarer une interface pour chaque "entite" pour
 * lesquelles des acces a la base de donnees sont necessaires. Cette interface
 * etend "JpaRepository" en précisant le type de l'entite (T) et de la clef
 * primaire (ID).
 * <p>
 * On peut declarer de nouvelles methodes dans nos "repositories" en respectant
 * des conventions de nommage et les typages (retour et arguments).
 */
package co.simplon.profiles.repositories;
