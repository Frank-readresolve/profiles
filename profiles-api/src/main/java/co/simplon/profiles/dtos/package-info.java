/**
 * Ce package contient tous les "DTO" (Data Transfer Objects).
 * <p>
 * Le DTO est un principe de conception qui vise a limiter les appels et la
 * quantite de donnees echanges entre un client et un serveur. Par extension le
 * nom des classes/objets qui representent les donnees echangees est nommer DTO.
 * D'autres appellent ces classes des "value objects" car ils ne font que
 * representer des valeurs, des donnees. Sans aucune logique.
 * <p>
 * Le principe de base est d'avoir un DTO pour chaque service, le DTO pouvant
 * representer des inputs comme des outputs d'un service. Si c'est un DTO
 * "input" alors il peut declarer les contraintes de validation a respecter.
 */
package co.simplon.profiles.dtos;
