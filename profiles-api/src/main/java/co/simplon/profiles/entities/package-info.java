/**
 * Ce package contient toutes les "entites" de l'application.
 * <p>
 * Une entite est une classe qui represente un "objet" metier et qui est mappee
 * avec une ou plusieurs tables de la base de donnees (dans le cas d'une base de
 * donnees relationnelle).
 * <p>
 * Les frameworks "ORM" (Object Relational Mapping) permettent de faire la
 * correspondance (mapping) entre classes et tables, champs et colonnes. De
 * respecter les conventions de nommage de chaque environnement (Java vs SQL),
 * de faciliter les operations de manipulation de donnees entre l'API et la base
 * de donnees (typiquement les operations CRUD).
 * <p>
 * Une classe devient une entite quand elle est annotee "@Entity", on ajoute
 * l'annotation (au niveau de la classe toujours) "@Table" avec le nom de la
 * table correspondante en parametre. Les champs de la classe sont mappes soit
 * par "@Column" pour les proprietes soit par "@JoinColumn" pour les
 * associations entre entites, dans les deux cas on precise le nom de la colonne
 * qui stocke la donne dans le premier cas, l'identifiant de l'entite referencee
 * (clef primaire de la table referencee) dans le deuxième cas.
 * <p>
 * Pour les associations on precise egalement la multiplicite (cardinalite cote
 * base de donnees) avec certaines annoations comme "@ManyToOne".
 * <p>
 * Le champ de la classe qui represente la clef primaire est annote avec "@Id"
 * et "@GeneratedValue" pour specifier la strategie de generation de cette clef.
 */
package co.simplon.profiles.entities;
