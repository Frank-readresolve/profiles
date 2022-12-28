/**
 * Ce package contient tous les "@RestController" de l'aplication. "Rest" car ce
 * sont des "controllers" de type Rest, autrement dit qui exposent des endpoints
 * d'API Rest. Et "controller" car ce sont des composants qui controlent
 * l'access aux services de l'application. Les services ne sont pas accessibes
 * directement.
 * <p>
 * Les controllers ont ainsi un ensemble bien specifique de responsabilites :
 * <ul>
 * <li>Exposent les endpoints pour les clients
 * <li>Valident les inputs en s'appuyant sur des contraintes de validation
 * <li>Autorisent ou non l'acces a un service associe en s'appuyant sur des
 * contraintes de securite
 * <li>Preparent la reponse a retourner au client.
 * </ul>
 */
package co.simplon.profiles.controllers;
