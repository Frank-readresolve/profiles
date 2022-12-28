/**
 * Ce package est considerer comme le package "racine" par Spring, il contient
 * la classe "application" avec la methode "main".
 * <p>
 * Comme tout programme Java la methode main est le point d'entree de
 * l'application.
 * <p>
 * Au demarrage, Spring va scanner l'ensemble des classes a partir de ce package
 * et ses sous-packages. Autrement formule, les classes qui sont en dehors de
 * cette arborescence ne seront pas trouvees donc ignorees.
 * <p>
 * Les classes qui interessent Spring sont dits des composants ou des "beans".
 * Spring les reconnait grace aux annotations (notamment mais pas exclusivement
 * "@RestController", "@Service", "@Entity", "@Repository").
 */
package co.simplon.profiles;
