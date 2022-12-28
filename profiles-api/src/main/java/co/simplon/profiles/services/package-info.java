/**
 * Ce package contient tous les "@Service" de l'aplication. C'est das la couche
 * service de l'application que sont realises les traitements metiers (calculs,
 * appels d'API, recuperation et stockage de donnees en s'appuyant sur d'autres
 * couches).
 * <p>
 * Un service est d'abord definit par une interface qui expose l'ensemble des
 * services souhaites et une classe concrete qui implemente l'interface. C'est
 * la classe concrete qui est annotee "@Service".
 * <p>
 * Quand le service est appele par la couche "controller" on par du principe que
 * les responsabilites de la couche "controller" ont ete respectees (validation,
 * securite d'acces...), ainsi plus besoin de s'en preoccuper dans la couche
 * service.
 * <p>
 * La couche service s'appuie generalement sur un ou plusieurs "repositories"
 * pour les access a la base de donnees. Ils sont injectes comme les services
 * eux-memes dans les "controllers".
 */
package co.simplon.profiles.services;
